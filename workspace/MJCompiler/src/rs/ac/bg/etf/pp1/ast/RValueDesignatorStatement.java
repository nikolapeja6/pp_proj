// generated with ast extension for cup
// version 0.8
// 27/4/2018 21:28:50


package rs.ac.bg.etf.pp1.ast;

public class RValueDesignatorStatement extends DesignatorStatement {

    private RValueDesignator RValueDesignator;

    public RValueDesignatorStatement (RValueDesignator RValueDesignator) {
        this.RValueDesignator=RValueDesignator;
        if(RValueDesignator!=null) RValueDesignator.setParent(this);
    }

    public RValueDesignator getRValueDesignator() {
        return RValueDesignator;
    }

    public void setRValueDesignator(RValueDesignator RValueDesignator) {
        this.RValueDesignator=RValueDesignator;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(RValueDesignator!=null) RValueDesignator.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(RValueDesignator!=null) RValueDesignator.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(RValueDesignator!=null) RValueDesignator.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("RValueDesignatorStatement(\n");

        if(RValueDesignator!=null)
            buffer.append(RValueDesignator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [RValueDesignatorStatement]");
        return buffer.toString();
    }
}
