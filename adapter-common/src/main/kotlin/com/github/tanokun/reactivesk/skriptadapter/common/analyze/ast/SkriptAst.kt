package com.github.tanokun.reactivesk.skriptadapter.common.analyze.ast

import com.github.tanokun.reactivesk.compiler.frontend.analyze.ast.AstNode

/**
 * Skript の解析結果を保持する AST を表すデータクラスです。
 * 先頭の要素とルートの構造を保持します。
 *
 * @param T 解析対象のノードの型
 * @param first AST の最初の要素、存在しない場合は null
 * @param root ルートの構造を表す `AstNode.Struct<T>`
 */
data class SkriptAst<T>(val first: T?, val root: AstNode.Struct<T>)