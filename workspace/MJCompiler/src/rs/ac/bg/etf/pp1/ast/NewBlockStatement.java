// generated with ast extension for cup
// version 0.8
// 2/1/2018 14:8:1


package rs.ac.bg.etf.pp1.ast;

public class NewBlockStatement extends Statement {

    private MultipleStatementHelper MultipleStatementHelper;

    public NewBlockStatement (MultipleStatementHelper MultipleStatementHelper) {
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
        buffer.append("NewBlockStatement(\n");

        if(MultipleStatementHelper!=null)
            buffer.append(MultipleStatementHelper.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [NewBlockStatement]");
        return buffer.toString();
    }
}
