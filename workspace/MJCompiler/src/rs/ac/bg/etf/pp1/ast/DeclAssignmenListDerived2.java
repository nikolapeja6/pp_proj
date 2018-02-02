// generated with ast extension for cup
// version 0.8
// 2/1/2018 13:49:18


package rs.ac.bg.etf.pp1.ast;

public class DeclAssignmenListDerived2 extends DeclAssignmenList {

    private DeclAssignmenList DeclAssignmenList;
    private DeclAssignElement DeclAssignElement;

    public DeclAssignmenListDerived2 (DeclAssignmenList DeclAssignmenList, DeclAssignElement DeclAssignElement) {
        this.DeclAssignmenList=DeclAssignmenList;
        if(DeclAssignmenList!=null) DeclAssignmenList.setParent(this);
        this.DeclAssignElement=DeclAssignElement;
        if(DeclAssignElement!=null) DeclAssignElement.setParent(this);
    }

    public DeclAssignmenList getDeclAssignmenList() {
        return DeclAssignmenList;
    }

    public void setDeclAssignmenList(DeclAssignmenList DeclAssignmenList) {
        this.DeclAssignmenList=DeclAssignmenList;
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
        if(DeclAssignmenList!=null) DeclAssignmenList.accept(visitor);
        if(DeclAssignElement!=null) DeclAssignElement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DeclAssignmenList!=null) DeclAssignmenList.traverseTopDown(visitor);
        if(DeclAssignElement!=null) DeclAssignElement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DeclAssignmenList!=null) DeclAssignmenList.traverseBottomUp(visitor);
        if(DeclAssignElement!=null) DeclAssignElement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DeclAssignmenListDerived2(\n");

        if(DeclAssignmenList!=null)
            buffer.append(DeclAssignmenList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DeclAssignElement!=null)
            buffer.append(DeclAssignElement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DeclAssignmenListDerived2]");
        return buffer.toString();
    }
}
