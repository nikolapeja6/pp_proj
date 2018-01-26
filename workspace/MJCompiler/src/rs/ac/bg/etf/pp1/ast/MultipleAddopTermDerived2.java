// generated with ast extension for cup
// version 0.8
// 26/0/2018 18:9:30


package rs.ac.bg.etf.pp1.ast;

public class MultipleAddopTermDerived2 extends MultipleAddopTerm {

    public MultipleAddopTermDerived2 () {
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
        buffer.append("MultipleAddopTermDerived2(\n");

        buffer.append(tab);
        buffer.append(") [MultipleAddopTermDerived2]");
        return buffer.toString();
    }
}
