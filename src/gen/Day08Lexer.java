// Generated from /home/eric/Projects/kotlin-advent-of-code-2017/src/Day08.g4 by ANTLR 4.12.0
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Day08Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INC=1, DEC=2, IF=3, GT=4, GTE=5, LT=6, LTE=7, EQ=8, NEQ=9, CLEAR=10, ID=11, 
		INT=12, NEG=13, NEWLINE=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INC", "DEC", "IF", "GT", "GTE", "LT", "LTE", "EQ", "NEQ", "CLEAR", "ID", 
			"INT", "NEG", "NEWLINE", "WS"
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


	public Day08Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Day08.g4"; }

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
		"\u0004\u0000\u000fX\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0004\nB\b\n\u000b\n\f\nC\u0001\u000b\u0004\u000bG\b\u000b\u000b\u000b"+
		"\f\u000bH\u0001\f\u0001\f\u0001\r\u0003\rN\b\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0004\u000eS\b\u000e\u000b\u000e\f\u000eT\u0001\u000e\u0001\u000e\u0000"+
		"\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u0001\u0000\u0003\u0001\u0000az\u0001\u000009\u0002"+
		"\u0000\t\t  [\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000"+
		"\u0003#\u0001\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000\u0000\u0007"+
		"*\u0001\u0000\u0000\u0000\t,\u0001\u0000\u0000\u0000\u000b/\u0001\u0000"+
		"\u0000\u0000\r1\u0001\u0000\u0000\u0000\u000f4\u0001\u0000\u0000\u0000"+
		"\u00117\u0001\u0000\u0000\u0000\u0013:\u0001\u0000\u0000\u0000\u0015A"+
		"\u0001\u0000\u0000\u0000\u0017F\u0001\u0000\u0000\u0000\u0019J\u0001\u0000"+
		"\u0000\u0000\u001bM\u0001\u0000\u0000\u0000\u001dR\u0001\u0000\u0000\u0000"+
		"\u001f \u0005i\u0000\u0000 !\u0005n\u0000\u0000!\"\u0005c\u0000\u0000"+
		"\"\u0002\u0001\u0000\u0000\u0000#$\u0005d\u0000\u0000$%\u0005e\u0000\u0000"+
		"%&\u0005c\u0000\u0000&\u0004\u0001\u0000\u0000\u0000\'(\u0005i\u0000\u0000"+
		"()\u0005f\u0000\u0000)\u0006\u0001\u0000\u0000\u0000*+\u0005>\u0000\u0000"+
		"+\b\u0001\u0000\u0000\u0000,-\u0005>\u0000\u0000-.\u0005=\u0000\u0000"+
		".\n\u0001\u0000\u0000\u0000/0\u0005<\u0000\u00000\f\u0001\u0000\u0000"+
		"\u000012\u0005<\u0000\u000023\u0005=\u0000\u00003\u000e\u0001\u0000\u0000"+
		"\u000045\u0005=\u0000\u000056\u0005=\u0000\u00006\u0010\u0001\u0000\u0000"+
		"\u000078\u0005!\u0000\u000089\u0005=\u0000\u00009\u0012\u0001\u0000\u0000"+
		"\u0000:;\u0005c\u0000\u0000;<\u0005l\u0000\u0000<=\u0005e\u0000\u0000"+
		"=>\u0005a\u0000\u0000>?\u0005r\u0000\u0000?\u0014\u0001\u0000\u0000\u0000"+
		"@B\u0007\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0016\u0001"+
		"\u0000\u0000\u0000EG\u0007\u0001\u0000\u0000FE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000I\u0018\u0001\u0000\u0000\u0000JK\u0005-\u0000\u0000K\u001a\u0001"+
		"\u0000\u0000\u0000LN\u0005\r\u0000\u0000ML\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0005\n\u0000\u0000P\u001c"+
		"\u0001\u0000\u0000\u0000QS\u0007\u0002\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0006\u000e\u0000\u0000W\u001e"+
		"\u0001\u0000\u0000\u0000\u0005\u0000CHMT\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}