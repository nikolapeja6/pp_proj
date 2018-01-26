// generated with ast extension for cup
// version 0.8
// 26/0/2018 18:9:29


package rs.ac.bg.etf.pp1.ast;

public class DeclAssignmenListDerived2 extends DeclAssignmenList {

    private DeclAssignmenList DeclAssignmenList;
    private String I2;
    private Literal Literal;

    public DeclAssignmenListDerived2 (DeclAssignmenList DeclAssignmenList, String I2, Literal Literal) {
        this.DeclAssignmenList=DeclAssignmenList;
        if(DeclAssignmenList!=null) DeclAssignmenList.setParent(this);
        this.I2=I2;
        this.Literal=Literal;
        if(Literal!=null) Literal.setParent(this);
    }

    public DeclAssignmenList getDeclAssignmenList() {
        return DeclAssignmenList;
    }

    public void setDeclAssignmenList(DeclAssignmenList DeclAssignmenList) {
        this.DeclAssignmenList=DeclAssignmenList;
    }

    public String getI2() {
        return I2;
    }

    public void setI2(String I2) {
        this.I2=I2;
    }

    public Literal getLiteral() {
        return Literal;
    }

    public void setLiteral(Literal Literal) {
        this.Literal=Literal;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DeclAssignmenList!=null) DeclAssignmenList.accept(visitor);
        if(Literal!=null) Literal.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DeclAssignmenList!=null) DeclAssignmenList.traverseTopDown(visitor);
        if(Literal!=null) Literal.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DeclAssignmenList!=null) DeclAssignmenList.traverseBottomUp(visitor);
        if(Literal!=null) Literal.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DeclAssignmenListDerived2(\n");

        if(DeclAssignmenList!=null)
            buffer.append(DeclAssignmenList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        if(Literal!=null)
            buffer.append(Literal.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DeclAssignmenListDerived2]");
        return buffer.toString();
    }
}
