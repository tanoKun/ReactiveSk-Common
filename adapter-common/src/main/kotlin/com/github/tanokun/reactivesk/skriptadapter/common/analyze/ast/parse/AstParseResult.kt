package com.github.tanokun.reactivesk.skriptadapter.common.analyze.ast.parse

import com.github.tanokun.reactivesk.compiler.frontend.analyze.ast.AstNode

sealed class AstParseResult {
    /**
     * 解析結果として単一のAstSectionと次に処理すべきTを返す
     */
    data class Single<T>(
        val astNode: AstNode<T>,
        val nextItem: T?
    ) : AstParseResult()
    
    /**
     * 解析をスキップして、標準のLine処理に委譲する
     */
    object Skip : AstParseResult()
}
