package com.github.tanokun.reactivesk.compiler.frontend.analyze.variable

import com.github.tanokun.reactivesk.lang.Identifier

/**
 * 型付き変数宣言を表す封印インターフェースです。
 * 変数名や型、可変性、スコープ深さおよびインデックスを保持します。
 *
 * @param variableName 変数名を表す [Identifier]
 * @param type 変数の型を表す `Class<*>`
 * @param isMutable 変数が可変かどうかを示すフラグ
 * @param depth 変数が宣言されたスコープの深さ(0起点)
 * @param index 変数に割り当てられたインデックス
 */
sealed interface TypedVariableDeclaration {
    val variableName: Identifier
    val type: Class<*>
    val isMutable: Boolean
    val depth: Int
    val index: Int

    /**
     * 未解決の変数宣言を表します。
     * 登録時に `resolve` によりインデックスが割り当てられます。
     *
     * @param variableName 変数名を表す [Identifier]
     * @param type 変数の型を表す `Class<*>`
     * @param isMutable 変数が可変かどうかを示すフラグ
     * @param depth 変数が宣言された深さ
     */
    data class Unresolved(
        override val variableName: Identifier,
        override val type: Class<*>,
        override val isMutable: Boolean,
        override val depth: Int,
    ) : TypedVariableDeclaration {
        override val index: Int = -1

        /**
         * 未解決宣言に対してインデックスを割り当てて解決済み宣言を返します。
         *
         * @param newIndex 割り当てるインデックス
         *
         * @return 解決済みの `TypedVariableDeclaration.Resolved`
         */
        fun resolve(newIndex: Int): Resolved =
            Resolved(variableName = variableName, type = type, isMutable = isMutable, depth = depth, index = newIndex)
    }

    /**
     * 解決済みの変数宣言を表します。
     *
     * @param variableName 変数名を表す [Identifier]
     * @param type 変数の型を表す `Class<*>`
     * @param isMutable 変数が可変かどうかを示すフラグ
     * @param depth 変数が宣言された深さ
     * @param index 割り当てられたインデックス
     */
    data class Resolved(
        override val variableName: Identifier,
        override val type: Class<*>,
        override val isMutable: Boolean,
        override val depth: Int,
        override val index: Int,
    ) : TypedVariableDeclaration
}