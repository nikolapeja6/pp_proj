// generated with ast extension for cup
// version 0.8
// 2/1/2018 13:49:18


package rs.ac.bg.etf.pp1.ast;

public class SingleFormalPar extends FormalPars {

    private FormalPar FormalPar;

    public SingleFormalPar (FormalPar FormalPar) {
        this.FormalPar=FormalPar;
        if(FormalPar!=null) FormalPar.setParent(this);
    }

    public FormalPar getFormalPar() {
        return FormalPar;
    }

    public void setFormalPar(FormalPar FormalPar) {
        this.FormalPar=FormalPar;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(FormalPar!=null) FormalPar.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FormalPar!=null) FormalPar.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FormalPar!=null) FormalPar.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleFormalPar(\n");

        if(FormalPar!=null)
            buffer.append(FormalPar.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleFormalPar]");
        return buffer.toString();
    }
}
