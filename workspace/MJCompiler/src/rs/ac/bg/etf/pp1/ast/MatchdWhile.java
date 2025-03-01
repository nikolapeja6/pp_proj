// generated with ast extension for cup
// version 0.8
// 18/2/2018 21:16:58


package rs.ac.bg.etf.pp1.ast;

public class MatchdWhile extends Matched {

    private DoWhileBegin DoWhileBegin;
    private StatementWhile StatementWhile;
    private ConditionWhile ConditionWhile;

    public MatchdWhile (DoWhileBegin DoWhileBegin, StatementWhile StatementWhile, ConditionWhile ConditionWhile) {
        this.DoWhileBegin=DoWhileBegin;
        if(DoWhileBegin!=null) DoWhileBegin.setParent(this);
        this.StatementWhile=StatementWhile;
        if(StatementWhile!=null) StatementWhile.setParent(this);
        this.ConditionWhile=ConditionWhile;
        if(ConditionWhile!=null) ConditionWhile.setParent(this);
    }

    public DoWhileBegin getDoWhileBegin() {
        return DoWhileBegin;
    }

    public void setDoWhileBegin(DoWhileBegin DoWhileBegin) {
        this.DoWhileBegin=DoWhileBegin;
    }

    public StatementWhile getStatementWhile() {
        return StatementWhile;
    }

    public void setStatementWhile(StatementWhile StatementWhile) {
        this.StatementWhile=StatementWhile;
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
        if(StatementWhile!=null) StatementWhile.accept(visitor);
        if(ConditionWhile!=null) ConditionWhile.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DoWhileBegin!=null) DoWhileBegin.traverseTopDown(visitor);
        if(StatementWhile!=null) StatementWhile.traverseTopDown(visitor);
        if(ConditionWhile!=null) ConditionWhile.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DoWhileBegin!=null) DoWhileBegin.traverseBottomUp(visitor);
        if(StatementWhile!=null) StatementWhile.traverseBottomUp(visitor);
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

        if(StatementWhile!=null)
            buffer.append(StatementWhile.toString("  "+tab));
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
