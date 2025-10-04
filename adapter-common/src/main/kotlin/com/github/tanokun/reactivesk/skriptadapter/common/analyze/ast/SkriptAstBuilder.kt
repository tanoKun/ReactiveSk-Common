package com.github.tanokun.reactivesk.skriptadapter.common.analyze.ast

import com.github.tanokun.reactivesk.compiler.frontend.analyze.ast.AstNode
import com.github.tanokun.reactivesk.skriptadapter.common.SkriptNodeAdapter
import com.github.tanokun.reactivesk.skriptadapter.common.analyze.ast.parse.AstParseResult
import com.github.tanokun.reactivesk.skriptadapter.common.analyze.ast.parse.ParseContext
import com.github.tanokun.reactivesk.skriptadapter.common.analyze.ast.parse.NodeParser
import kotlin.collections.firstOrNull
import kotlin.collections.sortedByDescending

/**
 * Skript のノード列から AST を構築するビルダークラスです。
 * 指定したパーサ群を用いてノード列を解析し `AstNode.Struct` を生成します。
 *
 * @param parsers 使用するパーサのリスト（`NodeParser<T>` のリスト）
 * @param skriptNodeAdapter ノード列の読み取りを行うアダプタ（`SkriptNodeAdapter<S, T>`）
 */
class SkriptAstBuilder<S, T>(
    parsers: List<NodeParser<T>>,
    private val skriptNodeAdapter: SkriptNodeAdapter<S, T>,
) {
    private val parsers = parsers.sortedByDescending { it.priority }

    /**
     * 指定したセクションノードから `SkriptAst` を構築して返します。
     *
     * @param sectionNode AST を構築する元となるセクションノード
     *
     * @return 構築された `SkriptAst<T>`
     */
    fun buildFromSectionNode(sectionNode: S): SkriptAst<T> {
        val items = skriptNodeAdapter.loadFromSectionNode(sectionNode)
        val first = items.firstOrNull()

        return SkriptAst(first, buildFromT(first))
    }

    /**
     * 指定した最初のノードから `AstNode.Struct` を構築して返します。
     *
     * @param first 構築を開始する最初のノード
     *
     * @return 構築された `AstNode.Struct<T>`
     */
    fun buildFromT(first: T?): AstNode.Struct<T> {
        return AstNode.Struct(first, parseBlock(first, stopExclusive = null).elements)
    }

    @Suppress("UNCHECKED_CAST")
    private fun parseBlock(startItem: T?, stopExclusive: T?): AstNode.Struct<T> {
        val elements = mutableListOf<AstNode<T>>()
        var currentItem: T? = startItem
        val visitedItems = mutableSetOf<T>()

        while (currentItem != null && currentItem !== stopExclusive) {
            if (!visitedItems.add(currentItem)) {
                System.err.println("Warning: Circular reference detected at $currentItem. Stopping parse.")
                break
            }

            val context = ParseContext(
                parseStruct = ::parseBlock,
                stopExclusive = stopExclusive
            )

            val handler = findParser(currentItem)
            val parseResult = handler?.parse(currentItem, context)

            val (astSection, nextItem) = when (parseResult) {
                is AstParseResult.Single<*> -> {
                    parseResult.astNode to parseResult.nextItem
                }
                is AstParseResult.Skip, null -> {
                    AstNode.Line.Other(currentItem) to skriptNodeAdapter.getNext(currentItem)
                }
            }

            elements.add(astSection as AstNode<T>)
            currentItem = nextItem as? T
        }

        return AstNode.Struct(startItem, elements)
    }

    private fun findParser(item: T): NodeParser<T>? {
        return parsers.firstOrNull { it.canHandle(item) }
    }
}