package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.CounterVisitor.FormParamCounter;
import rs.ac.bg.etf.pp1.CounterVisitor.VarCounter;
import rs.ac.bg.etf.pp1.ast.*;
import rs.etf.pp1.mj.runtime.Code;
import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Struct;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class CodeGenerator extends VisitorAdaptor {

	private int varCount;

	private int paramCnt;

	private int mainPc;

	public int getMainPc() {
		return mainPc;
	}

	public void visit(PrintStatement printStatement) {
				
		if (printStatement.getExpr().struct == Tab.intType) {
			Code.put(Code.const_5);
			Code.put(Code.print);
		} else {
			Code.put(Code.const_1);
			Code.put(Code.bprint);
		}
	}


	@Override
	public void visit(MethodNameAndRetType1 MethodTypeName) {
		if ("main".equalsIgnoreCase(((MethodNameAndRetType1) MethodTypeName).getName())) {
			mainPc = Code.pc;
		}
		MethodTypeName.obj.setAdr(Code.pc);

		// Collect arguments and local variables.
		SyntaxNode methodNode = MethodTypeName.getParent();
		VarCounter varCnt = new VarCounter();
		methodNode.traverseTopDown(varCnt);
		FormParamCounter fpCnt = new FormParamCounter();
		methodNode.traverseTopDown(fpCnt);

		// Generate the entry.
		Code.put(Code.enter);
		Code.put(fpCnt.getCount());
		Code.put(varCnt.getCount() + fpCnt.getCount());
	}

	public void visit(MethodEnd1 methodEnd) {
		Code.put(Code.exit);
		Code.put(Code.return_);
	}
	
	public void visit(DesignatorStatementAssignment designatorStatementAssignment)
	{
		Code.store(designatorStatementAssignment.getLValueDesignator().obj);
	}
	
	public void visit(DesignatorStatementInc designatorStatementInc)
	{
		Code.put(Code.const_1);
		Code.load(designatorStatementInc.getLValueDesignator().obj);
		Code.put(Code.add);
		Code.store(designatorStatementInc.getLValueDesignator().obj);
	}
	
	public void visit(DesignatorStatementDec designatorStatementDec)
	{
		Code.load(designatorStatementDec.getLValueDesignator().obj);
		Code.put(Code.const_1);
		Code.put(Code.sub);
		Code.store(designatorStatementDec.getLValueDesignator().obj);
	}
	
	public void visit(ExprElement1 exprElement1)
	{
		Addop addop = exprElement1.getAddop();
		
		if(addop instanceof AddopPlus)
		{
			Code.put(Code.add);
			return;
		}
		
		if(addop instanceof AddopMinus)
		{
			Code.put(Code.sub);
			return;
		}

	}
	
	public void visit(TermElement1 termElement1)
	{
		Mulop mulop = termElement1.getMulop();
		
		if(mulop instanceof MulopMultiply)
		{
			Code.put(Code.mul);
			return;
		}
		
		if(mulop instanceof MulopDiv)
		{
			Code.put(Code.div);
			return;
		}
		
		if(mulop instanceof MulopMod)
		{
			Code.put(Code.rem);
			return;
		}
	}
	
	public void visit(ConstantFactor constantFactor) {
		Code.load(constantFactor.getConstant().obj);
	}

	public void visit(LValueDesignator1 lvDesignator1)
	{
		System.out.println("Not implemented");
	}
	
	public void visit(RValueDesignator1 rvDesignator1)
	{
		Code.load(rvDesignator1.obj);
	}
		
	public void visit(DesignatorSimple designatorSimple)
	{	
		System.out.println("Not Implemented");
	}
	

	
	/*
	 * @Override public void visit(VarDecl VarDecl) { varCount++; }
	 * 
	 * @Override public void visit(FormalParamDecl FormalParam) { paramCnt++; }
	 * 
	 * @Override public void visit(MethodDecl MethodDecl) { Code.put(Code.exit);
	 * Code.put(Code.return_); }
	 * 
	 * @Override public void visit(ReturnExpr ReturnExpr) { Code.put(Code.exit);
	 * Code.put(Code.return_); }
	 * 
	 * @Override public void visit(ReturnNoExpr ReturnNoExpr) {
	 * Code.put(Code.exit); Code.put(Code.return_); }
	 * 
	 * @Override public void visit(Assignment Assignment) {
	 * Code.store(Assignment.getDesignator().obj); }
	 * 
	 * @Override public void visit(Const Const) { Code.load(new Obj(Obj.Con,
	 * "$", Const.struct, Const.getN1(), 0)); }
	 * 
	 * @Override public void visit(Designator Designator) { SyntaxNode parent =
	 * Designator.getParent(); if (Assignment.class != parent.getClass() &&
	 * FuncCall.class != parent.getClass()) { Code.load(Designator.obj); } }
	 * 
	 * @Override public void visit(FuncCall FuncCall) { Obj functionObj =
	 * FuncCall.getDesignator().obj; int offset = functionObj.getAdr() -
	 * Code.pc; Code.put(Code.call); Code.put2(offset); }
	 * 
	 * @Override public void visit(PrintStmt PrintStmt) {
	 * Code.put(Code.const_5); Code.put(Code.print); }
	 * 
	 * @Override public void visit(AddExpr AddExpr) { Code.put(Code.add); }
	 * 
	 */
}
