parser grammar FlaskPythonParser;
options { tokenVocab=FlaskPythonLexer; }

program : (statement | NEWLINE)* EOF # ProgramRule;

statement
    : importStmt    # ImportRule
    | funcDef       # FunctionRule
    | classDef      # ClassRule
    | assignStmt    # AssignmentRule
    | ifStmt        # IfRule
    | returnStmt    # ReturnRule
    | decoratorStmt # DecoratorRule
    | globalStmt    # GlobalRule
    | exprStmt      # ExpressionRule
    ;

importStmt : (FROM src=ID)? IMPORT idList;
globalStmt : GLOBAL idList;
assignStmt : ID ASSIGN expression;
returnStmt : RETURN expression?;
exprStmt   : expression;

// Function Definition
funcDef : DEF ID LPAREN paramList? RPAREN COLON block;

// Class Definition
classDef : CLASS ID (LPAREN ID RPAREN)? COLON block;

// If Statement
ifStmt : IF expression COLON block (ELIF expression COLON block)* (ELSE COLON block)?;

// Decorator
decoratorStmt : AT dottedName (LPAREN argList? RPAREN)? NEWLINE (funcDef | decoratorStmt);

// Block - contains statements that can be inside functions
block : NEWLINE+ (returnStmt | globalStmt | assignStmt | exprStmt | NEWLINE)*;

idList : ID (COMMA ID)*;
paramList : ID (COMMA ID)*;
dottedName : ID (DOT ID)*;

expression
    : dottedName LPAREN argList? RPAREN           # MethodCallExpr
    | ID LPAREN argList? RPAREN                   # FuncCallExpr
    | LBRACK NEWLINE* expressionList? NEWLINE* RBRACK  # ListExpr
    | LBRACE NEWLINE* dictPairs? NEWLINE* RBRACE       # DictExpr
    | expression DOT ID                           # MemberAccessExpr
    | expression (PLUS|MINUS|STAR|DIV) expression # MathExpr
    | expression (EQ|GT|LT|NEQ) expression       # CompExpr
    | STRING                                     # StringLit
    | FSTRING                                    # FStringLit
    | NUMBER                                     # NumberLit
    | ID                                         # VarLit
    ;

// Arguments (Supports keyword args: name="Laptop")
argList : argument (COMMA NEWLINE* argument)*;
argument : expression | ID ASSIGN expression;

expressionList : expression (COMMA NEWLINE* expression)*;
dictPairs : NEWLINE* pair (COMMA NEWLINE* pair)* NEWLINE*;
pair : expression COLON expression;