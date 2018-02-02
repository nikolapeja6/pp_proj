// generated with ast extension for cup
// version 0.8
// 2/1/2018 13:49:18


package rs.ac.bg.etf.pp1.ast;

public class ArrayElementDesignator extends Designator {

    private String array;
    private MultipleDesignatorElem MultipleDesignatorElem;

    public ArrayElementDesignator (String array, MultipleDesignatorElem MultipleDesignatorElem) {
        this.array=array;
        this.MultipleDesignatorElem=MultipleDesignatorElem;
        if(MultipleDesignatorElem!=null) MultipleDesignatorElem.setParent(this);
    }

    public String getArray() {
        return array;
    }

    public void setArray(String array) {
        this.array=array;
    }

    public MultipleDesignatorElem getMultipleDesignatorElem() {
        return MultipleDesignatorElem;
    }

    public void setMultipleDesignatorElem(MultipleDesignatorElem MultipleDesignatorElem) {
        this.MultipleDesignatorElem=MultipleDesignatorElem;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleDesignatorElem!=null) MultipleDesignatorElem.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleDesignatorElem!=null) MultipleDesignatorElem.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleDesignatorElem!=null) MultipleDesignatorElem.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ArrayElementDesignator(\n");

        buffer.append(" "+tab+array);
        buffer.append("\n");

        if(MultipleDesignatorElem!=null)
            buffer.append(MultipleDesignatorElem.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ArrayElementDesignator]");
        return buffer.toString();
    }
}
