package com.github.tanokun.reactivesk.skriptadapter.common.analyze.ast

import com.github.tanokun.reactivesk.compiler.frontend.analyze.ast.AstNode

data class SkriptAst<T>(val first: T?, val root: AstNode.Struct<T>)