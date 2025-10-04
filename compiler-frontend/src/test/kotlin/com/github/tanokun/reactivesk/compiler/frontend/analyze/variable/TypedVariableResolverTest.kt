package com.github.tanokun.reactivesk.compiler.frontend.analyze.variable

import com.github.tanokun.reactivesk.lang.Identifier
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class TypedVariableResolverTest {
    private fun createResolver(): TypedVariableResolver<Any, Any> = TypedVariableResolver()

    @Test
    @DisplayName("touchSection: 初回は0を返しテーブルを作成すること")
    fun touchSection_initial_returns_zero() {
        val resolver = createResolver()
        val top = Any()
        val section = Any()

        val id = resolver.touchSection(top, 1, section)

        assertEquals(0, id)
    }

    @Test
    @DisplayName("touchSection: 同一セクションなら同じIDを返すこと")
    fun touchSection_same_section_returns_same_id() {
        val resolver = createResolver()
        val top = Any()
        val section = Any()

        val first = resolver.touchSection(top, 2, section)
        val second = resolver.touchSection(top, 2, section)

        assertEquals(first, second)
    }

    @Test
    @DisplayName("touchSection: 別セクションならIDがインクリメントされること")
    fun touchSection_different_section_increments() {
        val resolver = createResolver()
        val top = Any()
        val s1 = Any()
        val s2 = Any()

        val id1 = resolver.touchSection(top, 0, s1)
        val id2 = resolver.touchSection(top, 0, s2)

        assertEquals(0, id1)
        assertEquals(1, id2)
    }

    @Test
    @DisplayName("declare: 宣言でインデックスが順に割り当てられ getIndexInAstNode が更新されること")
    fun declare_assigns_indices_and_updates_index_in_ast() {
        val resolver = createResolver()
        val top = Any()

        val r0 = resolver.declare(top, TypedVariableDeclaration.Unresolved(Identifier("v0"), Any::class.java, false, 0))
        val r1 = resolver.declare(top, TypedVariableDeclaration.Unresolved(Identifier("v1"), Any::class.java, false, 0))

        assertEquals(0, r0.index)
        assertEquals(1, r1.index)
        assertEquals(2, resolver.getIndexInAstNode(top))
    }

    @Test
    @DisplayName("getDeclarationInSingleScope: 単一セクションから宣言を取得できること")
    fun getDeclarationInSingle_scope_returns_declaration() {
        val resolver = createResolver()
        val top = Any()
        val name = Identifier("single")

        val declared = resolver.declare(top, TypedVariableDeclaration.Unresolved(name, Any::class.java, false, 0))

        val found = resolver.getDeclarationInSingleScope(top, 0, name)
        assertEquals(declared, found)
    }

    @Test
    @DisplayName("getDeclarationInScopeChain: 深いスコープが浅いスコープをシャドウすること")
    fun getDeclarationInScopeChain_shadowing_between_depths() {
        val resolver = createResolver()
        val top = Any()
        val name = Identifier("shadow")

        val outer = resolver.declare(top, TypedVariableDeclaration.Unresolved(name, Any::class.java, false, 0))
        val inner = resolver.declare(top, TypedVariableDeclaration.Unresolved(name, Any::class.java, false, 1))

        val foundFromInner = resolver.getDeclarationInScopeChain(top, 1, name)
        val foundFromOuter = resolver.getDeclarationInScopeChain(top, 0, name)

        assertEquals(inner, foundFromInner)
        assertEquals(outer, foundFromOuter)
    }

    @Test
    @DisplayName("getDeclarationInSingleScope: 存在しない場合はnullを返すこと")
    fun getDeclarationInSingleScope_not_found_returns_null() {
        val resolver = createResolver()
        val top = Any()
        val name = Identifier("nope")

        val found = resolver.getDeclarationInSingleScope(top, 0, name)
        assertNull(found)
    }
}