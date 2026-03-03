// Generated from src/main/antlr4/SimpleCSS.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpleCSSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, NUMBER=2, DOT=3, HASH=4, COMMA=5, COLON=6, SEMI=7, LBRACE=8, RBRACE=9, 
		MINUS=10, PERCENT=11, STAR=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID", "NUMBER", "DOT", "HASH", "COMMA", "COLON", "SEMI", "LBRACE", "RBRACE", 
			"MINUS", "PERCENT", "STAR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'.'", "'#'", "','", "':'", "';'", "'{'", "'}'", "'-'", 
			"'%'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "NUMBER", "DOT", "HASH", "COMMA", "COLON", "SEMI", "LBRACE", 
			"RBRACE", "MINUS", "PERCENT", "STAR", "WS"
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


	public SimpleCSSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleCSS.g4"; }

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
		"\u0004\u0000\rB\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0005\u0000\u001e"+
		"\b\u0000\n\u0000\f\u0000!\t\u0000\u0001\u0001\u0004\u0001$\b\u0001\u000b"+
		"\u0001\f\u0001%\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0004\f=\b\f\u000b\f\f\f>\u0001\f\u0001\f\u0000"+
		"\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u0001"+
		"\u0000\u0004\u0002\u0000AZaz\u0005\u0000--09AZ__az\u0001\u000009\u0003"+
		"\u0000\t\n\r\r  D\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000"+
		"\u0000\u0003#\u0001\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000\u0000"+
		"\u0007)\u0001\u0000\u0000\u0000\t+\u0001\u0000\u0000\u0000\u000b-\u0001"+
		"\u0000\u0000\u0000\r/\u0001\u0000\u0000\u0000\u000f1\u0001\u0000\u0000"+
		"\u0000\u00113\u0001\u0000\u0000\u0000\u00135\u0001\u0000\u0000\u0000\u0015"+
		"7\u0001\u0000\u0000\u0000\u00179\u0001\u0000\u0000\u0000\u0019<\u0001"+
		"\u0000\u0000\u0000\u001b\u001f\u0007\u0000\u0000\u0000\u001c\u001e\u0007"+
		"\u0001\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000"+
		"\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000"+
		"\u0000 \u0002\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\""+
		"$\u0007\u0002\u0000\u0000#\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"+
		"\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0004\u0001"+
		"\u0000\u0000\u0000\'(\u0005.\u0000\u0000(\u0006\u0001\u0000\u0000\u0000"+
		")*\u0005#\u0000\u0000*\b\u0001\u0000\u0000\u0000+,\u0005,\u0000\u0000"+
		",\n\u0001\u0000\u0000\u0000-.\u0005:\u0000\u0000.\f\u0001\u0000\u0000"+
		"\u0000/0\u0005;\u0000\u00000\u000e\u0001\u0000\u0000\u000012\u0005{\u0000"+
		"\u00002\u0010\u0001\u0000\u0000\u000034\u0005}\u0000\u00004\u0012\u0001"+
		"\u0000\u0000\u000056\u0005-\u0000\u00006\u0014\u0001\u0000\u0000\u0000"+
		"78\u0005%\u0000\u00008\u0016\u0001\u0000\u0000\u00009:\u0005*\u0000\u0000"+
		":\u0018\u0001\u0000\u0000\u0000;=\u0007\u0003\u0000\u0000<;\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0006\f\u0000\u0000A\u001a"+
		"\u0001\u0000\u0000\u0000\u0004\u0000\u001f%>\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}