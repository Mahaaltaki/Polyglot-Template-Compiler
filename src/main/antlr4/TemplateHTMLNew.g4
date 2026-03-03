grammar TemplateHTMLNew;

options {
    language = Java;
}

// ----------------------------------------
// Parser Rules
// ----------------------------------------

htmlDocument
    :   doctype? htmlContent* EOF
    ;

doctype
    :   DOCTYPE
    ;

htmlContent
    :   tagStart
    |   tagEnd
    |   selfClosingTag
    |   text
    ;

tagStart
    :   OPEN_TAG ID attribute* CLOSE_TAG htmlContent* END_TAG ID CLOSE_TAG
    ;

tagEnd
    :   END_TAG ID CLOSE_TAG
    ;

selfClosingTag
    :   OPEN_TAG ID attribute* SLASH_CLOSE_TAG
    |   OPEN_TAG VOID_TAG attribute* CLOSE_TAG
    ;

attribute
    :   ID EQUAL STRING
    ;

text
    :   TEXT
    ;

// ----------------------------------------
// Lexer Rules
// ----------------------------------------

DOCTYPE         : '<!DOCTYPE' ~[>]* '>';
OPEN_TAG        : '<';
END_TAG         : '</';
SLASH_CLOSE_TAG : '/>';
CLOSE_TAG       : '>';
EQUAL           : '=';

STRING
    :   '"' (~["\r\n])* '"'
    |   '\'' (~['\r\n])* '\''
    ;

ID              : [a-zA-Z][a-zA-Z0-9_-]*;

VOID_TAG
    :   'meta'
    |   'link'
    |   'br'
    |   'hr'
    |   'img'
    |   'input'
    |   'source'
    |   'track'
    |   'wbr'
    ;

TEXT
    :   ~[<]+
    ;

// Ignored tokens
WS      : [ \t\r\n]+ -> skip;
COMMENT : '<!--' .*? '-->' -> skip;
