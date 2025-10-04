package com.github.tanokun.reactivesk.skriptadapter.common.dynamic

import com.github.tanokun.reactivesk.compiler.backend.codegen.JvmBytecodeGenerator
import com.github.tanokun.reactivesk.lang.Identifier
import com.github.tanokun.reactivesk.skriptadapter.common.dynamic.classloader.DynamicClassLoader
import com.github.tanokun.reactivesk.skriptadapter.common.dynamic.classloader.DynamicClassDefinitionLoader
import java.io.File
import java.lang.ref.WeakReference

/**
 * 動的クラスの管理を行うクラスです。
 * スクリプトフォルダからクラス定義を読み込み、JVM バイトコードを生成して動的に読み込みます。
 *
 * @param scriptRootFolder クラス定義を検索するスクリプトのルートフォルダ
 * @param jvmBytecodeGenerator バイトコードを生成するためのジェネレータ
 */
class DynamicClassManager<T>(private val scriptRootFolder: File, private val jvmBytecodeGenerator: JvmBytecodeGenerator<T>) {
    private var currentClassLoader: WeakReference<DynamicClassLoader>? = null
    private var loadedClasses: Map<Identifier, Class<out T>> = emptyMap()
    val definitionLoader = DynamicClassDefinitionLoader()

    /**
     * 初期化を行い、すべてのクラスを読み込みます。
     */
    fun initialize() {
        this.loadedClasses = performFullLoad()
    }

    /**
     * 変更を検出して再読み込みを行い、差分を返します。
     *
     * @return 検出された変更差分のリスト
     */
    fun reload(): List<ChangedDifference> {
        val oldClasses = this.loadedClasses
        val newClasses = performFullLoad()
        this.loadedClasses = newClasses
        return calculateDifferences(oldClasses, newClasses)
    }

    @Suppress("UNCHECKED_CAST")
    private fun performFullLoad(): Map<Identifier, Class<T>> {
        definitionLoader.loadAllClassesFrom(scriptRootFolder)

        val allDefinitions = definitionLoader.getAllDefinitions()

        val unloadedTypes = allDefinitions.map { definition ->
            jvmBytecodeGenerator.generateClass(definition)
        }

        val newClassLoader = DynamicClassLoader(this.javaClass.classLoader, unloadedTypes)
        this.currentClassLoader = WeakReference(newClassLoader)

        return unloadedTypes.associate { unloadedType ->
            val loadedClass = newClassLoader.loadClass(unloadedType.typeDescription.name) as Class<T>
            Identifier(loadedClass.simpleName) to loadedClass
        }
    }

    /**
     * 指定した型名に対応する読み込まれたクラスを返します。
     *
     * @param typeName 検索する型名を表す [Identifier]
     *
     * @return 見つかった場合は対応する `Class<T>`、見つからない場合は null
     */
    fun getLoadedClass(typeName: Identifier): Class<out T>? {
        return loadedClasses[typeName]
    }

    private fun calculateDifferences(oldMap: Map<Identifier, Class<*>>, newMap: Map<Identifier, Class<T>>): List<ChangedDifference> {
        val changedDifferences = mutableListOf<ChangedDifference>()
        val allKeys = oldMap.keys union newMap.keys

        for (key in allKeys) {
            val oldClass = oldMap[key]
            val newClass = newMap[key]
            val changedDifference = when {
                newClass != null && oldClass == null -> ChangedDifference.Added(key, newClass)
                oldClass != null && newClass == null -> ChangedDifference.Removed(key, oldClass)
                newClass != null && oldClass != null -> ChangedDifference.Changed(key, oldClass, newClass)
                else -> null
            }
            changedDifference?.let { changedDifferences.add(it) }
        }
        return changedDifferences
    }
}
