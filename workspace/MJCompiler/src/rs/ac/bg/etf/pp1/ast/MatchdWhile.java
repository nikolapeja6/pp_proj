// generated with ast extension for cup
// version 0.8
// 26/1/2018 2:9:24


package rs.ac.bg.etf.pp1.ast;

public class MatchdWhile extends Matched {

    private DoWhileBegin DoWhileBegin;
    private Statement Statement;
    private ConditionWhile ConditionWhile;

    public MatchdWhile (DoWhileBegin DoWhileBegin, Statement Statement, ConditionWhile ConditionWhile) {
        this.DoWhileBegin=DoWhileBegin;
        if(DoWhileBegin!=null) DoWhileBegin.setParent(this);
        this.Statement=Statement;
        if(Statement!=null) Statement.setParent(this);
        this.ConditionWhile=ConditionWhile;
        if(ConditionWhile!=null) ConditionWhile.setParent(this);
    }

    public DoWhileBegin getDoWhileBegin() {
        return DoWhileBegin;
    }

    public void setDoWhileBegin(DoWhileBegin DoWhileBegin) {
        this.DoWhileBegin=DoWhileBegin;
    }

    public Statement getStatement() {
        return Statement;
    }

    public void setStatement(Statement Statement) {
        this.Statement=Statement;
    }

    public ConditionWhile getConditionWhile() {
        return ConditionWhile;
    }

    public void setConditionWhile(ConditionWhile ConditionWhile) {
        this.ConditionWhile=ConditionWhile;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DoWhileBegin!=null) DoWhileBegin.accept(visitor);
        if(Statement!=null) Statement.accept(visitor);
        if(ConditionWhile!=null) ConditionWhile.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DoWhileBegin!=null) DoWhileBegin.traverseTopDown(visitor);
        if(Statement!=null) Statement.traverseTopDown(visitor);
        if(ConditionWhile!=null) ConditionWhile.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DoWhileBegin!=null) DoWhileBegin.traverseBottomUp(visitor);
        if(Statement!=null) Statement.traverseBottomUp(visitor);
        if(ConditionWhile!=null) ConditionWhile.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MatchdWhile(\n");

        if(DoWhileBegin!=null)
            buffer.append(DoWhileBegin.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Statement!=null)
            buffer.append(Statement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConditionWhile!=null)
            buffer.append(ConditionWhile.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MatchdWhile]");
        return buffer.toString();
    }
}
