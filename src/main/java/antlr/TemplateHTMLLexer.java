// Generated from src/main/antlr4/TemplateHTMLLexer.g4 by ANTLR 4.13.1
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
public class TemplateHTMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG_START_OPEN=1, TAG_END_OPEN=2, HTML_COMMENT=3, TEXT=4, WS=5, TAG_CLOSE=6, 
		TAG_SLASH_CLOSE=7, EQUAL=8, BANG=9, VOID_TAG_NAME=10, ID=11, STRING=12, 
		TAG_WS=13;
	public static final int
		TAG_MODE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "TAG_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TAG_START_OPEN", "TAG_END_OPEN", "HTML_COMMENT", "TEXT", "WS", "TAG_CLOSE", 
			"TAG_SLASH_CLOSE", "EQUAL", "BANG", "VOID_TAG_NAME", "ID", "STRING", 
			"TAG_WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'</'", null, null, null, "'>'", "'/>'", "'='", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAG_START_OPEN", "TAG_END_OPEN", "HTML_COMMENT", "TEXT", "WS", 
			"TAG_CLOSE", "TAG_SLASH_CLOSE", "EQUAL", "BANG", "VOID_TAG_NAME", "ID", 
			"STRING", "TAG_WS"
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


	public TemplateHTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TemplateHTMLLexer.g4"; }

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
		"\u0004\u0000\r\u00a8\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007"+
		"\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007"+
		"\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007"+
		"\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n"+
		"\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002,\b\u0002\n\u0002\f\u0002/\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0004\u00038\b\u0003\u000b\u0003\f\u00039\u0001\u0004\u0004\u0004=\b"+
		"\u0004\u000b\u0004\f\u0004>\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0087\b\t\u0001\n\u0001\n\u0005\n\u008b\b\n\n\n\f\n\u008e\t\n\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u0092\b\u000b\n\u000b\f\u000b\u0095\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u009a\b\u000b\n\u000b"+
		"\f\u000b\u009d\t\u000b\u0001\u000b\u0003\u000b\u00a0\b\u000b\u0001\f\u0004"+
		"\f\u00a3\b\f\u000b\f\f\f\u00a4\u0001\f\u0001\f\u0001-\u0000\r\u0002\u0001"+
		"\u0004\u0002\u0006\u0003\b\u0004\n\u0005\f\u0006\u000e\u0007\u0010\b\u0012"+
		"\t\u0014\n\u0016\u000b\u0018\f\u001a\r\u0002\u0000\u0001\u0006\u0001\u0000"+
		"<<\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0005\u0000--09AZ__az\u0003\u0000"+
		"\n\n\r\r\"\"\u0003\u0000\n\n\r\r\'\'\u00bb\u0000\u0002\u0001\u0000\u0000"+
		"\u0000\u0000\u0004\u0001\u0000\u0000\u0000\u0000\u0006\u0001\u0000\u0000"+
		"\u0000\u0000\b\u0001\u0000\u0000\u0000\u0000\n\u0001\u0000\u0000\u0000"+
		"\u0001\f\u0001\u0000\u0000\u0000\u0001\u000e\u0001\u0000\u0000\u0000\u0001"+
		"\u0010\u0001\u0000\u0000\u0000\u0001\u0012\u0001\u0000\u0000\u0000\u0001"+
		"\u0014\u0001\u0000\u0000\u0000\u0001\u0016\u0001\u0000\u0000\u0000\u0001"+
		"\u0018\u0001\u0000\u0000\u0000\u0001\u001a\u0001\u0000\u0000\u0000\u0002"+
		"\u001c\u0001\u0000\u0000\u0000\u0004 \u0001\u0000\u0000\u0000\u0006%\u0001"+
		"\u0000\u0000\u0000\b7\u0001\u0000\u0000\u0000\n<\u0001\u0000\u0000\u0000"+
		"\fB\u0001\u0000\u0000\u0000\u000eF\u0001\u0000\u0000\u0000\u0010K\u0001"+
		"\u0000\u0000\u0000\u0012M\u0001\u0000\u0000\u0000\u0014\u0086\u0001\u0000"+
		"\u0000\u0000\u0016\u0088\u0001\u0000\u0000\u0000\u0018\u009f\u0001\u0000"+
		"\u0000\u0000\u001a\u00a2\u0001\u0000\u0000\u0000\u001c\u001d\u0005<\u0000"+
		"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f\u0006\u0000\u0000"+
		"\u0000\u001f\u0003\u0001\u0000\u0000\u0000 !\u0005<\u0000\u0000!\"\u0005"+
		"/\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0006\u0001\u0000\u0000$\u0005"+
		"\u0001\u0000\u0000\u0000%&\u0005<\u0000\u0000&\'\u0005!\u0000\u0000\'"+
		"(\u0005-\u0000\u0000()\u0005-\u0000\u0000)-\u0001\u0000\u0000\u0000*,"+
		"\t\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u000001\u0005-\u0000\u000012\u0005-\u0000\u0000"+
		"23\u0005>\u0000\u000034\u0001\u0000\u0000\u000045\u0006\u0002\u0001\u0000"+
		"5\u0007\u0001\u0000\u0000\u000068\b\u0000\u0000\u000076\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000"+
		"\u0000\u0000:\t\u0001\u0000\u0000\u0000;=\u0007\u0001\u0000\u0000<;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0006\u0004\u0001"+
		"\u0000A\u000b\u0001\u0000\u0000\u0000BC\u0005>\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DE\u0006\u0005\u0002\u0000E\r\u0001\u0000\u0000\u0000FG\u0005"+
		"/\u0000\u0000GH\u0005>\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0006\u0006"+
		"\u0002\u0000J\u000f\u0001\u0000\u0000\u0000KL\u0005=\u0000\u0000L\u0011"+
		"\u0001\u0000\u0000\u0000MN\u0005!\u0000\u0000N\u0013\u0001\u0000\u0000"+
		"\u0000OP\u0005m\u0000\u0000PQ\u0005e\u0000\u0000QR\u0005t\u0000\u0000"+
		"R\u0087\u0005a\u0000\u0000ST\u0005l\u0000\u0000TU\u0005i\u0000\u0000U"+
		"V\u0005n\u0000\u0000V\u0087\u0005k\u0000\u0000WX\u0005b\u0000\u0000X\u0087"+
		"\u0005r\u0000\u0000YZ\u0005h\u0000\u0000Z\u0087\u0005r\u0000\u0000[\\"+
		"\u0005i\u0000\u0000\\]\u0005m\u0000\u0000]\u0087\u0005g\u0000\u0000^_"+
		"\u0005i\u0000\u0000_`\u0005n\u0000\u0000`a\u0005p\u0000\u0000ab\u0005"+
		"u\u0000\u0000b\u0087\u0005t\u0000\u0000cd\u0005s\u0000\u0000de\u0005o"+
		"\u0000\u0000ef\u0005u\u0000\u0000fg\u0005r\u0000\u0000gh\u0005c\u0000"+
		"\u0000h\u0087\u0005e\u0000\u0000ij\u0005t\u0000\u0000jk\u0005r\u0000\u0000"+
		"kl\u0005a\u0000\u0000lm\u0005c\u0000\u0000m\u0087\u0005k\u0000\u0000n"+
		"o\u0005w\u0000\u0000op\u0005b\u0000\u0000p\u0087\u0005r\u0000\u0000qr"+
		"\u0005b\u0000\u0000rs\u0005a\u0000\u0000st\u0005s\u0000\u0000t\u0087\u0005"+
		"e\u0000\u0000uv\u0005a\u0000\u0000vw\u0005r\u0000\u0000wx\u0005e\u0000"+
		"\u0000x\u0087\u0005a\u0000\u0000yz\u0005c\u0000\u0000z{\u0005o\u0000\u0000"+
		"{\u0087\u0005l\u0000\u0000|}\u0005e\u0000\u0000}~\u0005m\u0000\u0000~"+
		"\u007f\u0005b\u0000\u0000\u007f\u0080\u0005e\u0000\u0000\u0080\u0087\u0005"+
		"d\u0000\u0000\u0081\u0082\u0005p\u0000\u0000\u0082\u0083\u0005a\u0000"+
		"\u0000\u0083\u0084\u0005r\u0000\u0000\u0084\u0085\u0005a\u0000\u0000\u0085"+
		"\u0087\u0005m\u0000\u0000\u0086O\u0001\u0000\u0000\u0000\u0086S\u0001"+
		"\u0000\u0000\u0000\u0086W\u0001\u0000\u0000\u0000\u0086Y\u0001\u0000\u0000"+
		"\u0000\u0086[\u0001\u0000\u0000\u0000\u0086^\u0001\u0000\u0000\u0000\u0086"+
		"c\u0001\u0000\u0000\u0000\u0086i\u0001\u0000\u0000\u0000\u0086n\u0001"+
		"\u0000\u0000\u0000\u0086q\u0001\u0000\u0000\u0000\u0086u\u0001\u0000\u0000"+
		"\u0000\u0086y\u0001\u0000\u0000\u0000\u0086|\u0001\u0000\u0000\u0000\u0086"+
		"\u0081\u0001\u0000\u0000\u0000\u0087\u0015\u0001\u0000\u0000\u0000\u0088"+
		"\u008c\u0007\u0002\u0000\u0000\u0089\u008b\u0007\u0003\u0000\u0000\u008a"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u0017\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f"+
		"\u0093\u0005\"\u0000\u0000\u0090\u0092\b\u0004\u0000\u0000\u0091\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0096"+
		"\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u00a0"+
		"\u0005\"\u0000\u0000\u0097\u009b\u0005\'\u0000\u0000\u0098\u009a\b\u0005"+
		"\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009e\u00a0\u0005\'\u0000\u0000\u009f\u008f\u0001\u0000\u0000"+
		"\u0000\u009f\u0097\u0001\u0000\u0000\u0000\u00a0\u0019\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a3\u0007\u0001\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0006\f\u0001\u0000\u00a7\u001b\u0001\u0000\u0000\u0000"+
		"\u000b\u0000\u0001-9>\u0086\u008c\u0093\u009b\u009f\u00a4\u0003\u0005"+
		"\u0001\u0000\u0006\u0000\u0000\u0004\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}