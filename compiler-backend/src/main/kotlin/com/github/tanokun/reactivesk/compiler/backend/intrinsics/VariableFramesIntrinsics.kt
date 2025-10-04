package com.github.tanokun.reactivesk.compiler.backend.intrinsics

/**
 * 変数フレーム操作を提供するインターフェースです。
 * 実装は値設定処理を行います。
 * また、シングルトンインスタンスとして `INSTANCE` フィールドを持つ必要があります。
 */
interface VariableFramesIntrinsics {
    /**
     * フレーム内のインデックスに値を設定します。
     *
     * @param mediator フレーム処理を仲介するオブジェクト
     * @param index 設定するインデックス
     * @param value 設定する値
     */
    fun set(mediator: Any, index: Int, value: Any?)
}