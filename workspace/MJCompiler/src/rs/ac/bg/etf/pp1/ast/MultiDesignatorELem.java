// generated with ast extension for cup
// version 0.8
// 2/1/2018 13:49:18


package rs.ac.bg.etf.pp1.ast;

public class MultiDesignatorELem extends MultipleDesignatorElem {

    private MultipleDesignatorElem MultipleDesignatorElem;
    private DesignatorElem DesignatorElem;

    public MultiDesignatorELem (MultipleDesignatorElem MultipleDesignatorElem, DesignatorElem DesignatorElem) {
        this.MultipleDesignatorElem=MultipleDesignatorElem;
        if(MultipleDesignatorElem!=null) MultipleDesignatorElem.setParent(this);
        this.DesignatorElem=DesignatorElem;
        if(DesignatorElem!=null) DesignatorElem.setParent(this);
    }

    public MultipleDesignatorElem getMultipleDesignatorElem() {
        return MultipleDesignatorElem;
    }

    public void setMultipleDesignatorElem(MultipleDesignatorElem MultipleDesignatorElem) {
        this.MultipleDesignatorElem=MultipleDesignatorElem;
    }

    public DesignatorElem getDesignatorElem() {
        return DesignatorElem;
    }

    public void setDesignatorElem(DesignatorElem DesignatorElem) {
        this.DesignatorElem=DesignatorElem;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleDesignatorElem!=null) MultipleDesignatorElem.accept(visitor);
        if(DesignatorElem!=null) DesignatorElem.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleDesignatorElem!=null) MultipleDesignatorElem.traverseTopDown(visitor);
        if(DesignatorElem!=null) DesignatorElem.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleDesignatorElem!=null) MultipleDesignatorElem.traverseBottomUp(visitor);
        if(DesignatorElem!=null) DesignatorElem.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultiDesignatorELem(\n");

        if(MultipleDesignatorElem!=null)
            buffer.append(MultipleDesignatorElem.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesignatorElem!=null)
            buffer.append(DesignatorElem.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultiDesignatorELem]");
        return buffer.toString();
    }
}
