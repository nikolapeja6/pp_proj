// generated with ast extension for cup
// version 0.8
// 1/4/2018 22:32:44


package rs.ac.bg.etf.pp1.ast;

public class DesignatorClassElementMultipleMultiple extends DesignatorClassElementMultiple {

    private DesignatorClassElementMultiple DesignatorClassElementMultiple;
    private DesignatorClassElement DesignatorClassElement;

    public DesignatorClassElementMultipleMultiple (DesignatorClassElementMultiple DesignatorClassElementMultiple, DesignatorClassElement DesignatorClassElement) {
        this.DesignatorClassElementMultiple=DesignatorClassElementMultiple;
        if(DesignatorClassElementMultiple!=null) DesignatorClassElementMultiple.setParent(this);
        this.DesignatorClassElement=DesignatorClassElement;
        if(DesignatorClassElement!=null) DesignatorClassElement.setParent(this);
    }

    public DesignatorClassElementMultiple getDesignatorClassElementMultiple() {
        return DesignatorClassElementMultiple;
    }

    public void setDesignatorClassElementMultiple(DesignatorClassElementMultiple DesignatorClassElementMultiple) {
        this.DesignatorClassElementMultiple=DesignatorClassElementMultiple;
    }

    public DesignatorClassElement getDesignatorClassElement() {
        return DesignatorClassElement;
    }

    public void setDesignatorClassElement(DesignatorClassElement DesignatorClassElement) {
        this.DesignatorClassElement=DesignatorClassElement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorClassElementMultiple!=null) DesignatorClassElementMultiple.accept(visitor);
        if(DesignatorClassElement!=null) DesignatorClassElement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorClassElementMultiple!=null) DesignatorClassElementMultiple.traverseTopDown(visitor);
        if(DesignatorClassElement!=null) DesignatorClassElement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorClassElementMultiple!=null) DesignatorClassElementMultiple.traverseBottomUp(visitor);
        if(DesignatorClassElement!=null) DesignatorClassElement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorClassElementMultipleMultiple(\n");

        if(DesignatorClassElementMultiple!=null)
            buffer.append(DesignatorClassElementMultiple.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesignatorClassElement!=null)
            buffer.append(DesignatorClassElement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorClassElementMultipleMultiple]");
        return buffer.toString();
    }
}
