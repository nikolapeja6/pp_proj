package rs.ac.bg.etf.pp1;

import java.util.Stack;

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
	
	private Stack<Integer> jmpNotThen = new Stack<>();
	private Stack<Integer> jmpEndThen = new Stack<>();

	public int getMainPc() {
		return mainPc;
	}

	
	public void visit(StatementReturnVoid returnVoid)
	{
		Code.put(Code.exit);
		Code.put(Code.return_);
	}
	
	public void visit(StatementReturnValue returnValue)
	{
		Code.put(Code.exit);
		Code.put(Code.return_);
	}
	
	public void visit(PrintStatementComplex printStatementComplex) {
		if (printStatementComplex.getExpr().struct == Tab.intType) {
			Code.load(printStatementComplex.getConstant().obj);
			Code.put(Code.print);
		} else {
			Code.load(printStatementComplex.getConstant().obj);
			Code.put(Code.bprint);
		}
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

	public void visit(ReadStatement readStatement) {
		if (readStatement.obj.getType() == Tab.intType) {
			Code.put(Code.read);
			Code.store(readStatement.obj);
		} else {
			Code.put(Code.bread);
			Code.store(readStatement.obj);
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

	public void visit(DesignatorStatementAssignment designatorStatementAssignment) {
		Code.store(designatorStatementAssignment.getLValueDesignator().obj);
	}
	
	public void visit(DesignatorStatementFunctionCall designatorStatementFunctionCall)
	{
		Obj obj = designatorStatementFunctionCall.obj; 
		
		int dstAdr = obj.getAdr() - Code.pc;
		Code.put(Code.call);
		Code.put2(dstAdr);
		
		if(obj.getType() != Tab.noType){
			Code.put(Code.pop);
		}
	}

	public void visit(DesignatorStatementInc designatorStatementInc) {
		Code.put(Code.const_1);
		Code.load(designatorStatementInc.getLValueDesignator().obj);
		Code.put(Code.add);
		Code.store(designatorStatementInc.getLValueDesignator().obj);
	}

	public void visit(DesignatorStatementDec designatorStatementDec) {
		Code.load(designatorStatementDec.getLValueDesignator().obj);
		Code.put(Code.const_1);
		Code.put(Code.sub);
		Code.store(designatorStatementDec.getLValueDesignator().obj);
	}
	
	// 	(MatchedIf)	IF OPEN_PARENTHESES Condition CLOSE_PARENTHESES MatchedThen ELSE Matched
	public void visit(MatchedIf matchedIf)
	{
		// since there was an else, the jmpNotThen has been updated
		// so only the jmpEndThen should be updated
		fixJumpAtEndOfThen();
	}

	
	// (UnmatchedIf)IF OPEN_PARENTHESES Condition CLOSE_PARENTHESES Statement
	public void visit(UnmatchedIf unmatchedIf)
	{
		// since there was not an else, the jmpNotThen needs to be updated
		// and there is no jmpEndThen
		fixJumpAtEndOfCondition();
	}

	// (UnmatchedIfElse)IF OPEN_PARENTHESES Condition CLOSE_PARENTHESES MatchedThen ELSE Unmatched
	public void visit(UnmatchedIfElse unmatchedIfElse)
	{
		// since there was an else, the jmpNotThen has been updated
		// so only the jmpEndThen should be updated
		fixJumpAtEndOfThen();
	}

	
	// jmp to next and correct else jmp
	public void visit(MatchedThen1 matchedThen1)
	{
		// jmp next
		Code.put(Code.jmp);
		jmpEndThen.push(Code.pc);
		Code.put2(0);
		
		// correct else jump at end of condition
		fixJumpAtEndOfCondition();
	}
	
	// jmp to else or continue to then
	public void visit(ConditionMultiple conditionMultiple)
	{
		insertJumpAtEndOfCondition();
	}
	
	// jmp to else or continue to then
	public void visit(ConditionSingle conditionSingle)
	{
		insertJumpAtEndOfCondition();
	}
	
	private void insertJumpAtEndOfCondition(){
		
		// if cond == 0, jmp else 
		Code.loadConst(0);
		Code.put(Code.jcc + Code.eq);
		
		// save current pc and store it as jmp address
		jmpNotThen.push(Code.pc);
		Code.put2(0);
		
	}
	
	private void fixJumpAtEndOfCondition()
	{
		int address = jmpNotThen.pop();
		Code.put2(address, Code.pc - address + 1);
	}
	
	private void fixJumpAtEndOfThen(){
		int address = jmpEndThen.pop();
		Code.put2(address, Code.pc - address + 1);
	}
	
	//ConditionElement ::= (ConditionElement1) OR CondTerm
	public void visit(ConditionElement1 conditionElement1) {
		
		// if a != 0, jmp true1
		Code.loadConst(0);
		Code.put(Code.jcc+Code.ne);
		Code.put2(7);
		
		// if b != 0, jmp true2
		Code.loadConst(0);
		Code.put(Code.jcc + Code.ne);
		Code.put2(5);
		
		// false: put 0,jmp next 
		Code.loadConst(0);
		Code.put(Code.jmp);
		Code.put2(4);
		
		// true1
		Code.put(Code.pop);
		
		// true2
		Code.loadConst(1);
		
		// next
	}

	//CondTermElement ::= (CondTermElement1) AND CondFact
	public void visit(CondTermElement1 condTermElement1) {
		
		// res = a*b
		Code.put(Code.mul);
		
		// cmp res, 0
		Code.loadConst(0);
		
		// put 1 if neq
		processRelopCnd(Code.ne);
	}
	
	private void processRelopCnd(int cnd)
	{
		// test and jmp if yes
		Code.put(Code.jcc + cnd);
		Code.put2(5);
					
		// no: put 0, jmp next
		Code.loadConst(0);
		Code.put(Code.jmp);
		Code.put2(4);
					
		// yes: put 1
		Code.loadConst(1);
					
		// next
	}

	// CondFactElement ::= (CondFactElement1) Relop Expr;
	public void visit(CondFactElement1 condFactElement1) {

		Relop relop = condFactElement1.getRelop();
		
		int cndCode = -1;
		
		if(relop instanceof RelopEq)
		{
			cndCode = Code.eq;
		}
		
		if(relop instanceof RelopNEq)
		{
			cndCode = Code.ne;
		}
		
		if(relop instanceof RelopGr)
		{
			cndCode = Code.gt;
		}
		
		if(relop instanceof RelopLs)
		{			
			cndCode = Code.lt;
		}
		
		if(relop instanceof RelopGEq)
		{
			cndCode = Code.ge;
		}
		
		if(relop instanceof RelopLEq)
		{
			cndCode = Code.le;
		}
		
		assert(cndCode != -1);
		
		processRelopCnd(cndCode);
	}
	
	

	public void visit(ExprWithMinus exprWithMinus) {
		Code.loadConst(-1);
		Code.put(Code.mul);
	}

	public void visit(ExprElement1 exprElement1) {
		Addop addop = exprElement1.getAddop();

		if (addop instanceof AddopPlus) {
			Code.put(Code.add);
			return;
		}

		if (addop instanceof AddopMinus) {
			Code.put(Code.sub);
			return;
		}

	}

	public void visit(TermElement1 termElement1) {
		Mulop mulop = termElement1.getMulop();

		if (mulop instanceof MulopMultiply) {
			Code.put(Code.mul);
			return;
		}

		if (mulop instanceof MulopDiv) {
			Code.put(Code.div);
			return;
		}

		if (mulop instanceof MulopMod) {
			Code.put(Code.rem);
			return;
		}
	}
	
	public void visit(FuncttionCallFactor functionCallFactor)
	{
		Obj obj = functionCallFactor.obj; 
		
		int dstAdr = obj.getAdr() - Code.pc;
		Code.put(Code.call);
		Code.put2(dstAdr);
	}

	public void visit(ConstantFactor constantFactor) {
		Code.load(constantFactor.getConstant().obj);
	}

	public void visit(FactorNewArray factorNewArray) {
		Struct elementType = factorNewArray.obj.getType().getElemType();

		Code.put(Code.newarray);

		if (elementType == Tab.intType) {
			Code.put(1);
			return;
		}

		if (elementType == Tab.charType) {
			Code.put(0);
			return;
		}

		System.out.println("unmatched new");

	}

	public void visit(LValueDesignator1 lvDesignator1) {
		/*
		if (lvDesignator1.getDesignator() instanceof DesignatorArray) {
			Code.put(lvDesignator1.obj.getAdr());
		}
		*/
		System.out.println("LValueDesignotr without code gen");
	}

	public void visit(RValueDesignator1 rvDesignator1) {
		/*
		 * if(rvDesignator1.getDesignator() instanceof DesignatorArray) {
		 * Code.put(rvDesignator1.obj.getAdr()); }
		 */
		Code.load(rvDesignator1.obj);
	}

	public void visit(DesignatorSimple designatorSimple) {
		System.out.println("DesignatorSimlpe without code gen");
	}

	public void visit(ArrayName1 arrayName1) {
		Code.load(arrayName1.obj);
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
