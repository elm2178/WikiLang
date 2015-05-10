// Generated from Wiki.g4 by ANTLR 4.5


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WikiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, MUL=15, ADD=16, DIV=17, 
		SUB=18, MOD=19, GT=20, LT=21, GTE=22, LTE=23, EQ=24, NEQ=25, PP=26, MM=27, 
		INT=28, STRING=29, BOOL=30, TABLE=31, PAGE=32, TRUE=33, FALSE=34, PRINT=35, 
		FUNC=36, END=37, RETURN=38, IF=39, ELSE=40, WHILE=41, FOR=42, BRK=43, 
		MAIN=44, IMPORT=45, ID=46, NUM=47, COMMENT=48, LCOM=49, STRLIT=50, NL=51, 
		WS=52;
	public static final int
		RULE_prog = 0, RULE_import_seq = 1, RULE_import_stmt = 2, RULE_prog_seq = 3, 
		RULE_seq = 4, RULE_main_func = 5, RULE_stmt_seq = 6, RULE_func_seq = 7, 
		RULE_stmt = 8, RULE_comm = 9, RULE_ident = 10, RULE_for_stmt = 11, RULE_while_stmt = 12, 
		RULE_if_stmt = 13, RULE_else_stmt = 14, RULE_func_action = 15, RULE_expr = 16, 
		RULE_array_expr = 17, RULE_static_fcall = 18, RULE_func = 19, RULE_func_stmt = 20, 
		RULE_params = 21, RULE_args = 22, RULE_ret_stmt = 23, RULE_bool_expr = 24, 
		RULE_bool_term = 25, RULE_bool_fact = 26, RULE_cond = 27, RULE_str_expr = 28, 
		RULE_int_expr = 29, RULE_term = 30, RULE_fact = 31, RULE_type = 32;
	public static final String[] ruleNames = {
		"prog", "import_seq", "import_stmt", "prog_seq", "seq", "main_func", "stmt_seq", 
		"func_seq", "stmt", "comm", "ident", "for_stmt", "while_stmt", "if_stmt", 
		"else_stmt", "func_action", "expr", "array_expr", "static_fcall", "func", 
		"func_stmt", "params", "args", "ret_stmt", "bool_expr", "bool_term", "bool_fact", 
		"cond", "str_expr", "int_expr", "term", "fact", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'()'", "'('", "')'", "'='", "'['", "']'", "';'", "'{'", 
		"','", "'}'", "'||'", "'&&'", "'!'", "'*'", "'+'", "'/'", "'-'", "'%'", 
		"'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'++'", "'--'", "'num'", 
		"'string'", "'bool'", "'table'", "'page'", "'true'", "'false'", "'print'", 
		"'func'", "'end'", "'return'", "'if'", "'else'", "'while'", "'for'", "'break'", 
		"'main'", "'import'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "MUL", "ADD", "DIV", "SUB", "MOD", "GT", "LT", "GTE", 
		"LTE", "EQ", "NEQ", "PP", "MM", "INT", "STRING", "BOOL", "TABLE", "PAGE", 
		"TRUE", "FALSE", "PRINT", "FUNC", "END", "RETURN", "IF", "ELSE", "WHILE", 
		"FOR", "BRK", "MAIN", "IMPORT", "ID", "NUM", "COMMENT", "LCOM", "STRLIT", 
		"NL", "WS"
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
	public String getGrammarFileName() { return "Wiki.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	public WikiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Import_seqContext import_seq() {
			return getRuleContext(Import_seqContext.class,0);
		}
		public Prog_seqContext prog_seq() {
			return getRuleContext(Prog_seqContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			import_seq();
			setState(67);
			prog_seq();
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

	public static class Import_seqContext extends ParserRuleContext {
		public Import_stmtContext import_stmt() {
			return getRuleContext(Import_stmtContext.class,0);
		}
		public TerminalNode NL() { return getToken(WikiParser.NL, 0); }
		public Import_seqContext import_seq() {
			return getRuleContext(Import_seqContext.class,0);
		}
		public Import_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterImport_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitImport_seq(this);
		}
	}

	public final Import_seqContext import_seq() throws RecognitionException {
		Import_seqContext _localctx = new Import_seqContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_import_seq);
		try {
			setState(74);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				import_stmt();
				setState(70);
				match(NL);
				setState(71);
				import_seq();
				}
				break;
			case EOF:
			case PP:
			case MM:
			case INT:
			case STRING:
			case BOOL:
			case TABLE:
			case PAGE:
			case PRINT:
			case FUNC:
			case RETURN:
			case IF:
			case WHILE:
			case FOR:
			case BRK:
			case MAIN:
			case ID:
			case COMMENT:
			case LCOM:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Import_stmtContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(WikiParser.IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(WikiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WikiParser.ID, i);
		}
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterImport_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitImport_stmt(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_import_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(IMPORT);
			setState(77);
			match(ID);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(78);
				match(T__0);
				setState(79);
				match(ID);
				}
				}
				setState(84);
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

	public static class Prog_seqContext extends ParserRuleContext {
		public SeqContext seq() {
			return getRuleContext(SeqContext.class,0);
		}
		public Prog_seqContext prog_seq() {
			return getRuleContext(Prog_seqContext.class,0);
		}
		public Prog_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterProg_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitProg_seq(this);
		}
	}

	public final Prog_seqContext prog_seq() throws RecognitionException {
		Prog_seqContext _localctx = new Prog_seqContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prog_seq);
		try {
			setState(89);
			switch (_input.LA(1)) {
			case PP:
			case MM:
			case INT:
			case STRING:
			case BOOL:
			case TABLE:
			case PAGE:
			case PRINT:
			case FUNC:
			case RETURN:
			case IF:
			case WHILE:
			case FOR:
			case BRK:
			case MAIN:
			case ID:
			case COMMENT:
			case LCOM:
			case NL:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				seq();
				setState(86);
				prog_seq();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SeqContext extends ParserRuleContext {
		public Func_seqContext func_seq() {
			return getRuleContext(Func_seqContext.class,0);
		}
		public Main_funcContext main_func() {
			return getRuleContext(Main_funcContext.class,0);
		}
		public Stmt_seqContext stmt_seq() {
			return getRuleContext(Stmt_seqContext.class,0);
		}
		public TerminalNode NL() { return getToken(WikiParser.NL, 0); }
		public SeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitSeq(this);
		}
	}

	public final SeqContext seq() throws RecognitionException {
		SeqContext _localctx = new SeqContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_seq);
		try {
			setState(95);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				func_seq();
				}
				break;
			case MAIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				main_func();
				}
				break;
			case PP:
			case MM:
			case INT:
			case STRING:
			case BOOL:
			case TABLE:
			case PAGE:
			case PRINT:
			case RETURN:
			case IF:
			case WHILE:
			case FOR:
			case BRK:
			case ID:
			case COMMENT:
			case LCOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				stmt_seq();
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(NL);
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

	public static class Main_funcContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(WikiParser.MAIN, 0); }
		public TerminalNode NL() { return getToken(WikiParser.NL, 0); }
		public TerminalNode END() { return getToken(WikiParser.END, 0); }
		public Stmt_seqContext stmt_seq() {
			return getRuleContext(Stmt_seqContext.class,0);
		}
		public Main_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterMain_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitMain_func(this);
		}
	}

	public final Main_funcContext main_func() throws RecognitionException {
		Main_funcContext _localctx = new Main_funcContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_main_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(MAIN);
			setState(98);
			match(T__1);
			setState(99);
			match(NL);
			setState(102);
			switch (_input.LA(1)) {
			case PP:
			case MM:
			case INT:
			case STRING:
			case BOOL:
			case TABLE:
			case PAGE:
			case PRINT:
			case RETURN:
			case IF:
			case WHILE:
			case FOR:
			case BRK:
			case ID:
			case COMMENT:
			case LCOM:
				{
				setState(100);
				stmt_seq();
				}
				break;
			case END:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(104);
			match(END);
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

	public static class Stmt_seqContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode NL() { return getToken(WikiParser.NL, 0); }
		public Stmt_seqContext stmt_seq() {
			return getRuleContext(Stmt_seqContext.class,0);
		}
		public Stmt_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterStmt_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitStmt_seq(this);
		}
	}

	public final Stmt_seqContext stmt_seq() throws RecognitionException {
		Stmt_seqContext _localctx = new Stmt_seqContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt_seq);
		try {
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				stmt();
				setState(107);
				match(NL);
				setState(108);
				stmt_seq();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				stmt();
				setState(113);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(111);
					match(NL);
					}
					break;
				case 2:
					{
					}
					break;
				}
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

	public static class Func_seqContext extends ParserRuleContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TerminalNode NL() { return getToken(WikiParser.NL, 0); }
		public Func_seqContext func_seq() {
			return getRuleContext(Func_seqContext.class,0);
		}
		public Func_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterFunc_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitFunc_seq(this);
		}
	}

	public final Func_seqContext func_seq() throws RecognitionException {
		Func_seqContext _localctx = new Func_seqContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func_seq);
		try {
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				func();
				setState(118);
				match(NL);
				setState(119);
				func_seq();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				func();
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommentContext extends StmtContext {
		public CommContext comm() {
			return getRuleContext(CommContext.class,0);
		}
		public CommentContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitComment(this);
		}
	}
	public static class BreakContext extends StmtContext {
		public TerminalNode BRK() { return getToken(WikiParser.BRK, 0); }
		public BreakContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitBreak(this);
		}
	}
	public static class IncDecContext extends StmtContext {
		public Token u;
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode PP() { return getToken(WikiParser.PP, 0); }
		public TerminalNode MM() { return getToken(WikiParser.MM, 0); }
		public IncDecContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterIncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitIncDec(this);
		}
	}
	public static class DeclareContext extends StmtContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public DeclareContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitDeclare(this);
		}
	}
	public static class PrintContext extends StmtContext {
		public TerminalNode PRINT() { return getToken(WikiParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitPrint(this);
		}
	}
	public static class DecAssignContext extends StmtContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DecAssignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterDecAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitDecAssign(this);
		}
	}
	public static class IfStmtContext extends StmtContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public IfStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitIfStmt(this);
		}
	}
	public static class WhileStmtContext extends StmtContext {
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public WhileStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitWhileStmt(this);
		}
	}
	public static class FuncActContext extends StmtContext {
		public Func_actionContext func_action() {
			return getRuleContext(Func_actionContext.class,0);
		}
		public FuncActContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterFuncAct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitFuncAct(this);
		}
	}
	public static class AssignContext extends StmtContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitAssign(this);
		}
	}
	public static class StaticCallContext extends StmtContext {
		public Static_fcallContext static_fcall() {
			return getRuleContext(Static_fcallContext.class,0);
		}
		public StaticCallContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterStaticCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitStaticCall(this);
		}
	}
	public static class ForStmtContext extends StmtContext {
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public ForStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitForStmt(this);
		}
	}
	public static class ReturnStmtContext extends StmtContext {
		public Ret_stmtContext ret_stmt() {
			return getRuleContext(Ret_stmtContext.class,0);
		}
		public ReturnStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitReturnStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		int _la;
		try {
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(PRINT);
				setState(125);
				match(T__2);
				setState(126);
				expr();
				setState(127);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				type();
				setState(130);
				ident();
				}
				break;
			case 3:
				_localctx = new DecAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				type();
				setState(133);
				ident();
				setState(134);
				match(T__4);
				setState(135);
				expr();
				}
				break;
			case 4:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				ident();
				setState(138);
				match(T__4);
				setState(139);
				expr();
				}
				break;
			case 5:
				_localctx = new IncDecContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(141);
					ident();
					setState(142);
					((IncDecContext)_localctx).u = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PP || _la==MM) ) {
						((IncDecContext)_localctx).u = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case PP:
				case MM:
					{
					setState(144);
					((IncDecContext)_localctx).u = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PP || _la==MM) ) {
						((IncDecContext)_localctx).u = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(145);
					ident();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 6:
				_localctx = new FuncActContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				func_action();
				}
				break;
			case 7:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
				if_stmt();
				}
				break;
			case 8:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(150);
				while_stmt();
				}
				break;
			case 9:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(151);
				for_stmt();
				}
				break;
			case 10:
				_localctx = new CommentContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(152);
				comm();
				}
				break;
			case 11:
				_localctx = new StaticCallContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(153);
				static_fcall();
				}
				break;
			case 12:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(154);
				match(BRK);
				}
				break;
			case 13:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(155);
				ret_stmt();
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

	public static class CommContext extends ParserRuleContext {
		public TerminalNode LCOM() { return getToken(WikiParser.LCOM, 0); }
		public TerminalNode COMMENT() { return getToken(WikiParser.COMMENT, 0); }
		public CommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterComm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitComm(this);
		}
	}

	public final CommContext comm() throws RecognitionException {
		CommContext _localctx = new CommContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==COMMENT || _la==LCOM) ) {
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

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WikiParser.ID, 0); }
		public List<Int_exprContext> int_expr() {
			return getRuleContexts(Int_exprContext.class);
		}
		public Int_exprContext int_expr(int i) {
			return getRuleContext(Int_exprContext.class,i);
		}
		public List<Static_fcallContext> static_fcall() {
			return getRuleContexts(Static_fcallContext.class);
		}
		public Static_fcallContext static_fcall(int i) {
			return getRuleContext(Static_fcallContext.class,i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitIdent(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ID);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(170);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(161);
						match(T__5);
						setState(164);
						switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
						case 1:
							{
							setState(162);
							int_expr(0);
							}
							break;
						case 2:
							{
							setState(163);
							static_fcall();
							}
							break;
						}
						setState(166);
						match(T__6);
						}
						break;
					case 2:
						{
						setState(168);
						match(T__5);
						setState(169);
						match(T__6);
						}
						break;
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(WikiParser.FOR, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(WikiParser.NL, 0); }
		public Stmt_seqContext stmt_seq() {
			return getRuleContext(Stmt_seqContext.class,0);
		}
		public TerminalNode END() { return getToken(WikiParser.END, 0); }
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitFor_stmt(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(FOR);
			setState(176);
			match(T__2);
			setState(177);
			stmt();
			setState(178);
			match(T__7);
			setState(179);
			expr();
			setState(180);
			match(T__7);
			setState(181);
			stmt();
			setState(182);
			match(T__3);
			setState(183);
			match(NL);
			setState(184);
			stmt_seq();
			setState(185);
			match(END);
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

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(WikiParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(WikiParser.NL, 0); }
		public Stmt_seqContext stmt_seq() {
			return getRuleContext(Stmt_seqContext.class,0);
		}
		public TerminalNode END() { return getToken(WikiParser.END, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(WHILE);
			setState(188);
			match(T__2);
			setState(189);
			expr();
			setState(190);
			match(T__3);
			setState(191);
			match(NL);
			setState(192);
			stmt_seq();
			setState(193);
			match(END);
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(WikiParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(WikiParser.NL, 0); }
		public Stmt_seqContext stmt_seq() {
			return getRuleContext(Stmt_seqContext.class,0);
		}
		public Else_stmtContext else_stmt() {
			return getRuleContext(Else_stmtContext.class,0);
		}
		public TerminalNode END() { return getToken(WikiParser.END, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(IF);
			setState(196);
			match(T__2);
			setState(197);
			expr();
			setState(198);
			match(T__3);
			setState(199);
			match(NL);
			setState(200);
			stmt_seq();
			setState(201);
			else_stmt();
			setState(202);
			match(END);
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

	public static class Else_stmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(WikiParser.ELSE, 0); }
		public TerminalNode NL() { return getToken(WikiParser.NL, 0); }
		public Stmt_seqContext stmt_seq() {
			return getRuleContext(Stmt_seqContext.class,0);
		}
		public Else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterElse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitElse_stmt(this);
		}
	}

	public final Else_stmtContext else_stmt() throws RecognitionException {
		Else_stmtContext _localctx = new Else_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_else_stmt);
		try {
			setState(208);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(ELSE);
				setState(205);
				match(NL);
				setState(206);
				stmt_seq();
				}
				break;
			case END:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Func_actionContext extends ParserRuleContext {
		public Func_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_action; }
	 
		public Func_actionContext() { }
		public void copyFrom(Func_actionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncCallContext extends Func_actionContext {
		public TerminalNode ID() { return getToken(WikiParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FuncCallContext(Func_actionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitFuncCall(this);
		}
	}
	public static class FuncAssignContext extends Func_actionContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode ID() { return getToken(WikiParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FuncAssignContext(Func_actionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterFuncAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitFuncAssign(this);
		}
	}
	public static class FuncDecAssignContext extends Func_actionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode ID() { return getToken(WikiParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FuncDecAssignContext(Func_actionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterFuncDecAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitFuncDecAssign(this);
		}
	}

	public final Func_actionContext func_action() throws RecognitionException {
		Func_actionContext _localctx = new Func_actionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_action);
		try {
			setState(230);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new FuncAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				ident();
				setState(211);
				match(T__4);
				setState(212);
				match(ID);
				setState(213);
				match(T__2);
				setState(214);
				params();
				setState(215);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new FuncDecAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				type();
				setState(218);
				ident();
				setState(219);
				match(T__4);
				setState(220);
				match(ID);
				setState(221);
				match(T__2);
				setState(222);
				params();
				setState(223);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new FuncCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(ID);
				setState(226);
				match(T__2);
				setState(227);
				params();
				setState(228);
				match(T__3);
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

	public static class ExprContext extends ParserRuleContext {
		public Array_exprContext array_expr() {
			return getRuleContext(Array_exprContext.class,0);
		}
		public Int_exprContext int_expr() {
			return getRuleContext(Int_exprContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Str_exprContext str_expr() {
			return getRuleContext(Str_exprContext.class,0);
		}
		public Static_fcallContext static_fcall() {
			return getRuleContext(Static_fcallContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		try {
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				array_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				int_expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				bool_expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				str_expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				static_fcall();
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

	public static class Array_exprContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Array_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterArray_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitArray_expr(this);
		}
	}

	public final Array_exprContext array_expr() throws RecognitionException {
		Array_exprContext _localctx = new Array_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array_expr);
		int _la;
		try {
			setState(251);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				ident();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(T__8);
				setState(241);
				expr();
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(242);
					match(T__9);
					setState(243);
					expr();
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(T__10);
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

	public static class Static_fcallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(WikiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WikiParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Static_fcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_fcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterStatic_fcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitStatic_fcall(this);
		}
	}

	public final Static_fcallContext static_fcall() throws RecognitionException {
		Static_fcallContext _localctx = new Static_fcallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_static_fcall);
		try {
			setState(267);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(ID);
				setState(254);
				match(T__0);
				setState(255);
				match(ID);
				setState(256);
				match(T__2);
				setState(257);
				expr();
				setState(258);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(ID);
				setState(261);
				match(T__0);
				setState(262);
				match(ID);
				setState(263);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(ID);
				setState(265);
				match(T__0);
				setState(266);
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

	public static class FuncContext extends ParserRuleContext {
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	 
		public FuncContext() { }
		public void copyFrom(FuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncDefContext extends FuncContext {
		public TerminalNode FUNC() { return getToken(WikiParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(WikiParser.ID, 0); }
		public TerminalNode NL() { return getToken(WikiParser.NL, 0); }
		public Func_stmtContext func_stmt() {
			return getRuleContext(Func_stmtContext.class,0);
		}
		public TerminalNode END() { return getToken(WikiParser.END, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Ret_stmtContext ret_stmt() {
			return getRuleContext(Ret_stmtContext.class,0);
		}
		public FuncDefContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitFuncDef(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_func);
		try {
			_localctx = new FuncDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(FUNC);
			setState(272);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(270);
				type();
				}
				break;
			case 2:
				{
				}
				break;
			}
			setState(274);
			match(ID);
			setState(280);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(275);
				match(T__2);
				setState(276);
				args();
				setState(277);
				match(T__3);
				}
				break;
			case T__1:
				{
				setState(279);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(282);
			match(NL);
			setState(283);
			func_stmt();
			setState(286);
			switch (_input.LA(1)) {
			case RETURN:
				{
				setState(284);
				ret_stmt();
				}
				break;
			case END:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(288);
			match(END);
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

	public static class Func_stmtContext extends ParserRuleContext {
		public Func_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_stmt; }
	 
		public Func_stmtContext() { }
		public void copyFrom(Func_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncStmtContext extends Func_stmtContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode NL() { return getToken(WikiParser.NL, 0); }
		public Func_stmtContext func_stmt() {
			return getRuleContext(Func_stmtContext.class,0);
		}
		public FuncStmtContext(Func_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterFuncStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitFuncStmt(this);
		}
	}
	public static class NoFunctStmtContext extends Func_stmtContext {
		public NoFunctStmtContext(Func_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterNoFunctStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitNoFunctStmt(this);
		}
	}
	public static class FCallContext extends Func_stmtContext {
		public TerminalNode ID() { return getToken(WikiParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FCallContext(Func_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterFCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitFCall(this);
		}
	}

	public final Func_stmtContext func_stmt() throws RecognitionException {
		Func_stmtContext _localctx = new Func_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_func_stmt);
		try {
			setState(300);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new FuncStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				stmt();
				setState(291);
				match(NL);
				setState(292);
				func_stmt();
				}
				break;
			case 2:
				_localctx = new NoFunctStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case 3:
				_localctx = new FCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				match(ID);
				setState(296);
				match(T__2);
				setState(297);
				params();
				setState(298);
				match(T__3);
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

	public static class ParamsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_params);
		try {
			setState(308);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				expr();
				setState(303);
				match(T__9);
				setState(304);
				params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class ArgsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_args);
		try {
			setState(319);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				type();
				setState(311);
				ident();
				setState(312);
				match(T__9);
				setState(313);
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				type();
				setState(316);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Ret_stmtContext extends ParserRuleContext {
		public Ret_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret_stmt; }
	 
		public Ret_stmtContext() { }
		public void copyFrom(Ret_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RetExprContext extends Ret_stmtContext {
		public TerminalNode RETURN() { return getToken(WikiParser.RETURN, 0); }
		public TerminalNode NL() { return getToken(WikiParser.NL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetExprContext(Ret_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterRetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitRetExpr(this);
		}
	}

	public final Ret_stmtContext ret_stmt() throws RecognitionException {
		Ret_stmtContext _localctx = new Ret_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ret_stmt);
		try {
			_localctx = new RetExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(RETURN);
			setState(324);
			switch (_input.LA(1)) {
			case T__2:
			case T__8:
			case T__13:
			case TRUE:
			case FALSE:
			case ID:
			case NUM:
			case STRLIT:
				{
				setState(322);
				expr();
				}
				break;
			case NL:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(326);
			match(NL);
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

	public static class Bool_exprContext extends ParserRuleContext {
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitBool_expr(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_bool_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(329);
			bool_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(331);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(332);
					match(T__11);
					setState(333);
					bool_term(0);
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Bool_termContext extends ParserRuleContext {
		public Bool_factContext bool_fact() {
			return getRuleContext(Bool_factContext.class,0);
		}
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterBool_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitBool_term(this);
		}
	}

	public final Bool_termContext bool_term() throws RecognitionException {
		return bool_term(0);
	}

	private Bool_termContext bool_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_termContext _localctx = new Bool_termContext(_ctx, _parentState);
		Bool_termContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_bool_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(340);
			bool_fact();
			}
			_ctx.stop = _input.LT(-1);
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_termContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_term);
					setState(342);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(343);
					match(T__12);
					setState(344);
					bool_fact();
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Bool_factContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(WikiParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(WikiParser.FALSE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Bool_factContext bool_fact() {
			return getRuleContext(Bool_factContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Bool_factContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterBool_fact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitBool_fact(this);
		}
	}

	public final Bool_factContext bool_fact() throws RecognitionException {
		Bool_factContext _localctx = new Bool_factContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bool_fact);
		try {
			setState(360);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(T__2);
				setState(351);
				bool_expr(0);
				setState(352);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(TRUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(FALSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(357);
				match(T__13);
				setState(358);
				bool_fact();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(359);
				cond();
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

	public static class CondContext extends ParserRuleContext {
		public Int_exprContext int_expr() {
			return getRuleContext(Int_exprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LT() { return getToken(WikiParser.LT, 0); }
		public TerminalNode GT() { return getToken(WikiParser.GT, 0); }
		public TerminalNode LTE() { return getToken(WikiParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(WikiParser.GTE, 0); }
		public TerminalNode EQ() { return getToken(WikiParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(WikiParser.NEQ, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			int_expr(0);
			setState(363);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTE) | (1L << LTE) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(364);
			expr();
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

	public static class Str_exprContext extends ParserRuleContext {
		public Str_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_expr; }
	 
		public Str_exprContext() { }
		public void copyFrom(Str_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdStringContext extends Str_exprContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public IdStringContext(Str_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterIdString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitIdString(this);
		}
	}
	public static class FCallStrContext extends Str_exprContext {
		public Static_fcallContext static_fcall() {
			return getRuleContext(Static_fcallContext.class,0);
		}
		public FCallStrContext(Str_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterFCallStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitFCallStr(this);
		}
	}
	public static class ConcatFcallContext extends Str_exprContext {
		public Static_fcallContext static_fcall() {
			return getRuleContext(Static_fcallContext.class,0);
		}
		public Str_exprContext str_expr() {
			return getRuleContext(Str_exprContext.class,0);
		}
		public ConcatFcallContext(Str_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterConcatFcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitConcatFcall(this);
		}
	}
	public static class ConcatIdContext extends Str_exprContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Str_exprContext str_expr() {
			return getRuleContext(Str_exprContext.class,0);
		}
		public ConcatIdContext(Str_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterConcatId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitConcatId(this);
		}
	}
	public static class ConcatStrContext extends Str_exprContext {
		public TerminalNode STRLIT() { return getToken(WikiParser.STRLIT, 0); }
		public Str_exprContext str_expr() {
			return getRuleContext(Str_exprContext.class,0);
		}
		public ConcatStrContext(Str_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterConcatStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitConcatStr(this);
		}
	}
	public static class StrLitContext extends Str_exprContext {
		public TerminalNode STRLIT() { return getToken(WikiParser.STRLIT, 0); }
		public StrLitContext(Str_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterStrLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitStrLit(this);
		}
	}

	public final Str_exprContext str_expr() throws RecognitionException {
		Str_exprContext _localctx = new Str_exprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_str_expr);
		try {
			setState(380);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new ConcatStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(STRLIT);
				setState(367);
				match(ADD);
				setState(368);
				str_expr();
				}
				break;
			case 2:
				_localctx = new ConcatIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				ident();
				setState(370);
				match(ADD);
				setState(371);
				str_expr();
				}
				break;
			case 3:
				_localctx = new ConcatFcallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				static_fcall();
				setState(374);
				match(ADD);
				setState(375);
				str_expr();
				}
				break;
			case 4:
				_localctx = new StrLitContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(377);
				match(STRLIT);
				}
				break;
			case 5:
				_localctx = new IdStringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(378);
				ident();
				}
				break;
			case 6:
				_localctx = new FCallStrContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(379);
				static_fcall();
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

	public static class Int_exprContext extends ParserRuleContext {
		public Int_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_expr; }
	 
		public Int_exprContext() { }
		public void copyFrom(Int_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermExprContext extends Int_exprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermExprContext(Int_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterTermExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitTermExpr(this);
		}
	}
	public static class AddSubContext extends Int_exprContext {
		public Token op;
		public Int_exprContext int_expr() {
			return getRuleContext(Int_exprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ADD() { return getToken(WikiParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(WikiParser.SUB, 0); }
		public AddSubContext(Int_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitAddSub(this);
		}
	}

	public final Int_exprContext int_expr() throws RecognitionException {
		return int_expr(0);
	}

	private Int_exprContext int_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Int_exprContext _localctx = new Int_exprContext(_ctx, _parentState);
		Int_exprContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_int_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(383);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddSubContext(new Int_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_int_expr);
					setState(385);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(386);
					((AddSubContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
						((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(387);
					term(0);
					}
					} 
				}
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FactTermContext extends TermContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public FactTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterFactTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitFactTerm(this);
		}
	}
	public static class MulDivContext extends TermContext {
		public Token op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TerminalNode MUL() { return getToken(WikiParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(WikiParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(WikiParser.MOD, 0); }
		public MulDivContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitMulDiv(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FactTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(394);
			fact();
			}
			_ctx.stop = _input.LT(-1);
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulDivContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(396);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(397);
					((MulDivContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(398);
					fact();
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUM() { return getToken(WikiParser.NUM, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Static_fcallContext static_fcall() {
			return getRuleContext(Static_fcallContext.class,0);
		}
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitFact(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fact);
		try {
			setState(411);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				match(T__2);
				setState(405);
				expr();
				setState(406);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				ident();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				static_fcall();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(WikiParser.INT, 0); }
		public TerminalNode STRING() { return getToken(WikiParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(WikiParser.BOOL, 0); }
		public TerminalNode PAGE() { return getToken(WikiParser.PAGE, 0); }
		public TerminalNode TABLE() { return getToken(WikiParser.TABLE, 0); }
		public TerminalNode ID() { return getToken(WikiParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WikiListener ) ((WikiListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << TABLE) | (1L << PAGE) | (1L << ID))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 25:
			return bool_term_sempred((Bool_termContext)_localctx, predIndex);
		case 29:
			return int_expr_sempred((Int_exprContext)_localctx, predIndex);
		case 30:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bool_term_sempred(Bool_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean int_expr_sempred(Int_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u01a2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\4\3\4\3\4\3\4\7"+
		"\4S\n\4\f\4\16\4V\13\4\3\5\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\3\6\3\6\5\6b"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\5\7i\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\bt\n\b\5\bv\n\b\3\t\3\t\3\t\3\t\3\t\5\t}\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u0095\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009f\n\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\5\f\u00a7\n\f\3\f\3\f\3\f\3\f\7\f\u00ad\n\f\f\f\16\f\u00b0"+
		"\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\5\20\u00d3\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00e9\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00f0\n\22\3\23\3\23\3\23\3"+
		"\23\3\23\7\23\u00f7\n\23\f\23\16\23\u00fa\13\23\3\23\3\23\5\23\u00fe\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u010e\n\24\3\25\3\25\3\25\5\25\u0113\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u011b\n\25\3\25\3\25\3\25\3\25\5\25\u0121\n\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u012f\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0137\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u0142\n\30\3\31\3\31\3\31\5\31\u0147\n\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0151\n\32\f\32\16\32\u0154"+
		"\13\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u015c\n\33\f\33\16\33\u015f"+
		"\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u016b\n"+
		"\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u017f\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\7\37\u0187\n\37\f\37\16\37\u018a\13\37\3 \3 \3 \3 \3 \3 \7 \u0192\n "+
		"\f \16 \u0195\13 \3!\3!\3!\3!\3!\3!\3!\5!\u019e\n!\3\"\3\"\3\"\2\6\62"+
		"\64<>#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@B\2\b\3\2\34\35\3\2\62\63\3\2\26\33\4\2\22\22\24\24\5\2\21\21\23\23"+
		"\25\25\4\2\36\"\60\60\u01c0\2D\3\2\2\2\4L\3\2\2\2\6N\3\2\2\2\b[\3\2\2"+
		"\2\na\3\2\2\2\fc\3\2\2\2\16u\3\2\2\2\20|\3\2\2\2\22\u009e\3\2\2\2\24\u00a0"+
		"\3\2\2\2\26\u00a2\3\2\2\2\30\u00b1\3\2\2\2\32\u00bd\3\2\2\2\34\u00c5\3"+
		"\2\2\2\36\u00d2\3\2\2\2 \u00e8\3\2\2\2\"\u00ef\3\2\2\2$\u00fd\3\2\2\2"+
		"&\u010d\3\2\2\2(\u010f\3\2\2\2*\u012e\3\2\2\2,\u0136\3\2\2\2.\u0141\3"+
		"\2\2\2\60\u0143\3\2\2\2\62\u014a\3\2\2\2\64\u0155\3\2\2\2\66\u016a\3\2"+
		"\2\28\u016c\3\2\2\2:\u017e\3\2\2\2<\u0180\3\2\2\2>\u018b\3\2\2\2@\u019d"+
		"\3\2\2\2B\u019f\3\2\2\2DE\5\4\3\2EF\5\b\5\2F\3\3\2\2\2GH\5\6\4\2HI\7\65"+
		"\2\2IJ\5\4\3\2JM\3\2\2\2KM\3\2\2\2LG\3\2\2\2LK\3\2\2\2M\5\3\2\2\2NO\7"+
		"/\2\2OT\7\60\2\2PQ\7\3\2\2QS\7\60\2\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU"+
		"\3\2\2\2U\7\3\2\2\2VT\3\2\2\2WX\5\n\6\2XY\5\b\5\2Y\\\3\2\2\2Z\\\3\2\2"+
		"\2[W\3\2\2\2[Z\3\2\2\2\\\t\3\2\2\2]b\5\20\t\2^b\5\f\7\2_b\5\16\b\2`b\7"+
		"\65\2\2a]\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\13\3\2\2\2cd\7.\2\2d"+
		"e\7\4\2\2eh\7\65\2\2fi\5\16\b\2gi\3\2\2\2hf\3\2\2\2hg\3\2\2\2ij\3\2\2"+
		"\2jk\7\'\2\2k\r\3\2\2\2lm\5\22\n\2mn\7\65\2\2no\5\16\b\2ov\3\2\2\2ps\5"+
		"\22\n\2qt\7\65\2\2rt\3\2\2\2sq\3\2\2\2sr\3\2\2\2tv\3\2\2\2ul\3\2\2\2u"+
		"p\3\2\2\2v\17\3\2\2\2wx\5(\25\2xy\7\65\2\2yz\5\20\t\2z}\3\2\2\2{}\5(\25"+
		"\2|w\3\2\2\2|{\3\2\2\2}\21\3\2\2\2~\177\7%\2\2\177\u0080\7\5\2\2\u0080"+
		"\u0081\5\"\22\2\u0081\u0082\7\6\2\2\u0082\u009f\3\2\2\2\u0083\u0084\5"+
		"B\"\2\u0084\u0085\5\26\f\2\u0085\u009f\3\2\2\2\u0086\u0087\5B\"\2\u0087"+
		"\u0088\5\26\f\2\u0088\u0089\7\7\2\2\u0089\u008a\5\"\22\2\u008a\u009f\3"+
		"\2\2\2\u008b\u008c\5\26\f\2\u008c\u008d\7\7\2\2\u008d\u008e\5\"\22\2\u008e"+
		"\u009f\3\2\2\2\u008f\u0090\5\26\f\2\u0090\u0091\t\2\2\2\u0091\u0095\3"+
		"\2\2\2\u0092\u0093\t\2\2\2\u0093\u0095\5\26\f\2\u0094\u008f\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u009f\3\2\2\2\u0096\u009f\5 \21\2\u0097\u009f\5\34"+
		"\17\2\u0098\u009f\5\32\16\2\u0099\u009f\5\30\r\2\u009a\u009f\5\24\13\2"+
		"\u009b\u009f\5&\24\2\u009c\u009f\7-\2\2\u009d\u009f\5\60\31\2\u009e~\3"+
		"\2\2\2\u009e\u0083\3\2\2\2\u009e\u0086\3\2\2\2\u009e\u008b\3\2\2\2\u009e"+
		"\u0094\3\2\2\2\u009e\u0096\3\2\2\2\u009e\u0097\3\2\2\2\u009e\u0098\3\2"+
		"\2\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\23\3\2\2\2\u00a0\u00a1\t\3\2"+
		"\2\u00a1\25\3\2\2\2\u00a2\u00ae\7\60\2\2\u00a3\u00a6\7\b\2\2\u00a4\u00a7"+
		"\5<\37\2\u00a5\u00a7\5&\24\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\7\t\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00ab\7\b"+
		"\2\2\u00ab\u00ad\7\t\2\2\u00ac\u00a3\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\27\3\2\2"+
		"\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7,\2\2\u00b2\u00b3\7\5\2\2\u00b3\u00b4"+
		"\5\22\n\2\u00b4\u00b5\7\n\2\2\u00b5\u00b6\5\"\22\2\u00b6\u00b7\7\n\2\2"+
		"\u00b7\u00b8\5\22\n\2\u00b8\u00b9\7\6\2\2\u00b9\u00ba\7\65\2\2\u00ba\u00bb"+
		"\5\16\b\2\u00bb\u00bc\7\'\2\2\u00bc\31\3\2\2\2\u00bd\u00be\7+\2\2\u00be"+
		"\u00bf\7\5\2\2\u00bf\u00c0\5\"\22\2\u00c0\u00c1\7\6\2\2\u00c1\u00c2\7"+
		"\65\2\2\u00c2\u00c3\5\16\b\2\u00c3\u00c4\7\'\2\2\u00c4\33\3\2\2\2\u00c5"+
		"\u00c6\7)\2\2\u00c6\u00c7\7\5\2\2\u00c7\u00c8\5\"\22\2\u00c8\u00c9\7\6"+
		"\2\2\u00c9\u00ca\7\65\2\2\u00ca\u00cb\5\16\b\2\u00cb\u00cc\5\36\20\2\u00cc"+
		"\u00cd\7\'\2\2\u00cd\35\3\2\2\2\u00ce\u00cf\7*\2\2\u00cf\u00d0\7\65\2"+
		"\2\u00d0\u00d3\5\16\b\2\u00d1\u00d3\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d2"+
		"\u00d1\3\2\2\2\u00d3\37\3\2\2\2\u00d4\u00d5\5\26\f\2\u00d5\u00d6\7\7\2"+
		"\2\u00d6\u00d7\7\60\2\2\u00d7\u00d8\7\5\2\2\u00d8\u00d9\5,\27\2\u00d9"+
		"\u00da\7\6\2\2\u00da\u00e9\3\2\2\2\u00db\u00dc\5B\"\2\u00dc\u00dd\5\26"+
		"\f\2\u00dd\u00de\7\7\2\2\u00de\u00df\7\60\2\2\u00df\u00e0\7\5\2\2\u00e0"+
		"\u00e1\5,\27\2\u00e1\u00e2\7\6\2\2\u00e2\u00e9\3\2\2\2\u00e3\u00e4\7\60"+
		"\2\2\u00e4\u00e5\7\5\2\2\u00e5\u00e6\5,\27\2\u00e6\u00e7\7\6\2\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00d4\3\2\2\2\u00e8\u00db\3\2\2\2\u00e8\u00e3\3\2"+
		"\2\2\u00e9!\3\2\2\2\u00ea\u00f0\5$\23\2\u00eb\u00f0\5<\37\2\u00ec\u00f0"+
		"\5\62\32\2\u00ed\u00f0\5:\36\2\u00ee\u00f0\5&\24\2\u00ef\u00ea\3\2\2\2"+
		"\u00ef\u00eb\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee"+
		"\3\2\2\2\u00f0#\3\2\2\2\u00f1\u00fe\5\26\f\2\u00f2\u00f3\7\13\2\2\u00f3"+
		"\u00f8\5\"\22\2\u00f4\u00f5\7\f\2\2\u00f5\u00f7\5\"\22\2\u00f6\u00f4\3"+
		"\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7\r\2\2\u00fc\u00fe\3\2"+
		"\2\2\u00fd\u00f1\3\2\2\2\u00fd\u00f2\3\2\2\2\u00fe%\3\2\2\2\u00ff\u0100"+
		"\7\60\2\2\u0100\u0101\7\3\2\2\u0101\u0102\7\60\2\2\u0102\u0103\7\5\2\2"+
		"\u0103\u0104\5\"\22\2\u0104\u0105\7\6\2\2\u0105\u010e\3\2\2\2\u0106\u0107"+
		"\7\60\2\2\u0107\u0108\7\3\2\2\u0108\u0109\7\60\2\2\u0109\u010e\7\4\2\2"+
		"\u010a\u010b\7\60\2\2\u010b\u010c\7\3\2\2\u010c\u010e\7\60\2\2\u010d\u00ff"+
		"\3\2\2\2\u010d\u0106\3\2\2\2\u010d\u010a\3\2\2\2\u010e\'\3\2\2\2\u010f"+
		"\u0112\7&\2\2\u0110\u0113\5B\"\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2"+
		"\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u011a\7\60\2\2\u0115"+
		"\u0116\7\5\2\2\u0116\u0117\5.\30\2\u0117\u0118\7\6\2\2\u0118\u011b\3\2"+
		"\2\2\u0119\u011b\7\4\2\2\u011a\u0115\3\2\2\2\u011a\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011d\7\65\2\2\u011d\u0120\5*\26\2\u011e\u0121\5"+
		"\60\31\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0123\7\'\2\2\u0123)\3\2\2\2\u0124\u0125\5\22\n\2"+
		"\u0125\u0126\7\65\2\2\u0126\u0127\5*\26\2\u0127\u012f\3\2\2\2\u0128\u012f"+
		"\3\2\2\2\u0129\u012a\7\60\2\2\u012a\u012b\7\5\2\2\u012b\u012c\5,\27\2"+
		"\u012c\u012d\7\6\2\2\u012d\u012f\3\2\2\2\u012e\u0124\3\2\2\2\u012e\u0128"+
		"\3\2\2\2\u012e\u0129\3\2\2\2\u012f+\3\2\2\2\u0130\u0131\5\"\22\2\u0131"+
		"\u0132\7\f\2\2\u0132\u0133\5,\27\2\u0133\u0137\3\2\2\2\u0134\u0137\5\""+
		"\22\2\u0135\u0137\3\2\2\2\u0136\u0130\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0135\3\2\2\2\u0137-\3\2\2\2\u0138\u0139\5B\"\2\u0139\u013a\5\26\f\2"+
		"\u013a\u013b\7\f\2\2\u013b\u013c\5.\30\2\u013c\u0142\3\2\2\2\u013d\u013e"+
		"\5B\"\2\u013e\u013f\5\26\f\2\u013f\u0142\3\2\2\2\u0140\u0142\3\2\2\2\u0141"+
		"\u0138\3\2\2\2\u0141\u013d\3\2\2\2\u0141\u0140\3\2\2\2\u0142/\3\2\2\2"+
		"\u0143\u0146\7(\2\2\u0144\u0147\5\"\22\2\u0145\u0147\3\2\2\2\u0146\u0144"+
		"\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7\65\2\2"+
		"\u0149\61\3\2\2\2\u014a\u014b\b\32\1\2\u014b\u014c\5\64\33\2\u014c\u0152"+
		"\3\2\2\2\u014d\u014e\f\4\2\2\u014e\u014f\7\16\2\2\u014f\u0151\5\64\33"+
		"\2\u0150\u014d\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\63\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\b\33\1\2\u0156"+
		"\u0157\5\66\34\2\u0157\u015d\3\2\2\2\u0158\u0159\f\4\2\2\u0159\u015a\7"+
		"\17\2\2\u015a\u015c\5\66\34\2\u015b\u0158\3\2\2\2\u015c\u015f\3\2\2\2"+
		"\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\65\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u0160\u0161\7\5\2\2\u0161\u0162\5\62\32\2\u0162\u0163\7\6\2\2"+
		"\u0163\u016b\3\2\2\2\u0164\u016b\7#\2\2\u0165\u016b\7$\2\2\u0166\u016b"+
		"\5\26\f\2\u0167\u0168\7\20\2\2\u0168\u016b\5\66\34\2\u0169\u016b\58\35"+
		"\2\u016a\u0160\3\2\2\2\u016a\u0164\3\2\2\2\u016a\u0165\3\2\2\2\u016a\u0166"+
		"\3\2\2\2\u016a\u0167\3\2\2\2\u016a\u0169\3\2\2\2\u016b\67\3\2\2\2\u016c"+
		"\u016d\5<\37\2\u016d\u016e\t\4\2\2\u016e\u016f\5\"\22\2\u016f9\3\2\2\2"+
		"\u0170\u0171\7\64\2\2\u0171\u0172\7\22\2\2\u0172\u017f\5:\36\2\u0173\u0174"+
		"\5\26\f\2\u0174\u0175\7\22\2\2\u0175\u0176\5:\36\2\u0176\u017f\3\2\2\2"+
		"\u0177\u0178\5&\24\2\u0178\u0179\7\22\2\2\u0179\u017a\5:\36\2\u017a\u017f"+
		"\3\2\2\2\u017b\u017f\7\64\2\2\u017c\u017f\5\26\f\2\u017d\u017f\5&\24\2"+
		"\u017e\u0170\3\2\2\2\u017e\u0173\3\2\2\2\u017e\u0177\3\2\2\2\u017e\u017b"+
		"\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017f;\3\2\2\2\u0180"+
		"\u0181\b\37\1\2\u0181\u0182\5> \2\u0182\u0188\3\2\2\2\u0183\u0184\f\4"+
		"\2\2\u0184\u0185\t\5\2\2\u0185\u0187\5> \2\u0186\u0183\3\2\2\2\u0187\u018a"+
		"\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189=\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018b\u018c\b \1\2\u018c\u018d\5@!\2\u018d\u0193\3\2\2"+
		"\2\u018e\u018f\f\4\2\2\u018f\u0190\t\6\2\2\u0190\u0192\5@!\2\u0191\u018e"+
		"\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"?\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7\5\2\2\u0197\u0198\5\"\22\2"+
		"\u0198\u0199\7\6\2\2\u0199\u019e\3\2\2\2\u019a\u019e\7\61\2\2\u019b\u019e"+
		"\5\26\f\2\u019c\u019e\5&\24\2\u019d\u0196\3\2\2\2\u019d\u019a\3\2\2\2"+
		"\u019d\u019b\3\2\2\2\u019d\u019c\3\2\2\2\u019eA\3\2\2\2\u019f\u01a0\t"+
		"\7\2\2\u01a0C\3\2\2\2#LT[ahsu|\u0094\u009e\u00a6\u00ac\u00ae\u00d2\u00e8"+
		"\u00ef\u00f8\u00fd\u010d\u0112\u011a\u0120\u012e\u0136\u0141\u0146\u0152"+
		"\u015d\u016a\u017e\u0188\u0193\u019d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}