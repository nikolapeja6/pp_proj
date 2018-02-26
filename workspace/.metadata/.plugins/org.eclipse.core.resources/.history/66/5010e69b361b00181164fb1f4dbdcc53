package rs.ac.bg.etf.pp1;

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

		// TODO
		/*
		 * @Override public void visit(FormalParamDecl formParamDecl1) {
		 * count++; }
		 */
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
}
