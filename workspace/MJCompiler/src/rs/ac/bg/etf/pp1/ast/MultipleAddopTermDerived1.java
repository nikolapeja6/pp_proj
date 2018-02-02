// generated with ast extension for cup
// version 0.8
// 2/1/2018 13:49:18


package rs.ac.bg.etf.pp1.ast;

public class MultipleAddopTermDerived1 extends MultipleAddopTerm {

    private MultipleAddopTerm MultipleAddopTerm;
    private Addop Addop;
    private Term Term;

    public MultipleAddopTermDerived1 (MultipleAddopTerm MultipleAddopTerm, Addop Addop, Term Term) {
        this.MultipleAddopTerm=MultipleAddopTerm;
        if(MultipleAddopTerm!=null) MultipleAddopTerm.setParent(this);
        this.Addop=Addop;
        if(Addop!=null) Addop.setParent(this);
        this.Term=Term;
        if(Term!=null) Term.setParent(this);
    }

    public MultipleAddopTerm getMultipleAddopTerm() {
        return MultipleAddopTerm;
    }

    public void setMultipleAddopTerm(MultipleAddopTerm MultipleAddopTerm) {
        this.MultipleAddopTerm=MultipleAddopTerm;
    }

    public Addop getAddop() {
        return Addop;
    }

    public void setAddop(Addop Addop) {
        this.Addop=Addop;
    }

    public Term getTerm() {
        return Term;
    }

    public void setTerm(Term Term) {
        this.Term=Term;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleAddopTerm!=null) MultipleAddopTerm.accept(visitor);
        if(Addop!=null) Addop.accept(visitor);
        if(Term!=null) Term.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleAddopTerm!=null) MultipleAddopTerm.traverseTopDown(visitor);
        if(Addop!=null) Addop.traverseTopDown(visitor);
        if(Term!=null) Term.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleAddopTerm!=null) MultipleAddopTerm.traverseBottomUp(visitor);
        if(Addop!=null) Addop.traverseBottomUp(visitor);
        if(Term!=null) Term.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleAddopTermDerived1(\n");

        if(MultipleAddopTerm!=null)
            buffer.append(MultipleAddopTerm.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Addop!=null)
            buffer.append(Addop.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Term!=null)
            buffer.append(Term.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleAddopTermDerived1]");
        return buffer.toString();
    }
}
