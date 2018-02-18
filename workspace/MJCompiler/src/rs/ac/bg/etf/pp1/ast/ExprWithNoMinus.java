// generated with ast extension for cup
// version 0.8
// 18/1/2018 4:58:16


package rs.ac.bg.etf.pp1.ast;

public class ExprWithNoMinus extends Expr {

    private Term Term;
    private OptionalExprList OptionalExprList;

    public ExprWithNoMinus (Term Term, OptionalExprList OptionalExprList) {
        this.Term=Term;
        if(Term!=null) Term.setParent(this);
        this.OptionalExprList=OptionalExprList;
        if(OptionalExprList!=null) OptionalExprList.setParent(this);
    }

    public Term getTerm() {
        return Term;
    }

    public void setTerm(Term Term) {
        this.Term=Term;
    }

    public OptionalExprList getOptionalExprList() {
        return OptionalExprList;
    }

    public void setOptionalExprList(OptionalExprList OptionalExprList) {
        this.OptionalExprList=OptionalExprList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Term!=null) Term.accept(visitor);
        if(OptionalExprList!=null) OptionalExprList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Term!=null) Term.traverseTopDown(visitor);
        if(OptionalExprList!=null) OptionalExprList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Term!=null) Term.traverseBottomUp(visitor);
        if(OptionalExprList!=null) OptionalExprList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ExprWithNoMinus(\n");

        if(Term!=null)
            buffer.append(Term.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OptionalExprList!=null)
            buffer.append(OptionalExprList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ExprWithNoMinus]");
        return buffer.toString();
    }
}
