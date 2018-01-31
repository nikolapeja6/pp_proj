// generated with ast extension for cup
// version 0.8
// 30/0/2018 22:37:37


package rs.ac.bg.etf.pp1.ast;

public class PositiveExpr extends Expr {

    private Term Term;
    private MultipleAddopTerm MultipleAddopTerm;

    public PositiveExpr (Term Term, MultipleAddopTerm MultipleAddopTerm) {
        this.Term=Term;
        if(Term!=null) Term.setParent(this);
        this.MultipleAddopTerm=MultipleAddopTerm;
        if(MultipleAddopTerm!=null) MultipleAddopTerm.setParent(this);
    }

    public Term getTerm() {
        return Term;
    }

    public void setTerm(Term Term) {
        this.Term=Term;
    }

    public MultipleAddopTerm getMultipleAddopTerm() {
        return MultipleAddopTerm;
    }

    public void setMultipleAddopTerm(MultipleAddopTerm MultipleAddopTerm) {
        this.MultipleAddopTerm=MultipleAddopTerm;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Term!=null) Term.accept(visitor);
        if(MultipleAddopTerm!=null) MultipleAddopTerm.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Term!=null) Term.traverseTopDown(visitor);
        if(MultipleAddopTerm!=null) MultipleAddopTerm.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Term!=null) Term.traverseBottomUp(visitor);
        if(MultipleAddopTerm!=null) MultipleAddopTerm.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("PositiveExpr(\n");

        if(Term!=null)
            buffer.append(Term.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleAddopTerm!=null)
            buffer.append(MultipleAddopTerm.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [PositiveExpr]");
        return buffer.toString();
    }
}
