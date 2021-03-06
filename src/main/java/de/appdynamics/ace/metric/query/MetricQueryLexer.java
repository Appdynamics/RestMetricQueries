// Generated from /vlab/development/github/RestMetricQueries/src/main/antlr/MetricQuery.g4 by ANTLR 4.3
package de.appdynamics.ace.metric.query;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MetricQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		NUMBER_NO_LEADING_ZEROS=10, TIME_UNIT=11, ANSIDATE=12, ANSITIME=13, TIMEZONE=14, 
		EXPORT=15, AGGREGATED=16, FROM=17, ON=18, WS=19, COMMA=20, STAR=21, PLAINSTRING=22, 
		APPLICATION=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"DIGIT", "DIGIT_NOT_ZERO", "NUMBER_NO_LEADING_ZEROS", "TIME_UNIT", "ANSIDATE", 
		"ANSITIME", "TIMEZONE", "EXPORT", "AGGREGATED", "FROM", "ON", "WS", "COMMA", 
		"STAR", "PLAINSTRING", "APPLICATION"
	};


	public MetricQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MetricQuery.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00de\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\6\r`\n\r\r\r\16\ra\5\r"+
		"d\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16n\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16v\n\16\3\16\3\16\3\16\3\16\3\16\5\16}\n\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u0085\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u008e\n\16\5\16\u0090\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\6\26\u00c7\n\26\r\26\16\26\u00c8\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27"+
		"\2\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31"+
		"\3\2\6\4\2GGgg\5\2\13\f\17\17\"\"\4\2$$))\4\2CCcc\u00e7\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2"+
		"\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13D\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2\21"+
		"M\3\2\2\2\23V\3\2\2\2\25X\3\2\2\2\27Z\3\2\2\2\31c\3\2\2\2\33\u008f\3\2"+
		"\2\2\35\u0091\3\2\2\2\37\u009c\3\2\2\2!\u00a5\3\2\2\2#\u00ab\3\2\2\2%"+
		"\u00b2\3\2\2\2\'\u00bd\3\2\2\2)\u00c2\3\2\2\2+\u00c6\3\2\2\2-\u00cc\3"+
		"\2\2\2/\u00ce\3\2\2\2\61\u00d0\3\2\2\2\63\u00d2\3\2\2\2\65\66\7c\2\2\66"+
		"\67\7i\2\2\678\7q\2\28\4\3\2\2\29:\7)\2\2:\6\3\2\2\2;<\7^\2\2<\b\3\2\2"+
		"\2=>\7g\2\2>?\7p\2\2?@\7f\2\2@A\7k\2\2AB\7p\2\2BC\7i\2\2C\n\3\2\2\2DE"+
		"\7c\2\2EF\7v\2\2F\f\3\2\2\2GH\7\60\2\2H\16\3\2\2\2IJ\7h\2\2JK\7q\2\2K"+
		"L\7t\2\2L\20\3\2\2\2MN\7u\2\2NO\7v\2\2OP\7c\2\2PQ\7t\2\2QR\7v\2\2RS\7"+
		"k\2\2ST\7p\2\2TU\7i\2\2U\22\3\2\2\2VW\7$\2\2W\24\3\2\2\2XY\4\62;\2Y\26"+
		"\3\2\2\2Z[\4\63;\2[\30\3\2\2\2\\d\5\25\13\2]_\5\27\f\2^`\5\25\13\2_^\3"+
		"\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2c\\\3\2\2\2c]\3\2\2\2d\32"+
		"\3\2\2\2ef\7o\2\2fg\7k\2\2gh\7p\2\2hi\7w\2\2ij\7v\2\2jk\7g\2\2km\3\2\2"+
		"\2ln\7u\2\2ml\3\2\2\2mn\3\2\2\2n\u0090\3\2\2\2op\7j\2\2pq\7q\2\2qr\7w"+
		"\2\2rs\7t\2\2su\3\2\2\2tv\7u\2\2ut\3\2\2\2uv\3\2\2\2v\u0090\3\2\2\2wx"+
		"\7f\2\2xy\7c\2\2yz\7{\2\2z|\3\2\2\2{}\7u\2\2|{\3\2\2\2|}\3\2\2\2}\u0090"+
		"\3\2\2\2~\177\7y\2\2\177\u0080\7g\2\2\u0080\u0081\7g\2\2\u0081\u0082\7"+
		"m\2\2\u0082\u0084\3\2\2\2\u0083\u0085\7u\2\2\u0084\u0083\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0090\3\2\2\2\u0086\u0087\7o\2\2\u0087\u0088\7q\2"+
		"\2\u0088\u0089\7p\2\2\u0089\u008a\7v\2\2\u008a\u008b\7j\2\2\u008b\u008d"+
		"\3\2\2\2\u008c\u008e\7u\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0090\3\2\2\2\u008fe\3\2\2\2\u008fo\3\2\2\2\u008fw\3\2\2\2\u008f~\3\2"+
		"\2\2\u008f\u0086\3\2\2\2\u0090\34\3\2\2\2\u0091\u0092\5\25\13\2\u0092"+
		"\u0093\5\25\13\2\u0093\u0094\5\25\13\2\u0094\u0095\5\25\13\2\u0095\u0096"+
		"\7/\2\2\u0096\u0097\5\25\13\2\u0097\u0098\5\25\13\2\u0098\u0099\7/\2\2"+
		"\u0099\u009a\5\25\13\2\u009a\u009b\5\25\13\2\u009b\36\3\2\2\2\u009c\u009d"+
		"\5\25\13\2\u009d\u009e\5\25\13\2\u009e\u009f\7<\2\2\u009f\u00a0\5\25\13"+
		"\2\u00a0\u00a1\5\25\13\2\u00a1\u00a2\7<\2\2\u00a2\u00a3\5\25\13\2\u00a3"+
		"\u00a4\5\25\13\2\u00a4 \3\2\2\2\u00a5\u00a6\7*\2\2\u00a6\u00a7\4C\\\2"+
		"\u00a7\u00a8\4C\\\2\u00a8\u00a9\4C\\\2\u00a9\u00aa\7+\2\2\u00aa\"\3\2"+
		"\2\2\u00ab\u00ac\t\2\2\2\u00ac\u00ad\7z\2\2\u00ad\u00ae\7r\2\2\u00ae\u00af"+
		"\7q\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7v\2\2\u00b1$\3\2\2\2\u00b2\u00b3"+
		"\7c\2\2\u00b3\u00b4\7i\2\2\u00b4\u00b5\7i\2\2\u00b5\u00b6\7t\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7\u00b8\7i\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7v\2\2"+
		"\u00ba\u00bb\7g\2\2\u00bb\u00bc\7f\2\2\u00bc&\3\2\2\2\u00bd\u00be\7h\2"+
		"\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7o\2\2\u00c1(\3\2"+
		"\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7p\2\2\u00c4*\3\2\2\2\u00c5\u00c7"+
		"\t\3\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\26\2\2\u00cb,\3\2\2\2"+
		"\u00cc\u00cd\7.\2\2\u00cd.\3\2\2\2\u00ce\u00cf\7,\2\2\u00cf\60\3\2\2\2"+
		"\u00d0\u00d1\n\4\2\2\u00d1\62\3\2\2\2\u00d2\u00d3\t\5\2\2\u00d3\u00d4"+
		"\7r\2\2\u00d4\u00d5\7r\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7k\2\2\u00d7"+
		"\u00d8\7e\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7k\2\2"+
		"\u00db\u00dc\7q\2\2\u00dc\u00dd\7p\2\2\u00dd\64\3\2\2\2\f\2acmu|\u0084"+
		"\u008d\u008f\u00c8\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}