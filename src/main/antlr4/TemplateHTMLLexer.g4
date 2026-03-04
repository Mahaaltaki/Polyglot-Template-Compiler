lexer grammar TemplateHTMLLexer;

TAG_START_OPEN  : '<'           -> pushMode(TAG_MODE);
TAG_END_OPEN    : '</'          -> pushMode(TAG_MODE);
HTML_COMMENT    : '<!--' .*? '-->' -> skip;
TEXT            : ~[<]+;
WS              : [ \t\r\n]+    -> skip;

mode TAG_MODE;

TAG_CLOSE       : '>'           -> popMode;
TAG_SLASH_CLOSE : '/>'          -> popMode;
EQUAL           : '=';
BANG            : '!';

VOID_TAG_NAME
    :   'meta' | 'link' | 'br' | 'hr' | 'img' | 'input' | 'source' | 'track' | 'wbr' | 'base' | 'area' | 'col' | 'embed' | 'param'
    ;

ID              : [a-zA-Z][a-zA-Z0-9_-]*;

STRING
    :   '"' (~["\r\n])* '"'
    |   '\'' (~['\r\n])* '\''
    ;

TAG_WS          : [ \t\r\n]+    -> skip;
