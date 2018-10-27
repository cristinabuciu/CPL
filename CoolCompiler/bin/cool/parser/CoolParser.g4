parser grammar CoolParser;

options {
    tokenVocab = CoolLexer;
}

@header{
    package cool.parser;
}

program
    :   EOF 
    ; 
    
classs
	: CLASS class_name INHERITS inherit_class_name BRACE_P_OPEN feature BRACE_P_CLOSED
	;
	
feature :
	var=ID COLON expr
	;
	
expr :
	SELF_TYPE;
	
class_name 
	: TYPE_ID
	;

inherit_class_name
	: TYPE_ID
	;
	
