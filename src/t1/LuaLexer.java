// Generated from /home/rastakhan/Documents/UFSCar/CC1-T1/src/t1/Lua.g4 by ANTLR 4.7
package t1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, CARACTERE=3, INTEIRO=4, FUNCTION=5, NOMEVARIAVEL=6, NOMEFUNCAO=7, 
		IF=8, THEN=9, ELSE=10, COMPARACAO=11, COMENTARIO=12, LPAREN=13, RPAREN=14, 
		END=15, RETURN=16, OPERADOR=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "LETRA", "ALGARISMO", "CARACTERE", "INTEIRO", "FUNCTION", 
		"NOMEVARIAVEL", "NOMEFUNCAO", "IF", "THEN", "ELSE", "COMPARACAO", "COMENTARIO", 
		"LPAREN", "RPAREN", "END", "RETURN", "OPERADOR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'\n'", null, null, "'function'", "'n'", "'func'", "'if'", 
		"'then'", "'else'", "'=='", null, "'('", "')'", "'end'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "CARACTERE", "INTEIRO", "FUNCTION", "NOMEVARIAVEL", 
		"NOMEFUNCAO", "IF", "THEN", "ELSE", "COMPARACAO", "COMENTARIO", "LPAREN", 
		"RPAREN", "END", "RETURN", "OPERADOR"
	};
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


	   public static String grupo="<<Digite os RAs do grupo aqui>>";


	public LuaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lua.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\6\6"+
		"\64\n\6\r\6\16\6\65\3\6\6\69\n\6\r\6\16\6:\3\6\6\6>\n\6\r\6\16\6?\3\6"+
		"\6\6C\n\6\r\6\16\6D\3\6\6\6H\n\6\r\6\16\6I\5\6L\n\6\3\7\6\7O\n\7\r\7\16"+
		"\7P\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\2\2\25\3\3\5\4\7\2\t\2\13\5\r\6"+
		"\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23\3\2"+
		"\4\4\2C\\c|\4\2,,//\2\u008e\2\3\3\2\2\2\2\5\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3"+
		"\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2"+
		"\2\2\13K\3\2\2\2\rN\3\2\2\2\17R\3\2\2\2\21[\3\2\2\2\23]\3\2\2\2\25b\3"+
		"\2\2\2\27e\3\2\2\2\31j\3\2\2\2\33o\3\2\2\2\35r\3\2\2\2\37w\3\2\2\2!y\3"+
		"\2\2\2#{\3\2\2\2%\177\3\2\2\2\'\u0086\3\2\2\2)*\7\"\2\2*\4\3\2\2\2+,\7"+
		"\f\2\2,\6\3\2\2\2-.\t\2\2\2.\b\3\2\2\2/\60\4\62;\2\60\n\3\2\2\2\61L\5"+
		"\7\4\2\62\64\5\t\5\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3"+
		"\2\2\2\66L\3\2\2\2\679\5\7\4\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2"+
		"\2;=\3\2\2\2<>\5\t\5\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@L\3\2\2"+
		"\2AC\5\t\5\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FH\5\7\4"+
		"\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2K\61\3\2\2\2K\63\3"+
		"\2\2\2K8\3\2\2\2KB\3\2\2\2L\f\3\2\2\2MO\5\t\5\2NM\3\2\2\2OP\3\2\2\2PN"+
		"\3\2\2\2PQ\3\2\2\2Q\16\3\2\2\2RS\7h\2\2ST\7w\2\2TU\7p\2\2UV\7e\2\2VW\7"+
		"v\2\2WX\7k\2\2XY\7q\2\2YZ\7p\2\2Z\20\3\2\2\2[\\\7p\2\2\\\22\3\2\2\2]^"+
		"\7h\2\2^_\7w\2\2_`\7p\2\2`a\7e\2\2a\24\3\2\2\2bc\7k\2\2cd\7h\2\2d\26\3"+
		"\2\2\2ef\7v\2\2fg\7j\2\2gh\7g\2\2hi\7p\2\2i\30\3\2\2\2jk\7g\2\2kl\7n\2"+
		"\2lm\7u\2\2mn\7g\2\2n\32\3\2\2\2op\7?\2\2pq\7?\2\2q\34\3\2\2\2rs\7/\2"+
		"\2st\7/\2\2tu\3\2\2\2uv\5\13\6\2v\36\3\2\2\2wx\7*\2\2x \3\2\2\2yz\7+\2"+
		"\2z\"\3\2\2\2{|\7g\2\2|}\7p\2\2}~\7f\2\2~$\3\2\2\2\177\u0080\7t\2\2\u0080"+
		"\u0081\7g\2\2\u0081\u0082\7v\2\2\u0082\u0083\7w\2\2\u0083\u0084\7t\2\2"+
		"\u0084\u0085\7p\2\2\u0085&\3\2\2\2\u0086\u0087\t\3\2\2\u0087(\3\2\2\2"+
		"\n\2\65:?DIKP\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}