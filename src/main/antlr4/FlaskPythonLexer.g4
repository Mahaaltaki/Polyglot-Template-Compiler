lexer grammar FlaskPythonLexer;

// Keywords - MUST come BEFORE ID to ensure they match first
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

// Symbols
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

// Literals - ID must come AFTER keywords
STRING: ('"' .*? '"' | '\'' .*? '\'');
FSTRING: 'f' ('"' .*? '"' | '\'' .*? '\'');
NUMBER: [0-9]+ ('.' [0-9]+)?;
ID: [a-zA-Z_][a-zA-Z0-9_]*;

// Whitespace and Newlines - CRITICAL: handle properly
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;