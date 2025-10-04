package com.github.tanokun.reactivesk.compiler.backend.codegen

import com.github.tanokun.reactivesk.compiler.backend.asFqcn
import com.github.tanokun.reactivesk.compiler.backend.codegen.constructor.ConstructorGenerator
import com.github.tanokun.reactivesk.compiler.backend.codegen.field.FieldsGenerator
import com.github.tanokun.reactivesk.compiler.backend.codegen.method.MethodsGenerator
import com.github.tanokun.reactivesk.lang.ClassDefinition
import net.bytebuddy.ByteBuddy
import net.bytebuddy.ClassFileVersion
import net.bytebuddy.description.type.TypeDescription
import net.bytebuddy.dynamic.DynamicType
import net.bytebuddy.dynamic.scaffold.TypeValidation
import java.lang.reflect.Modifier

/**
 * `ClassDefinition` から JVM バイトコードを生成するジェネレータです。
 * 指定したスーパークラスを継承した動的クラスを生成します。
 *
 * @param T 生成対象のクラスの型パラメータ
 * @param superClass 生成されるクラスのスーパークラス
 * @param constructorGenerator コンストラクタ生成を担当する `ConstructorGenerator<T>`
 * @param methodsGenerator メソッド生成を担当する `MethodsGenerator<T>`
 * @param fieldsGenerator フィールド生成を担当する `FieldsGenerator<T>`
 */
class JvmBytecodeGenerator<T>(
    val superClass: Class<T>,
    private val constructorGenerator: ConstructorGenerator<T>,
    private val methodsGenerator: MethodsGenerator<T>,
    private val fieldsGenerator: FieldsGenerator<T>,
) {

    /**
     * 指定した `ClassDefinition` から動的にクラスを生成して返します。
     *
     * @param classDefinition 生成元の `ClassDefinition`
     *
     * @return 生成された `DynamicType.Unloaded<T>`
     */
    @Suppress("UNCHECKED_CAST")
    fun generateClass(classDefinition: ClassDefinition): DynamicType.Unloaded<out T> {
        val fqcn = classDefinition.className.asFqcn()

        var builder: DynamicType.Builder<out T> = ByteBuddy(ClassFileVersion.JAVA_V8)
            .with(TypeValidation.DISABLED)
            .subclass(TypeDescription.ForLoadedType.of(superClass))
            .name(fqcn)
            .modifiers(Modifier.PUBLIC) as DynamicType.Builder<out T>

        builder = fieldsGenerator.defineFields(builder, classDefinition)
        builder = methodsGenerator.defineAllMethods(builder, classDefinition)
        builder = constructorGenerator.defineConstructor(builder, classDefinition)

        return builder.make()
    }
}