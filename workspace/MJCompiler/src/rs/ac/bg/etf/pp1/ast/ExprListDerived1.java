// generated with ast extension for cup
// version 0.8
// 17/1/2018 4:1:6


package rs.ac.bg.etf.pp1.ast;

public class ExprListDerived1 extends ExprList {

    private ExprElement ExprElement;

    public ExprListDerived1 (ExprElement ExprElement) {
        this.ExprElement=ExprElement;
        if(ExprElement!=null) ExprElement.setParent(this);
    }

    public ExprElement getExprElement() {
        return ExprElement;
    }

    public void setExprElement(ExprElement ExprElement) {
        this.ExprElement=ExprElement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ExprElement!=null) ExprElement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ExprElement!=null) ExprElement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ExprElement!=null) ExprElement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ExprListDerived1(\n");

        if(ExprElement!=null)
            buffer.append(ExprElement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ExprListDerived1]");
        return buffer.toString();
    }
}
