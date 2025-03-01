// generated with ast extension for cup
// version 0.8
// 18/2/2018 21:16:58


package rs.ac.bg.etf.pp1.ast;

public class Program1 extends Program {

    private ProgramName ProgramName;
    private ProgramBegin ProgramBegin;
    private MultipleMethodDecl MultipleMethodDecl;
    private ProgramEnd ProgramEnd;

    public Program1 (ProgramName ProgramName, ProgramBegin ProgramBegin, MultipleMethodDecl MultipleMethodDecl, ProgramEnd ProgramEnd) {
        this.ProgramName=ProgramName;
        if(ProgramName!=null) ProgramName.setParent(this);
        this.ProgramBegin=ProgramBegin;
        if(ProgramBegin!=null) ProgramBegin.setParent(this);
        this.MultipleMethodDecl=MultipleMethodDecl;
        if(MultipleMethodDecl!=null) MultipleMethodDecl.setParent(this);
        this.ProgramEnd=ProgramEnd;
        if(ProgramEnd!=null) ProgramEnd.setParent(this);
    }

    public ProgramName getProgramName() {
        return ProgramName;
    }

    public void setProgramName(ProgramName ProgramName) {
        this.ProgramName=ProgramName;
    }

    public ProgramBegin getProgramBegin() {
        return ProgramBegin;
    }

    public void setProgramBegin(ProgramBegin ProgramBegin) {
        this.ProgramBegin=ProgramBegin;
    }

    public MultipleMethodDecl getMultipleMethodDecl() {
        return MultipleMethodDecl;
    }

    public void setMultipleMethodDecl(MultipleMethodDecl MultipleMethodDecl) {
        this.MultipleMethodDecl=MultipleMethodDecl;
    }

    public ProgramEnd getProgramEnd() {
        return ProgramEnd;
    }

    public void setProgramEnd(ProgramEnd ProgramEnd) {
        this.ProgramEnd=ProgramEnd;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ProgramName!=null) ProgramName.accept(visitor);
        if(ProgramBegin!=null) ProgramBegin.accept(visitor);
        if(MultipleMethodDecl!=null) MultipleMethodDecl.accept(visitor);
        if(ProgramEnd!=null) ProgramEnd.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ProgramName!=null) ProgramName.traverseTopDown(visitor);
        if(ProgramBegin!=null) ProgramBegin.traverseTopDown(visitor);
        if(MultipleMethodDecl!=null) MultipleMethodDecl.traverseTopDown(visitor);
        if(ProgramEnd!=null) ProgramEnd.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ProgramName!=null) ProgramName.traverseBottomUp(visitor);
        if(ProgramBegin!=null) ProgramBegin.traverseBottomUp(visitor);
        if(MultipleMethodDecl!=null) MultipleMethodDecl.traverseBottomUp(visitor);
        if(ProgramEnd!=null) ProgramEnd.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Program1(\n");

        if(ProgramName!=null)
            buffer.append(ProgramName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ProgramBegin!=null)
            buffer.append(ProgramBegin.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleMethodDecl!=null)
            buffer.append(MultipleMethodDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ProgramEnd!=null)
            buffer.append(ProgramEnd.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Program1]");
        return buffer.toString();
    }
}
