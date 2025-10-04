package com.github.tanokun.reactivesk.skriptadapter.common

/**
 * スクリプトノードをアダプトするためのインターフェースです。
 * 実装は特定のソースノードからアダプトされたノード列を生成します。
 *
 * @param S ソースとなるセクションノードの型
 * @param T 生成されるノードの型
 */
interface SkriptNodeAdapter<S, T> {
    /**
     * セクションノードから読み込んだノード列を返します。
     *
     * @param sectionNode 読み込み元のセクションノード
     *
     * @return 読み込まれたノードのリスト
     */
    fun loadFromSectionNode(sectionNode: S): List<T>

    /**
     * 指定したノードの次のノードを返します。
     *
     * @param node 次を取得する元のノード
     *
     * @return 次のノード、存在しない場合は null
     */
    fun getNext(node: T): T?
}