package com.github.tanokun.reactivesk.skriptadapter.common

interface SkriptNodeAdapter<S, T> {
    fun loadFromSectionNode(sectionNode: S): List<T>

    fun getNext(node: T): T?
}