// generated with ast extension for cup
// version 0.8
// 27/4/2018 17:12:34


package rs.ac.bg.etf.pp1.ast;

public class RValueMethodCall2 extends RValueDesignator {

    private DesignatorClassElementMultiple DesignatorClassElementMultiple;
    private MethodDesignator MethodDesignator;

    public RValueMethodCall2 (DesignatorClassElementMultiple DesignatorClassElementMultiple, MethodDesignator MethodDesignator) {
        this.DesignatorClassElementMultiple=DesignatorClassElementMultiple;
        if(DesignatorClassElementMultiple!=null) DesignatorClassElementMultiple.setParent(this);
        this.MethodDesignator=MethodDesignator;
        if(MethodDesignator!=null) MethodDesignator.setParent(this);
    }

    public DesignatorClassElementMultiple getDesignatorClassElementMultiple() {
        return DesignatorClassElementMultiple;
    }

    public void setDesignatorClassElementMultiple(DesignatorClassElementMultiple DesignatorClassElementMultiple) {
        this.DesignatorClassElementMultiple=DesignatorClassElementMultiple;
    }

    public MethodDesignator getMethodDesignator() {
        return MethodDesignator;
    }

    public void setMethodDesignator(MethodDesignator MethodDesignator) {
        this.MethodDesignator=MethodDesignator;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorClassElementMultiple!=null) DesignatorClassElementMultiple.accept(visitor);
        if(MethodDesignator!=null) MethodDesignator.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorClassElementMultiple!=null) DesignatorClassElementMultiple.traverseTopDown(visitor);
        if(MethodDesignator!=null) MethodDesignator.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorClassElementMultiple!=null) DesignatorClassElementMultiple.traverseBottomUp(visitor);
        if(MethodDesignator!=null) MethodDesignator.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("RValueMethodCall2(\n");

        if(DesignatorClassElementMultiple!=null)
            buffer.append(DesignatorClassElementMultiple.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethodDesignator!=null)
            buffer.append(MethodDesignator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [RValueMethodCall2]");
        return buffer.toString();
    }
}
