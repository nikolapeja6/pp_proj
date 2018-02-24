// generated with ast extension for cup
// version 0.8
// 24/1/2018 2:49:38


package rs.ac.bg.etf.pp1.ast;

public class ReadStatement extends Matched {

    private LValueDesignator LValueDesignator;

    public ReadStatement (LValueDesignator LValueDesignator) {
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
        buffer.append("ReadStatement(\n");

        if(LValueDesignator!=null)
            buffer.append(LValueDesignator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ReadStatement]");
        return buffer.toString();
    }
}
