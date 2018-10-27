lexer grammar CoolLexer;

tokens { ERROR } 

@header{
    package cool.lexer;	
}

@members{    
    private void raiseError(String msg) {
        setText(msg);
        setType(ERROR);
    }
}

WS
    :   [ \n\f\r\t]+ -> skip
    ; 
    
/* keywords */

CLASS : ('c' | 'C')('l' | 'L')('a' | 'A')('s'|'S')('s' | 'S');
ELSE: ('e' | 'E')('l' | 'L')('s' | 'S')('e' | 'E');
IF: ('i' | 'I')('f' | 'F');
FI: ('f' | 'F')('i' | 'I');
IN: ('i' | 'I')('n' | 'N');
INHERITS: ('i' | 'I')('n' | 'N')('h' | 'H')('e' | 'E')('r' | 'R')('i' | 'I')('t' | 'T')('s' | 'S');
ISVOID: ('i' | 'I')('s' | 'S')('v' | 'V')('o' | 'O')('i' | 'I')('d' | 'D');
LET: ('l' | 'L')('e' | 'E')('t' | 'T');
LOOP: ('l' | 'L')('o' | 'O')('o' | 'O')('p' | 'P');
POOL: ('p' | 'P')('o' | 'O')('o' | 'O')('l' | 'L');
THEN: ('t' | 'T')('h' | 'H')('e' | 'E')('n' | 'N');
WHILE: ('w' | 'W')('h' | 'H')('i' | 'I')('l' | 'L')('e' | 'E');
CASE: ('c' | 'C')('a' | 'A')('s' | 'S')('e' | 'E');
ESAC: ('e' | 'E')('s' | 'S')('a' | 'A')('c' | 'C');
NEW: ('n' | 'N')('e' | 'E')('w' | 'W');
NOT: ('n' | 'N')('o' | 'O')('t' | 'T');
OF: ('o' | 'O')('f' | 'F');
FALSE: 'false';
TRUE: 'true';

STRING : '"' ('\\"' | .)*? '"'
		{
			
			String x = getText();
			int i = 0;
			while(i < x.length()){
				if(x.charAt(i) == '\\'){
					if(x.charAt(i+1) == '\n'){
						//x = x.substring(0,i) + x.substring(i+1,x.length());
						i++;
					}else
					if(x.charAt(i+1) != 'n' && x.charAt(i+1) != 't' && x.charAt(i+1) != 'b' && x.charAt(i+1) != 'f'){
						x = x.substring(0,i) + x.substring(i+1,x.length());
					}else					 
					 if(x.charAt(i+1) == 'n'){
						 x = x.substring(0,i) + '\n' + x.substring(i+2,x.length());
						 i++;
					 }else
					 if(x.charAt(i+1) == 't'){
					 	x = x.substring(0,i) + '\t' + x.substring(i+2,x.length());
					 	i++;
					 }else
					 if(x.charAt(i+1) == 'b'){
					 	x = x.substring(0,i) + '\b' + x.substring(i+2,x.length());
					 	i++;
					 }else
					 if (x.charAt(i+1) == 'f'){
						x = x.substring(0,i) + '\f' + x.substring(i+2,x.length());
					 	i++;
					}
				}
				else{
					i++;
				}
			}
			setText(x.substring(1,x.length()-1));
		};

BLOCK_COMMENT
    : '(*'
      (BLOCK_COMMENT|.)*?
      ('*)' | EOF ) -> skip
    ;

LINE_COMMENT
	: '--'
      (LINE_COMMENT|.)*?
      ('\n' ) -> skip
    ;

/* special identifiers */
SELF: 'self';
SELF_TYPE: 'SELF_TYPE';

/* identifiers */
fragment DIGIT : [0-9];
fragment LOWER_LETTER : [a-z];
fragment UPPER_LETTER : [A-Z]; 
TYPE_ID : UPPER_LETTER(LOWER_LETTER | UPPER_LETTER | DIGIT | '_')*;
ID : LOWER_LETTER(LOWER_LETTER | UPPER_LETTER | DIGIT | '_')*;
INTEGER: DIGIT | [1-9]DIGIT*;

/* parenthesis */
ROUND_P_OPEN : '(';
ROUND_P_COSED : ')';
SQUARE_P_OPEN : '[';
SQUARE_P_CLOSED : ']';
BRACE_P_OPEN : '{';
BRACE_P_CLOSED: '}';

/* arithmetic operations */
INTEGER_COMPLEMENT : '~';
PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVISION: '/';

/* assignment */
ASSIGN : '<-';

/* comparisons */
SET: '=>';
LESS_EQUAL: '<=';
LESS : '<';
EQUAL : '=';

/* other symbols */
COLON : ':';
SEMICOLON : ';';
COMMA : ',';
AT: '@';
POINT: '.';

//STR_OPEN : '"' -> pushMode(IN_STR), more;
//
//mode IN_STR;
//
//STRING : '"' -> popMode;
//FF : [\n\f\r\t] -> more;
//SLASH :  '\\' {System.out.println("Ajunge in SLASH " + getText());}-> more; 
//CHAR : ( ~'"'){System.out.println("Ajunge in CHAR " + getText());setText("h");System.out.println(" " + getText());} -> more;  // ~ = complement

//setText(getText().substring(0,getText().length()-1))




