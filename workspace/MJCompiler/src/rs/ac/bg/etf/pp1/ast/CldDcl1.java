// generated with ast extension for cup
// version 0.8
// 2/1/2018 14:8:1


package rs.ac.bg.etf.pp1.ast;

public class CldDcl1 extends ClassDecl {

    private NewClass NewClass;
    private ClassBodyDecl ClassBodyDecl;

    public CldDcl1 (NewClass NewClass, ClassBodyDecl ClassBodyDecl) {
        this.NewClass=NewClass;
        if(NewClass!=null) NewClass.setParent(this);
        this.ClassBodyDecl=ClassBodyDecl;
        if(ClassBodyDecl!=null) ClassBodyDecl.setParent(this);
    }

    public NewClass getNewClass() {
        return NewClass;
    }

    public void setNewClass(NewClass NewClass) {
        this.NewClass=NewClass;
    }

    public ClassBodyDecl getClassBodyDecl() {
        return ClassBodyDecl;
    }

    public void setClassBodyDecl(ClassBodyDecl ClassBodyDecl) {
        this.ClassBodyDecl=ClassBodyDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(NewClass!=null) NewClass.accept(visitor);
        if(ClassBodyDecl!=null) ClassBodyDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(NewClass!=null) NewClass.traverseTopDown(visitor);
        if(ClassBodyDecl!=null) ClassBodyDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(NewClass!=null) NewClass.traverseBottomUp(visitor);
        if(ClassBodyDecl!=null) ClassBodyDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CldDcl1(\n");

        if(NewClass!=null)
            buffer.append(NewClass.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ClassBodyDecl!=null)
            buffer.append(ClassBodyDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CldDcl1]");
        return buffer.toString();
    }
}
