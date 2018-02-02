// generated with ast extension for cup
// version 0.8
// 2/1/2018 13:49:18


package rs.ac.bg.etf.pp1.ast;

public class OptionalMultipleVarDeclDerived2 extends OptionalMultipleVarDecl {

    public OptionalMultipleVarDeclDerived2 () {
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
        buffer.append("OptionalMultipleVarDeclDerived2(\n");

        buffer.append(tab);
        buffer.append(") [OptionalMultipleVarDeclDerived2]");
        return buffer.toString();
    }
}
