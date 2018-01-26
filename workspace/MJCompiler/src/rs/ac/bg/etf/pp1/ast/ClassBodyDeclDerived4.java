// generated with ast extension for cup
// version 0.8
// 26/0/2018 14:24:41


package rs.ac.bg.etf.pp1.ast;

public class ClassBodyDeclDerived4 extends ClassBodyDecl {

    public ClassBodyDeclDerived4 () {
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
        buffer.append("ClassBodyDeclDerived4(\n");

        buffer.append(tab);
        buffer.append(") [ClassBodyDeclDerived4]");
        return buffer.toString();
    }
}
