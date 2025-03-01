// generated with ast extension for cup
// version 0.8
// 18/2/2018 21:16:58


package rs.ac.bg.etf.pp1.ast;

public class ActParsDerived2 extends ActPars {

    private ActParElement ActParElement;

    public ActParsDerived2 (ActParElement ActParElement) {
        this.ActParElement=ActParElement;
        if(ActParElement!=null) ActParElement.setParent(this);
    }

    public ActParElement getActParElement() {
        return ActParElement;
    }

    public void setActParElement(ActParElement ActParElement) {
        this.ActParElement=ActParElement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ActParElement!=null) ActParElement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ActParElement!=null) ActParElement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ActParElement!=null) ActParElement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ActParsDerived2(\n");

        if(ActParElement!=null)
            buffer.append(ActParElement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ActParsDerived2]");
        return buffer.toString();
    }
}
