// generated with ast extension for cup
// version 0.8
// 2/1/2018 14:8:1


package rs.ac.bg.etf.pp1.ast;

public class CldDcl3 extends ClassDecl {

    private NewClass NewClass;

    public CldDcl3 (NewClass NewClass) {
        this.NewClass=NewClass;
        if(NewClass!=null) NewClass.setParent(this);
    }

    public NewClass getNewClass() {
        return NewClass;
    }

    public void setNewClass(NewClass NewClass) {
        this.NewClass=NewClass;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(NewClass!=null) NewClass.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(NewClass!=null) NewClass.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(NewClass!=null) NewClass.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CldDcl3(\n");

        if(NewClass!=null)
            buffer.append(NewClass.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CldDcl3]");
        return buffer.toString();
    }
}
