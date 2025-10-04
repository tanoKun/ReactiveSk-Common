package com.github.tanokun.reactivesk.skriptadapter.common.analyze.ast.parse

/**
 * ノードを解析するためのインターフェースです。実装は特定の型のノードを受け取り解析を行います。
 *
 * @param T 解析対象のノードの型
 */
interface NodeParser<T> {
    /**
     * このパーサーの優先度を返します。
     *
     * @return 優先度 (高いほど先に処理されます)
     */
    val priority: Int

    /**
     * 指定されたアイテムをこのパーサーが処理できるか判定します。
     *
     * @param item 判定対象のアイテム
     *
     * @return 処理可能であれば true、そうでなければ false
     */
    fun canHandle(item: T): Boolean

    /**
     * 指定されたアイテムを解析して AST としての結果を返します。
     *
     * @param item 解析対象のアイテム
     * @param context 解析時に使用するコンテキスト
     *
     * @return 解析結果を表す `AstParseResult`
     */
    fun parse(item: T, context: ParseContext<T>): AstParseResult
}