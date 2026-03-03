grammar SimpleCSS;

stylesheet : ruleSet* EOF # StylesheetRule;

ruleSet : selectors LBRACE declaration* RBRACE # RuleSetRule;

selectors : selector (COMMA selector)*;

// Selector can be multiple parts (e.g. ".product-info h2")
selector : selectorElement+; 

selectorElement : (DOT | HASH)? ID | STAR;

declaration : propName COLON propValue SEMI? # DeclarationRule;

propName : ID | ID MINUS ID;
propValue : (ID | HASH | NUMBER | DOT | MINUS | PERCENT)+; // Allow flexible values

// Lexer
ID : [a-zA-Z][a-zA-Z0-9_-]*;
NUMBER : [0-9]+;
DOT: '.'; HASH: '#'; COMMA: ','; COLON: ':'; SEMI: ';'; LBRACE: '{'; RBRACE: '}'; MINUS: '-'; PERCENT: '%'; STAR: '*';
WS : [ \t\r\n]+ -> skip;