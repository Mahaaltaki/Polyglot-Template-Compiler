parser grammar TemplateHTMLParser;

options { tokenVocab=TemplateHTMLLexer; }

htmlDocument
    :   node* EOF
    ;

node
    :   doctype
    |   element
    |   TEXT
    ;

doctype
    :   TAG_START_OPEN BANG ID ID* TAG_CLOSE
    ;

element
    :   normalElement
    |   voidElement
    ;

normalElement
    :   TAG_START_OPEN tagName=ID attribute* TAG_CLOSE 
        node* 
        TAG_END_OPEN closingTagName=ID TAG_CLOSE
    ;

voidElement
    :   TAG_START_OPEN tagName=VOID_TAG_NAME attribute* TAG_CLOSE
    |   TAG_START_OPEN tagName=ID attribute* TAG_SLASH_CLOSE
    ;

attribute
    :   ID (EQUAL STRING)?
    ;
