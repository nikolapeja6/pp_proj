// generated with ast extension for cup
// version 0.8
// 27/4/2018 1:55:13


package rs.ac.bg.etf.pp1.ast;

public class RelopLs extends Relop {

    public RelopLs () {
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
        buffer.append("RelopLs(\n");

        buffer.append(tab);
        buffer.append(") [RelopLs]");
        return buffer.toString();
    }
}
