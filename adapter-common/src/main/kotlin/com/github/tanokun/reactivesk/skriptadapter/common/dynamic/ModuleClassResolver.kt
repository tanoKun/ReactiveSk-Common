package com.github.tanokun.reactivesk.skriptadapter.common.dynamic

import com.github.tanokun.reactivesk.compiler.backend.ClassResolver
import com.github.tanokun.reactivesk.lang.Identifier
import net.bytebuddy.description.annotation.AnnotationList
import net.bytebuddy.description.type.TypeDescription
import java.lang.reflect.Modifier

/**
 * モジュール内の型名を解決するためのクラスです。
 * 動的に読み込まれたクラスと静的なクラス解決ロジックを組み合わせて型記述を返します。
 *
 * @param T 解決対象となるクラスの型パラメータ
 * @param moduleManager 動的クラスを管理する [DynamicClassManager]
 * @param staticClassResolver 静的なクラス解決を行う関数
 */
class ModuleClassResolver<T>(
    private val moduleManager: DynamicClassManager<T>,
    private val staticClassResolver: (Identifier) -> Class<*>?
): ClassResolver {
    /**
     * 指定した型名を解決して [TypeDescription] を返します。
     *
     * @param typeName 解決する型名を表す [Identifier]
     * @param isArray 配列型であるかどうか
     *
     * @return 解決された `TypeDescription`
     */
    override fun resolveTypeDescription(typeName: Identifier, isArray: Boolean): TypeDescription {
        if (isArray) return TypeDescription.ForLoadedType.of(ArrayList::class.java)
        if (typeName.identifier == "void") return TypeDescription.ForLoadedType.of(Void.TYPE)

        moduleManager.getLoadedClass(typeName)?.let { return TypeDescription.ForLoadedType.of(it) }
        staticClassResolver(typeName)?.let { return TypeDescription.ForLoadedType.of(it) }

        val fqcn = "com.github.tanokun.reactivesk.dynamic.$typeName"

        return SafeLatentTypeDescription(fqcn)
    }

    /**
     * 安全な潜在的型記述を表す内部クラスです。
     * これは指定した完全修飾名での型参照を表現します。
     *
     * @param name 型の完全修飾名
     */
    internal class SafeLatentTypeDescription(name: String) : TypeDescription.Latent(
        name,
        Modifier.PUBLIC,
        TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(Any::class.java),
        emptyList()
    ) {
        override fun getDeclaringType(): TypeDescription = this

        override fun getInnerClassCount(): Int = 0

        override fun getDeclaredAnnotations(): AnnotationList = AnnotationList.Empty()
    }
}
