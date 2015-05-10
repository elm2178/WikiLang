// Generated from Wiki.g4 by ANTLR 4.5


import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WikiParser}.
 */
public interface WikiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WikiParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(WikiParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(WikiParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#import_seq}.
	 * @param ctx the parse tree
	 */
	void enterImport_seq(WikiParser.Import_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#import_seq}.
	 * @param ctx the parse tree
	 */
	void exitImport_seq(WikiParser.Import_seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(WikiParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(WikiParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#prog_seq}.
	 * @param ctx the parse tree
	 */
	void enterProg_seq(WikiParser.Prog_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#prog_seq}.
	 * @param ctx the parse tree
	 */
	void exitProg_seq(WikiParser.Prog_seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#seq}.
	 * @param ctx the parse tree
	 */
	void enterSeq(WikiParser.SeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#seq}.
	 * @param ctx the parse tree
	 */
	void exitSeq(WikiParser.SeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#main_func}.
	 * @param ctx the parse tree
	 */
	void enterMain_func(WikiParser.Main_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#main_func}.
	 * @param ctx the parse tree
	 */
	void exitMain_func(WikiParser.Main_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#stmt_seq}.
	 * @param ctx the parse tree
	 */
	void enterStmt_seq(WikiParser.Stmt_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#stmt_seq}.
	 * @param ctx the parse tree
	 */
	void exitStmt_seq(WikiParser.Stmt_seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#func_seq}.
	 * @param ctx the parse tree
	 */
	void enterFunc_seq(WikiParser.Func_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#func_seq}.
	 * @param ctx the parse tree
	 */
	void exitFunc_seq(WikiParser.Func_seqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint(WikiParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint(WikiParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declare}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(WikiParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declare}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(WikiParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecAssign}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDecAssign(WikiParser.DecAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecAssign}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDecAssign(WikiParser.DecAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign(WikiParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign(WikiParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncDec}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIncDec(WikiParser.IncDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncDec}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIncDec(WikiParser.IncDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncAct}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncAct(WikiParser.FuncActContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncAct}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncAct(WikiParser.FuncActContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(WikiParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(WikiParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(WikiParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(WikiParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(WikiParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(WikiParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comment}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterComment(WikiParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comment}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitComment(WikiParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StaticCall}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStaticCall(WikiParser.StaticCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StaticCall}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStaticCall(WikiParser.StaticCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Break}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak(WikiParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak(WikiParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(WikiParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link WikiParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(WikiParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#comm}.
	 * @param ctx the parse tree
	 */
	void enterComm(WikiParser.CommContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#comm}.
	 * @param ctx the parse tree
	 */
	void exitComm(WikiParser.CommContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(WikiParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(WikiParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(WikiParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(WikiParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(WikiParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(WikiParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(WikiParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(WikiParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_stmt(WikiParser.Else_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_stmt(WikiParser.Else_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncAssign}
	 * labeled alternative in {@link WikiParser#func_action}.
	 * @param ctx the parse tree
	 */
	void enterFuncAssign(WikiParser.FuncAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncAssign}
	 * labeled alternative in {@link WikiParser#func_action}.
	 * @param ctx the parse tree
	 */
	void exitFuncAssign(WikiParser.FuncAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDecAssign}
	 * labeled alternative in {@link WikiParser#func_action}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecAssign(WikiParser.FuncDecAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDecAssign}
	 * labeled alternative in {@link WikiParser#func_action}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecAssign(WikiParser.FuncDecAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link WikiParser#func_action}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(WikiParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link WikiParser#func_action}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(WikiParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(WikiParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(WikiParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void enterArray_expr(WikiParser.Array_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void exitArray_expr(WikiParser.Array_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#static_fcall}.
	 * @param ctx the parse tree
	 */
	void enterStatic_fcall(WikiParser.Static_fcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#static_fcall}.
	 * @param ctx the parse tree
	 */
	void exitStatic_fcall(WikiParser.Static_fcallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link WikiParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(WikiParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link WikiParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(WikiParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncStmt}
	 * labeled alternative in {@link WikiParser#func_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncStmt(WikiParser.FuncStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncStmt}
	 * labeled alternative in {@link WikiParser#func_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncStmt(WikiParser.FuncStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoFunctStmt}
	 * labeled alternative in {@link WikiParser#func_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNoFunctStmt(WikiParser.NoFunctStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoFunctStmt}
	 * labeled alternative in {@link WikiParser#func_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNoFunctStmt(WikiParser.NoFunctStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FCall}
	 * labeled alternative in {@link WikiParser#func_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFCall(WikiParser.FCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FCall}
	 * labeled alternative in {@link WikiParser#func_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFCall(WikiParser.FCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(WikiParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(WikiParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(WikiParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(WikiParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RetExpr}
	 * labeled alternative in {@link WikiParser#ret_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRetExpr(WikiParser.RetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RetExpr}
	 * labeled alternative in {@link WikiParser#ret_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRetExpr(WikiParser.RetExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(WikiParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(WikiParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#bool_term}.
	 * @param ctx the parse tree
	 */
	void enterBool_term(WikiParser.Bool_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#bool_term}.
	 * @param ctx the parse tree
	 */
	void exitBool_term(WikiParser.Bool_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#bool_fact}.
	 * @param ctx the parse tree
	 */
	void enterBool_fact(WikiParser.Bool_factContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#bool_fact}.
	 * @param ctx the parse tree
	 */
	void exitBool_fact(WikiParser.Bool_factContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(WikiParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(WikiParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcatStr}
	 * labeled alternative in {@link WikiParser#str_expr}.
	 * @param ctx the parse tree
	 */
	void enterConcatStr(WikiParser.ConcatStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcatStr}
	 * labeled alternative in {@link WikiParser#str_expr}.
	 * @param ctx the parse tree
	 */
	void exitConcatStr(WikiParser.ConcatStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcatId}
	 * labeled alternative in {@link WikiParser#str_expr}.
	 * @param ctx the parse tree
	 */
	void enterConcatId(WikiParser.ConcatIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcatId}
	 * labeled alternative in {@link WikiParser#str_expr}.
	 * @param ctx the parse tree
	 */
	void exitConcatId(WikiParser.ConcatIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcatFcall}
	 * labeled alternative in {@link WikiParser#str_expr}.
	 * @param ctx the parse tree
	 */
	void enterConcatFcall(WikiParser.ConcatFcallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcatFcall}
	 * labeled alternative in {@link WikiParser#str_expr}.
	 * @param ctx the parse tree
	 */
	void exitConcatFcall(WikiParser.ConcatFcallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrLit}
	 * labeled alternative in {@link WikiParser#str_expr}.
	 * @param ctx the parse tree
	 */
	void enterStrLit(WikiParser.StrLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrLit}
	 * labeled alternative in {@link WikiParser#str_expr}.
	 * @param ctx the parse tree
	 */
	void exitStrLit(WikiParser.StrLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdString}
	 * labeled alternative in {@link WikiParser#str_expr}.
	 * @param ctx the parse tree
	 */
	void enterIdString(WikiParser.IdStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdString}
	 * labeled alternative in {@link WikiParser#str_expr}.
	 * @param ctx the parse tree
	 */
	void exitIdString(WikiParser.IdStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FCallStr}
	 * labeled alternative in {@link WikiParser#str_expr}.
	 * @param ctx the parse tree
	 */
	void enterFCallStr(WikiParser.FCallStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FCallStr}
	 * labeled alternative in {@link WikiParser#str_expr}.
	 * @param ctx the parse tree
	 */
	void exitFCallStr(WikiParser.FCallStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermExpr}
	 * labeled alternative in {@link WikiParser#int_expr}.
	 * @param ctx the parse tree
	 */
	void enterTermExpr(WikiParser.TermExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermExpr}
	 * labeled alternative in {@link WikiParser#int_expr}.
	 * @param ctx the parse tree
	 */
	void exitTermExpr(WikiParser.TermExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link WikiParser#int_expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(WikiParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link WikiParser#int_expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(WikiParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactTerm}
	 * labeled alternative in {@link WikiParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFactTerm(WikiParser.FactTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactTerm}
	 * labeled alternative in {@link WikiParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFactTerm(WikiParser.FactTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link WikiParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(WikiParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link WikiParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(WikiParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(WikiParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(WikiParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(WikiParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(WikiParser.TypeContext ctx);
}