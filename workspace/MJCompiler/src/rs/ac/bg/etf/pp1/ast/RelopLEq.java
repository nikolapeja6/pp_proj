// generated with ast extension for cup
// version 0.8
// 18/2/2018 21:16:59


package rs.ac.bg.etf.pp1.ast;

public class RelopLEq extends Relop {

    public RelopLEq () {
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
        buffer.append("RelopLEq(\n");

        buffer.append(tab);
        buffer.append(") [RelopLEq]");
        return buffer.toString();
    }
}
