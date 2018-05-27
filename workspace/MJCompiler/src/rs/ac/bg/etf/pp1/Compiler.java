package rs.ac.bg.etf.pp1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java_cup.runtime.Symbol;
import jdk.nashorn.internal.runtime.GlobalFunctions;
import rs.ac.bg.etf.pp1.CounterVisitor.*;
import rs.ac.bg.etf.pp1.ast.SyntaxNode;
import rs.ac.bg.etf.pp1.util.Log4JUtils;
import rs.etf.pp1.mj.runtime.Code;
import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Struct;

public class Compiler {

	static {
		DOMConfigurator.configure(Log4JUtils.instance().findLoggerConfigFile());
		Log4JUtils.instance().prepareLogFile(Logger.getRootLogger());
	}
		
	public static void main(String[] args) throws Exception {
		Logger log = Logger.getLogger(Compiler.class);
		if (args.length < 2) {
			log.error("Not enough arguments supplied! Usage: MJParser <source-file> <obj-file> ");
			return;
		}
		
		File sourceCode = new File(args[0]);
		if (!sourceCode.exists()) {
			log.error("Source file [" + sourceCode.getAbsolutePath() + "] not found!");
			return;
		}
			
		log.info("Compiling source file: " + sourceCode.getAbsolutePath());
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceCode))) {
			Yylex lexer = new Yylex(br);
			MJParser p = new MJParser(lexer);
	        Symbol s = p.parse();  //pocetak parsiranja
	        SyntaxNode prog = (SyntaxNode)(s.value);
     
	        log.debug("***Abstract tree***");
	        log.debug("\n"+s.value.toString());

	        
			Tab.init(); // Universe scope
			Tab.insert(Obj.Type, "bool", Tab.intType);
			SemanticAnalyzer semanticCheck = new SemanticAnalyzer();
			prog.traverseBottomUp(semanticCheck);

			
	        log.debug(GlobalStuff.VirtualFunctions());
	        	  	        
	        // TODO
	        if (semanticCheck.passed()) {
	        	
	        	// Counters
				log.info("=========================   Counters   =========================");
				
				// classes
				ClassCounter classCounter = new ClassCounter();
				prog.traverseBottomUp(classCounter);
				log.info(classCounter.count + " classes found.");
				
				// Global functions in program.
				GlobalFunctionsCounter globalFunctionCounter = new GlobalFunctionsCounter();
				prog.traverseBottomUp(globalFunctionCounter);
				log.info(globalFunctionCounter.count + " global functions found.");
				
				// Global variables.
				GlobbalVarCounter globalVarCounter1 = new GlobbalVarCounter();
				prog.traverseBottomUp(globalVarCounter1);
				log.info(globalVarCounter1.count + " global variables found.");
				
				// Global constants.
				GlobalConstantCounter globalConstantCounter = new GlobalConstantCounter();
				prog.traverseBottomUp(globalConstantCounter);
				log.info(globalConstantCounter.count + " global constants found.");
				
				// Global array variables.
				GlobalArrayVariablesCounter globalArrayVariablesCounter = new GlobalArrayVariablesCounter();
				prog.traverseBottomUp(globalArrayVariablesCounter);
				log.info(globalArrayVariablesCounter.count + " global array variables found.");
		        
		        

		        tsdump();
	        	GlobbalVarCounter globalVarCounter = new GlobbalVarCounter();
	        	prog.traverseBottomUp(globalVarCounter);
	        	
	        	File objFile = new File(args[1]);
	        	log.info("Generating bytecode file: " + objFile.getAbsolutePath());
	        	if (objFile.exists())
	        		objFile.delete();
	        	
	        	// Code generation...
	        	CodeGenerator codeGenerator = new CodeGenerator();
	        	codeGenerator.staticVarCount = codeGenerator.totalStaticDataSize = globalVarCounter.count+1;
	        	GlobalStuff.vTableAddress = GlobalStuff.initialVTableAddress = globalVarCounter.count+1;
	        	prog.traverseBottomUp(codeGenerator);
	        	Code.dataSize = GlobalStuff.vTableAddress;//codeGenerator.totalStaticDataSize;//semanticCheck.nVars;
	        	Code.mainPc = codeGenerator.getMainPc();
	        	Code.write(new FileOutputStream(objFile));
	        	
	        	log.info("Finished code generation");
	        	tsdump();
		        log.debug(GlobalStuff.VirtualFunctions());
	        	log.info("SUCCESS!");
	        	
	        }
	        else {
	        	if(!semanticCheck.mainDetected){
	        		log.error("No main method detected.");
	        	}
	        	log.error("Compilation was UNSUCCESSFUL!");
	        }
		}catch(Exception e){
			e.printStackTrace();
			//Tab.dump();
	        //log.info(GlobalStuff.VirtualFunctions());
		}
	}
	
	public static void tsdump(){
		Tab.dump();
	}
}
