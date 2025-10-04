package com.github.tanokun.reactivesk.compiler.backend.codegen.field

import com.github.tanokun.reactivesk.compiler.backend.ClassResolver
import com.github.tanokun.reactivesk.compiler.backend.codegen.util.internalArrayListSetterOf
import com.github.tanokun.reactivesk.compiler.backend.codegen.util.internalFieldOf
import com.github.tanokun.reactivesk.compiler.backend.codegen.util.internalSetterOf
import com.github.tanokun.reactivesk.compiler.backend.intrinsics.JVM_SETTER_INSTANCE_FIELD
import com.github.tanokun.reactivesk.compiler.backend.intrinsics.JvmSetterIntrinsics
import com.github.tanokun.reactivesk.compiler.backend.intrinsics.getCheckTypesMethod
import com.github.tanokun.reactivesk.compiler.backend.metadata.ModifierMetadata
import com.github.tanokun.reactivesk.lang.ClassDefinition
import com.github.tanokun.reactivesk.lang.PropertyModifiers.isFactor
import net.bytebuddy.description.type.TypeDescription
import net.bytebuddy.dynamic.DynamicType
import net.bytebuddy.implementation.Implementation
import net.bytebuddy.implementation.MethodCall
import java.lang.reflect.Modifier

/**
 * クラス定義からフィールドおよび対応するセッタを生成するジェネレータです。
 * プロパティの型解決と単一要素／配列用のセッタを定義します。
 *
 * @param T 生成対象のクラスの型パラメータ
 * @param classResolver 型解決を行う `ClassResolver`
 * @param jvmSetterIntrinsics 変更通知や型チェックを行うイントリンシックのクラス
 */
class FieldsGenerator<T>(
    private val classResolver: ClassResolver,
    private val jvmSetterIntrinsics: Class<out JvmSetterIntrinsics>,
) {
    fun defineFields(
        builder: DynamicType.Builder<T>,
        classDefinition: ClassDefinition,
    ): DynamicType.Builder<T> {
        var current = builder

        classDefinition.getProperties().forEach { field ->
            val name = field.propertyName.identifier
            val fieldType = classResolver.resolveTypeDescription(field.typeName, field.isArray)
            val actualType = classResolver.resolveTypeDescription(field.typeName, false)

            current = defineBaseField(current, name, fieldType, field.modifiers)

            current =
                if (!field.isArray) defineNonArraySetter(current, name, fieldType, field.modifiers.isFactor())
                else defineArraySetters(current, name, actualType, field.modifiers.isFactor())

        }

        return current
    }

    private fun defineBaseField(
        builder: DynamicType.Builder<T>,
        name: String,
        fieldType: TypeDescription,
        modifiers: Int
    ): DynamicType.Builder<T> {
        return builder
            .defineField(internalFieldOf(name), fieldType, Modifier.PUBLIC)
            .annotateField(ModifierMetadata(modifiers))
    }

    private fun defineNonArraySetter(
        builder: DynamicType.Builder<T>,
        name: String,
        fieldType: TypeDescription,
        isFactor: Boolean,
    ): DynamicType.Builder<T> {
        val setterName = internalSetterOf(name)

        val appender = ValueSetterAppender(
            fieldName = internalFieldOf(name),
            propertyNameLiteral = name,
            isFactor = isFactor,
            intrinsicsObjectClass = jvmSetterIntrinsics, // Kotlin object
        )

        return builder
            .defineMethod(setterName, Void.TYPE, Modifier.PUBLIC)
            .withParameters(fieldType, TypeDescription.ForLoadedType.of(Boolean::class.java))
            .intercept(Implementation.Simple(appender))
    }

    private fun defineArraySetters(
        builder: DynamicType.Builder<T>,
        name: String,
        actualType: TypeDescription,
        isFactor: Boolean
    ): DynamicType.Builder<T> {
        val setterName = internalArrayListSetterOf(name)

        val appender = ValueSetterAppender(
            fieldName = internalFieldOf(name),
            propertyNameLiteral = name,
            isFactor = isFactor,
            intrinsicsObjectClass = jvmSetterIntrinsics, // Kotlin object
        )

        val intercept = MethodCall.invoke(jvmSetterIntrinsics.getCheckTypesMethod())
            .onField(jvmSetterIntrinsics.JVM_SETTER_INSTANCE_FIELD)
            .withArgument(0)
            .with(actualType)
            .andThen(Implementation.Simple(appender))

        val result = builder
            .defineMethod(setterName, Void.TYPE, Modifier.PUBLIC)
            .withParameters(ArrayList::class.java, Boolean::class.java)
            .intercept(intercept)

        return result
    }
}