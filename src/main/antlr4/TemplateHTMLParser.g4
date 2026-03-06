parser grammar TemplateHTMLParser;

options { tokenVocab=TemplateHTMLLexer; }

htmlDocument
    :   node* EOF
    ;

node
    :   doctype
    |   element
    |   jinjaVariable
    |   jinjaBlock
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

jinjaVariable
    :   JINJA_VAR_START jinjaVarExpression JINJA_VAR_END
    ;

jinjaVarExpression
    :   jinjaVarAccess (JINJA_DOT jinjaVarAccess)*
    ;

jinjaVarAccess
    :   JINJA_ID
    ;

jinjaBlock
    :   jinjaForBlock
    |   jinjaIfBlock
    ;

jinjaForBlock
    :   JINJA_BLOCK_START JINJA_FOR loopVar=BLOCK_ID JINJA_IN iterable=BLOCK_ID JINJA_BLOCK_END 
        node* 
        JINJA_BLOCK_START JINJA_ENDFOR JINJA_BLOCK_END
    ;

jinjaIfBlock
    :   JINJA_BLOCK_START JINJA_IF condition=BLOCK_ID JINJA_BLOCK_END 
        node* 
        (JINJA_BLOCK_START JINJA_ELSE JINJA_BLOCK_END node*)?
        JINJA_BLOCK_START JINJA_ENDIF JINJA_BLOCK_END
    ;
