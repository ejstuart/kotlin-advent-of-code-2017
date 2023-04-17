grammar Day08;

prog: stat+ ;


stat:   ID op num cond NEWLINE stat?       # assign
    ;

cond:   IF ID compar num    # if
    ;

num:   NEG?INT                 # number
    ;

op:     INC
|       DEC
;

compar: GT
|   LT
|   GTE
|   LTE
|   EQ
|   NEQ
;



INC : 'inc';
DEC : 'dec';
IF  :   'if'    ;
GT :   '>' ;
GTE :   '>=' ;
LT :   '<' ;
LTE :   '<=' ;
EQ :   '==' ;
NEQ :   '!=' ;
CLEAR:  'clear' ;
ID  :   [a-z]+ ;
INT :   [0-9]+ ;
NEG :   '-'     ;
NEWLINE:'\r'? '\n' ;
WS  :   [ \t]+ -> skip ;