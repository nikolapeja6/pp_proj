// generated with ast extension for cup
// version 0.8
// 2/1/2018 14:8:1


package rs.ac.bg.etf.pp1.ast;

public class MultipleStatementHelperDerived1 extends MultipleStatementHelper {

    private MultipleStatementHelper MultipleStatementHelper;
    private Statement Statement;

    public MultipleStatementHelperDerived1 (MultipleStatementHelper MultipleStatementHelper, Statement Statement) {
        this.MultipleStatementHelper=MultipleStatementHelper;
        if(MultipleStatementHelper!=null) MultipleStatementHelper.setParent(this);
        this.Statement=Statement;
        if(Statement!=null) Statement.setParent(this);
    }

    public MultipleStatementHelper getMultipleStatementHelper() {
        return MultipleStatementHelper;
    }

    public void setMultipleStatementHelper(MultipleStatementHelper MultipleStatementHelper) {
        this.MultipleStatementHelper=MultipleStatementHelper;
    }

    public Statement getStatement() {
        return Statement;
    }

    public void setStatement(Statement Statement) {
        this.Statement=Statement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleStatementHelper!=null) MultipleStatementHelper.accept(visitor);
        if(Statement!=null) Statement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleStatementHelper!=null) MultipleStatementHelper.traverseTopDown(visitor);
        if(Statement!=null) Statement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleStatementHelper!=null) MultipleStatementHelper.traverseBottomUp(visitor);
        if(Statement!=null) Statement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleStatementHelperDerived1(\n");

        if(MultipleStatementHelper!=null)
            buffer.append(MultipleStatementHelper.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Statement!=null)
            buffer.append(Statement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleStatementHelperDerived1]");
        return buffer.toString();
    }
}
