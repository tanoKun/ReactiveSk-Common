package com.github.tanokun.reactivesk.compiler.backend.codegen

import com.github.tanokun.reactivesk.compiler.backend.ClassResolver
import com.github.tanokun.reactivesk.compiler.backend.codegen.method.MethodsGenerator
import com.github.tanokun.reactivesk.compiler.backend.codegen.util.internalFunctionNameOf
import com.github.tanokun.reactivesk.compiler.backend.codegen.util.internalFunctionTriggerField
import com.github.tanokun.reactivesk.compiler.backend.intrinsics.TriggerItemIntrinsics
import com.github.tanokun.reactivesk.compiler.backend.intrinsics.VariableFramesIntrinsics
import com.github.tanokun.reactivesk.lang.ClassDefinition
import com.github.tanokun.reactivesk.lang.Identifier
import io.mockk.every
import io.mockk.mockk
import net.bytebuddy.ByteBuddy
import net.bytebuddy.ClassFileVersion
import net.bytebuddy.description.type.TypeDescription
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy
import net.bytebuddy.dynamic.scaffold.TypeValidation
import org.junit.jupiter.api.Assertions.assertTrue
import java.io.File
import kotlin.jvm.java
import kotlin.test.Test

class MethodsGeneratorTest {
    @Test
    fun `defineAllMethods actually generates method and trigger field`() {
        val classResolver = mockk<ClassResolver> {
            every { resolveTypeDescription(Identifier("String")) } returns TypeDescription.ForLoadedType.of(String::class.java)
            every { resolveTypeDescription(Identifier("Int")) } returns TypeDescription.ForLoadedType.of(Int::class.java)
            every { resolveTypeDescription(Identifier("String"), false) } returns TypeDescription.ForLoadedType.of(String::class.java)
        }

        val func = mockk<ClassDefinition.Function> {
            every { functionName } returns Identifier("doSomething")
            every { modifiers } returns 0
            every { returns } returns ClassDefinition.Function.Returns(Identifier("String"), false)
            every { parameters } returns listOf(
                ClassDefinition.Function.Parameter(Identifier("param1"), Identifier("String"), false)
            )
            every { throws } returns emptyList()
        }

        val func2 = mockk<ClassDefinition.Function> {
            every { functionName } returns Identifier("doSomething")
            every { modifiers } returns 0
            every { returns } returns ClassDefinition.Function.Returns(Identifier("String"), false)
            every { parameters } returns listOf(
                ClassDefinition.Function.Parameter(Identifier("param1"), Identifier("Int"), false)
            )
            every { throws } returns emptyList()
        }

        val classDefinition = mockk<ClassDefinition>()
        every { classDefinition.functions } returns listOf(func, func2)

        val generator = MethodsGenerator<Any>(
            classResolver,
            variableFramesIntrinsics = TestHelpers::class.java,
            triggerItemIntrinsics = TestHelpers2::class.java,
        )

        val builder = ByteBuddy(ClassFileVersion.JAVA_V8)
            .with(TypeValidation.DISABLED)
            .subclass(Any::class.java)
            .name("generated.TestGeneratedMethods")

        val resultBuilder = generator.defineAllMethods(builder, classDefinition)

        val dynamicType = resultBuilder.make()
        val loaded = dynamicType
            .load(this::class.java.classLoader, ClassLoadingStrategy.Default.WRAPPER)
            .apply { saveIn(File("generated-classes")) }
            .loaded

        val methodName = internalFunctionNameOf("doSomething")
        val fieldName0 = internalFunctionTriggerField("doSomething", 0)
        val fieldName1 = internalFunctionTriggerField("doSomething", 1)

        assertTrue(loaded.declaredMethods.any { it.name == methodName })
        assertTrue(loaded.declaredFields.any { it.name == fieldName0 })
        assertTrue(loaded.declaredFields.any { it.name == fieldName1 })
    }

    object TestHelpers: VariableFramesIntrinsics {
        override fun set(mediator: Any, index: Int, value: Any?) {

        }
    }

    object TestHelpers2: TriggerItemIntrinsics {
        override fun walk(trigger: Any?, event: Any) {
        }
    }
}
