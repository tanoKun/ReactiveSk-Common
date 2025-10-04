package com.github.tanokun.reactivesk.compiler.backend.intrinsics

/**
 * トリガー対象のアイテム操作を提供するインターフェースです。
 * 実装はトリガーの実行処理を提供します。
 * 実装は `INSTANCE` フィールドをシングルトンとして持つ必要があります。
 */
interface TriggerItemIntrinsics {
    /**
     * トリガーを実行します。
     *
     * @param trigger 実行対象のトリガーオブジェクト
     * @param event トリガーに渡すイベントオブジェクト
     */
    fun walk(trigger: Any?, event: Any)
}