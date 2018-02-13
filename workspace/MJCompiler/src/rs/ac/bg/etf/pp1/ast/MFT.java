// generated with ast extension for cup
// version 0.8
// 2/1/2018 14:8:1


package rs.ac.bg.etf.pp1.ast;

public class MFT extends Term {

    private Factor Factor;
    private MultipleMulopFactor MultipleMulopFactor;

    public MFT (Factor Factor, MultipleMulopFactor MultipleMulopFactor) {
        this.Factor=Factor;
        if(Factor!=null) Factor.setParent(this);
        this.MultipleMulopFactor=MultipleMulopFactor;
        if(MultipleMulopFactor!=null) MultipleMulopFactor.setParent(this);
    }

    public Factor getFactor() {
        return Factor;
    }

    public void setFactor(Factor Factor) {
        this.Factor=Factor;
    }

    public MultipleMulopFactor getMultipleMulopFactor() {
        return MultipleMulopFactor;
    }

    public void setMultipleMulopFactor(MultipleMulopFactor MultipleMulopFactor) {
        this.MultipleMulopFactor=MultipleMulopFactor;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Factor!=null) Factor.accept(visitor);
        if(MultipleMulopFactor!=null) MultipleMulopFactor.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Factor!=null) Factor.traverseTopDown(visitor);
        if(MultipleMulopFactor!=null) MultipleMulopFactor.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Factor!=null) Factor.traverseBottomUp(visitor);
        if(MultipleMulopFactor!=null) MultipleMulopFactor.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MFT(\n");

        if(Factor!=null)
            buffer.append(Factor.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleMulopFactor!=null)
            buffer.append(MultipleMulopFactor.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MFT]");
        return buffer.toString();
    }
}
