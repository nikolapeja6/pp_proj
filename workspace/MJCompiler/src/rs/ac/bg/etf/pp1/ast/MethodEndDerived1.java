// generated with ast extension for cup
// version 0.8
// 18/1/2018 4:50:12


package rs.ac.bg.etf.pp1.ast;

public class MethodEndDerived1 extends MethodEnd {

    public MethodEndDerived1 () {
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
        buffer.append("MethodEndDerived1(\n");

        buffer.append(tab);
        buffer.append(") [MethodEndDerived1]");
        return buffer.toString();
    }
}
