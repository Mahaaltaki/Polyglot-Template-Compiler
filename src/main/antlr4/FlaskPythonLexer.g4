lexer grammar FlaskPythonLexer;

FROM: 'from';
IMPORT: 'import';
DEF: 'def';
CLASS: 'class';
RETURN: 'return';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
FOR: 'for';
IN: 'in';
GLOBAL: 'global';


ASSIGN: '=';
COMMA: ',';
COLON: ':';
DOT: '.';
AT: '@';
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';
PLUS: '+';
MINUS: '-';
STAR: '*';
DIV: '/';
EQ: '==';
NEQ: '!=';
GT: '>';
LT: '<';

STRING: ('"' .*? '"' | '\'' .*? '\'');
FSTRING: 'f' ('"' .*? '"' | '\'' .*? '\'');
NUMBER: [0-9]+ ('.' [0-9]+)?;
ID: [a-zA-Z_][a-zA-Z0-9_]*;

NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;