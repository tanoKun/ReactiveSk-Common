// Generated from com.github.tanokun.reactivesk.compiler.frontend.parser.antlr/DynamicClassDefinition.g4 by ANTLR 4.13.1

package com.github.tanokun.reactivesk.compiler.frontend.parser.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DynamicClassDefinitionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, FIELD=2, FUNCTION=3, INIT=4, VAL=5, VAR=6, FACTOR=7, ARRAY=8, 
		OF=9, PRIVATE=10, THROWS=11, Identifier=12, LPAREN=13, RPAREN=14, LPAREN2=15, 
		RPAREN2=16, COLON=17, DCOLON=18, COMMA=19, STRING=20, COMMENT=21, NEWLINE=22, 
		WS=23, ANY_CHAR=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS", "FIELD", "FUNCTION", "INIT", "VAL", "VAR", "FACTOR", "ARRAY", 
			"OF", "PRIVATE", "THROWS", "Identifier", "LPAREN", "RPAREN", "LPAREN2", 
			"RPAREN2", "COLON", "DCOLON", "COMMA", "STRING", "COMMENT", "NEWLINE", 
			"WS", "ANY_CHAR"
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
			"WS", "ANY_CHAR"
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


	public DynamicClassDefinitionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DynamicClassDefinition.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0018\u00ac\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0005\u000bu\b\u000b\n\u000b\f\u000bx\t\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u008b\b\u0013\n\u0013\f\u0013"+
		"\u008e\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u0094\b\u0014\n\u0014\f\u0014\u0097\t\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0003\u0015\u009c\b\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u00a0"+
		"\b\u0015\u000b\u0015\f\u0015\u00a1\u0001\u0016\u0004\u0016\u00a5\b\u0016"+
		"\u000b\u0016\f\u0016\u00a6\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u008c\u0000\u0018\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000\u0005\u0003\u0000AZ__a"+
		"z\u0004\u000009AZ__az\u0003\u0000\n\n\r\r\"\"\u0002\u0000\n\n\r\r\u0003"+
		"\u0000\t\t  ``\u00b2\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u0003"+
		"7\u0001\u0000\u0000\u0000\u0005=\u0001\u0000\u0000\u0000\u0007F\u0001"+
		"\u0000\u0000\u0000\tK\u0001\u0000\u0000\u0000\u000bO\u0001\u0000\u0000"+
		"\u0000\rS\u0001\u0000\u0000\u0000\u000fZ\u0001\u0000\u0000\u0000\u0011"+
		"`\u0001\u0000\u0000\u0000\u0013c\u0001\u0000\u0000\u0000\u0015k\u0001"+
		"\u0000\u0000\u0000\u0017r\u0001\u0000\u0000\u0000\u0019y\u0001\u0000\u0000"+
		"\u0000\u001b{\u0001\u0000\u0000\u0000\u001d}\u0001\u0000\u0000\u0000\u001f"+
		"\u007f\u0001\u0000\u0000\u0000!\u0081\u0001\u0000\u0000\u0000#\u0083\u0001"+
		"\u0000\u0000\u0000%\u0086\u0001\u0000\u0000\u0000\'\u0088\u0001\u0000"+
		"\u0000\u0000)\u0091\u0001\u0000\u0000\u0000+\u009f\u0001\u0000\u0000\u0000"+
		"-\u00a4\u0001\u0000\u0000\u0000/\u00aa\u0001\u0000\u0000\u000012\u0005"+
		"c\u0000\u000023\u0005l\u0000\u000034\u0005a\u0000\u000045\u0005s\u0000"+
		"\u000056\u0005s\u0000\u00006\u0002\u0001\u0000\u0000\u000078\u0005f\u0000"+
		"\u000089\u0005i\u0000\u00009:\u0005e\u0000\u0000:;\u0005l\u0000\u0000"+
		";<\u0005d\u0000\u0000<\u0004\u0001\u0000\u0000\u0000=>\u0005f\u0000\u0000"+
		">?\u0005u\u0000\u0000?@\u0005n\u0000\u0000@A\u0005c\u0000\u0000AB\u0005"+
		"t\u0000\u0000BC\u0005i\u0000\u0000CD\u0005o\u0000\u0000DE\u0005n\u0000"+
		"\u0000E\u0006\u0001\u0000\u0000\u0000FG\u0005i\u0000\u0000GH\u0005n\u0000"+
		"\u0000HI\u0005i\u0000\u0000IJ\u0005t\u0000\u0000J\b\u0001\u0000\u0000"+
		"\u0000KL\u0005v\u0000\u0000LM\u0005a\u0000\u0000MN\u0005l\u0000\u0000"+
		"N\n\u0001\u0000\u0000\u0000OP\u0005v\u0000\u0000PQ\u0005a\u0000\u0000"+
		"QR\u0005r\u0000\u0000R\f\u0001\u0000\u0000\u0000ST\u0005f\u0000\u0000"+
		"TU\u0005a\u0000\u0000UV\u0005c\u0000\u0000VW\u0005t\u0000\u0000WX\u0005"+
		"o\u0000\u0000XY\u0005r\u0000\u0000Y\u000e\u0001\u0000\u0000\u0000Z[\u0005"+
		"a\u0000\u0000[\\\u0005r\u0000\u0000\\]\u0005r\u0000\u0000]^\u0005a\u0000"+
		"\u0000^_\u0005y\u0000\u0000_\u0010\u0001\u0000\u0000\u0000`a\u0005o\u0000"+
		"\u0000ab\u0005f\u0000\u0000b\u0012\u0001\u0000\u0000\u0000cd\u0005p\u0000"+
		"\u0000de\u0005r\u0000\u0000ef\u0005i\u0000\u0000fg\u0005v\u0000\u0000"+
		"gh\u0005a\u0000\u0000hi\u0005t\u0000\u0000ij\u0005e\u0000\u0000j\u0014"+
		"\u0001\u0000\u0000\u0000kl\u0005t\u0000\u0000lm\u0005h\u0000\u0000mn\u0005"+
		"r\u0000\u0000no\u0005o\u0000\u0000op\u0005w\u0000\u0000pq\u0005s\u0000"+
		"\u0000q\u0016\u0001\u0000\u0000\u0000rv\u0007\u0000\u0000\u0000su\u0007"+
		"\u0001\u0000\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0018\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005(\u0000\u0000z\u001a\u0001"+
		"\u0000\u0000\u0000{|\u0005)\u0000\u0000|\u001c\u0001\u0000\u0000\u0000"+
		"}~\u0005[\u0000\u0000~\u001e\u0001\u0000\u0000\u0000\u007f\u0080\u0005"+
		"]\u0000\u0000\u0080 \u0001\u0000\u0000\u0000\u0081\u0082\u0005:\u0000"+
		"\u0000\u0082\"\u0001\u0000\u0000\u0000\u0083\u0084\u0005:\u0000\u0000"+
		"\u0084\u0085\u0005:\u0000\u0000\u0085$\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0005,\u0000\u0000\u0087&\u0001\u0000\u0000\u0000\u0088\u008c\u0005\""+
		"\u0000\u0000\u0089\u008b\b\u0002\u0000\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0005\"\u0000\u0000"+
		"\u0090(\u0001\u0000\u0000\u0000\u0091\u0095\u0005#\u0000\u0000\u0092\u0094"+
		"\b\u0003\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001"+
		"\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001"+
		"\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0006\u0014\u0000\u0000\u0099*\u0001\u0000"+
		"\u0000\u0000\u009a\u009c\u0005\r\u0000\u0000\u009b\u009a\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u00a0\u0005\n\u0000\u0000\u009e\u00a0\u0005\r\u0000\u0000"+
		"\u009f\u009b\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2,\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a5\u0007\u0004\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0006\u0016\u0000\u0000\u00a9.\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\t\u0000\u0000\u0000\u00ab0\u0001\u0000\u0000\u0000\b\u0000v\u008c\u0095"+
		"\u009b\u009f\u00a1\u00a6\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}