// generated with ast extension for cup
// version 0.8
// 27/1/2018 5:21:58


package rs.ac.bg.etf.pp1.ast;

public class FuncttionCallFactorComplex extends Factor {

    private MethodDesignator MethodDesignator;
    private ActPars ActPars;

    public FuncttionCallFactorComplex (MethodDesignator MethodDesignator, ActPars ActPars) {
        this.MethodDesignator=MethodDesignator;
        if(MethodDesignator!=null) MethodDesignator.setParent(this);
        this.ActPars=ActPars;
        if(ActPars!=null) ActPars.setParent(this);
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
        if(MethodDesignator!=null) MethodDesignator.accept(visitor);
        if(ActPars!=null) ActPars.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethodDesignator!=null) MethodDesignator.traverseTopDown(visitor);
        if(ActPars!=null) ActPars.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethodDesignator!=null) MethodDesignator.traverseBottomUp(visitor);
        if(ActPars!=null) ActPars.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FuncttionCallFactorComplex(\n");

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
        buffer.append(") [FuncttionCallFactorComplex]");
        return buffer.toString();
    }
}
