lexer grammar TemplateHTMLLexer;

TAG_START_OPEN  : '<'           -> pushMode(TAG_MODE);
TAG_END_OPEN    : '</'          -> pushMode(TAG_MODE);
JINJA_VAR_START : '{{'          -> pushMode(JINJA_VAR_MODE);
JINJA_BLOCK_START: '{%'          -> pushMode(JINJA_BLOCK_MODE);
HTML_COMMENT    : '<!--' .*? '-->' -> skip;
TEXT            : ~[<{]+;
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

mode JINJA_VAR_MODE;

JINJA_VAR_END   : '}}'          -> popMode;
JINJA_ID        : [a-zA-Z_][a-zA-Z0-9_]*;
JINJA_DOT       : '.';
JINJA_WS        : [ \t\r\n]+    -> skip;

mode JINJA_BLOCK_MODE;

JINJA_BLOCK_END : '%}'          -> popMode;
JINJA_FOR       : 'for';
JINJA_IN        : 'in';
JINJA_ENDFOR    : 'endfor';
JINJA_IF        : 'if';
JINJA_ELSE      : 'else';
JINJA_ENDIF     : 'endif';
BLOCK_ID        : [a-zA-Z_][a-zA-Z0-9_]*;
BLOCK_WS        : [ \t\r\n]+    -> skip;
