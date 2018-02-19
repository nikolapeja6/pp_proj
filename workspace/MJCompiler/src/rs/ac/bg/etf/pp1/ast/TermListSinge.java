// generated with ast extension for cup
// version 0.8
// 19/1/2018 18:43:26


package rs.ac.bg.etf.pp1.ast;

public class TermListSinge extends TermList {

    private TermElement TermElement;

    public TermListSinge (TermElement TermElement) {
        this.TermElement=TermElement;
        if(TermElement!=null) TermElement.setParent(this);
    }

    public TermElement getTermElement() {
        return TermElement;
    }

    public void setTermElement(TermElement TermElement) {
        this.TermElement=TermElement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(TermElement!=null) TermElement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(TermElement!=null) TermElement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(TermElement!=null) TermElement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("TermListSinge(\n");

        if(TermElement!=null)
            buffer.append(TermElement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [TermListSinge]");
        return buffer.toString();
    }
}
