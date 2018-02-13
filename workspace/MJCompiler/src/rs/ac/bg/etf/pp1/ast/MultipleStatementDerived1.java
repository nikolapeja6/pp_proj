// generated with ast extension for cup
// version 0.8
// 2/1/2018 14:8:1


package rs.ac.bg.etf.pp1.ast;

public class MultipleStatementDerived1 extends MultipleStatement {

    private MultipleStatement MultipleStatement;
    private Statement Statement;

    public MultipleStatementDerived1 (MultipleStatement MultipleStatement, Statement Statement) {
        this.MultipleStatement=MultipleStatement;
        if(MultipleStatement!=null) MultipleStatement.setParent(this);
        this.Statement=Statement;
        if(Statement!=null) Statement.setParent(this);
    }

    public MultipleStatement getMultipleStatement() {
        return MultipleStatement;
    }

    public void setMultipleStatement(MultipleStatement MultipleStatement) {
        this.MultipleStatement=MultipleStatement;
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
        if(MultipleStatement!=null) MultipleStatement.accept(visitor);
        if(Statement!=null) Statement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleStatement!=null) MultipleStatement.traverseTopDown(visitor);
        if(Statement!=null) Statement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleStatement!=null) MultipleStatement.traverseBottomUp(visitor);
        if(Statement!=null) Statement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleStatementDerived1(\n");

        if(MultipleStatement!=null)
            buffer.append(MultipleStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Statement!=null)
            buffer.append(Statement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleStatementDerived1]");
        return buffer.toString();
    }
}
