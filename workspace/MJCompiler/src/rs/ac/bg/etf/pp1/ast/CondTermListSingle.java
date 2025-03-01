// generated with ast extension for cup
// version 0.8
// 18/2/2018 21:16:59


package rs.ac.bg.etf.pp1.ast;

public class CondTermListSingle extends CondTermList {

    private CondTermElement CondTermElement;

    public CondTermListSingle (CondTermElement CondTermElement) {
        this.CondTermElement=CondTermElement;
        if(CondTermElement!=null) CondTermElement.setParent(this);
    }

    public CondTermElement getCondTermElement() {
        return CondTermElement;
    }

    public void setCondTermElement(CondTermElement CondTermElement) {
        this.CondTermElement=CondTermElement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(CondTermElement!=null) CondTermElement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(CondTermElement!=null) CondTermElement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(CondTermElement!=null) CondTermElement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CondTermListSingle(\n");

        if(CondTermElement!=null)
            buffer.append(CondTermElement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CondTermListSingle]");
        return buffer.toString();
    }
}
