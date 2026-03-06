package visitor;

import antlr.TemplateHTMLParser;
import antlr.TemplateHTMLParserBaseVisitor;
import symboltable.SymbolTable;

public class HtmlSymbolTableVisitor extends TemplateHTMLParserBaseVisitor<Void> {
    private SymbolTable table;

    public HtmlSymbolTableVisitor() {
        this.table = new SymbolTable("HTML TEMPLATE");
    }

    public SymbolTable getSymbolTable() {
        return table;
    }

    @Override
    public Void visitNormalElement(TemplateHTMLParser.NormalElementContext ctx) {
        String tagName = ctx.tagName.getText();
        table.define(tagName, "HTML TAG", "Template");

        if (ctx.attribute() != null) {
            for (TemplateHTMLParser.AttributeContext attrCtx : ctx.attribute()) {
                String attrName = attrCtx.ID().getText();
                table.define(attrName, "ATTRIBUTE", tagName);
            }
        }

        return visitChildren(ctx);
    }

    @Override
    public Void visitVoidElement(TemplateHTMLParser.VoidElementContext ctx) {
        String tagName = ctx.tagName.getText();
        table.define(tagName, "HTML VOID TAG", "Template");

        if (ctx.attribute() != null) {
            for (TemplateHTMLParser.AttributeContext attrCtx : ctx.attribute()) {
                String attrName = attrCtx.ID().getText();
                table.define(attrName, "ATTRIBUTE", tagName);
            }
        }

        return visitChildren(ctx);
    }

    @Override
    public Void visitJinjaVariable(TemplateHTMLParser.JinjaVariableContext ctx) {
        String varName = ctx.jinjaVarExpression().jinjaVarAccess(0).getText();
        table.define(varName, "JINJA VARIABLE", "Template");
        return null;
    }

    @Override
    public Void visitJinjaForBlock(TemplateHTMLParser.JinjaForBlockContext ctx) {
        String loopVar = ctx.loopVar.getText();
        String iterable = ctx.iterable.getText();
        
        table.define(loopVar, "JINJA LOOP VAR", "For Loop");
        table.define(iterable, "JINJA ITERABLE", "For Loop");
        
        return visitChildren(ctx);
    }

    @Override
    public Void visitJinjaIfBlock(TemplateHTMLParser.JinjaIfBlockContext ctx) {
        String condition = ctx.condition.getText();
        table.define(condition, "JINJA CONDITION", "If Block");
        
        return visitChildren(ctx);
    }
}