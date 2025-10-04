package com.github.tanokun.reactivesk.skriptadapter.common.dynamic.classloader

import net.bytebuddy.dynamic.DynamicType

/**
 * 動的に生成されたバイトコードを読み込むクラスローダーです。
 * 指定されたバイト配列からクラスを定義して返します。
 *
 * @param parent 親のクラスローダー
 * @param unloadedTypes 読み込む未ロードの型の一覧
 */
class DynamicClassLoader(
    parent: ClassLoader,
    unloadedTypes: List<DynamicType.Unloaded<*>>
) : ClassLoader(parent) {
    private val byteCodeByName: Map<String, ByteArray> = unloadedTypes.associateBy(
        { it.typeDescription.name },
        { it.bytes }
    )

    /**
     * 指定した完全修飾名のクラスを検索して返します。
     * バイトコードが見つかればそのバイトコードからクラスを定義して返します。
     *
     * @param name 検索するクラスの完全修飾名
     *
     * @return 見つかったクラス、存在しない場合はスーパークラスローダーに委譲して結果を返します
     */
    override fun findClass(name: String): Class<*> {
        val byteCode = byteCodeByName[name]
        if (byteCode != null) {
            return defineClass(name, byteCode, 0, byteCode.size)
        }
        return super.findClass(name)
    }
}