package com.github.tanokun.reactivesk.compiler.frontend.analyze.variable

import com.github.tanokun.reactivesk.lang.Identifier
import java.util.*

typealias Depth = Int
typealias SectionId = Int

/**
 * AST 単位で型付き変数の解決と管理を行うユーティリティオブジェクトです。
 * 弱参照マップにより AST ごとに `TypedVariables<S>` を保持し、宣言の登録や解決、セクションの更新を行います。
 *
 * @param H AST の比較のハンドルとなる型
 * @param S セクションのハンドルとなる型
 * @param Depth 深さを表す型エイリアス
 * @param SectionId セクション識別子を表す型エイリアス
 */
class TypedVariableResolver<H, S> {
    private val variablesByTop = WeakHashMap<H, TypedVariables<S>>()

    private fun getOrCreateVariables(top: H): TypedVariables<S> {
        return variablesByTop.getOrPut(top) {
            TypedVariables()
        }
    }

    /**
     * セクションに入ったことを通知し、セクション ID を返します。
     * 必要に応じて新しいセクション ID を割り当てます。
     * 各セクションの比較は参照等価性で行われます。
     *
     * @param top 対象の AST ルートを表す `H`
     * @param depth 現在の深さを表す `Depth`
     * @param currentSection 現在のセクションを表す `Section`、存在しない場合は null
     *
     * @return 現在の深さに対応する `SectionId`
     */
    fun touchSection(top: H, depth: Depth, currentSection: S?): Int {
        val vars = getOrCreateVariables(top)
        val previousSection = vars.getLastSection(depth)

        if (previousSection == null) {
            vars.setLastSection(depth, currentSection)
            val sectionId = vars.getSectionId(depth)
            vars.ensureSectionTable(depth, sectionId)
            return sectionId
        }

        if (previousSection === currentSection) return vars.getSectionId(depth)

        val next = vars.getSectionId(depth) + 1
        vars.setSectionId(depth, next)
        vars.setLastSection(depth, currentSection)

        return next
    }

    /**
     * 未解決の変数宣言を登録して解決された宣言を返します。
     *
     * @param top 登録先の AST ルートを表す `H`
     * @param declaration 登録する未解決の宣言を表す `TypedVariableDeclaration.Unresolved`
     *
     * @return 登録後の `TypedVariableDeclaration.Resolved`
     */
    fun declare(top: H, declaration: TypedVariableDeclaration.Unresolved): TypedVariableDeclaration.Resolved {
        val vars = getOrCreateVariables(top)
        return vars.declare(declaration)
    }

    /**
     * 単一スコープ内での宣言を取得します。
     *
     * @param top 検索対象の AST ルートを表す `H`
     * @param depth 検索する深さを表す `Depth`
     * @param variableName 検索する変数名を表す `Identifier`
     *
     * @return 見つかった場合は `TypedVariableDeclaration.Resolved`、見つからない場合は null
     */
    fun getDeclarationInSingleScope(top: H, depth: Int, variableName: Identifier): TypedVariableDeclaration.Resolved? {
        val vars = variablesByTop[top] ?: return null

        return vars.getDeclarationInCurrentSectionId(depth, variableName)
    }

    /**
     * スコープチェーンを辿って変数宣言を解決します。
     *
     * @param top 検索対象の AST ルートを表す `H`
     * @param currentDepth 現在の深さを表す `Depth`
     * @param variableName 解決する変数名を表す `Identifier`
     *
     * @return 見つかった場合は `TypedVariableDeclaration.Resolved`、見つからない場合は null
     */
    fun getDeclarationInScopeChain(top: H, currentDepth: Int, variableName: Identifier): TypedVariableDeclaration.Resolved? {
        val vars = variablesByTop[top] ?: return null

        return vars.getDeclarationInSectionChain(currentDepth, variableName)
    }

    /**
     * 指定した AST ルートで次に割り当てられるインデックスを返します。
     *
     * @param top 対象の AST ルートを表す `H`
     *
     * @return 次に割り当てられるインデックス
     */
    fun getIndexInAstNode(top: H): Int {
        val vars = variablesByTop[top]

        return vars?.index ?: 0
    }
}