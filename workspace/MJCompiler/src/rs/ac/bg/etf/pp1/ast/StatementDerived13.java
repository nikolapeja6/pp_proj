// generated with ast extension for cup
// version 0.8
// 26/0/2018 14:24:41


package rs.ac.bg.etf.pp1.ast;

public class StatementDerived13 extends Statement {

    private MultipleStatement MultipleStatement;

    public StatementDerived13 (MultipleStatement MultipleStatement) {
        this.MultipleStatement=MultipleStatement;
        if(MultipleStatement!=null) MultipleStatement.setParent(this);
    }

    public MultipleStatement getMultipleStatement() {
        return MultipleStatement;
    }

    public void setMultipleStatement(MultipleStatement MultipleStatement) {
        this.MultipleStatement=MultipleStatement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleStatement!=null) MultipleStatement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleStatement!=null) MultipleStatement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleStatement!=null) MultipleStatement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDerived13(\n");

        if(MultipleStatement!=null)
            buffer.append(MultipleStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDerived13]");
        return buffer.toString();
    }
}
