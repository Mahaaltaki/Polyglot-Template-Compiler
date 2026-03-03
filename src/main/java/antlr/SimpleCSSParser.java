// Generated from src/main/antlr4/SimpleCSS.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleCSSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, NUMBER=2, DOT=3, HASH=4, COMMA=5, COLON=6, SEMI=7, LBRACE=8, RBRACE=9, 
		MINUS=10, PERCENT=11, STAR=12, WS=13;
	public static final int
		RULE_stylesheet = 0, RULE_ruleSet = 1, RULE_selectors = 2, RULE_selector = 3, 
		RULE_selectorElement = 4, RULE_declaration = 5, RULE_propName = 6, RULE_propValue = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "ruleSet", "selectors", "selector", "selectorElement", 
			"declaration", "propName", "propValue"
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

	@Override
	public String getGrammarFileName() { return "SimpleCSS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleCSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
	 
		public StylesheetContext() { }
		public void copyFrom(StylesheetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetRuleContext extends StylesheetContext {
		public TerminalNode EOF() { return getToken(SimpleCSSParser.EOF, 0); }
		public List<RuleSetContext> ruleSet() {
			return getRuleContexts(RuleSetContext.class);
		}
		public RuleSetContext ruleSet(int i) {
			return getRuleContext(RuleSetContext.class,i);
		}
		public StylesheetRuleContext(StylesheetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCSSVisitor ) return ((SimpleCSSVisitor<? extends T>)visitor).visitStylesheetRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			_localctx = new StylesheetRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4122L) != 0)) {
				{
				{
				setState(16);
				ruleSet();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
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
	public static class RuleSetContext extends ParserRuleContext {
		public RuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSet; }
	 
		public RuleSetContext() { }
		public void copyFrom(RuleSetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleSetRuleContext extends RuleSetContext {
		public SelectorsContext selectors() {
			return getRuleContext(SelectorsContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(SimpleCSSParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleCSSParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public RuleSetRuleContext(RuleSetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCSSVisitor ) return ((SimpleCSSVisitor<? extends T>)visitor).visitRuleSetRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ruleSet);
		int _la;
		try {
			_localctx = new RuleSetRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			selectors();
			setState(25);
			match(LBRACE);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(26);
				declaration();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(RBRACE);
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
	public static class SelectorsContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleCSSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleCSSParser.COMMA, i);
		}
		public SelectorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectors; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCSSVisitor ) return ((SimpleCSSVisitor<? extends T>)visitor).visitSelectors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorsContext selectors() throws RecognitionException {
		SelectorsContext _localctx = new SelectorsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			selector();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(35);
				match(COMMA);
				setState(36);
				selector();
				}
				}
				setState(41);
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
	public static class SelectorContext extends ParserRuleContext {
		public List<SelectorElementContext> selectorElement() {
			return getRuleContexts(SelectorElementContext.class);
		}
		public SelectorElementContext selectorElement(int i) {
			return getRuleContext(SelectorElementContext.class,i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCSSVisitor ) return ((SimpleCSSVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				selectorElement();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4122L) != 0) );
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
	public static class SelectorElementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleCSSParser.ID, 0); }
		public TerminalNode DOT() { return getToken(SimpleCSSParser.DOT, 0); }
		public TerminalNode HASH() { return getToken(SimpleCSSParser.HASH, 0); }
		public TerminalNode STAR() { return getToken(SimpleCSSParser.STAR, 0); }
		public SelectorElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCSSVisitor ) return ((SimpleCSSVisitor<? extends T>)visitor).visitSelectorElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorElementContext selectorElement() throws RecognitionException {
		SelectorElementContext _localctx = new SelectorElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectorElement);
		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case DOT:
			case HASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT || _la==HASH) {
					{
					setState(47);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==HASH) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(50);
				match(ID);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(STAR);
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
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationRuleContext extends DeclarationContext {
		public PropNameContext propName() {
			return getRuleContext(PropNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SimpleCSSParser.COLON, 0); }
		public PropValueContext propValue() {
			return getRuleContext(PropValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimpleCSSParser.SEMI, 0); }
		public DeclarationRuleContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCSSVisitor ) return ((SimpleCSSVisitor<? extends T>)visitor).visitDeclarationRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		int _la;
		try {
			_localctx = new DeclarationRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			propName();
			setState(55);
			match(COLON);
			setState(56);
			propValue();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(57);
				match(SEMI);
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
	public static class PropNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SimpleCSSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleCSSParser.ID, i);
		}
		public TerminalNode MINUS() { return getToken(SimpleCSSParser.MINUS, 0); }
		public PropNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCSSVisitor ) return ((SimpleCSSVisitor<? extends T>)visitor).visitPropName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropNameContext propName() throws RecognitionException {
		PropNameContext _localctx = new PropNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_propName);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(ID);
				setState(62);
				match(MINUS);
				setState(63);
				match(ID);
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
	public static class PropValueContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SimpleCSSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleCSSParser.ID, i);
		}
		public List<TerminalNode> HASH() { return getTokens(SimpleCSSParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(SimpleCSSParser.HASH, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SimpleCSSParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SimpleCSSParser.NUMBER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SimpleCSSParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimpleCSSParser.DOT, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SimpleCSSParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SimpleCSSParser.MINUS, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(SimpleCSSParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(SimpleCSSParser.PERCENT, i);
		}
		public PropValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCSSVisitor ) return ((SimpleCSSVisitor<? extends T>)visitor).visitPropValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropValueContext propValue() throws RecognitionException {
		PropValueContext _localctx = new PropValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propValue);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(66);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3102L) != 0)) ) {
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
				setState(69); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static final String _serializedATN =
		"\u0004\u0001\rH\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001c\b\u0001"+
		"\n\u0001\f\u0001\u001f\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002&\b\u0002\n\u0002\f\u0002)\t\u0002\u0001"+
		"\u0003\u0004\u0003,\b\u0003\u000b\u0003\f\u0003-\u0001\u0004\u0003\u0004"+
		"1\b\u0004\u0001\u0004\u0001\u0004\u0003\u00045\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005;\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006A\b\u0006\u0001\u0007\u0004"+
		"\u0007D\b\u0007\u000b\u0007\f\u0007E\u0001\u0007\u0000\u0000\b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0000\u0002\u0001\u0000\u0003\u0004\u0002\u0000"+
		"\u0001\u0004\n\u000bH\u0000\u0013\u0001\u0000\u0000\u0000\u0002\u0018"+
		"\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006+\u0001"+
		"\u0000\u0000\u0000\b4\u0001\u0000\u0000\u0000\n6\u0001\u0000\u0000\u0000"+
		"\f@\u0001\u0000\u0000\u0000\u000eC\u0001\u0000\u0000\u0000\u0010\u0012"+
		"\u0003\u0002\u0001\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0015"+
		"\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0001\u0000\u0000\u0000\u0014\u0016\u0001\u0000\u0000\u0000\u0015\u0013"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0000\u0000\u0001\u0017\u0001"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0004\u0002\u0000\u0019\u001d"+
		"\u0005\b\u0000\u0000\u001a\u001c\u0003\n\u0005\u0000\u001b\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000"+
		"\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0005\t\u0000\u0000"+
		"!\u0003\u0001\u0000\u0000\u0000\"\'\u0003\u0006\u0003\u0000#$\u0005\u0005"+
		"\u0000\u0000$&\u0003\u0006\u0003\u0000%#\u0001\u0000\u0000\u0000&)\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(\u0005\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*,\u0003\b\u0004"+
		"\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0007\u0001\u0000\u0000\u0000"+
		"/1\u0007\u0000\u0000\u00000/\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000025\u0005\u0001\u0000\u000035\u0005\f\u0000"+
		"\u000040\u0001\u0000\u0000\u000043\u0001\u0000\u0000\u00005\t\u0001\u0000"+
		"\u0000\u000067\u0003\f\u0006\u000078\u0005\u0006\u0000\u00008:\u0003\u000e"+
		"\u0007\u00009;\u0005\u0007\u0000\u0000:9\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;\u000b\u0001\u0000\u0000\u0000<A\u0005\u0001\u0000"+
		"\u0000=>\u0005\u0001\u0000\u0000>?\u0005\n\u0000\u0000?A\u0005\u0001\u0000"+
		"\u0000@<\u0001\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000A\r\u0001\u0000"+
		"\u0000\u0000BD\u0007\u0001\u0000\u0000CB\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"F\u000f\u0001\u0000\u0000\u0000\t\u0013\u001d\'-04:@E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}