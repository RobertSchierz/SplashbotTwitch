// Generated from Commands.g by ANTLR 4.5.3
package grammarfiles;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommandsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		First=1, Letter=2, Commandseperator=3, Separator=4, Methodstart=5, Methodend=6, 
		LineBreak=7, Whitespace=8;
	public static final int
		RULE_file = 0, RULE_command = 1, RULE_commandvaluerule = 2, RULE_methodrule = 3;
	public static final String[] ruleNames = {
		"file", "command", "commandvaluerule", "methodrule"
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

	@Override
	public String getGrammarFileName() { return "Commands.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CommandsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CommandsParser.EOF, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				command();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==First );
			setState(13);
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

	public static class CommandContext extends ParserRuleContext {
		public Token commandnamesign;
		public Token commandname;
		public CommandvalueruleContext commandvalue;
		public MethodruleContext method;
		public TerminalNode Commandseperator() { return getToken(CommandsParser.Commandseperator, 0); }
		public TerminalNode Separator() { return getToken(CommandsParser.Separator, 0); }
		public TerminalNode First() { return getToken(CommandsParser.First, 0); }
		public CommandvalueruleContext commandvaluerule() {
			return getRuleContext(CommandvalueruleContext.class,0);
		}
		public MethodruleContext methodrule() {
			return getRuleContext(MethodruleContext.class,0);
		}
		public TerminalNode LineBreak() { return getToken(CommandsParser.LineBreak, 0); }
		public TerminalNode EOF() { return getToken(CommandsParser.EOF, 0); }
		public List<TerminalNode> Letter() { return getTokens(CommandsParser.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(CommandsParser.Letter, i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			((CommandContext)_localctx).commandnamesign = match(First);
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				((CommandContext)_localctx).commandname = match(Letter);
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Letter );
			setState(21);
			match(Commandseperator);
			setState(22);
			((CommandContext)_localctx).commandvalue = commandvaluerule();
			setState(23);
			((CommandContext)_localctx).method = methodrule();
			setState(24);
			match(Separator);
			setState(25);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==LineBreak) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class CommandvalueruleContext extends ParserRuleContext {
		public List<TerminalNode> Letter() { return getTokens(CommandsParser.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(CommandsParser.Letter, i);
		}
		public List<TerminalNode> Whitespace() { return getTokens(CommandsParser.Whitespace); }
		public TerminalNode Whitespace(int i) {
			return getToken(CommandsParser.Whitespace, i);
		}
		public CommandvalueruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandvaluerule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterCommandvaluerule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitCommandvaluerule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitCommandvaluerule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandvalueruleContext commandvaluerule() throws RecognitionException {
		CommandvalueruleContext _localctx = new CommandvalueruleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commandvaluerule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				_la = _input.LA(1);
				if ( !(_la==Letter || _la==Whitespace) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Letter || _la==Whitespace );
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

	public static class MethodruleContext extends ParserRuleContext {
		public TerminalNode Methodstart() { return getToken(CommandsParser.Methodstart, 0); }
		public TerminalNode Methodend() { return getToken(CommandsParser.Methodend, 0); }
		public MethodruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodrule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterMethodrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitMethodrule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandsVisitor ) return ((CommandsVisitor<? extends T>)visitor).visitMethodrule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodruleContext methodrule() throws RecognitionException {
		MethodruleContext _localctx = new MethodruleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodrule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if (_la==Methodstart) {
				{
				setState(32);
				match(Methodstart);
				setState(33);
				match(Methodend);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n\'\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\2\3\2\3\3\3\3\6\3\24\n\3"+
		"\r\3\16\3\25\3\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4\37\n\4\r\4\16\4 \3\5\3\5"+
		"\5\5%\n\5\3\5\2\2\6\2\4\6\b\2\4\3\3\t\t\4\2\4\4\n\n&\2\13\3\2\2\2\4\21"+
		"\3\2\2\2\6\36\3\2\2\2\b$\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2\2\f\r\3\2\2\2"+
		"\r\13\3\2\2\2\r\16\3\2\2\2\16\17\3\2\2\2\17\20\7\2\2\3\20\3\3\2\2\2\21"+
		"\23\7\3\2\2\22\24\7\4\2\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25"+
		"\26\3\2\2\2\26\27\3\2\2\2\27\30\7\5\2\2\30\31\5\6\4\2\31\32\5\b\5\2\32"+
		"\33\7\6\2\2\33\34\t\2\2\2\34\5\3\2\2\2\35\37\t\3\2\2\36\35\3\2\2\2\37"+
		" \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\7\3\2\2\2\"#\7\7\2\2#%\7\b\2\2$\"\3\2"+
		"\2\2$%\3\2\2\2%\t\3\2\2\2\6\r\25 $";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}