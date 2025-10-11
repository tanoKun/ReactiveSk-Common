// Generated from com.github.tanokun.reactivesk.compiler.frontend.parser.antlr/DynamicClassDefinition.g4 by ANTLR 4.13.1

package com.github.tanokun.reactivesk.compiler.frontend.parser.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DynamicClassDefinitionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DynamicClassDefinitionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DynamicClassDefinitionParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#topLevelElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelElement(DynamicClassDefinitionParser.TopLevelElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#skipBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipBlock(DynamicClassDefinitionParser.SkipBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#notClassHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotClassHeader(DynamicClassDefinitionParser.NotClassHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(DynamicClassDefinitionParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(DynamicClassDefinitionParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(DynamicClassDefinitionParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#fieldSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldSection(DynamicClassDefinitionParser.FieldSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(DynamicClassDefinitionParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(DynamicClassDefinitionParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(DynamicClassDefinitionParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#constructorParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorParamList(DynamicClassDefinitionParser.ConstructorParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#constructorParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorParameter(DynamicClassDefinitionParser.ConstructorParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#constructorParameterNotProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorParameterNotProperty(DynamicClassDefinitionParser.ConstructorParameterNotPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#constructorParameterAsProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorParameterAsProperty(DynamicClassDefinitionParser.ConstructorParameterAsPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#throwsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowsList(DynamicClassDefinitionParser.ThrowsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#throw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow(DynamicClassDefinitionParser.ThrowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(DynamicClassDefinitionParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DynamicClassDefinitionParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(DynamicClassDefinitionParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#functionReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturn(DynamicClassDefinitionParser.FunctionReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#functionArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArguments(DynamicClassDefinitionParser.FunctionArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#accessModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifiers(DynamicClassDefinitionParser.AccessModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(DynamicClassDefinitionParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#sectionItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSectionItems(DynamicClassDefinitionParser.SectionItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicClassDefinitionParser#rawToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRawToken(DynamicClassDefinitionParser.RawTokenContext ctx);
}