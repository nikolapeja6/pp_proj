// generated with ast extension for cup
// version 0.8
// 11/2/2018 15:7:45


package rs.ac.bg.etf.pp1.ast;

public class CondFactListSingle extends CondFactList {

    private CondFactElement CondFactElement;

    public CondFactListSingle (CondFactElement CondFactElement) {
        this.CondFactElement=CondFactElement;
        if(CondFactElement!=null) CondFactElement.setParent(this);
    }

    public CondFactElement getCondFactElement() {
        return CondFactElement;
    }

    public void setCondFactElement(CondFactElement CondFactElement) {
        this.CondFactElement=CondFactElement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(CondFactElement!=null) CondFactElement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(CondFactElement!=null) CondFactElement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(CondFactElement!=null) CondFactElement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CondFactListSingle(\n");

        if(CondFactElement!=null)
            buffer.append(CondFactElement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CondFactListSingle]");
        return buffer.toString();
    }
}
