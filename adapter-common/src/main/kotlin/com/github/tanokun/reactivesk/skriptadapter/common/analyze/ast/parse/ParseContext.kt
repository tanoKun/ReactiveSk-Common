package com.github.tanokun.reactivesk.skriptadapter.common.analyze.ast.parse

import com.github.tanokun.reactivesk.compiler.frontend.analyze.ast.AstNode

/**
 * 解析時に使用するコンテキスト情報を保持するデータクラスです。
 * パーサー間で構造解析を委譲するための関数と停止条件を保持します。
 *
 * @param T ノードの型
 *
 * @param parseStruct ブロック解析を行う関数 `(T?, T?) -> AstNode.Struct<T>`
 * @param stopExclusive 解析を停止する対象のノード、存在しない場合は null
 */
data class ParseContext<T>(
    val parseStruct: (T?, T?) -> AstNode.Struct<T>,
    val stopExclusive: T?
)
