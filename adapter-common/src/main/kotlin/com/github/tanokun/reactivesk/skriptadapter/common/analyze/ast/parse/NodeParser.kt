package com.github.tanokun.reactivesk.skriptadapter.common.analyze.ast.parse

interface NodeParser<T> {
    val priority: Int

    fun canHandle(item: T): Boolean

    fun parse(item: T, context: ParseContext<T>): AstParseResult
}