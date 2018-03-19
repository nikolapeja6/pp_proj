// generated with ast extension for cup
// version 0.8
// 18/2/2018 21:16:58


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStatementAssignment extends DesignatorStatement {

    private LValueDesignator LValueDesignator;
    private Expr Expr;

    public DesignatorStatementAssignment (LValueDesignator LValueDesignator, Expr Expr) {
        this.LValueDesignator=LValueDesignator;
        if(LValueDesignator!=null) LValueDesignator.setParent(this);
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
    }

    public LValueDesignator getLValueDesignator() {
        return LValueDesignator;
    }

    public void setLValueDesignator(LValueDesignator LValueDesignator) {
        this.LValueDesignator=LValueDesignator;
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(LValueDesignator!=null) LValueDesignator.accept(visitor);
        if(Expr!=null) Expr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(LValueDesignator!=null) LValueDesignator.traverseTopDown(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(LValueDesignator!=null) LValueDesignator.traverseBottomUp(visitor);
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStatementAssignment(\n");

        if(LValueDesignator!=null)
            buffer.append(LValueDesignator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStatementAssignment]");
        return buffer.toString();
    }
}
