// generated with ast extension for cup
// version 0.8
// 26/1/2018 22:20:40


package rs.ac.bg.etf.pp1.ast;

public class ProgramEnd1 extends ProgramEnd {

    public ProgramEnd1 () {
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
        buffer.append("ProgramEnd1(\n");

        buffer.append(tab);
        buffer.append(") [ProgramEnd1]");
        return buffer.toString();
    }
}
