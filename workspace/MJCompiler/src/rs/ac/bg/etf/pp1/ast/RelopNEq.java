// generated with ast extension for cup
// version 0.8
// 28/1/2018 0:28:27


package rs.ac.bg.etf.pp1.ast;

public class RelopNEq extends Relop {

    public RelopNEq () {
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
        buffer.append("RelopNEq(\n");

        buffer.append(tab);
        buffer.append(") [RelopNEq]");
        return buffer.toString();
    }
}
