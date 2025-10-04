package com.github.tanokun.reactivesk.compiler.frontend.analyze.variable

import com.github.tanokun.reactivesk.lang.Identifier

/**
 * 型付き変数のテーブルと補助クラスを提供します。
 * 深さとセクション単位で変数宣言を管理し、解決や登録を行います。
 *
 * @param byDepth 深さごとのセクションテーブルを保持するマップを含む `Table`
 */
data class Table(
    val byDepth: MutableMap<Depth, MutableMap<SectionId, MutableMap<Identifier, TypedVariableDeclaration.Resolved>>> = mutableMapOf()
)

/**
 * 型付き変数の管理を行うクラスです。
 * 変数の宣言・解決・セクション管理を行います。
 *
 * @param table 内部で使用する `Table`
 * @param sectionIds 深さごとの現在の `SectionId` を保持するマップ
 * @param lastSection 深さごとの最後に見た `AstNode.Section` を保持するマップ
 * @param index 宣言時に割り当てる連番インデックス
 */
class TypedVariables<S>(
    private val table: Table = Table(),
    private val sectionIds: MutableMap<Depth, SectionId> = mutableMapOf(),
    private val lastSection: MutableMap<Depth, S?> = mutableMapOf(),
    var index: Int = 0
) {
    /**
     * 指定した深さの `SectionId` を返します。
     * 存在しない場合は 0 を返します。
     *
     * @param depth 取得する深さ
     *
     * @return 指定深さの `SectionId`
     */
    fun getSectionId(depth: Depth): SectionId = sectionIds[depth] ?: 0

    /**
     * 指定した深さに `SectionId` を設定します。
     * 必要に応じてセクションテーブルを初期化します。
     *
     * @param depth 設定する深さ
     * @param sectionId 設定する `SectionId`
     */
    fun setSectionId(depth: Depth, sectionId: SectionId) {
        sectionIds[depth] = sectionId

        ensureSectionTable(depth, sectionId)
    }

    /**
     * 指定した深さの最後に見た `Section` を返します。
     *
     * @param depth 取得する深さ
     *
     * @return 最後に見た `Section`、存在しない場合は null
     */
    fun getLastSection(depth: Depth): S? = lastSection[depth]

    /**
     * 指定した深さの最後に見た `Section` を設定します。
     *
     * @param depth 設定する深さ
     * @param section 設定する `Section`、存在しない場合は null
     */
    fun setLastSection(depth: Depth, section: S?) {
        lastSection[depth] = section
    }

    /**
     * 指定した深さとセクションID内で変数宣言を検索して返します。
     *
     * @param depth 検索する深さ
     * @param sectionId 検索する `SectionId`
     * @param variableName 検索する変数名を表す `Identifier`
     *
     * @return 見つかった場合は `TypedVariableDeclaration.Resolved`、見つからない場合は null
     */
    fun getDeclaration(depth: Depth, sectionId: SectionId, variableName: Identifier): TypedVariableDeclaration.Resolved? {
        return table.byDepth[depth]?.get(sectionId)?.get(variableName)
    }

    /**
     * スコープチェーンを辿って変数宣言を解決します。
     * 深さ 0 から現在の深さまで上位のセクションを探索します。
     *
     * @param currentDepth 現在の深さ
     * @param variableName 解決する変数名を表す `Identifier`
     *
     * @return 見つかった場合は `TypedVariableDeclaration.Resolved`、見つからない場合は null
     */
    fun getDeclarationInSectionChain(currentDepth: Depth, variableName: Identifier): TypedVariableDeclaration.Resolved? {
        for (depth in currentDepth downTo 0) {
            val sectionId = getSectionId(depth)
            val found = getDeclaration(depth, sectionId, variableName)

            if (found != null) return found
        }
        return null
    }

    /**
     * 現在のセクションID の範囲内で変数宣言を検索して返します。
     *
     * @param depth 検索する深さ
     * @param variableName 解決する変数名を表す `Identifier`
     *
     * @return 見つかった場合は `TypedVariableDeclaration.Resolved`、見つからない場合は null
     */
    fun getDeclarationInCurrentSectionId(depth: Depth, variableName: Identifier): TypedVariableDeclaration.Resolved? {
        val sectionId = getSectionId(depth)

        return getDeclaration(depth, sectionId, variableName)
    }

    /**
     * 未解決の宣言を解決して登録します。
     * 登録時に内部のインデックスを割り当てます。
     *
     * @param declaration 登録する未解決宣言を表す `TypedVariableDeclaration.Unresolved`
     *
     * @return 登録後の `TypedVariableDeclaration.Resolved`
     */
    fun declare(declaration: TypedVariableDeclaration.Unresolved): TypedVariableDeclaration.Resolved {
        val depth = declaration.depth
        val sectionId = getSectionId(depth)
        val tableMap = ensureSectionTable(depth, sectionId)
        val next = index++

        val indexed = declaration.resolve(next)
        tableMap[declaration.variableName] = indexed

        return indexed
    }

    /**
     * 指定した深さとセクションID のテーブルを保証し、存在しなければ生成して返します。
     *
     * @param depth 対象の深さ
     * @param sectionId 対象の `SectionId`
     *
     * @return 対象のセクションテーブル（変数名 -> 宣言）
     */
    fun ensureSectionTable(depth: Depth, sectionId: SectionId): MutableMap<Identifier, TypedVariableDeclaration.Resolved> {
        val depthMap = table.byDepth.getOrPut(depth) { mutableMapOf() }

        return depthMap.getOrPut(sectionId) { mutableMapOf() }
    }
}