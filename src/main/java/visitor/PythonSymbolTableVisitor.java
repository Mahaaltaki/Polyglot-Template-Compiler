package visitor;
import symboltable.SymbolTable;
import antlr.*;
import antlr.FlaskPythonParserBaseVisitor;

public class PythonSymbolTableVisitor extends FlaskPythonParserBaseVisitor<Void> {
    private SymbolTable table = new SymbolTable("PYTHON");
    public SymbolTable getSymbolTable() { return table; }

    @Override public Void visitAssignmentRule(FlaskPythonParser.AssignmentRuleContext ctx) {
        String varName = ctx.assignStmt().ID().getText();
        table.define(varName, "VARIABLE", "Global");
        return null;
    }
    @Override public Void visitImportRule(FlaskPythonParser.ImportRuleContext ctx) {
        for(var id : ctx.importStmt().idList().ID()) 
            table.define(id.getText(), "MODULE_IMPORT", "Global");
        return null;
    }
    @Override public Void visitFunctionRule(FlaskPythonParser.FunctionRuleContext ctx) {
        table.define(ctx.funcDef().ID().getText(), "FUNCTION", "Global");
        return null;
    }
}