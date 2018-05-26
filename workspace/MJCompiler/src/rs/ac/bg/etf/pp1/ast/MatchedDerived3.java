// generated with ast extension for cup
// version 0.8
// 26/4/2018 22:4:40


package rs.ac.bg.etf.pp1.ast;

public class MatchedDerived3 extends Matched {

    private MultipleStatements MultipleStatements;

    public MatchedDerived3 (MultipleStatements MultipleStatements) {
        this.MultipleStatements=MultipleStatements;
        if(MultipleStatements!=null) MultipleStatements.setParent(this);
    }

    public MultipleStatements getMultipleStatements() {
        return MultipleStatements;
    }

    public void setMultipleStatements(MultipleStatements MultipleStatements) {
        this.MultipleStatements=MultipleStatements;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleStatements!=null) MultipleStatements.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleStatements!=null) MultipleStatements.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleStatements!=null) MultipleStatements.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MatchedDerived3(\n");

        if(MultipleStatements!=null)
            buffer.append(MultipleStatements.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MatchedDerived3]");
        return buffer.toString();
    }
}
