// generated with ast extension for cup
// version 0.8
// 18/2/2018 21:16:58


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStatementFunctionCall extends DesignatorStatement {

    private MethodDesignator MethodDesignator;

    public DesignatorStatementFunctionCall (MethodDesignator MethodDesignator) {
        this.MethodDesignator=MethodDesignator;
        if(MethodDesignator!=null) MethodDesignator.setParent(this);
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
        if(MethodDesignator!=null) MethodDesignator.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethodDesignator!=null) MethodDesignator.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethodDesignator!=null) MethodDesignator.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStatementFunctionCall(\n");

        if(MethodDesignator!=null)
            buffer.append(MethodDesignator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStatementFunctionCall]");
        return buffer.toString();
    }
}
