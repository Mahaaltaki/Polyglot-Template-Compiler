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
		TAG_START_OPEN=1, TAG_END_OPEN=2, JINJA_VAR_START=3, JINJA_BLOCK_START=4, 
		HTML_COMMENT=5, TEXT=6, WS=7, TAG_CLOSE=8, TAG_SLASH_CLOSE=9, EQUAL=10, 
		BANG=11, VOID_TAG_NAME=12, ID=13, STRING=14, TAG_WS=15, JINJA_VAR_END=16, 
		JINJA_ID=17, JINJA_DOT=18, JINJA_WS=19, JINJA_BLOCK_END=20, JINJA_FOR=21, 
		JINJA_IN=22, JINJA_ENDFOR=23, JINJA_IF=24, JINJA_ELSE=25, JINJA_ENDIF=26, 
		BLOCK_ID=27, BLOCK_WS=28;
	public static final int
		RULE_htmlDocument = 0, RULE_node = 1, RULE_doctype = 2, RULE_element = 3, 
		RULE_normalElement = 4, RULE_voidElement = 5, RULE_attribute = 6, RULE_jinjaVariable = 7, 
		RULE_jinjaVarExpression = 8, RULE_jinjaVarAccess = 9, RULE_jinjaBlock = 10, 
		RULE_jinjaForBlock = 11, RULE_jinjaIfBlock = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "node", "doctype", "element", "normalElement", "voidElement", 
			"attribute", "jinjaVariable", "jinjaVarExpression", "jinjaVarAccess", 
			"jinjaBlock", "jinjaForBlock", "jinjaIfBlock"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'</'", "'{{'", "'{%'", null, null, null, "'>'", "'/>'", 
			"'='", "'!'", null, null, null, null, "'}}'", null, "'.'", null, "'%}'", 
			"'for'", "'in'", "'endfor'", "'if'", "'else'", "'endif'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAG_START_OPEN", "TAG_END_OPEN", "JINJA_VAR_START", "JINJA_BLOCK_START", 
			"HTML_COMMENT", "TEXT", "WS", "TAG_CLOSE", "TAG_SLASH_CLOSE", "EQUAL", 
			"BANG", "VOID_TAG_NAME", "ID", "STRING", "TAG_WS", "JINJA_VAR_END", "JINJA_ID", 
			"JINJA_DOT", "JINJA_WS", "JINJA_BLOCK_END", "JINJA_FOR", "JINJA_IN", 
			"JINJA_ENDFOR", "JINJA_IF", "JINJA_ELSE", "JINJA_ENDIF", "BLOCK_ID", 
			"BLOCK_WS"
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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 90L) != 0)) {
				{
				{
				setState(26);
				node();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
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
		public JinjaVariableContext jinjaVariable() {
			return getRuleContext(JinjaVariableContext.class,0);
		}
		public JinjaBlockContext jinjaBlock() {
			return getRuleContext(JinjaBlockContext.class,0);
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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				doctype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				jinjaVariable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				jinjaBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
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
			setState(41);
			match(TAG_START_OPEN);
			setState(42);
			match(BANG);
			setState(43);
			match(ID);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(44);
				match(ID);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				normalElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
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
			setState(56);
			match(TAG_START_OPEN);
			setState(57);
			((NormalElementContext)_localctx).tagName = match(ID);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(58);
				attribute();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(TAG_CLOSE);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 90L) != 0)) {
				{
				{
				setState(65);
				node();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(TAG_END_OPEN);
			setState(72);
			((NormalElementContext)_localctx).closingTagName = match(ID);
			setState(73);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(TAG_START_OPEN);
				setState(76);
				((VoidElementContext)_localctx).tagName = match(VOID_TAG_NAME);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(77);
					attribute();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(TAG_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(TAG_START_OPEN);
				setState(85);
				((VoidElementContext)_localctx).tagName = match(ID);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(86);
					attribute();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
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
			setState(95);
			match(ID);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(96);
				match(EQUAL);
				setState(97);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaVariableContext extends ParserRuleContext {
		public TerminalNode JINJA_VAR_START() { return getToken(TemplateHTMLParser.JINJA_VAR_START, 0); }
		public JinjaVarExpressionContext jinjaVarExpression() {
			return getRuleContext(JinjaVarExpressionContext.class,0);
		}
		public TerminalNode JINJA_VAR_END() { return getToken(TemplateHTMLParser.JINJA_VAR_END, 0); }
		public JinjaVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitJinjaVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaVariableContext jinjaVariable() throws RecognitionException {
		JinjaVariableContext _localctx = new JinjaVariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jinjaVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(JINJA_VAR_START);
			setState(101);
			jinjaVarExpression();
			setState(102);
			match(JINJA_VAR_END);
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
	public static class JinjaVarExpressionContext extends ParserRuleContext {
		public List<JinjaVarAccessContext> jinjaVarAccess() {
			return getRuleContexts(JinjaVarAccessContext.class);
		}
		public JinjaVarAccessContext jinjaVarAccess(int i) {
			return getRuleContext(JinjaVarAccessContext.class,i);
		}
		public List<TerminalNode> JINJA_DOT() { return getTokens(TemplateHTMLParser.JINJA_DOT); }
		public TerminalNode JINJA_DOT(int i) {
			return getToken(TemplateHTMLParser.JINJA_DOT, i);
		}
		public JinjaVarExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaVarExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitJinjaVarExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaVarExpressionContext jinjaVarExpression() throws RecognitionException {
		JinjaVarExpressionContext _localctx = new JinjaVarExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jinjaVarExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			jinjaVarAccess();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_DOT) {
				{
				{
				setState(105);
				match(JINJA_DOT);
				setState(106);
				jinjaVarAccess();
				}
				}
				setState(111);
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
	public static class JinjaVarAccessContext extends ParserRuleContext {
		public TerminalNode JINJA_ID() { return getToken(TemplateHTMLParser.JINJA_ID, 0); }
		public JinjaVarAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaVarAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitJinjaVarAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaVarAccessContext jinjaVarAccess() throws RecognitionException {
		JinjaVarAccessContext _localctx = new JinjaVarAccessContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jinjaVarAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(JINJA_ID);
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
	public static class JinjaBlockContext extends ParserRuleContext {
		public JinjaForBlockContext jinjaForBlock() {
			return getRuleContext(JinjaForBlockContext.class,0);
		}
		public JinjaIfBlockContext jinjaIfBlock() {
			return getRuleContext(JinjaIfBlockContext.class,0);
		}
		public JinjaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitJinjaBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBlockContext jinjaBlock() throws RecognitionException {
		JinjaBlockContext _localctx = new JinjaBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jinjaBlock);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				jinjaForBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				jinjaIfBlock();
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
	public static class JinjaForBlockContext extends ParserRuleContext {
		public Token loopVar;
		public Token iterable;
		public List<TerminalNode> JINJA_BLOCK_START() { return getTokens(TemplateHTMLParser.JINJA_BLOCK_START); }
		public TerminalNode JINJA_BLOCK_START(int i) {
			return getToken(TemplateHTMLParser.JINJA_BLOCK_START, i);
		}
		public TerminalNode JINJA_FOR() { return getToken(TemplateHTMLParser.JINJA_FOR, 0); }
		public TerminalNode JINJA_IN() { return getToken(TemplateHTMLParser.JINJA_IN, 0); }
		public List<TerminalNode> JINJA_BLOCK_END() { return getTokens(TemplateHTMLParser.JINJA_BLOCK_END); }
		public TerminalNode JINJA_BLOCK_END(int i) {
			return getToken(TemplateHTMLParser.JINJA_BLOCK_END, i);
		}
		public TerminalNode JINJA_ENDFOR() { return getToken(TemplateHTMLParser.JINJA_ENDFOR, 0); }
		public List<TerminalNode> BLOCK_ID() { return getTokens(TemplateHTMLParser.BLOCK_ID); }
		public TerminalNode BLOCK_ID(int i) {
			return getToken(TemplateHTMLParser.BLOCK_ID, i);
		}
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public JinjaForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaForBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitJinjaForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaForBlockContext jinjaForBlock() throws RecognitionException {
		JinjaForBlockContext _localctx = new JinjaForBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jinjaForBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(JINJA_BLOCK_START);
			setState(119);
			match(JINJA_FOR);
			setState(120);
			((JinjaForBlockContext)_localctx).loopVar = match(BLOCK_ID);
			setState(121);
			match(JINJA_IN);
			setState(122);
			((JinjaForBlockContext)_localctx).iterable = match(BLOCK_ID);
			setState(123);
			match(JINJA_BLOCK_END);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					node();
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(130);
			match(JINJA_BLOCK_START);
			setState(131);
			match(JINJA_ENDFOR);
			setState(132);
			match(JINJA_BLOCK_END);
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
	public static class JinjaIfBlockContext extends ParserRuleContext {
		public Token condition;
		public List<TerminalNode> JINJA_BLOCK_START() { return getTokens(TemplateHTMLParser.JINJA_BLOCK_START); }
		public TerminalNode JINJA_BLOCK_START(int i) {
			return getToken(TemplateHTMLParser.JINJA_BLOCK_START, i);
		}
		public TerminalNode JINJA_IF() { return getToken(TemplateHTMLParser.JINJA_IF, 0); }
		public List<TerminalNode> JINJA_BLOCK_END() { return getTokens(TemplateHTMLParser.JINJA_BLOCK_END); }
		public TerminalNode JINJA_BLOCK_END(int i) {
			return getToken(TemplateHTMLParser.JINJA_BLOCK_END, i);
		}
		public TerminalNode JINJA_ENDIF() { return getToken(TemplateHTMLParser.JINJA_ENDIF, 0); }
		public TerminalNode BLOCK_ID() { return getToken(TemplateHTMLParser.BLOCK_ID, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public TerminalNode JINJA_ELSE() { return getToken(TemplateHTMLParser.JINJA_ELSE, 0); }
		public JinjaIfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaIfBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateHTMLParserVisitor ) return ((TemplateHTMLParserVisitor<? extends T>)visitor).visitJinjaIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaIfBlockContext jinjaIfBlock() throws RecognitionException {
		JinjaIfBlockContext _localctx = new JinjaIfBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jinjaIfBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(JINJA_BLOCK_START);
			setState(135);
			match(JINJA_IF);
			setState(136);
			((JinjaIfBlockContext)_localctx).condition = match(BLOCK_ID);
			setState(137);
			match(JINJA_BLOCK_END);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(138);
					node();
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(144);
				match(JINJA_BLOCK_START);
				setState(145);
				match(JINJA_ELSE);
				setState(146);
				match(JINJA_BLOCK_END);
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(147);
						node();
						}
						} 
					}
					setState(152);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			}
			setState(155);
			match(JINJA_BLOCK_START);
			setState(156);
			match(JINJA_ENDIF);
			setState(157);
			match(JINJA_BLOCK_END);
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
		"\u0004\u0001\u001c\u00a0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000"+
		"\u001f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002.\b\u0002\n\u0002\f\u00021\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u00037\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004<\b\u0004\n\u0004\f\u0004"+
		"?\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004C\b\u0004\n\u0004\f\u0004"+
		"F\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005O\b\u0005\n\u0005\f\u0005R\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005X\b\u0005"+
		"\n\u0005\f\u0005[\t\u0005\u0001\u0005\u0003\u0005^\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006c\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\bl\b\b\n\b\f\b"+
		"o\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0003\nu\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"~\b\u000b\n\u000b\f\u000b\u0081\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u008c"+
		"\b\f\n\f\f\f\u008f\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0095\b"+
		"\f\n\f\f\f\u0098\t\f\u0003\f\u009a\b\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u0000\u0000\u00a5\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0002\'\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u0006"+
		"6\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\n]\u0001\u0000\u0000"+
		"\u0000\f_\u0001\u0000\u0000\u0000\u000ed\u0001\u0000\u0000\u0000\u0010"+
		"h\u0001\u0000\u0000\u0000\u0012p\u0001\u0000\u0000\u0000\u0014t\u0001"+
		"\u0000\u0000\u0000\u0016v\u0001\u0000\u0000\u0000\u0018\u0086\u0001\u0000"+
		"\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0005\u0000\u0000\u0001!"+
		"\u0001\u0001\u0000\u0000\u0000\"(\u0003\u0004\u0002\u0000#(\u0003\u0006"+
		"\u0003\u0000$(\u0003\u000e\u0007\u0000%(\u0003\u0014\n\u0000&(\u0005\u0006"+
		"\u0000\u0000\'\"\u0001\u0000\u0000\u0000\'#\u0001\u0000\u0000\u0000\'"+
		"$\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000"+
		"\u0000(\u0003\u0001\u0000\u0000\u0000)*\u0005\u0001\u0000\u0000*+\u0005"+
		"\u000b\u0000\u0000+/\u0005\r\u0000\u0000,.\u0005\r\u0000\u0000-,\u0001"+
		"\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u000002\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000023\u0005\b\u0000\u00003\u0005\u0001\u0000\u0000\u000047\u0003\b"+
		"\u0004\u000057\u0003\n\u0005\u000064\u0001\u0000\u0000\u000065\u0001\u0000"+
		"\u0000\u00007\u0007\u0001\u0000\u0000\u000089\u0005\u0001\u0000\u0000"+
		"9=\u0005\r\u0000\u0000:<\u0003\f\u0006\u0000;:\u0001\u0000\u0000\u0000"+
		"<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@D\u0005\b\u0000"+
		"\u0000AC\u0003\u0002\u0001\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0005\u0002\u0000\u0000"+
		"HI\u0005\r\u0000\u0000IJ\u0005\b\u0000\u0000J\t\u0001\u0000\u0000\u0000"+
		"KL\u0005\u0001\u0000\u0000LP\u0005\f\u0000\u0000MO\u0003\f\u0006\u0000"+
		"NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000S^\u0005\b\u0000\u0000TU\u0005\u0001\u0000\u0000UY\u0005\r"+
		"\u0000\u0000VX\u0003\f\u0006\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\^\u0005\t\u0000\u0000]K"+
		"\u0001\u0000\u0000\u0000]T\u0001\u0000\u0000\u0000^\u000b\u0001\u0000"+
		"\u0000\u0000_b\u0005\r\u0000\u0000`a\u0005\n\u0000\u0000ac\u0005\u000e"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\r\u0001"+
		"\u0000\u0000\u0000de\u0005\u0003\u0000\u0000ef\u0003\u0010\b\u0000fg\u0005"+
		"\u0010\u0000\u0000g\u000f\u0001\u0000\u0000\u0000hm\u0003\u0012\t\u0000"+
		"ij\u0005\u0012\u0000\u0000jl\u0003\u0012\t\u0000ki\u0001\u0000\u0000\u0000"+
		"lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000n\u0011\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005"+
		"\u0011\u0000\u0000q\u0013\u0001\u0000\u0000\u0000ru\u0003\u0016\u000b"+
		"\u0000su\u0003\u0018\f\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000"+
		"\u0000u\u0015\u0001\u0000\u0000\u0000vw\u0005\u0004\u0000\u0000wx\u0005"+
		"\u0015\u0000\u0000xy\u0005\u001b\u0000\u0000yz\u0005\u0016\u0000\u0000"+
		"z{\u0005\u001b\u0000\u0000{\u007f\u0005\u0014\u0000\u0000|~\u0003\u0002"+
		"\u0001\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005\u0004\u0000\u0000\u0083\u0084\u0005\u0017\u0000\u0000\u0084"+
		"\u0085\u0005\u0014\u0000\u0000\u0085\u0017\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005\u0004\u0000\u0000\u0087\u0088\u0005\u0018\u0000\u0000\u0088"+
		"\u0089\u0005\u001b\u0000\u0000\u0089\u008d\u0005\u0014\u0000\u0000\u008a"+
		"\u008c\u0003\u0002\u0001\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u0099\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0004\u0000\u0000\u0091"+
		"\u0092\u0005\u0019\u0000\u0000\u0092\u0096\u0005\u0014\u0000\u0000\u0093"+
		"\u0095\u0003\u0002\u0001\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0099\u0090\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005\u0004\u0000\u0000\u009c\u009d\u0005\u001a\u0000\u0000\u009d"+
		"\u009e\u0005\u0014\u0000\u0000\u009e\u0019\u0001\u0000\u0000\u0000\u0010"+
		"\u001d\'/6=DPY]bmt\u007f\u008d\u0096\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}