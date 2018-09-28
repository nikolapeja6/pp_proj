// generated with ast extension for cup
// version 0.8
// 18/2/2018 21:16:58


package rs.ac.bg.etf.pp1.ast;

public class FormParsDerived1 extends FormPars {

    private FormPars FormPars;
    private FormParsElement FormParsElement;

    public FormParsDerived1 (FormPars FormPars, FormParsElement FormParsElement) {
        this.FormPars=FormPars;
        if(FormPars!=null) FormPars.setParent(this);
        this.FormParsElement=FormParsElement;
        if(FormParsElement!=null) FormParsElement.setParent(this);
    }

    public FormPars getFormPars() {
        return FormPars;
    }

    public void setFormPars(FormPars FormPars) {
        this.FormPars=FormPars;
    }

    public FormParsElement getFormParsElement() {
        return FormParsElement;
    }

    public void setFormParsElement(FormParsElement FormParsElement) {
        this.FormParsElement=FormParsElement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(FormPars!=null) FormPars.accept(visitor);
        if(FormParsElement!=null) FormParsElement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FormPars!=null) FormPars.traverseTopDown(visitor);
        if(FormParsElement!=null) FormParsElement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FormPars!=null) FormPars.traverseBottomUp(visitor);
        if(FormParsElement!=null) FormParsElement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormParsDerived1(\n");

        if(FormPars!=null)
            buffer.append(FormPars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(FormParsElement!=null)
            buffer.append(FormParsElement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormParsDerived1]");
        return buffer.toString();
    }
}
