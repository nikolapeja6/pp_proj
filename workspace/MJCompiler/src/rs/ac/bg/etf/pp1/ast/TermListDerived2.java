// generated with ast extension for cup
// version 0.8
// 18/1/2018 4:58:16


package rs.ac.bg.etf.pp1.ast;

public class TermListDerived2 extends TermList {

    private TermList TermList;
    private TermElement TermElement;

    public TermListDerived2 (TermList TermList, TermElement TermElement) {
        this.TermList=TermList;
        if(TermList!=null) TermList.setParent(this);
        this.TermElement=TermElement;
        if(TermElement!=null) TermElement.setParent(this);
    }

    public TermList getTermList() {
        return TermList;
    }

    public void setTermList(TermList TermList) {
        this.TermList=TermList;
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
        if(TermList!=null) TermList.accept(visitor);
        if(TermElement!=null) TermElement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(TermList!=null) TermList.traverseTopDown(visitor);
        if(TermElement!=null) TermElement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(TermList!=null) TermList.traverseBottomUp(visitor);
        if(TermElement!=null) TermElement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("TermListDerived2(\n");

        if(TermList!=null)
            buffer.append(TermList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(TermElement!=null)
            buffer.append(TermElement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [TermListDerived2]");
        return buffer.toString();
    }
}
