package com.github.tanokun.reactivesk.compiler.frontend.analyze

import com.github.tanokun.reactivesk.compiler.frontend.analyze.ast.AbstractDataFlowAnalyzer
import com.github.tanokun.reactivesk.compiler.frontend.analyze.ast.AstNode
import com.github.tanokun.reactivesk.compiler.frontend.analyze.ast.result.Diagnostic
import com.github.tanokun.reactivesk.compiler.frontend.analyze.ast.result.Severity
import com.github.tanokun.reactivesk.lang.Identifier

/**
 * `function` セクションに対するデータフロー解析を行い、返り値の検証を行います。
 * 返り値が確定していない経路が存在する場合にエラーを生成します。
 *
 * @param functionBodyAst 解析対象の関数本体を表す `AstNode.Struct<H>`
 * @param functionName 検証対象の関数名を表す [Identifier]
 * @param className 関数が属するクラス名を表す [Identifier]
 * @param hasReturnValue 関数が返り値を持つかどうかを示すフラグ
 *
 * @return `analyze` を実行した際に得られる診断のラップを返す
 */
class FunctionReturnAnalyzer<H: Any>(
    functionBodyAst: AstNode.Struct<H>,
    private val functionName: Identifier,
    private val className: Identifier,
    private val hasReturnValue: Boolean
) : AbstractDataFlowAnalyzer<Boolean, H>(functionBodyAst) {

    /**
     * 解析開始時、パスはまだ終了していないことを示します。
     */
    override val initialState: Boolean = false

    /**
     * 1行の文を解析します。
     *
     * @param node 解析対象の `AstNode.Line<H>`
     * @param currentState この行の直前のパス終了状態
     *
     * @return この行を通過した後のパス終了状態を含む `AnalysisResult<Boolean, H>`
     */
    override fun analyzeLine(
        node: AstNode.Line<H>,
        currentState: Boolean
    ): AnalysisResult<Boolean, H> {
        if (hasReturnValue && node is AstNode.Line.Exit) {
            val diagnostic = Diagnostic(
                "require return value in function '$functionName' in '$className' so cannot use 'exit effect'.",
                node,
                Severity.ERROR
            )

            return AnalysisResult(listOf(diagnostic), false)
        }

        if (node is AstNode.Line.FunReturn) return AnalysisResult(emptyList(), true)

        return AnalysisResult(emptyList(), false)
    }

    /**
     * 複数の分岐パスの状態をマージします。
     *
     * @param statesToMerge マージ対象の状態リスト
     *
     * @return すべてのパスが終了している場合に true を返す
     */
    override fun mergeBranchStates(statesToMerge: List<Boolean>): Boolean {
        return statesToMerge.all { it }
    }

    /**
     * ループ後の状態をマージします。
     * ループは 0 回実行される可能性があるため、初期状態を返します。
     *
     * @param initialState ループに入る前の状態
     * @param loopBodyFinalState ループ本体を1回以上通過した後の状態
     *
     * @return ループ後の最終状態を表す `Boolean`
     */
    override fun mergeLoopStates(initialState: Boolean, loopBodyFinalState: Boolean): Boolean {
        return initialState
    }

    /**
     * 解析完了後の追加検証を行います。
     *
     * @param rootNode 解析対象の AST ルートを表す `AstNode.Struct<H>`
     * @param finalState 解析完了後の最終状態
     *
     * @return 発見された `List<Diagnostic<H>>`
     */
    override fun verify(rootNode: AstNode.Struct<H>, finalState: Boolean): List<Diagnostic<H>> {
        if (hasReturnValue && !finalState) {
            val errorMessage = "Function '$functionName' in '$className' must return a value on all paths."
            return listOf(Diagnostic(errorMessage, rootNode))
        }

        return emptyList()
    }
}