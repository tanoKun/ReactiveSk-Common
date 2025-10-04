package com.github.tanokun.reactivesk.compiler.backend.intrinsics

/**
 * 変数フレーム操作を提供するインターフェースです。
 * 実装はフレームの開始と値設定処理を行います。
 * また、シングルトンインスタンスとして `INSTANCE` フィールドを持つ必要があります。
 */
interface VariableFramesIntrinsics {

    /**
     * フレームを開始します。
     *
     * @param mediator フレーム処理を仲介するオブジェクト
     * @param capacity フレームの初期容量
     */
    fun beginFrame(mediator: Any, capacity: Int = 10)

    /**
     * フレーム内のインデックスに値を設定します。
     *
     * @param mediator フレーム処理を仲介するオブジェクト
     * @param index 設定するインデックス
     * @param value 設定する値
     */
    fun set(mediator: Any, index: Int, value: Any?)
}