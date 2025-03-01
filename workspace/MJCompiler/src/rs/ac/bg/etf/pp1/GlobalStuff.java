package rs.ac.bg.etf.pp1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Struct;

public class GlobalStuff {
	
	public static int vTableAddress;
	public static int initialVTableAddress;
	
	static LinkedHashMap<String, LinkedList<Function>> virtualFunctionStack = new LinkedHashMap<>();
	
	public static HashMap<String, Obj> classTypeObjects = new HashMap<>();
	
	public static HashMap<String, LinkedList<String>> areDerivedFromClasses = new HashMap<>();
	
	public static HashMap<Struct, LinkedList<Struct>> baseClassesFor = new HashMap<>();
	
	public static void AddClass(String className)
	{
		virtualFunctionStack.put(className, new LinkedList<>());
	}
	
	public static void AddFunction(String className, String functionName)
	{
		LinkedList<Function> list = virtualFunctionStack.get(className);
		
		assert(list != null);
		
		for(int i =0; i < list.size(); ){
			Function f = list.get(i);
			if(f.name.equals(functionName)){
				list.remove(f);
			}
			else{
				i++;
			}
		}
		list.add(new Function(functionName));		
	}
	
	public static String VirtualFunctions(){
		StringBuilder sb = new StringBuilder();
		
		Iterator it = virtualFunctionStack.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        
	        sb.append(((String)pair.getKey()) + "\n\t");
	        
	        LinkedList<Function> list = GetFunctions((String) pair.getKey());
	        for(Function f: list)
	        {
	        	sb.append(f.toString() + "; " );
	        }
	        
	        sb.append("\n");
	    }
	    
	    return sb.toString();
	}
	
	public static void UpdateAddressOfFunction(String className, String functionName, long address){
		
		LinkedList<Function> list = GetFunctions(className);
		for(int i =0; i< list.size(); i++)
		{
			Function f = list.get(i);
			if(f.name.equals(functionName)){
				f.adr = address;
				break;
			}
		}
		
		LinkedList<String> derived = areDerivedFromClasses.get(className);
		if(derived == null || derived.size() == 0){
			return;
		}
		
		for(String derivedClassName: derived){
			UpdateAddressOfFunction(derivedClassName, functionName, address);
		}
	}
	
	public static Integer[] GetVTablesInitializationValues(){
		ArrayList<Integer> ret = new ArrayList<>();
		
		Iterator it = virtualFunctionStack.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        
	        LinkedList<Function> list = GetFunctions((String) pair.getKey());
	        for(Function f: list)
	        {
	        	for(int i =0; i< f.name.length(); i++)
	        		ret.add((int) f.name.charAt(i));
	        	ret.add(-1);
	        	ret.add((int) f.adr);
	        }
	        
	        ret.add(-2);
	    }
	    
	    return ret.toArray(new Integer[ret.size()]);
	}
	
	public static long CalculateVTableSize(String className){
		LinkedList<Function> list = GetFunctions(className);
		
		long ret = 0;
		for(Function f : list)
		{
			ret+=f.name.length() + 1 + 1;
		}
		
		ret+=1;
		
		return ret;
	}
	
	public static void UpdateVTableAddress(String className)
	{
		vTableAddress+=CalculateVTableSize(className);
	}
	
	private static LinkedList<Function> GetFunctions(String classNme){
		return virtualFunctionStack.get(classNme);
	}
	
	public static void main(String [] args){
		AddClass("aaa");
		AddFunction("aaa", "fun_a");
		AddClass("bbb");
		AddFunction("bbb", "fun_b");
		
		System.out.println("aaa functions: ");
		for(Function f: GetFunctions("aaa"))
			System.out.print(f.name + "; ");
		
		System.out.println();
		System.out.println();
		
		System.out.println("bbb functions: ");
		for(Function f: GetFunctions("bbb"))
			System.out.print(f.name + "; ");
		
		
	}
	
}

class Function{
	public String name;
	public long adr;
	
	public Function(){}
	public Function(String _name){name = _name;}
	public Function(String _name, long _adr){name = _name; adr = _adr;}
	
	public String toString(){return name + "("+adr+")";}
}
