package rs.ac.bg.etf.pp1;

import java_cup.runtime.Symbol;
import org.apache.log4j.*;

%%

%{
	private Symbol new_symbol(int type){
		return new Symbol(type, yyline+1, yycolumn);
	}
	
	private Symbol new_symbol(int type, Object value){
		return new Symbol(type, yyline+1, yycolumn, value);
	}
	
%}

%cup
%line
%column


%xstate COMMENT


%eofval{
	return new_symbol(sym.EOF);
%eofval}

%%

" "			{ }
"\b"		{ }
"\t"		{ }
"\r\n"		{ }
"\f"		{ }

 "program" 	{return new_symbol(sym.PROG, yytext());}
 "break"	{return new_symbol(sym.BREAK, yytext());}
 "class"	{return new_symbol(sym.CLASS, yytext());}
 "else"		{return new_symbol(sym.ELSE, yytext());}
 "if"		{return new_symbol(sym.IF, yytext());}
 "new"		{return new_symbol(sym.NEW, yytext());}
 "print"	{return new_symbol(sym.PRINT, yytext());}
 "read"		{return new_symbol(sym.READ, yytext());}
 "return"	{return new_symbol(sym.RETURN, yytext());}
 "void"		{return new_symbol(sym.VOID, yytext());}
 "do"		{return new_symbol(sym.DO, yytext());}
 "while"	{return new_symbol(sym.WHILE, yytext());}
 "extends"	{return new_symbol(sym.EXTENDS, yytext());}
 "continue"	{return new_symbol(sym.CONTINUE, yytext());}
 "const"	{return new_symbol(sym.CONST, yytext());}

 "+"		{return new_symbol(sym.PLUS, yytext());}
 "-"		{return new_symbol(sym.MINUS, yytext());}
 "*"		{return new_symbol(sym.MULTUPLY, yytext());}
 "/"		{return new_symbol(sym.DIV, yytext());}
 "%"		{return new_symbol(sym.MOD, yytext());}
 "="		{return new_symbol(sym.ASSIGN, yytext());}
 "=="		{return new_symbol(sym.EQUAL, yytext());}
 "!="		{return new_symbol(sym.NOT_EQUAL, yytext());}
 ">"		{return new_symbol(sym.GREATER, yytext());}
 "<"		{return new_symbol(sym.LESS, yytext());}
 ">="		{return new_symbol(sym.GREATER_OR_EQUEL, yytext());}
 "<="		{return new_symbol(sym.LESS_OR_EQUEL, yytext());}
 "&&"		{return new_symbol(sym.AND, yytext());}
 "||"		{return new_symbol(sym.OR, yytext());}
 "++"		{return new_symbol(sym.INC, yytext());}
 "--"		{return new_symbol(sym.DEC, yytext());}
 ","		{return new_symbol(sym.COMMA, yytext());}
 ";"		{return new_symbol(sym.SEMICOLON, yytext());}
 "."		{return new_symbol(sym.DOT, yytext());}
 "("		{return new_symbol(sym.OPEN_PARENTHESES, yytext());}
 ")"		{return new_symbol(sym.CLOSE_PARENTHESES, yytext());}
 "{"		{return new_symbol(sym.OPEN_BRACES, yytext());}
 "}"		{return new_symbol(sym.CLOSE_BRACES, yytext());}
 "["		{return new_symbol(sym.OPEN_CHEVRONS, yytext());}
 "]"		{return new_symbol(sym.CLOSE_CHEVRONS, yytext());}


 "true"|"false" 					{return new_symbol(sym.BOOL, Boolean.valueOf(yytext()));}
 ([a-z]|[A-Z])([a-z|A-Z|0-9|_])* 	{return new_symbol(sym.IDENT, yytext());}
 [0-9]+ 							{return new_symbol(sym.NUMBER, new Integer(yytext()));}
 \'[^\']\' 						{return new_symbol(sym.CHAR, Character.toString(yytext().charAt(1)));}
 



"//"				{yybegin(COMMENT);}
<COMMENT> . 		{yybegin(COMMENT);}
<COMMENT> "\r\n" 	{yybegin(YYINITIAL);}



. {Logger.getLogger(getClass()).error("Leksicka greska ("+yytext()+") na "+(yycolumn+1)+" karakteru "+ (yyline + 1) +" linije.");}

