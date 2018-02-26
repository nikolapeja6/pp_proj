// generated with ast extension for cup
// version 0.8
// 26/1/2018 22:20:40


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStatementDec extends DesignatorStatement {

    private LValueDesignator LValueDesignator;

    public DesignatorStatementDec (LValueDesignator LValueDesignator) {
        this.LValueDesignator=LValueDesignator;
        if(LValueDesignator!=null) LValueDesignator.setParent(this);
    }

    public LValueDesignator getLValueDesignator() {
        return LValueDesignator;
    }

    public void setLValueDesignator(LValueDesignator LValueDesignator) {
        this.LValueDesignator=LValueDesignator;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(LValueDesignator!=null) LValueDesignator.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(LValueDesignator!=null) LValueDesignator.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(LValueDesignator!=null) LValueDesignator.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStatementDec(\n");

        if(LValueDesignator!=null)
            buffer.append(LValueDesignator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStatementDec]");
        return buffer.toString();
    }
}
