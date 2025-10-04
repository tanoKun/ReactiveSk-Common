package com.github.tanokun.reactivesk.compiler.frontend.analyze.ast.result

import com.github.tanokun.reactivesk.compiler.frontend.analyze.ast.AstNode

/**
 * 解析中に発見された問題点（エラーや警告）を表すデータクラスです。
 *
 * @param message 問題を説明するメッセージ
 * @param location 問題が発生した箇所を表す `AstNode<T>`
 * @param severity 問題の重大度を表す `Severity`
 */
data class Diagnostic<T>(
    val message: String,
    val location: AstNode<T>,
    val severity: Severity = Severity.ERROR
)