package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.ast.ClassDeclEnd1;
import rs.ac.bg.etf.pp1.ast.ConstDeclElement1;
import rs.ac.bg.etf.pp1.ast.DerivedClassBegin;
import rs.ac.bg.etf.pp1.ast.FormParsElementArray;
import rs.ac.bg.etf.pp1.ast.FormParsElementSingle;
import rs.ac.bg.etf.pp1.ast.MethodNameAndRetType1;
import rs.ac.bg.etf.pp1.ast.NewClassBegin;
import rs.ac.bg.etf.pp1.ast.PrintStatement;
import rs.ac.bg.etf.pp1.ast.PrintStatementComplex;
import rs.ac.bg.etf.pp1.ast.VarDecl;
import rs.ac.bg.etf.pp1.ast.VarDeclElement;
import rs.ac.bg.etf.pp1.ast.VarDeclElementArray;
import rs.ac.bg.etf.pp1.ast.VarDeclElementSingle;
import rs.ac.bg.etf.pp1.ast.VisitorAdaptor;
import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Struct;

public class CounterVisitor extends VisitorAdaptor {

	protected int count;

	public int getCount() {
		return count;
	}

	public static class FormParamCounter extends CounterVisitor {

		  public void visit(FormParsElementSingle formParamDecl1) {
		  count++; 
		  }
		  
		  public void visit(FormParsElementArray formParamDecl1) {
		  count++; 
		  }
		  
	}

	public static class VarCounter extends CounterVisitor {
		public void visit(VarDeclElementArray varDeclElementArray) {
			if (check(varDeclElementArray))
				count++;
		}

		public void visit(VarDeclElementSingle varDeclElementSingle) {
			if (check(varDeclElementSingle))
				count++;
		}

		public boolean check(VarDeclElement varDeclElement) {
			return true;
		}
	}

	public static class GlobbalVarCounter extends VarCounter {
		@Override
		public boolean check(VarDeclElement varDeclElement) {
			return varDeclElement.obj.getLevel() == 0;
		}
	}
	
	public static class PrintCounter extends CounterVisitor{
		public void visit(PrintStatementComplex node){
			count++;
		}
		
		public void visit(PrintStatement node){
			count++;
		}
	}
	
	public static class ClassCounter extends CounterVisitor{
		public void visit(DerivedClassBegin node){
			count++;
		}
		
		public void visit(NewClassBegin node){
			count++;
		}
	}
	
	public static class GlobalFunctionsCounter extends CounterVisitor{
		
		private boolean inClassDecl = false;
		
		public void visit(MethodNameAndRetType1 node){
			if(!inClassDecl){
				count++;
			}
		}
		
		public void visit(DerivedClassBegin node){
			inClassDecl = true;
		}
		
		public void visit(NewClassBegin node){
			inClassDecl = true;
		}
		
		public void visit(ClassDeclEnd1 classEnd){
			inClassDecl = false;
		}
	}

	public static class GlobalConstantCounter extends CounterVisitor{
		public void visit(ConstDeclElement1 node){
			count++;
		}
	}
	
	public static class GlobalArrayVariablesCounter extends CounterVisitor{
		public void visit(VarDeclElementArray node){
			count++;
		}
	}
}
