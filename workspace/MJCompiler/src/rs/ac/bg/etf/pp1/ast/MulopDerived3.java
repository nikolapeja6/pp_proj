// generated with ast extension for cup
// version 0.8
// 22/1/2018 2:49:22


package rs.ac.bg.etf.pp1.ast;

public class MulopDerived3 extends Mulop {

    public MulopDerived3 () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MulopDerived3(\n");

        buffer.append(tab);
        buffer.append(") [MulopDerived3]");
        return buffer.toString();
    }
}
