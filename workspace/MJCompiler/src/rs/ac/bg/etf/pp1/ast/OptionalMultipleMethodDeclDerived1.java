// generated with ast extension for cup
// version 0.8
// 2/1/2018 14:8:1


package rs.ac.bg.etf.pp1.ast;

public class OptionalMultipleMethodDeclDerived1 extends OptionalMultipleMethodDecl {

    private MultipleMethodDecl MultipleMethodDecl;

    public OptionalMultipleMethodDeclDerived1 (MultipleMethodDecl MultipleMethodDecl) {
        this.MultipleMethodDecl=MultipleMethodDecl;
        if(MultipleMethodDecl!=null) MultipleMethodDecl.setParent(this);
    }

    public MultipleMethodDecl getMultipleMethodDecl() {
        return MultipleMethodDecl;
    }

    public void setMultipleMethodDecl(MultipleMethodDecl MultipleMethodDecl) {
        this.MultipleMethodDecl=MultipleMethodDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleMethodDecl!=null) MultipleMethodDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleMethodDecl!=null) MultipleMethodDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleMethodDecl!=null) MultipleMethodDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("OptionalMultipleMethodDeclDerived1(\n");

        if(MultipleMethodDecl!=null)
            buffer.append(MultipleMethodDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [OptionalMultipleMethodDeclDerived1]");
        return buffer.toString();
    }
}
