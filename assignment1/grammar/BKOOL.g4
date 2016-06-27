/**
 * Student name: Nguyen Bao Xuan Truong
 * Student ID:
 */
grammar BKOOL;

@lexer::header{
	package bkool.parser;
	import bkool.utils.*;
}
@lexer::members{
@Override
public Token emit() {
    switch (getType()) {
    case ERROR_CHAR:
    	Token result = super.emit();
    	throw new ErrorToken(result.getText());	
    default:
        return super.emit();
    }
}
}

@parser::header {
	package bkool.parser;
	import bkool.utils.*;
}
options{
	language=Java;
}

//Regular expression
program : class_declaration+ EOF;
class_declaration : CLASS  ID  (EXTENDS ID)? LP list_members RP;
list_members: (member)* ;
member: (STATIC)? attribute (method_declaration)?;
attribute:mutable|immutable;
mutable:varible_declaration;
immutable:constant_declaration;
constant_declaration: (STATIC)? FINAL constant_type ID ASSIGN expression SEMICOLONE;
constant_type:INT|FLOAT|STRING|BOOLEAN;
varible_declaration:(STATIC)? list_id COLON varible_type SEMICOLONE;
list_id:ID (COMMA ID)*;
varible_type:constant_type|array_type|ID;
method_normal: RETURN method_type (LBRACKET STATIC RBRACKET)? ID list_parameters block_statement;
list_parameters: LBRACKET (parameter (COMMA parameter)*)? RBRACKET;
parameter:ID (COMMA ID)* COLON constant_type;
method_type:constant_type;
method_constructor:ID list_parameters block_statement;
method_declaration: method_normal|method_constructor|method_void;
method_void: VOID ID list_parameters block_statement;
array_type:(constant_type|ID)  LBRACKET INTERGER RBRACKET;
block_statement:LBRACKET list_statement RBRACKET;
list_statement:(statement)+;
statement:varible_declaration|constant_declaration;
expression:  relational_expression | boolean_expression | arithmetic_expression;
arithmetic_expression: (ADD | SUB) arithmetic_expression | arithmetic_expression_op1 ;
arithmetic_expression_op1: arithmetic_expression_op1 (MUL | DIVFLOAT | BACKSLASH | MODUN) arithmetic_expression_op2 | arithmetic_expression_op2;
arithmetic_expression_op2: arithmetic_expression_op2 (ADD | SUB) last_expression | last_expression;
boolean_expression:NOT boolean_expression|boolean_expression_op1;
boolean_expression_op1:boolean_expression_op1 (AND|OR) last_expression|last_expression;
relational_expression: last_expression RELATION_OPERATOR last_expression;
last_expression: INT|FLOAT|BOOLEAN| LP expression RP| ID;

//program:(declaration)*;
//declaration: variable AND function ;
//variable:type ID(COMMA ID)*SEMICOLONE ;
//type:INT|FLOAT ;
//function:type ID paramdec body;
//paramdec: LP listPM RP;
//listPM: pm ptemp;
//ptemp:SEMICOLONE ptemp;
//pm:type ID (COMMA ID)*;
//body:LBRACKET(element)+ RBRACKET;
//element: variable|statement;
//statement: assignment|callstm||returnstm;
//assignment:ID EQUAD expr SEMICOLONE;
//call: ID LP loe RP;
//callstm:call SEMICOLONE;
//returnt: expr SEMICOLONE;
//returnstm: returnt expr SEMICOLONE;
//loe:expr exprtemp;
//exprtemp:COMMA expr exprtemp;
//expr:expr(ADD|SUB) expr1|expr1;
//expr1: expr1(MUL|DIVINT)expr1|expr2;
//expr2:LP expr RP|operand;
//operand:INT|FLOATLITERAL|ID|call;

//KEYWORD
BOOLEAN:'boolean';
BREAK:'break';
CLASS:'class';
CONTINUE:'continue';
DO:'do';
ELSE:'else';
EXTENDS:'extends';
FLOAT:'float';
IF:'if';
INT :'int';
NEW:'new';
STRING:'string';
THEN:'then';
FOR:'for';
RETURN:'return';
TRUE:'true';
FALSE:'false';
VOID:'void';
NIL:'nil';
THIS:'this';
FINAL:'final';
STATIC:'static';

//OPERATOR
RELATION_OPERATOR:EQUAD|NOTEQUAD|GT|LT|LE|GE;
ASSIGN:':=';
ADD:'+';
MUL:'*';
DIVINT:'\'';
NOTEQUAD:'!=';
LT:'<';
LE:'<=';
OR:'||';
NOT:'!';
OBJECTCREATE:'new';
SUB:'-';
DIVFLOAT:'/';
BACKSLASH:'\\';
MODUN:'%';
EQUAD:'==';
GT:'>';
GE:'>=';
AND:'&&';
CONCATENATION:'^';


//SEPARATOR
LSB:'[';
RSB:']';
LBRACKET:'(';
RBRACKET:')';
SEMICOLONE:';';
COLON:':';
DOT:'.';
COMMA:',';
LP: '{';
RP: '}';


// INTERGER LITERAL
INTERGER:[0-9]+;

//FLOAT LITERAL
FLOATLITERAL : [0-9]+'.'[0-9]*EXP?|[0-9]+'.'[0-9]+EXP?|[0-9]+EXP;
//FLOATLITERAL : [0-9]+DOT[0-9]+EXP?|DOT[0-9]+EXP?|[0-9]+EXP;

fragment
EXP: [eE][+-]?[0-9]+;

//BOOLEAN LITERAL
BOOLEANLITERAL:[true|false];


//STRING LITERAL
STRINGLITERAL: UNTERMINAL'"';
fragment
UNTERMINAL:'"' (~["\\\t\r\n] | '\\' (. | EOF))*;


WS : [ \t\r\n]+ -> skip ;
ID : [A-Za-z'_']([A-Za-z0-9'_']*)?;
COMMENT:  '/*'(.)*?'*/' ->skip ;
LINECOMMENT:'%%'~[\r\n]* ->skip;

ERROR_CHAR : . ;

