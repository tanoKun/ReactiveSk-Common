package com.github.tanokun.reactivesk.compiler.backend.intrinsics

import java.lang.reflect.Field
import java.lang.reflect.Method

/**
 * バックエンドで使用するイントリンシックへのリフレクションアクセスを補助するユーティリティです。
 * 各種イントリンシックオブジェクトのフィールドやメソッドを取得する拡張プロパティ/関数を提供します。
 */

/**
 * `TriggerItemIntrinsics` 実装の `INSTANCE` フィールドを表す `Field` を返します。
 */
val Class<out TriggerItemIntrinsics>.TRIGGER_ITEM_INSTANCE_FIELD: Field
    get() = this.getField("INSTANCE")

/**
 * `TriggerItemIntrinsics` の `walk` メソッドを返します。
 *
 * @return `Method` 型の `walk` メソッド
 */
fun Class<out TriggerItemIntrinsics>.getWalkMethod(): Method =
    this.getMethod("walk", Any::class.java, Any::class.java)

/**
 * `VariableFramesIntrinsics` の `beginFrame` メソッドを返します。
 *
 * @return `Method` 型の `beginFrame` メソッド
 */
fun Class<out VariableFramesIntrinsics>.getBeginFrameMethod(): Method =
    this.getMethod("beginFrame", Any::class.java, Int::class.java)

/**
 * `VariableFramesIntrinsics` の `set` メソッドを返します。
 *
 * @return `Method` 型の `set` メソッド
 */
fun Class<out VariableFramesIntrinsics>.getSetMethod(): Method =
    this.getMethod("set", Any::class.java, Int::class.java, Any::class.java)

/**
 * `VariableFramesIntrinsics` 実装の `INSTANCE` フィールドを表す `Field` を返します。
 */
val Class<out VariableFramesIntrinsics>.VARIABLE_FRAMES_INSTANCE_FIELD: Field
    get() = this.getField("INSTANCE")

/**
 * `JvmSetterIntrinsics` の `notifyChanged` メソッドを返します。
 *
 * @return `Method` 型の `notifyChanged` メソッド
 */
fun Class<out JvmSetterIntrinsics>.getNotifyChangedMethod(): Method =
    this.getMethod("notifyChanged", Boolean::class.java, Any::class.java, String::class.java, Any::class.java, Any::class.java)

/**
 * `JvmSetterIntrinsics` の `checkTypes` メソッドを返します。
 *
 * @return `Method` 型の `checkTypes` メソッド
 */
fun Class<out JvmSetterIntrinsics>.getCheckTypesMethod(): Method =
    this.getMethod("checkTypes", ArrayList::class.java, Class::class.java)

/**
 * `JvmSetterIntrinsics` 実装の `INSTANCE` フィールドを表す `Field` を返します。
 *
 * @return `Field` 型の `INSTANCE` フィールド
 */
val Class<out JvmSetterIntrinsics>.JVM_SETTER_INSTANCE_FIELD: Field
    get() = this.getField("INSTANCE")