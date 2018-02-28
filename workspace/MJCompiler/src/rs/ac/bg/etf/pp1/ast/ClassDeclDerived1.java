// generated with ast extension for cup
// version 0.8
// 28/1/2018 0:28:26


package rs.ac.bg.etf.pp1.ast;

public class ClassDeclDerived1 extends ClassDecl {

    private ClassDeclBegin ClassDeclBegin;
    private ClassDeclEnd ClassDeclEnd;

    public ClassDeclDerived1 (ClassDeclBegin ClassDeclBegin, ClassDeclEnd ClassDeclEnd) {
        this.ClassDeclBegin=ClassDeclBegin;
        if(ClassDeclBegin!=null) ClassDeclBegin.setParent(this);
        this.ClassDeclEnd=ClassDeclEnd;
        if(ClassDeclEnd!=null) ClassDeclEnd.setParent(this);
    }

    public ClassDeclBegin getClassDeclBegin() {
        return ClassDeclBegin;
    }

    public void setClassDeclBegin(ClassDeclBegin ClassDeclBegin) {
        this.ClassDeclBegin=ClassDeclBegin;
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
        if(ClassDeclEnd!=null) ClassDeclEnd.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassDeclBegin!=null) ClassDeclBegin.traverseTopDown(visitor);
        if(ClassDeclEnd!=null) ClassDeclEnd.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassDeclBegin!=null) ClassDeclBegin.traverseBottomUp(visitor);
        if(ClassDeclEnd!=null) ClassDeclEnd.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassDeclDerived1(\n");

        if(ClassDeclBegin!=null)
            buffer.append(ClassDeclBegin.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ClassDeclEnd!=null)
            buffer.append(ClassDeclEnd.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassDeclDerived1]");
        return buffer.toString();
    }
}
