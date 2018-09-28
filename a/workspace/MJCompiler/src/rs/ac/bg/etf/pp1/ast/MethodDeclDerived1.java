// generated with ast extension for cup
// version 0.8
// 27/4/2018 1:55:13


package rs.ac.bg.etf.pp1.ast;

public class MethodDeclDerived1 extends MethodDecl {

    private MethodNameAndRetType MethodNameAndRetType;
    private MethodBegin MethodBegin;
    private MultipleStatements MultipleStatements;
    private MethodEnd MethodEnd;

    public MethodDeclDerived1 (MethodNameAndRetType MethodNameAndRetType, MethodBegin MethodBegin, MultipleStatements MultipleStatements, MethodEnd MethodEnd) {
        this.MethodNameAndRetType=MethodNameAndRetType;
        if(MethodNameAndRetType!=null) MethodNameAndRetType.setParent(this);
        this.MethodBegin=MethodBegin;
        if(MethodBegin!=null) MethodBegin.setParent(this);
        this.MultipleStatements=MultipleStatements;
        if(MultipleStatements!=null) MultipleStatements.setParent(this);
        this.MethodEnd=MethodEnd;
        if(MethodEnd!=null) MethodEnd.setParent(this);
    }

    public MethodNameAndRetType getMethodNameAndRetType() {
        return MethodNameAndRetType;
    }

    public void setMethodNameAndRetType(MethodNameAndRetType MethodNameAndRetType) {
        this.MethodNameAndRetType=MethodNameAndRetType;
    }

    public MethodBegin getMethodBegin() {
        return MethodBegin;
    }

    public void setMethodBegin(MethodBegin MethodBegin) {
        this.MethodBegin=MethodBegin;
    }

    public MultipleStatements getMultipleStatements() {
        return MultipleStatements;
    }

    public void setMultipleStatements(MultipleStatements MultipleStatements) {
        this.MultipleStatements=MultipleStatements;
    }

    public MethodEnd getMethodEnd() {
        return MethodEnd;
    }

    public void setMethodEnd(MethodEnd MethodEnd) {
        this.MethodEnd=MethodEnd;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MethodNameAndRetType!=null) MethodNameAndRetType.accept(visitor);
        if(MethodBegin!=null) MethodBegin.accept(visitor);
        if(MultipleStatements!=null) MultipleStatements.accept(visitor);
        if(MethodEnd!=null) MethodEnd.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethodNameAndRetType!=null) MethodNameAndRetType.traverseTopDown(visitor);
        if(MethodBegin!=null) MethodBegin.traverseTopDown(visitor);
        if(MultipleStatements!=null) MultipleStatements.traverseTopDown(visitor);
        if(MethodEnd!=null) MethodEnd.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethodNameAndRetType!=null) MethodNameAndRetType.traverseBottomUp(visitor);
        if(MethodBegin!=null) MethodBegin.traverseBottomUp(visitor);
        if(MultipleStatements!=null) MultipleStatements.traverseBottomUp(visitor);
        if(MethodEnd!=null) MethodEnd.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodDeclDerived1(\n");

        if(MethodNameAndRetType!=null)
            buffer.append(MethodNameAndRetType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethodBegin!=null)
            buffer.append(MethodBegin.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleStatements!=null)
            buffer.append(MultipleStatements.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethodEnd!=null)
            buffer.append(MethodEnd.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodDeclDerived1]");
        return buffer.toString();
    }
}
