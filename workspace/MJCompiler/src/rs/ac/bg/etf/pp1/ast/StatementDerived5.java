// generated with ast extension for cup
// version 0.8
// 26/0/2018 18:9:30


package rs.ac.bg.etf.pp1.ast;

public class StatementDerived5 extends Statement {

    private MultipleStatementHelper MultipleStatementHelper;

    public StatementDerived5 (MultipleStatementHelper MultipleStatementHelper) {
        this.MultipleStatementHelper=MultipleStatementHelper;
        if(MultipleStatementHelper!=null) MultipleStatementHelper.setParent(this);
    }

    public MultipleStatementHelper getMultipleStatementHelper() {
        return MultipleStatementHelper;
    }

    public void setMultipleStatementHelper(MultipleStatementHelper MultipleStatementHelper) {
        this.MultipleStatementHelper=MultipleStatementHelper;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleStatementHelper!=null) MultipleStatementHelper.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleStatementHelper!=null) MultipleStatementHelper.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleStatementHelper!=null) MultipleStatementHelper.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDerived5(\n");

        if(MultipleStatementHelper!=null)
            buffer.append(MultipleStatementHelper.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDerived5]");
        return buffer.toString();
    }
}
