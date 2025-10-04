package com.github.tanokun.reactivesk.skriptadapter.common.reflection

import java.lang.reflect.Field

/**
 * リフレクション操作を補助するユーティリティオブジェクトです。
 * フィールドの検索とキャッシュを行います。
 *
 * @property fieldCache 検索結果をキャッシュするマップ
 */
object Reflection {
    private val fieldCache = mutableMapOf<Pair<Class<*>, String>, Field>()

    /**
     * 指定したクラスから名前が一致するフィールドを検索して返します。
     * スーパークラスも遡って検索し、見つかったフィールドはアクセス可能に設定してキャッシュします。
     *
     * @param cls 検索対象のクラス
     * @param name 検索するフィールド名
     *
     * @return 見つかったフィールド
     */
    fun findField(cls: Class<*>, name: String): Field = fieldCache.getOrPut(cls to name) {
        var currentClass: Class<*>? = cls
        while (currentClass != null) {
            try {
                return@getOrPut currentClass.getDeclaredField(name).apply { isAccessible = true }
            } catch (_: NoSuchFieldException) {
                currentClass = currentClass.superclass
            }
        }
        throw NoSuchFieldException("Field '$name' not found in ${cls.name} or its superclasses")
    }
}