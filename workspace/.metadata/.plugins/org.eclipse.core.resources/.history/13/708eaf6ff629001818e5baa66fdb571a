// generated with ast extension for cup
// version 0.8
// 15/2/2018 22:35:52


package rs.ac.bg.etf.pp1.ast;

public class DesignatorClass extends Designator {

    private String I1;
    private DesignatorClassElement DesignatorClassElement;

    public DesignatorClass (String I1, DesignatorClassElement DesignatorClassElement) {
        this.I1=I1;
        this.DesignatorClassElement=DesignatorClassElement;
        if(DesignatorClassElement!=null) DesignatorClassElement.setParent(this);
    }

    public String getI1() {
        return I1;
    }

    public void setI1(String I1) {
        this.I1=I1;
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
        if(DesignatorClassElement!=null) DesignatorClassElement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorClassElement!=null) DesignatorClassElement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorClassElement!=null) DesignatorClassElement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorClass(\n");

        buffer.append(" "+tab+I1);
        buffer.append("\n");

        if(DesignatorClassElement!=null)
            buffer.append(DesignatorClassElement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorClass]");
        return buffer.toString();
    }
}
