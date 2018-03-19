// generated with ast extension for cup
// version 0.8
// 18/2/2018 21:16:58


package rs.ac.bg.etf.pp1.ast;

public class MatchedIf extends Matched {

    private Condition Condition;
    private MatchedThen MatchedThen;
    private Matched Matched;

    public MatchedIf (Condition Condition, MatchedThen MatchedThen, Matched Matched) {
        this.Condition=Condition;
        if(Condition!=null) Condition.setParent(this);
        this.MatchedThen=MatchedThen;
        if(MatchedThen!=null) MatchedThen.setParent(this);
        this.Matched=Matched;
        if(Matched!=null) Matched.setParent(this);
    }

    public Condition getCondition() {
        return Condition;
    }

    public void setCondition(Condition Condition) {
        this.Condition=Condition;
    }

    public MatchedThen getMatchedThen() {
        return MatchedThen;
    }

    public void setMatchedThen(MatchedThen MatchedThen) {
        this.MatchedThen=MatchedThen;
    }

    public Matched getMatched() {
        return Matched;
    }

    public void setMatched(Matched Matched) {
        this.Matched=Matched;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Condition!=null) Condition.accept(visitor);
        if(MatchedThen!=null) MatchedThen.accept(visitor);
        if(Matched!=null) Matched.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Condition!=null) Condition.traverseTopDown(visitor);
        if(MatchedThen!=null) MatchedThen.traverseTopDown(visitor);
        if(Matched!=null) Matched.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Condition!=null) Condition.traverseBottomUp(visitor);
        if(MatchedThen!=null) MatchedThen.traverseBottomUp(visitor);
        if(Matched!=null) Matched.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MatchedIf(\n");

        if(Condition!=null)
            buffer.append(Condition.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MatchedThen!=null)
            buffer.append(MatchedThen.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Matched!=null)
            buffer.append(Matched.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MatchedIf]");
        return buffer.toString();
    }
}
