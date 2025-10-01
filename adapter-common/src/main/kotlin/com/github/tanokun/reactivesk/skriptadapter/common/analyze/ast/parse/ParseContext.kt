package com.github.tanokun.reactivesk.skriptadapter.common.analyze.ast.parse

import com.github.tanokun.reactivesk.compiler.frontend.analyze.ast.AstNode

data class ParseContext<T>(
    val parseStruct: (T?, T?) -> AstNode.Struct<T>,
    val stopExclusive: T?
)
