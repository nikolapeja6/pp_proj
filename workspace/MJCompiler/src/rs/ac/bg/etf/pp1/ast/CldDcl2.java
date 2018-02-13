// generated with ast extension for cup
// version 0.8
// 2/1/2018 14:8:1


package rs.ac.bg.etf.pp1.ast;

public class CldDcl2 extends ClassDecl {

    private DerivedClass DerivedClass;
    private ClassBodyDecl ClassBodyDecl;

    public CldDcl2 (DerivedClass DerivedClass, ClassBodyDecl ClassBodyDecl) {
        this.DerivedClass=DerivedClass;
        if(DerivedClass!=null) DerivedClass.setParent(this);
        this.ClassBodyDecl=ClassBodyDecl;
        if(ClassBodyDecl!=null) ClassBodyDecl.setParent(this);
    }

    public DerivedClass getDerivedClass() {
        return DerivedClass;
    }

    public void setDerivedClass(DerivedClass DerivedClass) {
        this.DerivedClass=DerivedClass;
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
        if(DerivedClass!=null) DerivedClass.accept(visitor);
        if(ClassBodyDecl!=null) ClassBodyDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DerivedClass!=null) DerivedClass.traverseTopDown(visitor);
        if(ClassBodyDecl!=null) ClassBodyDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DerivedClass!=null) DerivedClass.traverseBottomUp(visitor);
        if(ClassBodyDecl!=null) ClassBodyDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CldDcl2(\n");

        if(DerivedClass!=null)
            buffer.append(DerivedClass.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ClassBodyDecl!=null)
            buffer.append(ClassBodyDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CldDcl2]");
        return buffer.toString();
    }
}
