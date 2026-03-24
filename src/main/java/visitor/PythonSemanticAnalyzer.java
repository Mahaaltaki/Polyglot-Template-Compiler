package visitor;

import antlr.*;
import symboltable.SymbolTable;
import java.util.*;

public class PythonSemanticAnalyzer extends FlaskPythonParserBaseVisitor<Void> {
    private SymbolTable table;
    private List<String> errors;
    
    private Map<String, String> globalScope = new HashMap<>();
    private Map<String, String> localScope = new HashMap<>();
    private boolean inFunction = false;
    private Set<String> declaredRoutes = new HashSet<>();

    public PythonSemanticAnalyzer(String fileName) {
        this.table = new SymbolTable("PYTHON: " + fileName);
        this.errors = new ArrayList<>();
    }

    public SymbolTable getSymbolTable() { return table; }
    public List<String> getErrors() { return errors; }

    private void reportError(String type, String message, int line, int col) {
        errors.add(String.format(Locale.ENGLISH, ">> [SEMANTIC ERROR - %s] Line %d, Col %d: %s", type, line, col, message));
    }

    @Override
    public Void visitImportRule(FlaskPythonParser.ImportRuleContext ctx) {
        for (var idNode : ctx.importStmt().idList().ID()) {
            String id = idNode.getText();
            globalScope.put(id, "MODULE_IMPORT");
            table.define(id, "MODULE_IMPORT", "Global");
        }
        return null;
    }

    @Override
    public Void visitFuncDef(FlaskPythonParser.FuncDefContext ctx) {
        String funcName = ctx.ID().getText();
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        if (globalScope.containsKey(funcName)) {
            reportError("DUPLICATE_DECLARATION", "Function '" + funcName + "' is already defined.", line, col);
        } else {
            globalScope.put(funcName, "FUNCTION");
            table.define(funcName, "FUNCTION", "Global");
        }

        inFunction = true;
        localScope.clear(); 
        
        if(ctx.paramList() != null) {
            for(var param : ctx.paramList().ID()) {
                localScope.put(param.getText(), "PARAMETER");
                table.define(param.getText(), "PARAMETER", "Local: " + funcName);
            }
        }

        visitChildren(ctx); 
        inFunction = false; 
        return null;
    }

    @Override
    public Void visitAssignStmt(FlaskPythonParser.AssignStmtContext ctx) {
        String varName = ctx.ID().getText();
        
        if (inFunction) {
            localScope.put(varName, "VARIABLE");
            table.define(varName, "VARIABLE", "Local");
        } else {
            globalScope.put(varName, "VARIABLE");
            table.define(varName, "VARIABLE", "Global");
        }
        return visitChildren(ctx);
    }

    @Override
    public Void visitReturnStmt(FlaskPythonParser.ReturnStmtContext ctx) {
        if (!inFunction) {
            reportError("RETURN_OUTSIDE_FUNCTION", "'return' statement cannot be used outside of a function.", 
                        ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
        }
        return visitChildren(ctx);
    }

    @Override
    public Void visitGlobalStmt(FlaskPythonParser.GlobalStmtContext ctx) {
        for(var idNode : ctx.idList().ID()) {
            String varName = idNode.getText();
            if (!globalScope.containsKey(varName)) {
                reportError("UNRESOLVED_GLOBAL", "Global variable '" + varName + "' used in function but never defined in global scope.", 
                            ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
            } else {
                localScope.put(varName, "GLOBAL_REF");
                table.define(varName, "GLOBAL_REF", "Local");
            }
        }
        return null;
    }

    @Override
    public Void visitFuncCallExpr(FlaskPythonParser.FuncCallExprContext ctx) {
        checkMissingFlaskImport(ctx.ID().getText(), ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
        return visitChildren(ctx);
    }

    @Override
    public Void visitMethodCallExpr(FlaskPythonParser.MethodCallExprContext ctx) {
        checkMissingFlaskImport(ctx.dottedName().getText(), ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
        return visitChildren(ctx);
    }

    private void checkMissingFlaskImport(String funcName, int line, int col) {
        List<String> flaskBuiltins = Arrays.asList("render_template", "redirect", "url_for");
        if (flaskBuiltins.contains(funcName) && !globalScope.containsKey(funcName)) {
            reportError("MISSING_FLASK_IMPORT", "Flask function '" + funcName + "' is used but was not imported.", line, col);
        }
    }

    @Override
    public Void visitVarLit(FlaskPythonParser.VarLitContext ctx) {
        String varName = ctx.ID().getText();
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        if (!localScope.containsKey(varName) && !globalScope.containsKey(varName) && !varName.equals("app") && !varName.equals("__name__")) {
            reportError("UNDEFINED_VARIABLE", "Variable '" + varName + "' is used before assignment.", line, col);
        }
        return null;
    }

    @Override
    public Void visitDecoratorRule(FlaskPythonParser.DecoratorRuleContext ctx) {
        FlaskPythonParser.DecoratorStmtContext decCtx = ctx.decoratorStmt();
        String decText = decCtx.dottedName().getText();
        
        if (decText.equals("app.route") && decCtx.argList() != null) {
            String routePath = decCtx.argList().argument(0).getText();
            int line = decCtx.getStart().getLine();
            int col = decCtx.getStart().getCharPositionInLine();

            if (declaredRoutes.contains(routePath)) {
                reportError("DUPLICATE_ROUTE", "Flask route " + routePath + " is already registered to another function.", line, col);
            } else {
                declaredRoutes.add(routePath);
            }
        }
        
        if (decCtx.funcDef() != null) {
            visit(decCtx.funcDef()); 
        } else if (decCtx.decoratorStmt() != null) {
            visit(decCtx.decoratorStmt());
        }

        return null;
    }
}
