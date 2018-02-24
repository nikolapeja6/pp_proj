// generated with ast extension for cup
// version 0.8
// 24/1/2018 2:49:39


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(Unmatched Unmatched);
    public void visit(ArrayName ArrayName);
    public void visit(ReturnType ReturnType);
    public void visit(Mulop Mulop);
    public void visit(MethodDecl MethodDecl);
    public void visit(Constant Constant);
    public void visit(CondFactElement CondFactElement);
    public void visit(Matched Matched);
    public void visit(Relop Relop);
    public void visit(TermList TermList);
    public void visit(ConditionList ConditionList);
    public void visit(MultipleMethodDecl MultipleMethodDecl);
    public void visit(CondTermList CondTermList);
    public void visit(ProgramEnd ProgramEnd);
    public void visit(OptionalExprList OptionalExprList);
    public void visit(Addop Addop);
    public void visit(ProgramBegin ProgramBegin);
    public void visit(Factor Factor);
    public void visit(CondTerm CondTerm);
    public void visit(CondFactList CondFactList);
    public void visit(MethodEnd MethodEnd);
    public void visit(RValueDesignator RValueDesignator);
    public void visit(Designator Designator);
    public void visit(Term Term);
    public void visit(Condition Condition);
    public void visit(MultipleVarDecl MultipleVarDecl);
    public void visit(MultipleStatements MultipleStatements);
    public void visit(ExprList ExprList);
    public void visit(VarDeclElement VarDeclElement);
    public void visit(ProgramName ProgramName);
    public void visit(LValueDesignator LValueDesignator);
    public void visit(VarDeclList VarDeclList);
    public void visit(MethodNameAndRetType MethodNameAndRetType);
    public void visit(Expr Expr);
    public void visit(VoidType VoidType);
    public void visit(ConditionElement ConditionElement);
    public void visit(DesignatorStatement DesignatorStatement);
    public void visit(Statement Statement);
    public void visit(VarDecl VarDecl);
    public void visit(Type Type);
    public void visit(CondTermElement CondTermElement);
    public void visit(CondFact CondFact);
    public void visit(ExprElement ExprElement);
    public void visit(Program Program);
    public void visit(TermElement TermElement);
    public void visit(MulopMod MulopMod);
    public void visit(MulopDiv MulopDiv);
    public void visit(MulopMultiply MulopMultiply);
    public void visit(AddopMinus AddopMinus);
    public void visit(AddopPlus AddopPlus);
    public void visit(RelopDerived6 RelopDerived6);
    public void visit(RelopDerived5 RelopDerived5);
    public void visit(RelopDerived4 RelopDerived4);
    public void visit(RelopDerived3 RelopDerived3);
    public void visit(RelopDerived2 RelopDerived2);
    public void visit(RelopDerived1 RelopDerived1);
    public void visit(ArrayName1 ArrayName1);
    public void visit(DesignatorArray DesignatorArray);
    public void visit(DesignatorSimple DesignatorSimple);
    public void visit(RValueDesignator1 RValueDesignator1);
    public void visit(LValueDesignator1 LValueDesignator1);
    public void visit(BoolConstant BoolConstant);
    public void visit(CharConstant CharConstant);
    public void visit(NumberConstant NumberConstant);
    public void visit(FactorNewArray FactorNewArray);
    public void visit(FactorParenExpr FactorParenExpr);
    public void visit(ConstantFactor ConstantFactor);
    public void visit(FuncttionCallFactor FuncttionCallFactor);
    public void visit(VariableFactor VariableFactor);
    public void visit(TermElement1 TermElement1);
    public void visit(TermListSingle TermListSingle);
    public void visit(TermListMultiple TermListMultiple);
    public void visit(SingleFactorTerm SingleFactorTerm);
    public void visit(MultiFactorTerm MultiFactorTerm);
    public void visit(ExprElement1 ExprElement1);
    public void visit(ExprListDerived2 ExprListDerived2);
    public void visit(ExprListDerived1 ExprListDerived1);
    public void visit(OptionalExprListDerived2 OptionalExprListDerived2);
    public void visit(OptionalExprListDerived1 OptionalExprListDerived1);
    public void visit(ExprWithNoMinus ExprWithNoMinus);
    public void visit(ExprWithMinus ExprWithMinus);
    public void visit(CondFactElement1 CondFactElement1);
    public void visit(CondFactListSingle CondFactListSingle);
    public void visit(CondFactListMultiple CondFactListMultiple);
    public void visit(CondFactSingle CondFactSingle);
    public void visit(CondFactMultiple CondFactMultiple);
    public void visit(CondTermElement1 CondTermElement1);
    public void visit(CondTermListSingle CondTermListSingle);
    public void visit(CondTermListMultiple CondTermListMultiple);
    public void visit(CondTermSingle CondTermSingle);
    public void visit(CondTermMultiple CondTermMultiple);
    public void visit(ConditionElement1 ConditionElement1);
    public void visit(ConditionListSingle ConditionListSingle);
    public void visit(ConditionListMultiple ConditionListMultiple);
    public void visit(ConditionSingle ConditionSingle);
    public void visit(ConditionMultiple ConditionMultiple);
    public void visit(DesignatorStatementDec DesignatorStatementDec);
    public void visit(DesignatorStatementInc DesignatorStatementInc);
    public void visit(DesignatorStatementFunctionCall DesignatorStatementFunctionCall);
    public void visit(DesignatorStatementAssignment DesignatorStatementAssignment);
    public void visit(UnmatchedIfElse UnmatchedIfElse);
    public void visit(UnmatchedIf UnmatchedIf);
    public void visit(MatchdWhile MatchdWhile);
    public void visit(MatchedIf MatchedIf);
    public void visit(ReadStatement ReadStatement);
    public void visit(PrintStatement PrintStatement);
    public void visit(PrintStatementComplex PrintStatementComplex);
    public void visit(StatementReturnValue StatementReturnValue);
    public void visit(StatementReturnVoid StatementReturnVoid);
    public void visit(MatchedDerived1 MatchedDerived1);
    public void visit(StatementDerived4 StatementDerived4);
    public void visit(StatementDerived3 StatementDerived3);
    public void visit(StatementDerived2 StatementDerived2);
    public void visit(StatementDerived1 StatementDerived1);
    public void visit(MultipleStatementsDerived2 MultipleStatementsDerived2);
    public void visit(MultipleStatementsDerived1 MultipleStatementsDerived1);
    public void visit(Type1 Type1);
    public void visit(VoidTypeDerived1 VoidTypeDerived1);
    public void visit(TypeReturnType TypeReturnType);
    public void visit(VoidReturnType VoidReturnType);
    public void visit(MethodEnd1 MethodEnd1);
    public void visit(MethodNameAndRetType1 MethodNameAndRetType1);
    public void visit(MethodDeclDerived2 MethodDeclDerived2);
    public void visit(MethodDeclDerived1 MethodDeclDerived1);
    public void visit(MultipleMethodDeclDerived2 MultipleMethodDeclDerived2);
    public void visit(MultipleMethodDeclDerived1 MultipleMethodDeclDerived1);
    public void visit(VarDeclElementSingle VarDeclElementSingle);
    public void visit(VarDeclElementArray VarDeclElementArray);
    public void visit(VarDeclListDerived2 VarDeclListDerived2);
    public void visit(VarDeclListDerived1 VarDeclListDerived1);
    public void visit(VarDecl1 VarDecl1);
    public void visit(MultipleVarDeclDerived2 MultipleVarDeclDerived2);
    public void visit(MultipleVarDeclDerived1 MultipleVarDeclDerived1);
    public void visit(ProgramEnd1 ProgramEnd1);
    public void visit(ProgramBegin1 ProgramBegin1);
    public void visit(ProgName ProgName);
    public void visit(Program2 Program2);
    public void visit(Program1 Program1);

}
