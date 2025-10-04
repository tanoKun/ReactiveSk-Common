package com.github.tanokun.reactivesk.compiler.backend.codegen.method

/**
 * 関数のトリガーフィールドを指定するためのアノテーションです。
 *
 * @param triggerField トリガーフィールドの名前
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class TriggerMetadata(val triggerField: String)