// Generated from Commands.g by ANTLR 4.5.3
package grammarfiles;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommandsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		First=1, Letter=2, Commandseperator=3, Separator=4, Methodstart=5, Methodend=6, 
		LineBreak=7, Whitespace=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"First", "Letter", "Commandseperator", "Separator", "Methodstart", "Methodend", 
		"LineBreak", "Whitespace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", null, "'='", "';'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "First", "Letter", "Commandseperator", "Separator", "Methodstart", 
		"Methodend", "LineBreak", "Whitespace"
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


	public CommandsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Commands.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n.\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\6\3"+
		"\27\n\3\r\3\16\3\30\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\5\b$\n\b\3\b\3"+
		"\b\5\b(\n\b\3\t\6\t+\n\t\r\t\16\t,\2\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\3\2\4\4\2C\\c|\5\2\13\f\16\17\"\"\61\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\3\23\3\2\2\2\5\26\3\2\2\2\7\32\3\2\2\2\t\34\3\2\2\2\13\36\3\2\2\2\r"+
		" \3\2\2\2\17\'\3\2\2\2\21*\3\2\2\2\23\24\7#\2\2\24\4\3\2\2\2\25\27\t\2"+
		"\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\6\3\2"+
		"\2\2\32\33\7?\2\2\33\b\3\2\2\2\34\35\7=\2\2\35\n\3\2\2\2\36\37\7*\2\2"+
		"\37\f\3\2\2\2 !\7+\2\2!\16\3\2\2\2\"$\7\17\2\2#\"\3\2\2\2#$\3\2\2\2$%"+
		"\3\2\2\2%(\7\f\2\2&(\7\17\2\2\'#\3\2\2\2\'&\3\2\2\2(\20\3\2\2\2)+\t\3"+
		"\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\22\3\2\2\2\b\2\26\30#\'"+
		",\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}