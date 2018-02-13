// generated with ast extension for cup
// version 0.8
// 2/1/2018 14:8:1


package rs.ac.bg.etf.pp1.ast;

public class DeclAssignElem extends DeclAssignElement {

    private String name;
    private Literal Literal;

    public DeclAssignElem (String name, Literal Literal) {
        this.name=name;
        this.Literal=Literal;
        if(Literal!=null) Literal.setParent(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
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
        if(Literal!=null) Literal.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Literal!=null) Literal.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Literal!=null) Literal.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DeclAssignElem(\n");

        buffer.append(" "+tab+name);
        buffer.append("\n");

        if(Literal!=null)
            buffer.append(Literal.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DeclAssignElem]");
        return buffer.toString();
    }
}
