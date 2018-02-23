// generated with ast extension for cup
// version 0.8
// 23/1/2018 1:15:37


package rs.ac.bg.etf.pp1.ast;

public class NumberConstant extends Constant {

    private Integer number;

    public NumberConstant (Integer number) {
        this.number=number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number=number;
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
        buffer.append("NumberConstant(\n");

        buffer.append(" "+tab+number);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [NumberConstant]");
        return buffer.toString();
    }
}
