package visitor;

import antlr.TemplateHTMLParser;
import antlr.TemplateHTMLParserBaseVisitor;
import ast.ASTNode;
import static ast.ASTNode.*;

public class HtmlASTVisitor extends TemplateHTMLParserBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitHtmlDocument(TemplateHTMLParser.HtmlDocumentContext ctx) {
        ASTNode root = new GenericNode("HTML Document");
        for (var nodeCtx : ctx.node()) {
            ASTNode child = visit(nodeCtx);
            if (child != null) root.addChild(child);
        }
        return root;
    }

    @Override
    public ASTNode visitDoctype(TemplateHTMLParser.DoctypeContext ctx) {
        return new GenericNode("DOCTYPE: " + ctx.ID(0).getText());
    }

    @Override
    public ASTNode visitNode(TemplateHTMLParser.NodeContext ctx) {
        if (ctx.TEXT() != null) {
            String text = ctx.TEXT().getText().trim();
            if (!text.isEmpty()) {
                return new GenericNode("Text: " + (text.length() > 30 ? text.substring(0, 30) + "..." : text));
            }
            return null;
        }
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitNormalElement(TemplateHTMLParser.NormalElementContext ctx) {
        String tagName = ctx.tagName.getText();
        ASTNode elementNode = new GenericNode("Element: " + tagName);

        if (ctx.attribute() != null) {
            for (var attrCtx : ctx.attribute()) {
                ASTNode attrNode = visit(attrCtx);
                if (attrNode != null) elementNode.addChild(attrNode);
            }
        }

        for (var nodeCtx : ctx.node()) {
            ASTNode child = visit(nodeCtx);
            if (child != null) elementNode.addChild(child);
        }

        return elementNode;
    }

    @Override
    public ASTNode visitVoidElement(TemplateHTMLParser.VoidElementContext ctx) {
        String tagName = ctx.tagName.getText();
        ASTNode elementNode = new GenericNode("Void Element: " + tagName);

        if (ctx.attribute() != null) {
            for (var attrCtx : ctx.attribute()) {
                ASTNode attrNode = visit(attrCtx);
                if (attrNode != null) elementNode.addChild(attrNode);
            }
        }

        return elementNode;
    }

    @Override
    public ASTNode visitAttribute(TemplateHTMLParser.AttributeContext ctx) {
        String name = ctx.ID().getText();
        String value = (ctx.STRING() != null) ? ctx.STRING().getText() : "true";
        return new GenericNode("Attribute: " + name + " -> " + value);
    }

    @Override
    protected ASTNode defaultResult() { 
        return null; 
    }
}