// Generated from /home/eric/Projects/kotlin-advent-of-code-2017/src/Day08.g4 by ANTLR 4.12.0
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Day08Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INC=1, DEC=2, IF=3, GT=4, GTE=5, LT=6, LTE=7, EQ=8, NEQ=9, CLEAR=10, ID=11, 
		INT=12, NEG=13, NEWLINE=14, WS=15;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_cond = 2, RULE_num = 3, RULE_op = 4, 
		RULE_compar = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "cond", "num", "op", "compar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inc'", "'dec'", "'if'", "'>'", "'>='", "'<'", "'<='", "'=='", 
			"'!='", "'clear'", null, null, "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INC", "DEC", "IF", "GT", "GTE", "LT", "LTE", "EQ", "NEQ", "CLEAR", 
			"ID", "INT", "NEG", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Day08.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Day08Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Day08Listener ) ((Day08Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Day08Listener ) ((Day08Listener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Day08Visitor ) return ((Day08Visitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends StatContext {
		public TerminalNode ID() { return getToken(Day08Parser.ID, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Day08Parser.NEWLINE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Day08Listener ) ((Day08Listener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Day08Listener ) ((Day08Listener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Day08Visitor ) return ((Day08Visitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			_localctx = new AssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(ID);
			setState(18);
			op();
			setState(19);
			num();
			setState(20);
			cond();
			setState(21);
			match(NEWLINE);
			setState(23);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(22);
				stat();
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
	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends CondContext {
		public TerminalNode IF() { return getToken(Day08Parser.IF, 0); }
		public TerminalNode ID() { return getToken(Day08Parser.ID, 0); }
		public ComparContext compar() {
			return getRuleContext(ComparContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public IfContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Day08Listener ) ((Day08Listener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Day08Listener ) ((Day08Listener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Day08Visitor ) return ((Day08Visitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cond);
		try {
			_localctx = new IfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(IF);
			setState(26);
			match(ID);
			setState(27);
			compar();
			setState(28);
			num();
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
	public static class NumContext extends ParserRuleContext {
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
	 
		public NumContext() { }
		public void copyFrom(NumContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends NumContext {
		public TerminalNode INT() { return getToken(Day08Parser.INT, 0); }
		public TerminalNode NEG() { return getToken(Day08Parser.NEG, 0); }
		public NumberContext(NumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Day08Listener ) ((Day08Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Day08Listener ) ((Day08Listener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Day08Visitor ) return ((Day08Visitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_num);
		int _la;
		try {
			_localctx = new NumberContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEG) {
				{
				setState(30);
				match(NEG);
				}
			}

			setState(33);
			match(INT);
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
	public static class OpContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(Day08Parser.INC, 0); }
		public TerminalNode DEC() { return getToken(Day08Parser.DEC, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Day08Listener ) ((Day08Listener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Day08Listener ) ((Day08Listener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Day08Visitor ) return ((Day08Visitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
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
	public static class ComparContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(Day08Parser.GT, 0); }
		public TerminalNode LT() { return getToken(Day08Parser.LT, 0); }
		public TerminalNode GTE() { return getToken(Day08Parser.GTE, 0); }
		public TerminalNode LTE() { return getToken(Day08Parser.LTE, 0); }
		public TerminalNode EQ() { return getToken(Day08Parser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(Day08Parser.NEQ, 0); }
		public ComparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Day08Listener ) ((Day08Listener)listener).enterCompar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Day08Listener ) ((Day08Listener)listener).exitCompar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Day08Visitor ) return ((Day08Visitor<? extends T>)visitor).visitCompar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparContext compar() throws RecognitionException {
		ComparContext _localctx = new ComparContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u000f(\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003 \b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0002\u0001\u0000"+
		"\u0001\u0002\u0001\u0000\u0004\t$\u0000\r\u0001\u0000\u0000\u0000\u0002"+
		"\u0011\u0001\u0000\u0000\u0000\u0004\u0019\u0001\u0000\u0000\u0000\u0006"+
		"\u001f\u0001\u0000\u0000\u0000\b#\u0001\u0000\u0000\u0000\n%\u0001\u0000"+
		"\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001\u0000\u0000\u0000"+
		"\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f"+
		"\u0010\u0001\u0000\u0000\u0000\u0010\u0001\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0005\u000b\u0000\u0000\u0012\u0013\u0003\b\u0004\u0000\u0013\u0014"+
		"\u0003\u0006\u0003\u0000\u0014\u0015\u0003\u0004\u0002\u0000\u0015\u0017"+
		"\u0005\u000e\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0003"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0003\u0000\u0000\u001a\u001b"+
		"\u0005\u000b\u0000\u0000\u001b\u001c\u0003\n\u0005\u0000\u001c\u001d\u0003"+
		"\u0006\u0003\u0000\u001d\u0005\u0001\u0000\u0000\u0000\u001e \u0005\r"+
		"\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!\"\u0005\f\u0000\u0000\"\u0007\u0001"+
		"\u0000\u0000\u0000#$\u0007\u0000\u0000\u0000$\t\u0001\u0000\u0000\u0000"+
		"%&\u0007\u0001\u0000\u0000&\u000b\u0001\u0000\u0000\u0000\u0003\u000f"+
		"\u0017\u001f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}