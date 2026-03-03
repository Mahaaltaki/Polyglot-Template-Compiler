package visitor;
import antlr.*;
import ast.ASTNode;
import static ast.ASTNode.*;
import antlr.SimpleCSSBaseVisitor;

public class CssASTVisitor extends SimpleCSSBaseVisitor<ASTNode> {
    @Override public ASTNode visitStylesheetRule(SimpleCSSParser.StylesheetRuleContext ctx) {
        ASTNode root = new GenericNode("CSS Stylesheet");
        for(var rule : ctx.ruleSet()) root.addChild(visit(rule));
        return root;
    }
    @Override public ASTNode visitRuleSetRule(SimpleCSSParser.RuleSetRuleContext ctx) {
        ASTNode node = new GenericNode("Rule");
        node.addChild(new GenericNode("Selector: " + ctx.selectors().getText()));
        for(var decl : ctx.declaration()) node.addChild(visit(decl));
        return node;
    }
    @Override public ASTNode visitDeclarationRule(SimpleCSSParser.DeclarationRuleContext ctx) {
        return new GenericNode("Style: " + ctx.propName().getText() + " -> " + ctx.propValue().getText());
    }
}