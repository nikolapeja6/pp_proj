// generated with ast extension for cup
// version 0.8
// 26/0/2018 18:9:29


package rs.ac.bg.etf.pp1.ast;

public class ClassBodyDeclDerived3 extends ClassBodyDecl {

    private MultipleVarDecl MultipleVarDecl;
    private MultipleMethodDecl MultipleMethodDecl;

    public ClassBodyDeclDerived3 (MultipleVarDecl MultipleVarDecl, MultipleMethodDecl MultipleMethodDecl) {
        this.MultipleVarDecl=MultipleVarDecl;
        if(MultipleVarDecl!=null) MultipleVarDecl.setParent(this);
        this.MultipleMethodDecl=MultipleMethodDecl;
        if(MultipleMethodDecl!=null) MultipleMethodDecl.setParent(this);
    }

    public MultipleVarDecl getMultipleVarDecl() {
        return MultipleVarDecl;
    }

    public void setMultipleVarDecl(MultipleVarDecl MultipleVarDecl) {
        this.MultipleVarDecl=MultipleVarDecl;
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
        if(MultipleVarDecl!=null) MultipleVarDecl.accept(visitor);
        if(MultipleMethodDecl!=null) MultipleMethodDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleVarDecl!=null) MultipleVarDecl.traverseTopDown(visitor);
        if(MultipleMethodDecl!=null) MultipleMethodDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleVarDecl!=null) MultipleVarDecl.traverseBottomUp(visitor);
        if(MultipleMethodDecl!=null) MultipleMethodDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassBodyDeclDerived3(\n");

        if(MultipleVarDecl!=null)
            buffer.append(MultipleVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleMethodDecl!=null)
            buffer.append(MultipleMethodDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassBodyDeclDerived3]");
        return buffer.toString();
    }
}
