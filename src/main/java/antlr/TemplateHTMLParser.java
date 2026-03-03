// Generated from src/main/antlr4/TemplateHTMLParser.g4 by ANTLR 4.13.1
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
public class TemplateHTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG_START_OPEN=1, TAG_END_OPEN=2, HTML_COMMENT=3, TEXT=4, WS=5, TAG_CLOSE=6, 
		TAG_SLASH_CLOSE=7, EQUAL=8, BANG=9, VOID_TAG_NAME=10, ID=11, STRING=12, 
		TAG_WS=13;
	public static final int
		RULE_htmlDocument = 0, RULE_node = 1, RULE_doctype = 2, RULE_element = 3, 
		RULE_normalElement = 4, RULE_voidElement = 5, RULE_attribute = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "node", "doctype", "element", "normalElement", "voidElement", 
			"attribute"
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

	@Override
	public String getGrammarFileName() { return "TemplateHTMLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TemplateHTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TemplateHTMLParser.EOF, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_START_OPEN || _la==TEXT) {
				{
				{
				setState(14);
				node();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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
	public static class NodeContext extends ParserRuleContext {
		public DoctypeContext doctype() {
			return getRuleContext(DoctypeContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(TemplateHTMLParser.TEXT, 0); }
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_node);
		try {
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				doctype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				match(TEXT);
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
	public static class DoctypeContext extends ParserRuleContext {
		public TerminalNode TAG_START_OPEN() { return getToken(TemplateHTMLParser.TAG_START_OPEN, 0); }
		public TerminalNode BANG() { return getToken(TemplateHTMLParser.BANG, 0); }
		public List<TerminalNode> ID() { return getTokens(TemplateHTMLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TemplateHTMLParser.ID, i);
		}
		public TerminalNode TAG_CLOSE() { return getToken(TemplateHTMLParser.TAG_CLOSE, 0); }
		public DoctypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doctype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitDoctype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoctypeContext doctype() throws RecognitionException {
		DoctypeContext _localctx = new DoctypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_doctype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(TAG_START_OPEN);
			setState(28);
			match(BANG);
			setState(29);
			match(ID);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(30);
				match(ID);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(TAG_CLOSE);
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
	public static class ElementContext extends ParserRuleContext {
		public NormalElementContext normalElement() {
			return getRuleContext(NormalElementContext.class,0);
		}
		public VoidElementContext voidElement() {
			return getRuleContext(VoidElementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				normalElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				voidElement();
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
	public static class NormalElementContext extends ParserRuleContext {
		public Token tagName;
		public Token closingTagName;
		public TerminalNode TAG_START_OPEN() { return getToken(TemplateHTMLParser.TAG_START_OPEN, 0); }
		public List<TerminalNode> TAG_CLOSE() { return getTokens(TemplateHTMLParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(TemplateHTMLParser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_END_OPEN() { return getToken(TemplateHTMLParser.TAG_END_OPEN, 0); }
		public List<TerminalNode> ID() { return getTokens(TemplateHTMLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TemplateHTMLParser.ID, i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public NormalElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitNormalElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalElementContext normalElement() throws RecognitionException {
		NormalElementContext _localctx = new NormalElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_normalElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(TAG_START_OPEN);
			setState(43);
			((NormalElementContext)_localctx).tagName = match(ID);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(44);
				attribute();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(TAG_CLOSE);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_START_OPEN || _la==TEXT) {
				{
				{
				setState(51);
				node();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(TAG_END_OPEN);
			setState(58);
			((NormalElementContext)_localctx).closingTagName = match(ID);
			setState(59);
			match(TAG_CLOSE);
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
	public static class VoidElementContext extends ParserRuleContext {
		public Token tagName;
		public TerminalNode TAG_START_OPEN() { return getToken(TemplateHTMLParser.TAG_START_OPEN, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(TemplateHTMLParser.TAG_CLOSE, 0); }
		public TerminalNode VOID_TAG_NAME() { return getToken(TemplateHTMLParser.VOID_TAG_NAME, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(TemplateHTMLParser.TAG_SLASH_CLOSE, 0); }
		public TerminalNode ID() { return getToken(TemplateHTMLParser.ID, 0); }
		public VoidElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitVoidElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidElementContext voidElement() throws RecognitionException {
		VoidElementContext _localctx = new VoidElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_voidElement);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(TAG_START_OPEN);
				setState(62);
				((VoidElementContext)_localctx).tagName = match(VOID_TAG_NAME);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(63);
					attribute();
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69);
				match(TAG_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(TAG_START_OPEN);
				setState(71);
				((VoidElementContext)_localctx).tagName = match(ID);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(72);
					attribute();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
				match(TAG_SLASH_CLOSE);
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
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TemplateHTMLParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(TemplateHTMLParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(TemplateHTMLParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ID);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(82);
				match(EQUAL);
				setState(83);
				match(STRING);
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

	public static final String _serializedATN =
		"\u0004\u0001\rW\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002 \b\u0002\n\u0002\f\u0002#\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003)\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004.\b\u0004\n\u0004\f\u0004"+
		"1\t\u0004\u0001\u0004\u0001\u0004\u0005\u00045\b\u0004\n\u0004\f\u0004"+
		"8\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005A\b\u0005\n\u0005\f\u0005D\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005J\b\u0005"+
		"\n\u0005\f\u0005M\t\u0005\u0001\u0005\u0003\u0005P\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006U\b\u0006\u0001\u0006\u0000\u0000"+
		"\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0000Z\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0002\u0019\u0001\u0000\u0000\u0000\u0004\u001b\u0001\u0000"+
		"\u0000\u0000\u0006(\u0001\u0000\u0000\u0000\b*\u0001\u0000\u0000\u0000"+
		"\nO\u0001\u0000\u0000\u0000\fQ\u0001\u0000\u0000\u0000\u000e\u0010\u0003"+
		"\u0002\u0001\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0013\u0001"+
		"\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001"+
		"\u0000\u0000\u0000\u0012\u0014\u0001\u0000\u0000\u0000\u0013\u0011\u0001"+
		"\u0000\u0000\u0000\u0014\u0015\u0005\u0000\u0000\u0001\u0015\u0001\u0001"+
		"\u0000\u0000\u0000\u0016\u001a\u0003\u0004\u0002\u0000\u0017\u001a\u0003"+
		"\u0006\u0003\u0000\u0018\u001a\u0005\u0004\u0000\u0000\u0019\u0016\u0001"+
		"\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u0018\u0001"+
		"\u0000\u0000\u0000\u001a\u0003\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		"\u0001\u0000\u0000\u001c\u001d\u0005\t\u0000\u0000\u001d!\u0005\u000b"+
		"\u0000\u0000\u001e \u0005\u000b\u0000\u0000\u001f\u001e\u0001\u0000\u0000"+
		"\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001"+
		"\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000"+
		"$%\u0005\u0006\u0000\u0000%\u0005\u0001\u0000\u0000\u0000&)\u0003\b\u0004"+
		"\u0000\')\u0003\n\u0005\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000"+
		"\u0000\u0000)\u0007\u0001\u0000\u0000\u0000*+\u0005\u0001\u0000\u0000"+
		"+/\u0005\u000b\u0000\u0000,.\u0003\f\u0006\u0000-,\u0001\u0000\u0000\u0000"+
		".1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u000002\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000026\u0005\u0006"+
		"\u0000\u000035\u0003\u0002\u0001\u000043\u0001\u0000\u0000\u000058\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"79\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\u0002\u0000"+
		"\u0000:;\u0005\u000b\u0000\u0000;<\u0005\u0006\u0000\u0000<\t\u0001\u0000"+
		"\u0000\u0000=>\u0005\u0001\u0000\u0000>B\u0005\n\u0000\u0000?A\u0003\f"+
		"\u0006\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000EP\u0005\u0006\u0000\u0000FG\u0005\u0001\u0000"+
		"\u0000GK\u0005\u000b\u0000\u0000HJ\u0003\f\u0006\u0000IH\u0001\u0000\u0000"+
		"\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NP\u0005"+
		"\u0007\u0000\u0000O=\u0001\u0000\u0000\u0000OF\u0001\u0000\u0000\u0000"+
		"P\u000b\u0001\u0000\u0000\u0000QT\u0005\u000b\u0000\u0000RS\u0005\b\u0000"+
		"\u0000SU\u0005\f\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000U\r\u0001\u0000\u0000\u0000\n\u0011\u0019!(/6BKOT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}