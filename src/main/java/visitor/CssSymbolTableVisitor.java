package visitor;
import symboltable.SymbolTable;
import antlr.*;
import antlr.SimpleCSSBaseVisitor;

public class CssSymbolTableVisitor extends SimpleCSSBaseVisitor<Void> {
    private SymbolTable table = new SymbolTable("CSS");
    public SymbolTable getSymbolTable() { return table; }

    @Override public Void visitRuleSetRule(SimpleCSSParser.RuleSetRuleContext ctx) {
        String selector = ctx.selectors().getText();
        table.define(selector, "SELECTOR", "Stylesheet");
        return null;
    }
}