// generated with ast extension for cup
// version 0.8
// 27/1/2018 5:21:57


package rs.ac.bg.etf.pp1.ast;

public class MultipleDeclDerived2 extends MultipleDecl {

    private MultipleDecl MultipleDecl;
    private VarDecl VarDecl;

    public MultipleDeclDerived2 (MultipleDecl MultipleDecl, VarDecl VarDecl) {
        this.MultipleDecl=MultipleDecl;
        if(MultipleDecl!=null) MultipleDecl.setParent(this);
        this.VarDecl=VarDecl;
        if(VarDecl!=null) VarDecl.setParent(this);
    }

    public MultipleDecl getMultipleDecl() {
        return MultipleDecl;
    }

    public void setMultipleDecl(MultipleDecl MultipleDecl) {
        this.MultipleDecl=MultipleDecl;
    }

    public VarDecl getVarDecl() {
        return VarDecl;
    }

    public void setVarDecl(VarDecl VarDecl) {
        this.VarDecl=VarDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleDecl!=null) MultipleDecl.accept(visitor);
        if(VarDecl!=null) VarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleDecl!=null) MultipleDecl.traverseTopDown(visitor);
        if(VarDecl!=null) VarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleDecl!=null) MultipleDecl.traverseBottomUp(visitor);
        if(VarDecl!=null) VarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleDeclDerived2(\n");

        if(MultipleDecl!=null)
            buffer.append(MultipleDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDecl!=null)
            buffer.append(VarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleDeclDerived2]");
        return buffer.toString();
    }
}
