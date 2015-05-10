import java.util.LinkedList;

public class SemCheck extends WikiBaseListener {
	Env top;
	LinkedList<Env> list = new LinkedList<Env>();
	
	private void push(String scope){
		if (top != null) top.print(); System.out.println("enter " + scope);
	    top = new Env(top, scope);
	    list.push(top);
	}
	
	private void pop(String scope){
		if (top != null) top.print(); System.out.println("exit " + scope);
 		list.pop();
 		if (!list.isEmpty()) {top = list.getFirst();}
 		
	}
	
//===================================================================
	
	public void enterProg(WikiParser.ProgContext ctx) {
		top = null;
		push("global");
	}
	public void exitProg(WikiParser.ProgContext ctx){ pop("global");}
	
	public void enterMain_func(WikiParser.Main_funcContext ctx) { push("main");}
	public void exitMain_func(WikiParser.Main_funcContext ctx) { pop("main");}
	
	public void enterDeclare(WikiParser.DeclareContext ctx) { 
		String name = ctx.ident().ID().getText();
		String type = ctx.type().getText();
		if (top.getLocal(name) != null) {
			System.out.println(name + " already declared");
		}
		else {top.put(name, type);}
	}
	public void enterDecAssign(WikiParser.DecAssignContext ctx) { 
		String name = ctx.ident().ID().getText();
		String type = ctx.type().getText();
		if (top.getLocal(name) != null) {
			System.out.println(name + " already declared");
		}
		else {top.put(name, type);}
	}
	
	public void enterAssign(WikiParser.AssignContext ctx) {
		String name = ctx.ident().ID().getText();
		String type = top.get(name);
		if ( type==null ) {
		System.out.println("no such variable " + name);
		}

	}
	//more to do
	public void enterIncDec(WikiParser.IncDecContext ctx) { }
	
	public void enterFor_stmt(WikiParser.For_stmtContext ctx) { push("for");}
	public void exitFor_stmt(WikiParser.For_stmtContext ctx) { pop("for");}
	
	public void enterWhile_stmt(WikiParser.While_stmtContext ctx){ push("while");}
	public void exitWhile_stmt(WikiParser.While_stmtContext ctx) { pop("while");}
	
	public void enterIf_stmt(WikiParser.If_stmtContext ctx) { push("if");}
	public void exitIf_stmt(WikiParser.If_stmtContext ctx) { pop("if");}
	
	//more to do
	public void enterIdent(WikiParser.IdentContext ctx) { }
	
	public void enterFuncAssign(WikiParser.FuncAssignContext ctx) { 
		String ident = ctx.ident().ID().getText();
		if (top.get(ident)==null){
			System.out.println("no such variable "+ident);
		}
		String func = ctx.ID().getText();
		if (top.get(func)==null){
			System.out.println("no such variable "+func);
		}
		
	}
	

	public void enterFuncDecAssign(WikiParser.FuncDecAssignContext ctx) { 
		String name = ctx.ident().ID().getText();
		String type = ctx.type().getText();
		if (top.getLocal(name) != null) {
			System.out.println(name + " already declared");
		}
		else {top.put(name, type);}
		
		String func = ctx.ID().getText();
		if (top.get(func)==null){
			System.out.println("no such variable "+func);
		}

	}
	
	public void enterFuncCall(WikiParser.FuncCallContext ctx) {
		String name = ctx.ID().getText();
		if (top.get(name)==null){
			System.out.println("no such variable "+name);
		}
	}
	
	//more work
	public void enterArray_expr(WikiParser.Array_exprContext ctx) {
		String name = ctx.ident().ID().getText();
		if (top.get(name)==null){
			System.out.println("no such variable "+name);
		}
	}
	
	//need more work
	public void enterStatic_fcall(WikiParser.Static_fcallContext ctx) { }
	
	public void enterFuncDef(WikiParser.FuncDefContext ctx) {
		String name = ctx.ID().getText();
		if (ctx.type() != null) { top.put(name,ctx.type().getText());}
		else { top.put(name, "void");}
		push(name);
	}
	public void exitFuncDef(WikiParser.FuncDefContext ctx) { pop(ctx.ID().getText());}
	
	public void enterFCall(WikiParser.FCallContext ctx) { 
		String name = ctx.ID().getText();
		if(top.get(name) == null){
			System.out.println("no such variable "+name);
		}
	}
	
	
	public void enterArgs(WikiParser.ArgsContext ctx) { 
		String name = ctx.ident().ID().getText();
		String type = ctx.type().getText();
		if (top.getLocal(name) != null) {
			System.out.println(name + " already declared");
		}
		else {top.put(name, type);}
	}
	
	public void enterBool_fact(WikiParser.Bool_factContext ctx) {
		if (ctx.ident() != null){
			String name = ctx.ident().ID().getText();
		    if (top.get(name) == null){
		    	System.out.println("no such variable "+name);
		    }
		    else if (!top.get(name).equals("bool")){
		    	System.out.println(name+ " is not a bool");
		    }
		}
	}
	
	
	
	
	
	
	
	
}
