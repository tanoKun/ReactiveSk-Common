package com.github.tanokun.reactivesk.skriptadapter.common

import com.github.tanokun.reactivesk.compiler.backend.ClassResolver
import com.github.tanokun.reactivesk.compiler.backend.codegen.JvmBytecodeGenerator
import com.github.tanokun.reactivesk.compiler.backend.intrinsics.VariableFramesIntrinsics
import com.github.tanokun.reactivesk.lang.Identifier

interface SkriptAdapter<T, A> {
    fun getSkriptClass(className: Identifier): Class<*>?

    fun registerClassToSkript(addon: A)

    fun T.getFirstInSection(): T?

    fun createJvmBytecodeGenerator(
        superClass: Class<*>,
        classResolver: ClassResolver,
        variableFrames: VariableFramesIntrinsics,
        isImplementingBeginFrame: Boolean
    ): JvmBytecodeGenerator
}