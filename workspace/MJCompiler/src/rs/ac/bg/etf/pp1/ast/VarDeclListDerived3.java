// generated with ast extension for cup
// version 0.8
// 26/4/2018 21:56:49


package rs.ac.bg.etf.pp1.ast;

public class VarDeclListDerived3 extends VarDeclList {

    public VarDeclListDerived3 () {
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
        buffer.append("VarDeclListDerived3(\n");

        buffer.append(tab);
        buffer.append(") [VarDeclListDerived3]");
        return buffer.toString();
    }
}
