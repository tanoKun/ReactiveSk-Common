package com.github.tanokun.reactivesk.skriptadapter.common.dynamic

import com.github.tanokun.reactivesk.lang.Identifier

/**
 * 動的クラスの変更差分を表す封印インターフェースです。
 * 追加・削除・変更の各種差分を表現します。
 *
 * @property className 差分対象のクラス名を表す [Identifier]
 */
sealed interface ChangedDifference {
    val className: Identifier

    /**
     * クラスが追加された差分を表します。
     *
     * @param className 追加されたクラスの名前を表す [Identifier]
     * @param new 追加後のクラスを表す `Class<*>`
     */
    data class Added(override val className: Identifier, val new: Class<*>) : ChangedDifference

    /**
     * クラスが削除された差分を表します。
     *
     * @param className 削除されたクラスの名前を表す [Identifier]
     * @param previous 削除前のクラスを表す `Class<*>`
     */
    data class Removed(override val className: Identifier, val previous: Class<*>) : ChangedDifference

    /**
     * クラスが変更された差分を表します。
     *
     * @param className 変更対象のクラスの名前を表す [Identifier]
     * @param previous 変更前のクラスを表す `Class<*>`
     * @param new 変更後のクラスを表す `Class<*>`
     */
    data class Changed(override val className: Identifier, val previous: Class<*>, val new: Class<*>) : ChangedDifference
}