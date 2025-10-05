package lex;
import java_cup.runtime.*;
import java.util.*;

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

%%

// ---------- Palabras reservadas ----------
"REPEAT"             { System.out.println("Token REPEAT encontrado, Lexema " + yytext()); }
"UNTIL"              { System.out.println("Token UNTIL encontrado, Lexema " + yytext()); }
"IF"                 { System.out.println("Token IF encontrado, Lexema " + yytext()); }
"THEN"               { System.out.println("Token THEN encontrado, Lexema " + yytext()); }
"ELSE"               { System.out.println("Token ELSE encontrado, Lexema " + yytext()); }
"ENDIF"              { System.out.println("Token ENDIF encontrado, Lexema " + yytext()); }
"DECVAR"             { System.out.println("Token DECVAR encontrado, Lexema " + yytext()); }
"ENDDECVAR"          { System.out.println("Token ENDDECVAR encontrado, Lexema " + yytext()); }
"PROGRAM.SECTION"    { System.out.println("Token PROGRAM_SECTION encontrado, Lexema " + yytext()); }
"ENDPROGRAM.SECTION" { System.out.println("Token END_PROGRAM_SECTION encontrado, Lexema " + yytext()); }
"INT"                { System.out.println("Token TYPE_INT encontrado, Lexema " + yytext()); }
"FLOAT"              { System.out.println("Token TYPE_FLOAT encontrado, Lexema " + yytext()); }
"STRING"             { System.out.println("Token TYPE_STRING encontrado, Lexema " + yytext()); }
"show"               { System.out.println("Token SHOW encontrado, Lexema " + yytext()); }

// ---------- Operadores y símbolos ----------
"=="   { System.out.println("Token EQ encontrado, Lexema " + yytext()); }
"!="   { System.out.println("Token NEQ encontrado, Lexema " + yytext()); }
"<="   { System.out.println("Token LE encontrado, Lexema " + yytext()); }
">="   { System.out.println("Token GE encontrado, Lexema " + yytext()); }
"<"    { System.out.println("Token LT encontrado, Lexema " + yytext()); }
">"    { System.out.println("Token GT encontrado, Lexema " + yytext()); }
"&&"   { System.out.println("Token AND encontrado, Lexema " + yytext()); }
"||"   { System.out.println("Token OR encontrado, Lexema " + yytext()); }
"!"    { System.out.println("Token NOT encontrado, Lexema " + yytext()); }
"+"    { System.out.println("Token MAS encontrado, Lexema " + yytext()); }
"-"    { System.out.println("Token MENOS encontrado, Lexema " + yytext()); }
"*"    { System.out.println("Token MULT encontrado, Lexema " + yytext()); }
"/"    { System.out.println("Token DIV encontrado, Lexema " + yytext()); }
"="    { System.out.println("Token ASSIGN encontrado, Lexema " + yytext()); }
"["    { System.out.println("Token LBRACK encontrado, Lexema " + yytext()); }
"]"    { System.out.println("Token RBRACK encontrado, Lexema " + yytext()); }
"("    { System.out.println("Token LPAREN encontrado, Lexema " + yytext()); }
")"    { System.out.println("Token RPAREN encontrado, Lexema " + yytext()); }
","    { System.out.println("Token COMA encontrado, Lexema " + yytext()); }
"{#}{Iguales}" { System.out.println("Token FUNC_IGUALES encontrado, Lexema " + yytext()); }

// ---------- Literales ----------
{HEX}    { System.out.println("Token HEX_CONST encontrado, Lexema " + yytext()); }
{FLOAT}  { System.out.println("Token FLOAT_CONST encontrado, Lexema " + yytext()); }
{INT}    { System.out.println("Token INT_CONST encontrado, Lexema " + yytext()); }
{STRING} { System.out.println("Token STRING_CONST encontrado, Lexema " + yytext()); }

// ---------- Identificadores ----------
{ID}     { System.out.println("Token ID encontrado, Lexema " + yytext()); }

// ---------- Comentarios ----------
"//".* { /* se ignora */ }
"/*"([^*]|(\*+[^*/]))*"*/" { /* se ignora */ }

// ---------- Espacios ----------
{WHITESPACE} { /* se ignora */ }

// ---------- Error léxico ----------
. { throw new Error("Caracter no permitido: <" + yytext() + "> en la linea " + yyline); }

<<EOF>> { System.out.println("Fin de archivo."); return null; }