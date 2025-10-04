package com.github.tanokun.reactivesk.compiler.frontend.analyze.ast

import com.github.tanokun.reactivesk.compiler.frontend.analyze.ast.result.Diagnostic

/**
 * データフロー解析の抽象クラスです。サブクラスは具体的な状態遷移ルールを実装して解析を行います。
 *
 * @param T 解析で扱う状態の型
 * @param H AST ノードが保持するハンドラの型
 * @param rootAst 解析対象のルートとなる `AstNode.Struct<H>`
 */
abstract class AbstractDataFlowAnalyzer<T: Any, H: Any>(private val rootAst: AstNode.Struct<H>) {

    /**
     * サブクラスが定義する、解析開始時の初期状態
     *
     * @return なし
     */
    protected abstract val initialState: T

    /**
     * 1行の文を解析し、状態を遷移させます。
     *
     * @param node 解析対象の `AstNode.Line<H>`
     * @param currentState この行の直前の状態
     *
     * @return この行を解析した結果を表す `AnalysisResult<T, H>`
     */
    protected abstract fun analyzeLine(node: AstNode.Line<H>, currentState: T): AnalysisResult<T, H>

    /**
     * 複数の分岐パスの状態をマージするルールを定義します。
     *
     * @param statesToMerge 各分岐パスが完了した後の状態のリスト
     *
     * @return マージ後の単一の状態
     */
    protected abstract fun mergeBranchStates(statesToMerge: List<T>): T

    /**
     * ループ後の状態をマージするルールを定義します。
     *
     * @param initialState ループに入る前の状態
     * @param loopBodyFinalState ループ本体を1回以上通過した後の状態
     *
     * @return ループ全体が完了した後の最終的な状態
     */
    protected abstract fun mergeLoopStates(initialState: T, loopBodyFinalState: T): T

    /**
     * 解析完了後、最終的な状態を使って追加の検証を行います。
     *
     * @param rootNode 解析対象だった AST のルートノードを表す `AstNode.Struct<H>`
     * @param finalState 解析完了後の最終的な状態
     *
     * @return 追加の検証で見つかった診断のリスト
     */
    protected abstract fun verify(rootNode: AstNode.Struct<H>, finalState: T): List<Diagnostic<H>>

    /**
     * AST ノードの解析結果をラップするデータクラスです。
     *
     * @param T 解析で扱う状態の型
     * @param H AST ノードが保持するハンドラの型
     * @param diagnostics 発見された診断のリスト
     * @param finalState このノード完了後の最終的な状態
     */
    data class AnalysisResult<T, H>(
        val diagnostics: List<Diagnostic<H>>,
        val finalState: T
    )

    /**
     * 解析を実行し、最終的な診断結果を返します。
     *
     * @return 解析結果を表す `AnalysisResult<T, H>`
     */
    fun analyze(): AnalysisResult<T, H> {
        val finalResult = analyzeNode(rootAst, initialState)

        return finalResult.copy(diagnostics = finalResult.diagnostics + verify(rootAst, finalResult.finalState))
    }

    private fun analyzeNode(node: AstNode<H>, currentState: T): AnalysisResult<T, H> {
        return when (node) {
            is AstNode.Line -> analyzeLine(node, currentState)
            is AstNode.Struct -> analyzeBlock(node, currentState)
            is AstNode.Section -> analyzeSection(node, currentState)
        }
    }

    private fun analyzeBlock(node: AstNode.Struct<H>, initialState: T): AnalysisResult<T, H> {
        val totalDiagnostics = mutableListOf<Diagnostic<H>>()
        val finalState = node.elements.fold(initialState) { currentState, element ->
            val result = analyzeNode(element, currentState)
            totalDiagnostics.addAll(result.diagnostics)

            result.finalState
        }
        return AnalysisResult(totalDiagnostics, finalState)
    }


    private fun analyzeSection(node: AstNode.Section<H>, currentState: T): AnalysisResult<T, H> = when (node) {
        is AstNode.Section.If -> analyzeIf(node, currentState)
        is AstNode.Section.Loop -> {
            val loopBodyResult = analyzeBlock(AstNode.Struct(node.handler, node.elements), currentState)
            val finalState = mergeLoopStates(currentState, loopBodyResult.finalState)

            AnalysisResult(loopBodyResult.diagnostics, finalState)
        }
        is AstNode.Section.Other -> analyzeBlock(AstNode.Struct(node.handler, node.elements), currentState)
    }

    private fun analyzeIf(node: AstNode.Section.If<H>, initialState: T): AnalysisResult<T, H> {
        val thenResult = analyzeNode(node.thenSection, initialState)
        val elseIfResults = node.elseIfSections.map { analyzeNode(it.thenSection, initialState) }
        val elseResult = node.elseSection?.let { analyzeNode(it, initialState) }

        val allDiagnostics = (
            thenResult.diagnostics +
                elseIfResults.flatMap { it.diagnostics } +
                (elseResult?.diagnostics ?: emptyList())
            )

        val finalState: T
        if (elseResult == null) {
            val statesToMerge = listOf(initialState) + (listOf(thenResult) + elseIfResults).map { it.finalState }
            finalState = mergeBranchStates(statesToMerge)
        } else {
            val statesToMerge = (listOf(thenResult) + elseIfResults + listOf(elseResult)).map { it.finalState }
            finalState = mergeBranchStates(statesToMerge)
        }
        return AnalysisResult(allDiagnostics, finalState)
    }
}