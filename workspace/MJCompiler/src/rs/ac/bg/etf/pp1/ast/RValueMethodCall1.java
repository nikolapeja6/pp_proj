// generated with ast extension for cup
// version 0.8
// 25/4/2018 1:33:5


package rs.ac.bg.etf.pp1.ast;

public class RValueMethodCall1 extends RValueDesignator {

    private DesignatorClassElementMultiple DesignatorClassElementMultiple;
    private MethodDesignator MethodDesignator;
    private ActPars ActPars;

    public RValueMethodCall1 (DesignatorClassElementMultiple DesignatorClassElementMultiple, MethodDesignator MethodDesignator, ActPars ActPars) {
        this.DesignatorClassElementMultiple=DesignatorClassElementMultiple;
        if(DesignatorClassElementMultiple!=null) DesignatorClassElementMultiple.setParent(this);
        this.MethodDesignator=MethodDesignator;
        if(MethodDesignator!=null) MethodDesignator.setParent(this);
        this.ActPars=ActPars;
        if(ActPars!=null) ActPars.setParent(this);
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

    public ActPars getActPars() {
        return ActPars;
    }

    public void setActPars(ActPars ActPars) {
        this.ActPars=ActPars;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorClassElementMultiple!=null) DesignatorClassElementMultiple.accept(visitor);
        if(MethodDesignator!=null) MethodDesignator.accept(visitor);
        if(ActPars!=null) ActPars.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorClassElementMultiple!=null) DesignatorClassElementMultiple.traverseTopDown(visitor);
        if(MethodDesignator!=null) MethodDesignator.traverseTopDown(visitor);
        if(ActPars!=null) ActPars.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorClassElementMultiple!=null) DesignatorClassElementMultiple.traverseBottomUp(visitor);
        if(MethodDesignator!=null) MethodDesignator.traverseBottomUp(visitor);
        if(ActPars!=null) ActPars.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("RValueMethodCall1(\n");

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

        if(ActPars!=null)
            buffer.append(ActPars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [RValueMethodCall1]");
        return buffer.toString();
    }
}
