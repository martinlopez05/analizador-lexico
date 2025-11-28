package com.mycompany.analizadorlexico;
import java_cup.runtime.*;
import java.util.*;

import com.mycompany.analizadorlexico.TablaSimbolos;


%%

%cup
%public
%class Lexico
%unicode
%line
%column
%implements java.io.Serializable

// ---------- Definiciones de macros ----------
WHITESPACE = [ \t\f\r\n]+
LETTER     = [a-zA-Z]
DIGIT      = [0-9]
ID         = {LETTER}({LETTER}|{DIGIT})*
INT        = {DIGIT}+
FLOAT      = ({DIGIT}+\.{DIGIT}*|{DIGIT}*\.{DIGIT}+)
HEX        = 0[hH][0-9a-fA-F]+
STRING     = \"([^\"\\]|\\.)*\"

%{
/**
*   Instancia de tabla de simbolos
*
*/
TablaSimbolos symtbl = new TablaSimbolos("ts.txt");


%}

%%

// ---------- Palabras reservadas ----------
"REPEAT"             { return new Symbol(sym.REPEAT, yytext());}
"UNTIL"              { return new Symbol(sym.UNTIL, yytext()); }
"IF"                 { return new Symbol(sym.IF, yytext()); }
"THEN"               { return new Symbol(sym.THEN, yytext()); }
"ELSE"               { return new Symbol(sym.ELSE, yytext()); }
"ENDIF"              { return new Symbol(sym.ENDIF, yytext()); }
"DECVAR"             { return new Symbol(sym.DECVAR, yytext()); }
"ENDDECVAR"          { return new Symbol(sym.ENDDECVAR, yytext()); }
"PROGRAM.SECTION"    { return new Symbol(sym.PROGRAM_SECTION, yytext()); }
"ENDPROGRAM.SECTION" { return new Symbol(sym.END_PROGRAM_SECTION, yytext()); }
"INT"                { return new Symbol(sym.TYPE_INT, yytext()); }
"FLOAT"              { return new Symbol(sym.TYPE_FLOAT, yytext()); }
"STRING"             { return new Symbol(sym.TYPE_STRING, yytext()); }
"show"               { return new Symbol(sym.SHOW, yytext()); }

// ---------- Operadores y símbolos ----------
"=="   { return new Symbol(sym.EQ, yytext()); }
"!="   { return new Symbol(sym.NEQ, yytext()); }
"<="   { return new Symbol(sym.LE, yytext()); }
">="   { return new Symbol(sym.GE, yytext()); }
"<"    { return new Symbol(sym.LT, yytext()); }
">"    { return new Symbol(sym.GT, yytext()); }
"&&"   { return new Symbol(sym.AND, yytext()); }
"||"   { return new Symbol(sym.OR, yytext()); }
"!"    { return new Symbol(sym.NOT, yytext()); }
"+"    { return new Symbol(sym.MAS, yytext()); }
"-"    { return new Symbol(sym.MENOS, yytext()); }
"*"    { return new Symbol(sym.MULT, yytext()); }
"/"    { return new Symbol(sym.DIV, yytext()); }
"="    { return new Symbol(sym.ASSIGN, yytext()); }
"["    { return new Symbol(sym.LBRACK, yytext()); }
"]"    { return new Symbol(sym.RBRACK, yytext()); }
"("    { return new Symbol(sym.LPAREN, yytext()); }
")"    { return new Symbol(sym.RPAREN, yytext()); }
","    { return new Symbol(sym.COMA, yytext()); }
"#Iguales" { return new Symbol(sym.FUNC_IGUALES, yytext()); }

// ---------- Literales ----------
{HEX}    { 
  int valorDecimal = Integer.parseInt(yytext().substring(2), 16);
  symtbl.agregarSimbolo(yytext(), "HEX_CONST", String.valueOf(valorDecimal), null);
  return new Symbol(sym.HEX_CONST, yytext());
}
{FLOAT}  { 
  symtbl.agregarSimbolo("_" + yytext(), "FLOAT_CONST", yytext(), null);
  return new Symbol(sym.FLOAT_CONST, yytext()); 
}
{INT}    { 
  symtbl.agregarSimbolo("_" + yytext(), "INT_CONST", yytext(), null);
  return new Symbol(sym.INT_CONST, yytext());
}
{STRING} { 
  symtbl.agregarSimbolo("_" + yytext(), "STRING_CONST", yytext(), yytext().length());
  return new Symbol(sym.STRING_CONST, yytext());
}

// ---------- Identificadores ----------
{ID}     { 
  symtbl.agregarSimbolo(yytext(), "ID", null, null);
  return new Symbol(sym.ID, yytext());
}

// ---------- Comentarios ----------
"//".* { /* se ignora */ }
"/*"([^*]|(\*+[^*/]))*"*/" { /* se ignora */ }

// ---------- Espacios ----------
{WHITESPACE} { /* se ignora */ }

// ---------- Error léxico ----------
. { throw new Error("Caracter no permitido: <" + yytext() + "> en la linea " + yyline); }

<<EOF>> { System.out.println("Fin de archivo."); return null; }