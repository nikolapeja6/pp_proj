// generated with ast extension for cup
// version 0.8
// 27/4/2018 1:55:14


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(ConditionElement ConditionElement);
    public void visit(FormPars FormPars);
    public void visit(MultipleStatements MultipleStatements);
    public void visit(ProgramEnd ProgramEnd);
    public void visit(FormParsElement FormParsElement);
    public void visit(ConditionWhile ConditionWhile);
    public void visit(Factor Factor);
    public void visit(Statement Statement);
    public void visit(ActParElement ActParElement);
    public void visit(MethodNameAndRetType MethodNameAndRetType);
    public void visit(DesignatorClassElementList DesignatorClassElementList);
    public void visit(MethodDecl MethodDecl);
    public void visit(ConstDeclList ConstDeclList);
    public void visit(ExprElement ExprElement);
    public void visit(ConditionList ConditionList);
    public void visit(ExprList ExprList);
    public void visit(CondFactElement CondFactElement);
    public void visit(ConstDeclElement ConstDeclElement);
    public void visit(MethodDesignator MethodDesignator);
    public void visit(Relop Relop);
    public void visit(DesignatorClassElementMultiple DesignatorClassElementMultiple);
    public void visit(CondFactList CondFactList);
    public void visit(Expr Expr);
    public void visit(MultipleMethodDecl MultipleMethodDecl);
    public void visit(VarDecl VarDecl);
    public void visit(StatementWhile StatementWhile);
    public void visit(Unmatched Unmatched);
    public void visit(ProgramBegin ProgramBegin);
    public void visit(Program Program);
    public void visit(ArrayName ArrayName);
    public void visit(LValueDesignator LValueDesignator);
    public void visit(Constant Constant);
    public void visit(VoidType VoidType);
    public void visit(RValueDesignator RValueDesignator);
    public void visit(Condition Condition);
    public void visit(Mulop Mulop);
    public void visit(DesignatorStatement DesignatorStatement);
    public void visit(DesignatorClassElemenListFirst DesignatorClassElemenListFirst);
    public void visit(MatchedThen MatchedThen);
    public void visit(CondTermElement CondTermElement);
    public void visit(Addop Addop);
    public void visit(ConstDecl ConstDecl);
    public void visit(DesignatorClassElement DesignatorClassElement);
    public void visit(TermElement TermElement);
    public void visit(Type Type);
    public void visit(ReturnType ReturnType);
    public void visit(CondTermList CondTermList);
    public void visit(DoWhileBegin DoWhileBegin);
    public void visit(ArrayFieldName ArrayFieldName);
    public void visit(MultipleVarDecl MultipleVarDecl);
    public void visit(CondTerm CondTerm);
    public void visit(ClassDecl ClassDecl);
    public void visit(ClassMethodBegin ClassMethodBegin);
    public void visit(ClassDeclBegin ClassDeclBegin);
    public void visit(ClassDeclEnd ClassDeclEnd);
    public void visit(TermList TermList);
    public void visit(MethodBegin MethodBegin);
    public void visit(MultipleDecl MultipleDecl);
    public void visit(ActPars ActPars);
    public void visit(DesignatorClassBegin DesignatorClassBegin);
    public void visit(Designator Designator);
    public void visit(Matched Matched);
    public void visit(VarDeclList VarDeclList);
    public void visit(MethodEnd MethodEnd);
    public void visit(CondFact CondFact);
    public void visit(VarDeclElement VarDeclElement);
    public void visit(Term Term);
    public void visit(OptionalThis OptionalThis);
    public void visit(ProgramName ProgramName);
    public void visit(OptionalExprList OptionalExprList);
    public void visit(MulopMod MulopMod);
    public void visit(MulopDiv MulopDiv);
    public void visit(MulopMultiply MulopMultiply);
    public void visit(AddopMinus AddopMinus);
    public void visit(AddopPlus AddopPlus);
    public void visit(RelopLEq RelopLEq);
    public void visit(RelopGEq RelopGEq);
    public void visit(RelopLs RelopLs);
    public void visit(RelopGr RelopGr);
    public void visit(RelopNEq RelopNEq);
    public void visit(RelopEq RelopEq);
    public void visit(ArrayName1 ArrayName1);
    public void visit(DesignatorSimple DesignatorSimple);
    public void visit(DesignatorArray DesignatorArray);
    public void visit(DesignatorClassElement1 DesignatorClassElement1);
    public void visit(DesignatorClassElementMultipleSingle DesignatorClassElementMultipleSingle);
    public void visit(DesignatorClassElementMultipleMultiple DesignatorClassElementMultipleMultiple);
    public void visit(MethodDesignator1 MethodDesignator1);
    public void visit(RValueDesignator1 RValueDesignator1);
    public void visit(RValueClassDesignator RValueClassDesignator);
    public void visit(RValueMethodCall2 RValueMethodCall2);
    public void visit(RValueMethodCall1 RValueMethodCall1);
    public void visit(LValueDesignator1 LValueDesignator1);
    public void visit(LValueClassDesignator LValueClassDesignator);
    public void visit(BoolConstant BoolConstant);
    public void visit(CharConstant CharConstant);
    public void visit(NumberConstant NumberConstant);
    public void visit(FactorNewObject FactorNewObject);
    public void visit(FactorNewArray FactorNewArray);
    public void visit(FactorParenExpr FactorParenExpr);
    public void visit(ConstantFactor ConstantFactor);
    public void visit(FuncttionCallFactor FuncttionCallFactor);
    public void visit(FuncttionCallFactorComplex FuncttionCallFactorComplex);
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
    public void visit(ConditionSingleWhile ConditionSingleWhile);
    public void visit(ConditionMultipleWhile ConditionMultipleWhile);
    public void visit(ConditionDerived1 ConditionDerived1);
    public void visit(ConditionSingle ConditionSingle);
    public void visit(ConditionMultiple ConditionMultiple);
    public void visit(DesignatorStatementDerived1 DesignatorStatementDerived1);
    public void visit(DesignatorStatementDec DesignatorStatementDec);
    public void visit(DesignatorStatementInc DesignatorStatementInc);
    public void visit(DesignatorStatementFunctionCall DesignatorStatementFunctionCall);
    public void visit(DesignatorStatementFunctionCallComplex DesignatorStatementFunctionCallComplex);
    public void visit(RValueDesignatorStatement RValueDesignatorStatement);
    public void visit(DesignatorStatementAssignment DesignatorStatementAssignment);
    public void visit(MatchedThen1 MatchedThen1);
    public void visit(UnmatchedIfElse UnmatchedIfElse);
    public void visit(UnmatchedIf UnmatchedIf);
    public void visit(StatementWhile1 StatementWhile1);
    public void visit(DoWhileBegin1 DoWhileBegin1);
    public void visit(MatchedDerived3 MatchedDerived3);
    public void visit(MatchedDerived2 MatchedDerived2);
    public void visit(MatchedContinue MatchedContinue);
    public void visit(MatchedBreak MatchedBreak);
    public void visit(MatchdWhile MatchdWhile);
    public void visit(MatchedIf MatchedIf);
    public void visit(ReadStatement ReadStatement);
    public void visit(PrintStatement PrintStatement);
    public void visit(PrintStatementComplex PrintStatementComplex);
    public void visit(StatementReturnValue StatementReturnValue);
    public void visit(StatementReturnVoid StatementReturnVoid);
    public void visit(MatchedDerived1 MatchedDerived1);
    public void visit(StatementDerived2 StatementDerived2);
    public void visit(StatementDerived1 StatementDerived1);
    public void visit(MultipleStatementsDerived2 MultipleStatementsDerived2);
    public void visit(MultipleStatementsDerived1 MultipleStatementsDerived1);
    public void visit(Type1 Type1);
    public void visit(ActParElement1 ActParElement1);
    public void visit(ActParsDerived2 ActParsDerived2);
    public void visit(ActParsDerived1 ActParsDerived1);
    public void visit(FormParsElementDerived1 FormParsElementDerived1);
    public void visit(FormParsElementSingle FormParsElementSingle);
    public void visit(FormParsElementArray FormParsElementArray);
    public void visit(FormParsDerived2 FormParsDerived2);
    public void visit(FormParsDerived1 FormParsDerived1);
    public void visit(VoidTypeDerived1 VoidTypeDerived1);
    public void visit(TypeReturnType TypeReturnType);
    public void visit(VoidReturnType VoidReturnType);
    public void visit(MethodEnd1 MethodEnd1);
    public void visit(MethodBegin1 MethodBegin1);
    public void visit(MethodNameAndRetType1 MethodNameAndRetType1);
    public void visit(MethodDeclDerived4 MethodDeclDerived4);
    public void visit(MethodDeclDerived3 MethodDeclDerived3);
    public void visit(MethodDeclDerived2 MethodDeclDerived2);
    public void visit(MethodDeclDerived1 MethodDeclDerived1);
    public void visit(MultipleMethodDeclDerived2 MultipleMethodDeclDerived2);
    public void visit(MultipleMethodDeclDerived1 MultipleMethodDeclDerived1);
    public void visit(VarDeclElementDerived1 VarDeclElementDerived1);
    public void visit(VarDeclElementSingle VarDeclElementSingle);
    public void visit(VarDeclElementArray VarDeclElementArray);
    public void visit(VarDeclListDerived2 VarDeclListDerived2);
    public void visit(VarDeclListDerived1 VarDeclListDerived1);
    public void visit(VarDeclDerived1 VarDeclDerived1);
    public void visit(VarDecl1 VarDecl1);
    public void visit(MultipleVarDeclDerived2 MultipleVarDeclDerived2);
    public void visit(MultipleVarDeclDerived1 MultipleVarDeclDerived1);
    public void visit(ConstDeclElement1 ConstDeclElement1);
    public void visit(ConstDeclListDerived2 ConstDeclListDerived2);
    public void visit(ConstDeclListDerived1 ConstDeclListDerived1);
    public void visit(ConstDecl1 ConstDecl1);
    public void visit(ClassDeclEnd1 ClassDeclEnd1);
    public void visit(ErrorClass ErrorClass);
    public void visit(NewClassBegin NewClassBegin);
    public void visit(DerivedClassBegin DerivedClassBegin);
    public void visit(ClassDecl4 ClassDecl4);
    public void visit(ClassDecl3 ClassDecl3);
    public void visit(ClassDecl2 ClassDecl2);
    public void visit(ClassDecl1 ClassDecl1);
    public void visit(MultipleDeclDerived6 MultipleDeclDerived6);
    public void visit(MultipleDeclDerived5 MultipleDeclDerived5);
    public void visit(MultipleDeclDerived4 MultipleDeclDerived4);
    public void visit(MultipleDeclDerived3 MultipleDeclDerived3);
    public void visit(MultipleDeclDerived2 MultipleDeclDerived2);
    public void visit(MultipleDeclDerived1 MultipleDeclDerived1);
    public void visit(ProgramEnd1 ProgramEnd1);
    public void visit(ProgramBegin1 ProgramBegin1);
    public void visit(ProgName ProgName);
    public void visit(Program1 Program1);
    public void visit(Program2 Program2);

}
