// Generated from com.github.tanokun.reactivesk.compiler.frontend.parser.antlr/DynamicClassDefinition.g4 by ANTLR 4.13.1

package com.github.tanokun.reactivesk.compiler.frontend.parser.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DynamicClassDefinitionParser}.
 */
public interface DynamicClassDefinitionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DynamicClassDefinitionParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DynamicClassDefinitionParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#topLevelElement}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelElement(DynamicClassDefinitionParser.TopLevelElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#topLevelElement}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelElement(DynamicClassDefinitionParser.TopLevelElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#skipBlock}.
	 * @param ctx the parse tree
	 */
	void enterSkipBlock(DynamicClassDefinitionParser.SkipBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#skipBlock}.
	 * @param ctx the parse tree
	 */
	void exitSkipBlock(DynamicClassDefinitionParser.SkipBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#notClassHeader}.
	 * @param ctx the parse tree
	 */
	void enterNotClassHeader(DynamicClassDefinitionParser.NotClassHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#notClassHeader}.
	 * @param ctx the parse tree
	 */
	void exitNotClassHeader(DynamicClassDefinitionParser.NotClassHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(DynamicClassDefinitionParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(DynamicClassDefinitionParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(DynamicClassDefinitionParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(DynamicClassDefinitionParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(DynamicClassDefinitionParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(DynamicClassDefinitionParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#fieldSection}.
	 * @param ctx the parse tree
	 */
	void enterFieldSection(DynamicClassDefinitionParser.FieldSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#fieldSection}.
	 * @param ctx the parse tree
	 */
	void exitFieldSection(DynamicClassDefinitionParser.FieldSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(DynamicClassDefinitionParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(DynamicClassDefinitionParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(DynamicClassDefinitionParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(DynamicClassDefinitionParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(DynamicClassDefinitionParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(DynamicClassDefinitionParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#constructorParamList}.
	 * @param ctx the parse tree
	 */
	void enterConstructorParamList(DynamicClassDefinitionParser.ConstructorParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#constructorParamList}.
	 * @param ctx the parse tree
	 */
	void exitConstructorParamList(DynamicClassDefinitionParser.ConstructorParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#constructorParameter}.
	 * @param ctx the parse tree
	 */
	void enterConstructorParameter(DynamicClassDefinitionParser.ConstructorParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#constructorParameter}.
	 * @param ctx the parse tree
	 */
	void exitConstructorParameter(DynamicClassDefinitionParser.ConstructorParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#constructorParameterNotProperty}.
	 * @param ctx the parse tree
	 */
	void enterConstructorParameterNotProperty(DynamicClassDefinitionParser.ConstructorParameterNotPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#constructorParameterNotProperty}.
	 * @param ctx the parse tree
	 */
	void exitConstructorParameterNotProperty(DynamicClassDefinitionParser.ConstructorParameterNotPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#constructorParameterAsProperty}.
	 * @param ctx the parse tree
	 */
	void enterConstructorParameterAsProperty(DynamicClassDefinitionParser.ConstructorParameterAsPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#constructorParameterAsProperty}.
	 * @param ctx the parse tree
	 */
	void exitConstructorParameterAsProperty(DynamicClassDefinitionParser.ConstructorParameterAsPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#throwsList}.
	 * @param ctx the parse tree
	 */
	void enterThrowsList(DynamicClassDefinitionParser.ThrowsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#throwsList}.
	 * @param ctx the parse tree
	 */
	void exitThrowsList(DynamicClassDefinitionParser.ThrowsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#throw}.
	 * @param ctx the parse tree
	 */
	void enterThrow(DynamicClassDefinitionParser.ThrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#throw}.
	 * @param ctx the parse tree
	 */
	void exitThrow(DynamicClassDefinitionParser.ThrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(DynamicClassDefinitionParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(DynamicClassDefinitionParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DynamicClassDefinitionParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DynamicClassDefinitionParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(DynamicClassDefinitionParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(DynamicClassDefinitionParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturn(DynamicClassDefinitionParser.FunctionReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturn(DynamicClassDefinitionParser.FunctionReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArguments(DynamicClassDefinitionParser.FunctionArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArguments(DynamicClassDefinitionParser.FunctionArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#accessModifiers}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifiers(DynamicClassDefinitionParser.AccessModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#accessModifiers}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifiers(DynamicClassDefinitionParser.AccessModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(DynamicClassDefinitionParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(DynamicClassDefinitionParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#sectionItems}.
	 * @param ctx the parse tree
	 */
	void enterSectionItems(DynamicClassDefinitionParser.SectionItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#sectionItems}.
	 * @param ctx the parse tree
	 */
	void exitSectionItems(DynamicClassDefinitionParser.SectionItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicClassDefinitionParser#rawToken}.
	 * @param ctx the parse tree
	 */
	void enterRawToken(DynamicClassDefinitionParser.RawTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicClassDefinitionParser#rawToken}.
	 * @param ctx the parse tree
	 */
	void exitRawToken(DynamicClassDefinitionParser.RawTokenContext ctx);
}