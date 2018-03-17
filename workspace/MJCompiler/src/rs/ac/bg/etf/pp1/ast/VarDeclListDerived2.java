// generated with ast extension for cup
// version 0.8
// 15/2/2018 22:35:52


package rs.ac.bg.etf.pp1.ast;

public class VarDeclListDerived2 extends VarDeclList {

    private VarDeclElement VarDeclElement;

    public VarDeclListDerived2 (VarDeclElement VarDeclElement) {
        this.VarDeclElement=VarDeclElement;
        if(VarDeclElement!=null) VarDeclElement.setParent(this);
    }

    public VarDeclElement getVarDeclElement() {
        return VarDeclElement;
    }

    public void setVarDeclElement(VarDeclElement VarDeclElement) {
        this.VarDeclElement=VarDeclElement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarDeclElement!=null) VarDeclElement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclElement!=null) VarDeclElement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclElement!=null) VarDeclElement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDeclListDerived2(\n");

        if(VarDeclElement!=null)
            buffer.append(VarDeclElement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDeclListDerived2]");
        return buffer.toString();
    }
}
