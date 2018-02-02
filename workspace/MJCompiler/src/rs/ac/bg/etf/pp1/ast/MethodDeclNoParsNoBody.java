// generated with ast extension for cup
// version 0.8
// 2/1/2018 13:49:18


package rs.ac.bg.etf.pp1.ast;

public class MethodDeclNoParsNoBody extends MethodDecl {

    private ReturnType ReturnType;
    private String ident;
    private OptionalMultipleVarDecl OptionalMultipleVarDecl;

    public MethodDeclNoParsNoBody (ReturnType ReturnType, String ident, OptionalMultipleVarDecl OptionalMultipleVarDecl) {
        this.ReturnType=ReturnType;
        if(ReturnType!=null) ReturnType.setParent(this);
        this.ident=ident;
        this.OptionalMultipleVarDecl=OptionalMultipleVarDecl;
        if(OptionalMultipleVarDecl!=null) OptionalMultipleVarDecl.setParent(this);
    }

    public ReturnType getReturnType() {
        return ReturnType;
    }

    public void setReturnType(ReturnType ReturnType) {
        this.ReturnType=ReturnType;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident=ident;
    }

    public OptionalMultipleVarDecl getOptionalMultipleVarDecl() {
        return OptionalMultipleVarDecl;
    }

    public void setOptionalMultipleVarDecl(OptionalMultipleVarDecl OptionalMultipleVarDecl) {
        this.OptionalMultipleVarDecl=OptionalMultipleVarDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ReturnType!=null) ReturnType.accept(visitor);
        if(OptionalMultipleVarDecl!=null) OptionalMultipleVarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ReturnType!=null) ReturnType.traverseTopDown(visitor);
        if(OptionalMultipleVarDecl!=null) OptionalMultipleVarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ReturnType!=null) ReturnType.traverseBottomUp(visitor);
        if(OptionalMultipleVarDecl!=null) OptionalMultipleVarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodDeclNoParsNoBody(\n");

        if(ReturnType!=null)
            buffer.append(ReturnType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+ident);
        buffer.append("\n");

        if(OptionalMultipleVarDecl!=null)
            buffer.append(OptionalMultipleVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodDeclNoParsNoBody]");
        return buffer.toString();
    }
}
