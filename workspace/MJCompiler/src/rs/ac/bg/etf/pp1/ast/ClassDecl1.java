// generated with ast extension for cup
// version 0.8
// 18/2/2018 21:16:58


package rs.ac.bg.etf.pp1.ast;

public class ClassDecl1 extends ClassDecl {

    private ClassDeclBegin ClassDeclBegin;
    private MultipleVarDecl MultipleVarDecl;
    private MultipleMethodDecl MultipleMethodDecl;
    private ClassDeclEnd ClassDeclEnd;

    public ClassDecl1 (ClassDeclBegin ClassDeclBegin, MultipleVarDecl MultipleVarDecl, MultipleMethodDecl MultipleMethodDecl, ClassDeclEnd ClassDeclEnd) {
        this.ClassDeclBegin=ClassDeclBegin;
        if(ClassDeclBegin!=null) ClassDeclBegin.setParent(this);
        this.MultipleVarDecl=MultipleVarDecl;
        if(MultipleVarDecl!=null) MultipleVarDecl.setParent(this);
        this.MultipleMethodDecl=MultipleMethodDecl;
        if(MultipleMethodDecl!=null) MultipleMethodDecl.setParent(this);
        this.ClassDeclEnd=ClassDeclEnd;
        if(ClassDeclEnd!=null) ClassDeclEnd.setParent(this);
    }

    public ClassDeclBegin getClassDeclBegin() {
        return ClassDeclBegin;
    }

    public void setClassDeclBegin(ClassDeclBegin ClassDeclBegin) {
        this.ClassDeclBegin=ClassDeclBegin;
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

    public ClassDeclEnd getClassDeclEnd() {
        return ClassDeclEnd;
    }

    public void setClassDeclEnd(ClassDeclEnd ClassDeclEnd) {
        this.ClassDeclEnd=ClassDeclEnd;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ClassDeclBegin!=null) ClassDeclBegin.accept(visitor);
        if(MultipleVarDecl!=null) MultipleVarDecl.accept(visitor);
        if(MultipleMethodDecl!=null) MultipleMethodDecl.accept(visitor);
        if(ClassDeclEnd!=null) ClassDeclEnd.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassDeclBegin!=null) ClassDeclBegin.traverseTopDown(visitor);
        if(MultipleVarDecl!=null) MultipleVarDecl.traverseTopDown(visitor);
        if(MultipleMethodDecl!=null) MultipleMethodDecl.traverseTopDown(visitor);
        if(ClassDeclEnd!=null) ClassDeclEnd.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassDeclBegin!=null) ClassDeclBegin.traverseBottomUp(visitor);
        if(MultipleVarDecl!=null) MultipleVarDecl.traverseBottomUp(visitor);
        if(MultipleMethodDecl!=null) MultipleMethodDecl.traverseBottomUp(visitor);
        if(ClassDeclEnd!=null) ClassDeclEnd.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassDecl1(\n");

        if(ClassDeclBegin!=null)
            buffer.append(ClassDeclBegin.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

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

        if(ClassDeclEnd!=null)
            buffer.append(ClassDeclEnd.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassDecl1]");
        return buffer.toString();
    }
}
