// generated with ast extension for cup
// version 0.8
// 27/4/2018 21:28:50


package rs.ac.bg.etf.pp1.ast;

public class MatchedDerived2 extends Matched {

    public MatchedDerived2 () {
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
        buffer.append("MatchedDerived2(\n");

        buffer.append(tab);
        buffer.append(") [MatchedDerived2]");
        return buffer.toString();
    }
}
