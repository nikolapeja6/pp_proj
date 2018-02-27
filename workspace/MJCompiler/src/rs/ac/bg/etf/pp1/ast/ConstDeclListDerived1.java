// generated with ast extension for cup
// version 0.8
// 27/1/2018 5:21:57


package rs.ac.bg.etf.pp1.ast;

public class ConstDeclListDerived1 extends ConstDeclList {

    private ConstDeclList ConstDeclList;
    private ConstDeclElement ConstDeclElement;

    public ConstDeclListDerived1 (ConstDeclList ConstDeclList, ConstDeclElement ConstDeclElement) {
        this.ConstDeclList=ConstDeclList;
        if(ConstDeclList!=null) ConstDeclList.setParent(this);
        this.ConstDeclElement=ConstDeclElement;
        if(ConstDeclElement!=null) ConstDeclElement.setParent(this);
    }

    public ConstDeclList getConstDeclList() {
        return ConstDeclList;
    }

    public void setConstDeclList(ConstDeclList ConstDeclList) {
        this.ConstDeclList=ConstDeclList;
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
        if(ConstDeclList!=null) ConstDeclList.accept(visitor);
        if(ConstDeclElement!=null) ConstDeclElement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstDeclList!=null) ConstDeclList.traverseTopDown(visitor);
        if(ConstDeclElement!=null) ConstDeclElement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstDeclList!=null) ConstDeclList.traverseBottomUp(visitor);
        if(ConstDeclElement!=null) ConstDeclElement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDeclListDerived1(\n");

        if(ConstDeclList!=null)
            buffer.append(ConstDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstDeclElement!=null)
            buffer.append(ConstDeclElement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDeclListDerived1]");
        return buffer.toString();
    }
}
