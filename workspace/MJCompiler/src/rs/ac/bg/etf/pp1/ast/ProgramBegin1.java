// generated with ast extension for cup
// version 0.8
// 22/1/2018 21:52:48


package rs.ac.bg.etf.pp1.ast;

public class ProgramBegin1 extends ProgramBegin {

    public ProgramBegin1 () {
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
        buffer.append("ProgramBegin1(\n");

        buffer.append(tab);
        buffer.append(") [ProgramBegin1]");
        return buffer.toString();
    }
}
