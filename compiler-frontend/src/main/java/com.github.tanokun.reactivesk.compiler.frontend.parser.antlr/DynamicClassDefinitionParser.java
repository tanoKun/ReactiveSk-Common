// Generated from com.github.tanokun.reactivesk.compiler.frontend.parser.antlr/DynamicClassDefinition.g4 by ANTLR 4.13.1

package com.github.tanokun.reactivesk.compiler.frontend.parser.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DynamicClassDefinitionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, FIELD=2, FUNCTION=3, INIT=4, VAL=5, VAR=6, FACTOR=7, ARRAY=8, 
		OF=9, PRIVATE=10, THROWS=11, Identifier=12, LPAREN=13, RPAREN=14, LPAREN2=15, 
		RPAREN2=16, COLON=17, DCOLON=18, COMMA=19, STRING=20, COMMENT=21, NEWLINE=22, 
		WS=23, ANY_CHAR=24, INDENT=25, DEDENT=26;
	public static final int
		RULE_program = 0, RULE_topLevelElement = 1, RULE_skipBlock = 2, RULE_notClassHeader = 3, 
		RULE_classDef = 4, RULE_classBody = 5, RULE_classMember = 6, RULE_fieldSection = 7, 
		RULE_field = 8, RULE_initializer = 9, RULE_function = 10, RULE_constructorParamList = 11, 
		RULE_constructorParameter = 12, RULE_constructorParameterNotProperty = 13, 
		RULE_constructorParameterAsProperty = 14, RULE_throwsList = 15, RULE_throw = 16, 
		RULE_argument = 17, RULE_type = 18, RULE_declaration = 19, RULE_functionReturn = 20, 
		RULE_functionArguments = 21, RULE_accessModifiers = 22, RULE_section = 23, 
		RULE_sectionItems = 24, RULE_rawToken = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "topLevelElement", "skipBlock", "notClassHeader", "classDef", 
			"classBody", "classMember", "fieldSection", "field", "initializer", "function", 
			"constructorParamList", "constructorParameter", "constructorParameterNotProperty", 
			"constructorParameterAsProperty", "throwsList", "throw", "argument", 
			"type", "declaration", "functionReturn", "functionArguments", "accessModifiers", 
			"section", "sectionItems", "rawToken"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'field'", "'function'", "'init'", "'val'", "'var'", 
			"'factor'", "'array'", "'of'", "'private'", "'throws'", null, "'('", 
			"')'", "'['", "']'", "':'", "'::'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "FIELD", "FUNCTION", "INIT", "VAL", "VAR", "FACTOR", "ARRAY", 
			"OF", "PRIVATE", "THROWS", "Identifier", "LPAREN", "RPAREN", "LPAREN2", 
			"RPAREN2", "COLON", "DCOLON", "COMMA", "STRING", "COMMENT", "NEWLINE", 
			"WS", "ANY_CHAR", "INDENT", "DEDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DynamicClassDefinition.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DynamicClassDefinitionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DynamicClassDefinitionParser.EOF, 0); }
		public List<TopLevelElementContext> topLevelElement() {
			return getRuleContexts(TopLevelElementContext.class);
		}
		public TopLevelElementContext topLevelElement(int i) {
			return getRuleContext(TopLevelElementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DynamicClassDefinitionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DynamicClassDefinitionParser.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(54);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(52);
						topLevelElement();
						}
						break;
					case 2:
						{
						setState(53);
						match(NEWLINE);
						}
						break;
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(59);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TopLevelElementContext extends ParserRuleContext {
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public SkipBlockContext skipBlock() {
			return getRuleContext(SkipBlockContext.class,0);
		}
		public TopLevelElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterTopLevelElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitTopLevelElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitTopLevelElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelElementContext topLevelElement() throws RecognitionException {
		TopLevelElementContext _localctx = new TopLevelElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topLevelElement);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				classDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				skipBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SkipBlockContext extends ParserRuleContext {
		public NotClassHeaderContext notClassHeader() {
			return getRuleContext(NotClassHeaderContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DynamicClassDefinitionParser.NEWLINE, 0); }
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public SkipBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterSkipBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitSkipBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitSkipBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipBlockContext skipBlock() throws RecognitionException {
		SkipBlockContext _localctx = new SkipBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_skipBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			notClassHeader();
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(66);
				match(NEWLINE);
				setState(67);
				section();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotClassHeaderContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(DynamicClassDefinitionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DynamicClassDefinitionParser.NEWLINE, i);
		}
		public NotClassHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notClassHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterNotClassHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitNotClassHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitNotClassHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotClassHeaderContext notClassHeader() throws RecognitionException {
		NotClassHeaderContext _localctx = new NotClassHeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_notClassHeader);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			if (!( _input.LA(1) != CLASS && _input.LA(1) != EOF )) throw new FailedPredicateException(this, " _input.LA(1) != CLASS && _input.LA(1) != EOF ");
			setState(72); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(71);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==NEWLINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(74); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefContext extends ParserRuleContext {
		public Token name;
		public ConstructorParamListContext constructorParameters;
		public TerminalNode CLASS() { return getToken(DynamicClassDefinitionParser.CLASS, 0); }
		public TerminalNode COLON() { return getToken(DynamicClassDefinitionParser.COLON, 0); }
		public TerminalNode Identifier() { return getToken(DynamicClassDefinitionParser.Identifier, 0); }
		public TerminalNode LPAREN2() { return getToken(DynamicClassDefinitionParser.LPAREN2, 0); }
		public TerminalNode RPAREN2() { return getToken(DynamicClassDefinitionParser.RPAREN2, 0); }
		public TerminalNode NEWLINE() { return getToken(DynamicClassDefinitionParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(DynamicClassDefinitionParser.INDENT, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(DynamicClassDefinitionParser.DEDENT, 0); }
		public ConstructorParamListContext constructorParamList() {
			return getRuleContext(ConstructorParamListContext.class,0);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(CLASS);
			setState(77);
			((ClassDefContext)_localctx).name = match(Identifier);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN2) {
				{
				setState(78);
				match(LPAREN2);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5344L) != 0)) {
					{
					setState(79);
					((ClassDefContext)_localctx).constructorParameters = constructorParamList();
					}
				}

				setState(82);
				match(RPAREN2);
				}
			}

			setState(85);
			match(COLON);
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(86);
				match(NEWLINE);
				setState(87);
				match(INDENT);
				setState(88);
				classBody();
				setState(89);
				match(DEDENT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				classMember();
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4195356L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public FieldSectionContext fieldSection() {
			return getRuleContext(FieldSectionContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DynamicClassDefinitionParser.NEWLINE, 0); }
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classMember);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIELD:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				fieldSection();
				}
				break;
			case INIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				initializer();
				}
				break;
			case FUNCTION:
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				function();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldSectionContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(DynamicClassDefinitionParser.FIELD, 0); }
		public TerminalNode COLON() { return getToken(DynamicClassDefinitionParser.COLON, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(DynamicClassDefinitionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DynamicClassDefinitionParser.NEWLINE, i);
		}
		public TerminalNode INDENT() { return getToken(DynamicClassDefinitionParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(DynamicClassDefinitionParser.DEDENT, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public FieldSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterFieldSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitFieldSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitFieldSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldSectionContext fieldSection() throws RecognitionException {
		FieldSectionContext _localctx = new FieldSectionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldSection);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(FIELD);
			setState(105);
			match(COLON);
			setState(106);
			match(NEWLINE);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDENT) {
				{
				setState(107);
				match(INDENT);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1248L) != 0)) {
					{
					setState(108);
					field();
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(110); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(109);
								match(NEWLINE);
								}
								}
								setState(112); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==NEWLINE );
							setState(114);
							field();
							}
							} 
						}
						setState(119);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(120);
						match(NEWLINE);
						}
					}

					}
				}

				setState(125);
				match(DEDENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public AccessModifiersContext accessModifiers() {
			return getRuleContext(AccessModifiersContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(128);
				accessModifiers();
				}
			}

			setState(131);
			declaration();
			setState(132);
			argument();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(DynamicClassDefinitionParser.INIT, 0); }
		public TerminalNode COLON() { return getToken(DynamicClassDefinitionParser.COLON, 0); }
		public TerminalNode THROWS() { return getToken(DynamicClassDefinitionParser.THROWS, 0); }
		public TerminalNode LPAREN2() { return getToken(DynamicClassDefinitionParser.LPAREN2, 0); }
		public ThrowsListContext throwsList() {
			return getRuleContext(ThrowsListContext.class,0);
		}
		public TerminalNode RPAREN2() { return getToken(DynamicClassDefinitionParser.RPAREN2, 0); }
		public TerminalNode NEWLINE() { return getToken(DynamicClassDefinitionParser.NEWLINE, 0); }
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(INIT);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(135);
				match(THROWS);
				setState(136);
				match(LPAREN2);
				setState(137);
				throwsList();
				setState(138);
				match(RPAREN2);
				}
			}

			setState(142);
			match(COLON);
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(143);
				match(NEWLINE);
				setState(144);
				section();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode FUNCTION() { return getToken(DynamicClassDefinitionParser.FUNCTION, 0); }
		public TerminalNode LPAREN() { return getToken(DynamicClassDefinitionParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DynamicClassDefinitionParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(DynamicClassDefinitionParser.COLON, 0); }
		public TerminalNode Identifier() { return getToken(DynamicClassDefinitionParser.Identifier, 0); }
		public AccessModifiersContext accessModifiers() {
			return getRuleContext(AccessModifiersContext.class,0);
		}
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public FunctionReturnContext functionReturn() {
			return getRuleContext(FunctionReturnContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(DynamicClassDefinitionParser.THROWS, 0); }
		public TerminalNode LPAREN2() { return getToken(DynamicClassDefinitionParser.LPAREN2, 0); }
		public ThrowsListContext throwsList() {
			return getRuleContext(ThrowsListContext.class,0);
		}
		public TerminalNode RPAREN2() { return getToken(DynamicClassDefinitionParser.RPAREN2, 0); }
		public TerminalNode NEWLINE() { return getToken(DynamicClassDefinitionParser.NEWLINE, 0); }
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(147);
				accessModifiers();
				}
			}

			setState(150);
			match(FUNCTION);
			setState(151);
			((FunctionContext)_localctx).name = match(Identifier);
			setState(152);
			match(LPAREN);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(153);
				functionArguments();
				}
			}

			setState(156);
			match(RPAREN);
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(157);
				functionReturn();
				}
				break;
			}
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(160);
				match(THROWS);
				setState(161);
				match(LPAREN2);
				setState(162);
				throwsList();
				setState(163);
				match(RPAREN2);
				}
			}

			setState(167);
			match(COLON);
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(168);
				match(NEWLINE);
				setState(169);
				section();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorParamListContext extends ParserRuleContext {
		public List<ConstructorParameterContext> constructorParameter() {
			return getRuleContexts(ConstructorParameterContext.class);
		}
		public ConstructorParameterContext constructorParameter(int i) {
			return getRuleContext(ConstructorParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DynamicClassDefinitionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DynamicClassDefinitionParser.COMMA, i);
		}
		public ConstructorParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterConstructorParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitConstructorParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitConstructorParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorParamListContext constructorParamList() throws RecognitionException {
		ConstructorParamListContext _localctx = new ConstructorParamListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constructorParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			constructorParameter();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(173);
				match(COMMA);
				setState(174);
				constructorParameter();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorParameterContext extends ParserRuleContext {
		public ConstructorParameterNotPropertyContext constructorParameterNotProperty() {
			return getRuleContext(ConstructorParameterNotPropertyContext.class,0);
		}
		public ConstructorParameterAsPropertyContext constructorParameterAsProperty() {
			return getRuleContext(ConstructorParameterAsPropertyContext.class,0);
		}
		public ConstructorParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterConstructorParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitConstructorParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitConstructorParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorParameterContext constructorParameter() throws RecognitionException {
		ConstructorParameterContext _localctx = new ConstructorParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constructorParameter);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				constructorParameterNotProperty();
				}
				break;
			case VAL:
			case VAR:
			case FACTOR:
			case PRIVATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				constructorParameterAsProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorParameterNotPropertyContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ConstructorParameterNotPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorParameterNotProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterConstructorParameterNotProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitConstructorParameterNotProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitConstructorParameterNotProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorParameterNotPropertyContext constructorParameterNotProperty() throws RecognitionException {
		ConstructorParameterNotPropertyContext _localctx = new ConstructorParameterNotPropertyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constructorParameterNotProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			argument();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorParameterAsPropertyContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public AccessModifiersContext accessModifiers() {
			return getRuleContext(AccessModifiersContext.class,0);
		}
		public ConstructorParameterAsPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorParameterAsProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterConstructorParameterAsProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitConstructorParameterAsProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitConstructorParameterAsProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorParameterAsPropertyContext constructorParameterAsProperty() throws RecognitionException {
		ConstructorParameterAsPropertyContext _localctx = new ConstructorParameterAsPropertyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constructorParameterAsProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(186);
				accessModifiers();
				}
			}

			setState(189);
			declaration();
			setState(190);
			argument();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowsListContext extends ParserRuleContext {
		public List<ThrowContext> throw_() {
			return getRuleContexts(ThrowContext.class);
		}
		public ThrowContext throw_(int i) {
			return getRuleContext(ThrowContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DynamicClassDefinitionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DynamicClassDefinitionParser.COMMA, i);
		}
		public ThrowsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterThrowsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitThrowsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitThrowsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowsListContext throwsList() throws RecognitionException {
		ThrowsListContext _localctx = new ThrowsListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_throwsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			throw_();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(193);
				match(COMMA);
				setState(194);
				throw_();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DynamicClassDefinitionParser.Identifier, 0); }
		public ThrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterThrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitThrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitThrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowContext throw_() throws RecognitionException {
		ThrowContext _localctx = new ThrowContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_throw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public Token name;
		public TerminalNode COLON() { return getToken(DynamicClassDefinitionParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(DynamicClassDefinitionParser.Identifier, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			((ArgumentContext)_localctx).name = match(Identifier);
			setState(203);
			match(COLON);
			setState(204);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Token typeName;
		public Token arrayType;
		public TerminalNode Identifier() { return getToken(DynamicClassDefinitionParser.Identifier, 0); }
		public TerminalNode ARRAY() { return getToken(DynamicClassDefinitionParser.ARRAY, 0); }
		public TerminalNode OF() { return getToken(DynamicClassDefinitionParser.OF, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				((TypeContext)_localctx).typeName = match(Identifier);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(ARRAY);
				setState(208);
				match(OF);
				setState(209);
				((TypeContext)_localctx).arrayType = match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(DynamicClassDefinitionParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(DynamicClassDefinitionParser.VAR, 0); }
		public TerminalNode FACTOR() { return getToken(DynamicClassDefinitionParser.FACTOR, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionReturnContext extends ParserRuleContext {
		public TypeContext returnType;
		public TerminalNode DCOLON() { return getToken(DynamicClassDefinitionParser.DCOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(DynamicClassDefinitionParser.COLON, 0); }
		public FunctionReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterFunctionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitFunctionReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitFunctionReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnContext functionReturn() throws RecognitionException {
		FunctionReturnContext _localctx = new FunctionReturnContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionReturn);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DCOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(DCOLON);
				setState(215);
				((FunctionReturnContext)_localctx).returnType = type();
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(COLON);
				setState(217);
				((FunctionReturnContext)_localctx).returnType = type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DynamicClassDefinitionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DynamicClassDefinitionParser.COMMA, i);
		}
		public FunctionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterFunctionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitFunctionArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentsContext functionArguments() throws RecognitionException {
		FunctionArgumentsContext _localctx = new FunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			argument();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(221);
				match(COMMA);
				setState(222);
				argument();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessModifiersContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(DynamicClassDefinitionParser.PRIVATE, 0); }
		public AccessModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterAccessModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitAccessModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitAccessModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifiersContext accessModifiers() throws RecognitionException {
		AccessModifiersContext _localctx = new AccessModifiersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_accessModifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(PRIVATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SectionContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(DynamicClassDefinitionParser.INDENT, 0); }
		public SectionItemsContext sectionItems() {
			return getRuleContext(SectionItemsContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(DynamicClassDefinitionParser.DEDENT, 0); }
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_section);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(INDENT);
				setState(231);
				sectionItems();
				setState(232);
				match(DEDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(INDENT);
				setState(235);
				match(DEDENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SectionItemsContext extends ParserRuleContext {
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public List<RawTokenContext> rawToken() {
			return getRuleContexts(RawTokenContext.class);
		}
		public RawTokenContext rawToken(int i) {
			return getRuleContext(RawTokenContext.class,i);
		}
		public SectionItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterSectionItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitSectionItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitSectionItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionItemsContext sectionItems() throws RecognitionException {
		SectionItemsContext _localctx = new SectionItemsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sectionItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(240);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INDENT:
					{
					setState(238);
					section();
					}
					break;
				case CLASS:
				case FIELD:
				case FUNCTION:
				case INIT:
				case VAL:
				case VAR:
				case FACTOR:
				case ARRAY:
				case OF:
				case PRIVATE:
				case THROWS:
				case Identifier:
				case LPAREN:
				case RPAREN:
				case LPAREN2:
				case RPAREN2:
				case COLON:
				case DCOLON:
				case COMMA:
				case STRING:
				case COMMENT:
				case NEWLINE:
				case WS:
				case ANY_CHAR:
					{
					setState(239);
					rawToken();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 67108862L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RawTokenContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(DynamicClassDefinitionParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(DynamicClassDefinitionParser.DEDENT, 0); }
		public RawTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).enterRawToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamicClassDefinitionListener ) ((DynamicClassDefinitionListener)listener).exitRawToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamicClassDefinitionVisitor ) return ((DynamicClassDefinitionVisitor<? extends T>)visitor).visitRawToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RawTokenContext rawToken() throws RecognitionException {
		RawTokenContext _localctx = new RawTokenContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_rawToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==INDENT || _la==DEDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return notClassHeader_sempred((NotClassHeaderContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean notClassHeader_sempred(NotClassHeaderContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  _input.LA(1) != CLASS && _input.LA(1) != EOF ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u00f7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0005\u00007\b"+
		"\u0000\n\u0000\f\u0000:\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0003\u0001@\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002E\b\u0002\u0001\u0003\u0001\u0003\u0004\u0003I\b\u0003\u000b\u0003"+
		"\f\u0003J\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"Q\b\u0004\u0001\u0004\u0003\u0004T\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\\\b\u0004\u0001"+
		"\u0005\u0004\u0005_\b\u0005\u000b\u0005\f\u0005`\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006g\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007o\b\u0007"+
		"\u000b\u0007\f\u0007p\u0001\u0007\u0005\u0007t\b\u0007\n\u0007\f\u0007"+
		"w\t\u0007\u0001\u0007\u0003\u0007z\b\u0007\u0003\u0007|\b\u0007\u0001"+
		"\u0007\u0003\u0007\u007f\b\u0007\u0001\b\u0003\b\u0082\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008d"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u0092\b\t\u0001\n\u0003\n\u0095\b"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009b\b\n\u0001\n\u0001\n\u0003"+
		"\n\u009f\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a6\b\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u00ab\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00b0\b\u000b\n\u000b\f\u000b\u00b3\t\u000b\u0001\f"+
		"\u0001\f\u0003\f\u00b7\b\f\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u00bc"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00c4\b\u000f\n\u000f\f\u000f\u00c7\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d3\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00db\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00e0\b"+
		"\u0015\n\u0015\f\u0015\u00e3\t\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u00ed\b\u0017\u0001\u0018\u0001\u0018\u0004\u0018\u00f1\b\u0018\u000b"+
		"\u0018\f\u0018\u00f2\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u0000\u001a"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02\u0000\u0003\u0001\u0000\u0016\u0016\u0001\u0000"+
		"\u0005\u0007\u0001\u0000\u0019\u001a\u00ff\u00008\u0001\u0000\u0000\u0000"+
		"\u0002?\u0001\u0000\u0000\u0000\u0004A\u0001\u0000\u0000\u0000\u0006F"+
		"\u0001\u0000\u0000\u0000\bL\u0001\u0000\u0000\u0000\n^\u0001\u0000\u0000"+
		"\u0000\ff\u0001\u0000\u0000\u0000\u000eh\u0001\u0000\u0000\u0000\u0010"+
		"\u0081\u0001\u0000\u0000\u0000\u0012\u0086\u0001\u0000\u0000\u0000\u0014"+
		"\u0094\u0001\u0000\u0000\u0000\u0016\u00ac\u0001\u0000\u0000\u0000\u0018"+
		"\u00b6\u0001\u0000\u0000\u0000\u001a\u00b8\u0001\u0000\u0000\u0000\u001c"+
		"\u00bb\u0001\u0000\u0000\u0000\u001e\u00c0\u0001\u0000\u0000\u0000 \u00c8"+
		"\u0001\u0000\u0000\u0000\"\u00ca\u0001\u0000\u0000\u0000$\u00d2\u0001"+
		"\u0000\u0000\u0000&\u00d4\u0001\u0000\u0000\u0000(\u00da\u0001\u0000\u0000"+
		"\u0000*\u00dc\u0001\u0000\u0000\u0000,\u00e4\u0001\u0000\u0000\u0000."+
		"\u00ec\u0001\u0000\u0000\u00000\u00f0\u0001\u0000\u0000\u00002\u00f4\u0001"+
		"\u0000\u0000\u000047\u0003\u0002\u0001\u000057\u0005\u0016\u0000\u0000"+
		"64\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u00007:\u0001\u0000\u0000"+
		"\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000;<\u0005\u0000\u0000\u0001<\u0001"+
		"\u0001\u0000\u0000\u0000=@\u0003\b\u0004\u0000>@\u0003\u0004\u0002\u0000"+
		"?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@\u0003\u0001\u0000"+
		"\u0000\u0000AD\u0003\u0006\u0003\u0000BC\u0005\u0016\u0000\u0000CE\u0003"+
		".\u0017\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000E\u0005"+
		"\u0001\u0000\u0000\u0000FH\u0004\u0003\u0000\u0000GI\b\u0000\u0000\u0000"+
		"HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000K\u0007\u0001\u0000\u0000\u0000LM\u0005"+
		"\u0001\u0000\u0000MS\u0005\f\u0000\u0000NP\u0005\u000f\u0000\u0000OQ\u0003"+
		"\u0016\u000b\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RT\u0005\u0010\u0000\u0000SN\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U[\u0005\u0011"+
		"\u0000\u0000VW\u0005\u0016\u0000\u0000WX\u0005\u0019\u0000\u0000XY\u0003"+
		"\n\u0005\u0000YZ\u0005\u001a\u0000\u0000Z\\\u0001\u0000\u0000\u0000[V"+
		"\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\t\u0001\u0000\u0000"+
		"\u0000]_\u0003\f\u0006\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\u000b\u0001"+
		"\u0000\u0000\u0000bg\u0003\u000e\u0007\u0000cg\u0003\u0012\t\u0000dg\u0003"+
		"\u0014\n\u0000eg\u0005\u0016\u0000\u0000fb\u0001\u0000\u0000\u0000fc\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000"+
		"g\r\u0001\u0000\u0000\u0000hi\u0005\u0002\u0000\u0000ij\u0005\u0011\u0000"+
		"\u0000j~\u0005\u0016\u0000\u0000k{\u0005\u0019\u0000\u0000lu\u0003\u0010"+
		"\b\u0000mo\u0005\u0016\u0000\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rt\u0003\u0010\b\u0000sn\u0001\u0000\u0000\u0000tw\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xz\u0005\u0016\u0000"+
		"\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000"+
		"\u0000\u0000{l\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u007f\u0005\u001a\u0000\u0000~k\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u000f\u0001\u0000\u0000\u0000"+
		"\u0080\u0082\u0003,\u0016\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0003&\u0013\u0000\u0084\u0085\u0003\"\u0011\u0000\u0085\u0011"+
		"\u0001\u0000\u0000\u0000\u0086\u008c\u0005\u0004\u0000\u0000\u0087\u0088"+
		"\u0005\u000b\u0000\u0000\u0088\u0089\u0005\u000f\u0000\u0000\u0089\u008a"+
		"\u0003\u001e\u000f\u0000\u008a\u008b\u0005\u0010\u0000\u0000\u008b\u008d"+
		"\u0001\u0000\u0000\u0000\u008c\u0087\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0091"+
		"\u0005\u0011\u0000\u0000\u008f\u0090\u0005\u0016\u0000\u0000\u0090\u0092"+
		"\u0003.\u0017\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0013\u0001\u0000\u0000\u0000\u0093\u0095\u0003"+
		",\u0016\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0003"+
		"\u0000\u0000\u0097\u0098\u0005\f\u0000\u0000\u0098\u009a\u0005\r\u0000"+
		"\u0000\u0099\u009b\u0003*\u0015\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009e\u0005\u000e\u0000\u0000\u009d\u009f\u0003(\u0014\u0000\u009e"+
		"\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u000b\u0000\u0000\u00a1"+
		"\u00a2\u0005\u000f\u0000\u0000\u00a2\u00a3\u0003\u001e\u000f\u0000\u00a3"+
		"\u00a4\u0005\u0010\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00aa\u0005\u0011\u0000\u0000\u00a8"+
		"\u00a9\u0005\u0016\u0000\u0000\u00a9\u00ab\u0003.\u0017\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u0015"+
		"\u0001\u0000\u0000\u0000\u00ac\u00b1\u0003\u0018\f\u0000\u00ad\u00ae\u0005"+
		"\u0013\u0000\u0000\u00ae\u00b0\u0003\u0018\f\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u0017\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b7\u0003\u001a"+
		"\r\u0000\u00b5\u00b7\u0003\u001c\u000e\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u0019\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0003\"\u0011\u0000\u00b9\u001b\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bc\u0003,\u0016\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0003&\u0013\u0000\u00be\u00bf\u0003\"\u0011\u0000\u00bf\u001d"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c5\u0003 \u0010\u0000\u00c1\u00c2\u0005"+
		"\u0013\u0000\u0000\u00c2\u00c4\u0003 \u0010\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u001f\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\f\u0000"+
		"\u0000\u00c9!\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\f\u0000\u0000"+
		"\u00cb\u00cc\u0005\u0011\u0000\u0000\u00cc\u00cd\u0003$\u0012\u0000\u00cd"+
		"#\u0001\u0000\u0000\u0000\u00ce\u00d3\u0005\f\u0000\u0000\u00cf\u00d0"+
		"\u0005\b\u0000\u0000\u00d0\u00d1\u0005\t\u0000\u0000\u00d1\u00d3\u0005"+
		"\f\u0000\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000\u00d2\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d3%\u0001\u0000\u0000\u0000\u00d4\u00d5\u0007\u0001\u0000"+
		"\u0000\u00d5\'\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0012\u0000\u0000"+
		"\u00d7\u00db\u0003$\u0012\u0000\u00d8\u00d9\u0005\u0011\u0000\u0000\u00d9"+
		"\u00db\u0003$\u0012\u0000\u00da\u00d6\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00db)\u0001\u0000\u0000\u0000\u00dc\u00e1\u0003"+
		"\"\u0011\u0000\u00dd\u00de\u0005\u0013\u0000\u0000\u00de\u00e0\u0003\""+
		"\u0011\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e2+\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0005\n\u0000\u0000\u00e5-\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0005\u0019\u0000\u0000\u00e7\u00e8\u00030\u0018\u0000\u00e8"+
		"\u00e9\u0005\u001a\u0000\u0000\u00e9\u00ed\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0005\u0019\u0000\u0000\u00eb\u00ed\u0005\u001a\u0000\u0000\u00ec"+
		"\u00e6\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed"+
		"/\u0001\u0000\u0000\u0000\u00ee\u00f1\u0003.\u0017\u0000\u00ef\u00f1\u0003"+
		"2\u0019\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f31\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\b\u0002\u0000\u0000\u00f53\u0001\u0000\u0000\u0000"+
		"!68?DJPS[`fpuy{~\u0081\u008c\u0091\u0094\u009a\u009e\u00a5\u00aa\u00b1"+
		"\u00b6\u00bb\u00c5\u00d2\u00da\u00e1\u00ec\u00f0\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}