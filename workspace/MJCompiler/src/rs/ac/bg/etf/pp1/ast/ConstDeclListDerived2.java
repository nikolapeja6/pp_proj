// generated with ast extension for cup
// version 0.8
// 18/2/2018 21:16:58


package rs.ac.bg.etf.pp1.ast;

public class ConstDeclListDerived2 extends ConstDeclList {

    private ConstDeclElement ConstDeclElement;

    public ConstDeclListDerived2 (ConstDeclElement ConstDeclElement) {
        this.ConstDeclElement=ConstDeclElement;
        if(ConstDeclElement!=null) ConstDeclElement.setParent(this);
    }

    public ConstDeclElement getConstDeclElement() {
        return ConstDeclElement;
    }

    public void setConstDeclElement(ConstDeclElement ConstDeclElement) {
        this.ConstDeclElement=ConstDeclElement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstDeclElement!=null) ConstDeclElement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstDeclElement!=null) ConstDeclElement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstDeclElement!=null) ConstDeclElement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDeclListDerived2(\n");

        if(ConstDeclElement!=null)
            buffer.append(ConstDeclElement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDeclListDerived2]");
        return buffer.toString();
    }
}
