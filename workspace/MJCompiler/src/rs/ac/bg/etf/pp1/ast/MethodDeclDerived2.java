// generated with ast extension for cup
// version 0.8
// 26/0/2018 18:9:30


package rs.ac.bg.etf.pp1.ast;

public class MethodDeclDerived2 extends MethodDecl {

    private ReturnType ReturnType;
    private String I2;
    private FormalPars FormalPars;
    private MultipleVarDecl MultipleVarDecl;
    private MultipleStatement MultipleStatement;

    public MethodDeclDerived2 (ReturnType ReturnType, String I2, FormalPars FormalPars, MultipleVarDecl MultipleVarDecl, MultipleStatement MultipleStatement) {
        this.ReturnType=ReturnType;
        if(ReturnType!=null) ReturnType.setParent(this);
        this.I2=I2;
        this.FormalPars=FormalPars;
        if(FormalPars!=null) FormalPars.setParent(this);
        this.MultipleVarDecl=MultipleVarDecl;
        if(MultipleVarDecl!=null) MultipleVarDecl.setParent(this);
        this.MultipleStatement=MultipleStatement;
        if(MultipleStatement!=null) MultipleStatement.setParent(this);
    }

    public ReturnType getReturnType() {
        return ReturnType;
    }

    public void setReturnType(ReturnType ReturnType) {
        this.ReturnType=ReturnType;
    }

    public String getI2() {
        return I2;
    }

    public void setI2(String I2) {
        this.I2=I2;
    }

    public FormalPars getFormalPars() {
        return FormalPars;
    }

    public void setFormalPars(FormalPars FormalPars) {
        this.FormalPars=FormalPars;
    }

    public MultipleVarDecl getMultipleVarDecl() {
        return MultipleVarDecl;
    }

    public void setMultipleVarDecl(MultipleVarDecl MultipleVarDecl) {
        this.MultipleVarDecl=MultipleVarDecl;
    }

    public MultipleStatement getMultipleStatement() {
        return MultipleStatement;
    }

    public void setMultipleStatement(MultipleStatement MultipleStatement) {
        this.MultipleStatement=MultipleStatement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ReturnType!=null) ReturnType.accept(visitor);
        if(FormalPars!=null) FormalPars.accept(visitor);
        if(MultipleVarDecl!=null) MultipleVarDecl.accept(visitor);
        if(MultipleStatement!=null) MultipleStatement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ReturnType!=null) ReturnType.traverseTopDown(visitor);
        if(FormalPars!=null) FormalPars.traverseTopDown(visitor);
        if(MultipleVarDecl!=null) MultipleVarDecl.traverseTopDown(visitor);
        if(MultipleStatement!=null) MultipleStatement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ReturnType!=null) ReturnType.traverseBottomUp(visitor);
        if(FormalPars!=null) FormalPars.traverseBottomUp(visitor);
        if(MultipleVarDecl!=null) MultipleVarDecl.traverseBottomUp(visitor);
        if(MultipleStatement!=null) MultipleStatement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodDeclDerived2(\n");

        if(ReturnType!=null)
            buffer.append(ReturnType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        if(FormalPars!=null)
            buffer.append(FormalPars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleVarDecl!=null)
            buffer.append(MultipleVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleStatement!=null)
            buffer.append(MultipleStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodDeclDerived2]");
        return buffer.toString();
    }
}
