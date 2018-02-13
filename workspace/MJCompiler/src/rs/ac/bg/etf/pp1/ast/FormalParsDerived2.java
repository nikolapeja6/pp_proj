// generated with ast extension for cup
// version 0.8
// 2/1/2018 14:8:1


package rs.ac.bg.etf.pp1.ast;

public class FormalParsDerived2 extends FormalPars {

    private FormalPars FormalPars;

    public FormalParsDerived2 (FormalPars FormalPars) {
        this.FormalPars=FormalPars;
        if(FormalPars!=null) FormalPars.setParent(this);
    }

    public FormalPars getFormalPars() {
        return FormalPars;
    }

    public void setFormalPars(FormalPars FormalPars) {
        this.FormalPars=FormalPars;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(FormalPars!=null) FormalPars.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FormalPars!=null) FormalPars.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FormalPars!=null) FormalPars.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormalParsDerived2(\n");

        if(FormalPars!=null)
            buffer.append(FormalPars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormalParsDerived2]");
        return buffer.toString();
    }
}
