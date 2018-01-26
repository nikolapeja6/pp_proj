// generated with ast extension for cup
// version 0.8
// 26/0/2018 18:9:30


package rs.ac.bg.etf.pp1.ast;

public class StatementDerived1 extends Statement {

    private TerminalStatement TerminalStatement;

    public StatementDerived1 (TerminalStatement TerminalStatement) {
        this.TerminalStatement=TerminalStatement;
        if(TerminalStatement!=null) TerminalStatement.setParent(this);
    }

    public TerminalStatement getTerminalStatement() {
        return TerminalStatement;
    }

    public void setTerminalStatement(TerminalStatement TerminalStatement) {
        this.TerminalStatement=TerminalStatement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(TerminalStatement!=null) TerminalStatement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(TerminalStatement!=null) TerminalStatement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(TerminalStatement!=null) TerminalStatement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDerived1(\n");

        if(TerminalStatement!=null)
            buffer.append(TerminalStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDerived1]");
        return buffer.toString();
    }
}
