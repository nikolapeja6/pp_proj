// generated with ast extension for cup
// version 0.8
// 27/4/2018 1:55:13


package rs.ac.bg.etf.pp1.ast;

public class MultipleDeclDerived3 extends MultipleDecl {

    private MultipleDecl MultipleDecl;
    private ClassDecl ClassDecl;

    public MultipleDeclDerived3 (MultipleDecl MultipleDecl, ClassDecl ClassDecl) {
        this.MultipleDecl=MultipleDecl;
        if(MultipleDecl!=null) MultipleDecl.setParent(this);
        this.ClassDecl=ClassDecl;
        if(ClassDecl!=null) ClassDecl.setParent(this);
    }

    public MultipleDecl getMultipleDecl() {
        return MultipleDecl;
    }

    public void setMultipleDecl(MultipleDecl MultipleDecl) {
        this.MultipleDecl=MultipleDecl;
    }

    public ClassDecl getClassDecl() {
        return ClassDecl;
    }

    public void setClassDecl(ClassDecl ClassDecl) {
        this.ClassDecl=ClassDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleDecl!=null) MultipleDecl.accept(visitor);
        if(ClassDecl!=null) ClassDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleDecl!=null) MultipleDecl.traverseTopDown(visitor);
        if(ClassDecl!=null) ClassDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleDecl!=null) MultipleDecl.traverseBottomUp(visitor);
        if(ClassDecl!=null) ClassDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleDeclDerived3(\n");

        if(MultipleDecl!=null)
            buffer.append(MultipleDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ClassDecl!=null)
            buffer.append(ClassDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleDeclDerived3]");
        return buffer.toString();
    }
}
