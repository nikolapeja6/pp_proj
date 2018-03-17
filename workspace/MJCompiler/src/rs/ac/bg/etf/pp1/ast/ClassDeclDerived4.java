// generated with ast extension for cup
// version 0.8
// 15/2/2018 22:35:52


package rs.ac.bg.etf.pp1.ast;

public class ClassDeclDerived4 extends ClassDecl {

    private ClassDeclBegin ClassDeclBegin;
    private ClassDeclEnd ClassDeclEnd;

    public ClassDeclDerived4 (ClassDeclBegin ClassDeclBegin, ClassDeclEnd ClassDeclEnd) {
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
        buffer.append("ClassDeclDerived4(\n");

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
        buffer.append(") [ClassDeclDerived4]");
        return buffer.toString();
    }
}
