// generated with ast extension for cup
// version 0.8
// 26/1/2018 22:20:40


package rs.ac.bg.etf.pp1.ast;

public class MultipleDeclDerived1 extends MultipleDecl {

    private MultipleDecl MultipleDecl;
    private ConstDecl ConstDecl;

    public MultipleDeclDerived1 (MultipleDecl MultipleDecl, ConstDecl ConstDecl) {
        this.MultipleDecl=MultipleDecl;
        if(MultipleDecl!=null) MultipleDecl.setParent(this);
        this.ConstDecl=ConstDecl;
        if(ConstDecl!=null) ConstDecl.setParent(this);
    }

    public MultipleDecl getMultipleDecl() {
        return MultipleDecl;
    }

    public void setMultipleDecl(MultipleDecl MultipleDecl) {
        this.MultipleDecl=MultipleDecl;
    }

    public ConstDecl getConstDecl() {
        return ConstDecl;
    }

    public void setConstDecl(ConstDecl ConstDecl) {
        this.ConstDecl=ConstDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleDecl!=null) MultipleDecl.accept(visitor);
        if(ConstDecl!=null) ConstDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleDecl!=null) MultipleDecl.traverseTopDown(visitor);
        if(ConstDecl!=null) ConstDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleDecl!=null) MultipleDecl.traverseBottomUp(visitor);
        if(ConstDecl!=null) ConstDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleDeclDerived1(\n");

        if(MultipleDecl!=null)
            buffer.append(MultipleDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstDecl!=null)
            buffer.append(ConstDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleDeclDerived1]");
        return buffer.toString();
    }
}
