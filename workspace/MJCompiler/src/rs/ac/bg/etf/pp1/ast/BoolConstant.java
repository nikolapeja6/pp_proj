// generated with ast extension for cup
// version 0.8
// 23/1/2018 2:3:45


package rs.ac.bg.etf.pp1.ast;

public class BoolConstant extends Constant {

    private String bl;

    public BoolConstant (String bl) {
        this.bl=bl;
    }

    public String getBl() {
        return bl;
    }

    public void setBl(String bl) {
        this.bl=bl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("BoolConstant(\n");

        buffer.append(" "+tab+bl);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [BoolConstant]");
        return buffer.toString();
    }
}
