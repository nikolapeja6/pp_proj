// generated with ast extension for cup
// version 0.8
// 17/1/2018 4:1:6


package rs.ac.bg.etf.pp1.ast;

public class ReturnTypeDerived1 extends ReturnType {

    private VoidType VoidType;

    public ReturnTypeDerived1 (VoidType VoidType) {
        this.VoidType=VoidType;
        if(VoidType!=null) VoidType.setParent(this);
    }

    public VoidType getVoidType() {
        return VoidType;
    }

    public void setVoidType(VoidType VoidType) {
        this.VoidType=VoidType;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VoidType!=null) VoidType.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VoidType!=null) VoidType.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VoidType!=null) VoidType.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ReturnTypeDerived1(\n");

        if(VoidType!=null)
            buffer.append(VoidType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ReturnTypeDerived1]");
        return buffer.toString();
    }
}
