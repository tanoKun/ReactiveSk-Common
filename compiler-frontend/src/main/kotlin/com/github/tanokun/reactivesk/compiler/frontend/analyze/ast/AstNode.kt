package com.github.tanokun.reactivesk.compiler.frontend.analyze.ast

import com.github.tanokun.reactivesk.lang.Identifier

/**
 * 解析された AST のノードを表す封印インターフェースです。
 * 各種ノードは行ノード、セクションノード、構造ノードなどに分類されます。
 *
 * @param H ノードが保持するハンドラの型
 */
sealed interface AstNode<H> {
    val handler: H?

    /**
     * `else if` 相当の節を表すデータクラスです。
     *
     * @param handler セクションに紐づくハンドラ
     * @param thenSection `then` 節の構造を表す `Struct<H>`
     */
    data class ElseIf<H>(val handler: H?, val thenSection: Struct<H>)

    /**
     * ブロックや条件などの複数要素を持つセクションを表す封印インターフェースです。
     *
     * @param H セクション内のハンドラの型
     */
    sealed interface Section<H> : AstNode<H> {
        /**
         * ループセクションを表します。
         *
         * @param handler セクションに紐づくハンドラ
         * @param elements セクション内の要素のリスト
         */
        data class Loop<H>(override val handler: H?, val elements: List<AstNode<H>>) : Section<H>
        /**
         * その他のセクション（汎用）を表します。
         *
         * @param handler セクションに紐づくハンドラ
         * @param elements セクション内の要素のリスト
         */
        data class Other<H>(override val handler: H?, val elements: List<AstNode<H>>) : Section<H>
        /**
         * 条件分岐（if-elseif-else）を表します。
         *
         * @param handler セクションに紐づくハンドラ
         * @param thenSection `then` 節の構造を表す `Struct<H>`
         * @param elseIfSections `else if` 節のリスト
         * @param elseSection `else` 節、存在しない場合は null
         */
        data class If<H>(
            override val handler: H?,
            val thenSection: Struct<H>, val elseIfSections: List<ElseIf<H>>, val elseSection: Struct<H>?
        ) : Section<H>
    }

    /**
     * 構造ノード（ブロック）を表します。
     *
     * @param handler この構造に紐づくハンドラ
     * @param elements この構造内の要素リスト
     */
    data class Struct<H>(override val handler: H?, val elements: List<AstNode<H>>) : AstNode<H>

    /**
     * 単一行の処理を表す封印インターフェースです。
     *
     * @param H 行に紐づくハンドラの型
     */
    sealed interface Line<H>: AstNode<H> {
        /**
         * 関数の `return` を表す行ノードです。
         *
         * @param handler 行に紐づくハンドラ
         */
        data class FunReturn<H>(override val handler: H?) : Line<H>
        /**
         * フィールド解決（代入など）を表す行ノードです。
         *
         * @param handler 行に紐づくハンドラ
         * @param fieldName 解決対象のフィールド名を表す `Identifier`
         */
        data class ResolveField<H>(override val handler: H?, val fieldName: Identifier) : Line<H>
        /**
         * `exit effect` 相当の終了を表す行ノードです。
         *
         * @param handler 行に紐づくハンドラ
         */
        data class Exit<H>(override val handler: H?) : Line<H>
        /**
         * その他の行ノードを表します。
         *
         * @param handler 行に紐づくハンドラ
         */
        data class Other<H>(override val handler: H?) : Line<H>
    }
}