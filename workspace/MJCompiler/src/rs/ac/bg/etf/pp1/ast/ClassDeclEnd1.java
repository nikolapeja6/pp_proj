// generated with ast extension for cup
// version 0.8
// 28/1/2018 0:28:26


package rs.ac.bg.etf.pp1.ast;

public class ClassDeclEnd1 extends ClassDeclEnd {

    public ClassDeclEnd1 () {
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
        buffer.append("ClassDeclEnd1(\n");

        buffer.append(tab);
        buffer.append(") [ClassDeclEnd1]");
        return buffer.toString();
    }
}
