// generated with ast extension for cup
// version 0.8
// 26/0/2018 18:9:30


package rs.ac.bg.etf.pp1.ast;

public class DesignatorDerived2 extends Designator {

    private String I1;
    private MultipleDesignatorElem MultipleDesignatorElem;

    public DesignatorDerived2 (String I1, MultipleDesignatorElem MultipleDesignatorElem) {
        this.I1=I1;
        this.MultipleDesignatorElem=MultipleDesignatorElem;
        if(MultipleDesignatorElem!=null) MultipleDesignatorElem.setParent(this);
    }

    public String getI1() {
        return I1;
    }

    public void setI1(String I1) {
        this.I1=I1;
    }

    public MultipleDesignatorElem getMultipleDesignatorElem() {
        return MultipleDesignatorElem;
    }

    public void setMultipleDesignatorElem(MultipleDesignatorElem MultipleDesignatorElem) {
        this.MultipleDesignatorElem=MultipleDesignatorElem;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleDesignatorElem!=null) MultipleDesignatorElem.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleDesignatorElem!=null) MultipleDesignatorElem.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleDesignatorElem!=null) MultipleDesignatorElem.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorDerived2(\n");

        buffer.append(" "+tab+I1);
        buffer.append("\n");

        if(MultipleDesignatorElem!=null)
            buffer.append(MultipleDesignatorElem.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorDerived2]");
        return buffer.toString();
    }
}
