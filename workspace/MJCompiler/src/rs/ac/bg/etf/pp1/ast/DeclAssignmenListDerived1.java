// generated with ast extension for cup
// version 0.8
// 2/1/2018 13:49:18


package rs.ac.bg.etf.pp1.ast;

public class DeclAssignmenListDerived1 extends DeclAssignmenList {

    private DeclAssignElement DeclAssignElement;

    public DeclAssignmenListDerived1 (DeclAssignElement DeclAssignElement) {
        this.DeclAssignElement=DeclAssignElement;
        if(DeclAssignElement!=null) DeclAssignElement.setParent(this);
    }

    public DeclAssignElement getDeclAssignElement() {
        return DeclAssignElement;
    }

    public void setDeclAssignElement(DeclAssignElement DeclAssignElement) {
        this.DeclAssignElement=DeclAssignElement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DeclAssignElement!=null) DeclAssignElement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DeclAssignElement!=null) DeclAssignElement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DeclAssignElement!=null) DeclAssignElement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DeclAssignmenListDerived1(\n");

        if(DeclAssignElement!=null)
            buffer.append(DeclAssignElement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DeclAssignmenListDerived1]");
        return buffer.toString();
    }
}
