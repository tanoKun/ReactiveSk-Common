package com.github.tanokun.reactivesk.skriptadapter.common.analyze.ast.parse

import com.github.tanokun.reactivesk.compiler.frontend.analyze.ast.AstNode

/**
 * ノード解析の結果を表すクラスです。
 */
sealed class AstParseResult {
    /**
     * 解析結果として単一の AST セクションと次に処理すべき項目を返します。
     *
     * @param T ノードの型
     * @param astNode 生成された `AstNode<T>`
     * @param nextItem 次に処理する項目、存在しない場合は null
     */
    data class Single<T>(
        val astNode: AstNode<T>,
        val nextItem: T?
    ) : AstParseResult()
    
    /**
     * 解析をスキップし、標準の行処理に委譲することを示すオブジェクトです。
     */
    object Skip : AstParseResult()
}
