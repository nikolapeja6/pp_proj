// generated with ast extension for cup
// version 0.8
// 27/4/2018 1:55:13


package rs.ac.bg.etf.pp1.ast;

public class LValueClassDesignator extends LValueDesignator {

    private DesignatorClassElementMultiple DesignatorClassElementMultiple;
    private Designator Designator;

    public LValueClassDesignator (DesignatorClassElementMultiple DesignatorClassElementMultiple, Designator Designator) {
        this.DesignatorClassElementMultiple=DesignatorClassElementMultiple;
        if(DesignatorClassElementMultiple!=null) DesignatorClassElementMultiple.setParent(this);
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
    }

    public DesignatorClassElementMultiple getDesignatorClassElementMultiple() {
        return DesignatorClassElementMultiple;
    }

    public void setDesignatorClassElementMultiple(DesignatorClassElementMultiple DesignatorClassElementMultiple) {
        this.DesignatorClassElementMultiple=DesignatorClassElementMultiple;
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorClassElementMultiple!=null) DesignatorClassElementMultiple.accept(visitor);
        if(Designator!=null) Designator.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorClassElementMultiple!=null) DesignatorClassElementMultiple.traverseTopDown(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorClassElementMultiple!=null) DesignatorClassElementMultiple.traverseBottomUp(visitor);
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("LValueClassDesignator(\n");

        if(DesignatorClassElementMultiple!=null)
            buffer.append(DesignatorClassElementMultiple.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [LValueClassDesignator]");
        return buffer.toString();
    }
}
