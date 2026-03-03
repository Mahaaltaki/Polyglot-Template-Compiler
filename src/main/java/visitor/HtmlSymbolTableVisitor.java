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
}