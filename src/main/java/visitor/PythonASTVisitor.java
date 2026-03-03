package visitor;
import antlr.*;
import ast.ASTNode;
import static ast.ASTNode.*;
import antlr.FlaskPythonParserBaseVisitor;

public class PythonASTVisitor extends FlaskPythonParserBaseVisitor<ASTNode> {
    @Override public ASTNode visitProgramRule(FlaskPythonParser.ProgramRuleContext ctx) {
        ASTNode root = new ProgramNode();
        for(var stmt : ctx.statement()) if(stmt != null) root.addChild(visit(stmt));
        return root;
    }
    @Override public ASTNode visitImportRule(FlaskPythonParser.ImportRuleContext ctx) {
        String src = ctx.importStmt().src != null ? ctx.importStmt().src.getText() : "module";
        return new ImportNode(ctx.importStmt().getStart().getLine(), src);
    }
    @Override public ASTNode visitFunctionRule(FlaskPythonParser.FunctionRuleContext ctx) {
        var node = new FuncDefNode(ctx.funcDef().getStart().getLine(), ctx.funcDef().ID().getText());
        node.addChild(visit(ctx.funcDef().block()));
        return node;
    }
    @Override public ASTNode visitClassRule(FlaskPythonParser.ClassRuleContext ctx) {
        var node = new ClassDefNode(ctx.classDef().getStart().getLine(), ctx.classDef().ID(0).getText());
        node.addChild(visit(ctx.classDef().block()));
        return node;
    }
    @Override public ASTNode visitAssignmentRule(FlaskPythonParser.AssignmentRuleContext ctx) {
        var node = new AssignNode(ctx.assignStmt().getStart().getLine(), ctx.assignStmt().ID().getText());
        node.addChild(visit(ctx.assignStmt().expression()));
        return node;
    }
    @Override public ASTNode visitIfRule(FlaskPythonParser.IfRuleContext ctx) {
        var node = new IfNode(ctx.ifStmt().getStart().getLine());
        node.addChild(visit(ctx.ifStmt().expression(0)));
        return node;
    }
    @Override public ASTNode visitReturnRule(FlaskPythonParser.ReturnRuleContext ctx) {
        var node = new ReturnNode(ctx.returnStmt().getStart().getLine());
        if(ctx.returnStmt().expression() != null) node.addChild(visit(ctx.returnStmt().expression()));
        return node;
    }
    @Override public ASTNode visitDecoratorRule(FlaskPythonParser.DecoratorRuleContext ctx) {
        var node = new DecoratorNode(ctx.decoratorStmt().getStart().getLine(), ctx.decoratorStmt().dottedName().getText());
        if(ctx.decoratorStmt().funcDef() != null) {
             var funcCtx = ctx.decoratorStmt().funcDef();
             var funcNode = new FuncDefNode(funcCtx.getStart().getLine(), funcCtx.ID().getText());
             funcNode.addChild(visit(funcCtx.block()));
             node.addChild(funcNode);
        }
        return node;
    }
    @Override public ASTNode visitExpressionRule(FlaskPythonParser.ExpressionRuleContext ctx) {
        return visit(ctx.exprStmt().expression());
    }
    
    @Override public ASTNode visitBlock(FlaskPythonParser.BlockContext ctx) {
        var blockNode = new GenericNode("Block");
        
        for(var child : ctx.children) {
            if(child instanceof FlaskPythonParser.ReturnStmtContext) {
                var stmtCtx = (FlaskPythonParser.ReturnStmtContext)child;
                var node = new ReturnNode(stmtCtx.getStart().getLine());
                if(stmtCtx.expression() != null) node.addChild(visit(stmtCtx.expression()));
                blockNode.addChild(node);
            } else if(child instanceof FlaskPythonParser.GlobalStmtContext) {
                var stmtCtx = (FlaskPythonParser.GlobalStmtContext)child;
                blockNode.addChild(new GenericNode("Global: " + stmtCtx.idList().getText()));
            } else if(child instanceof FlaskPythonParser.AssignStmtContext) {
                var stmtCtx = (FlaskPythonParser.AssignStmtContext)child;
                var node = new AssignNode(stmtCtx.getStart().getLine(), stmtCtx.ID().getText());
                node.addChild(visit(stmtCtx.expression()));
                blockNode.addChild(node);
            } else if(child instanceof FlaskPythonParser.ExprStmtContext) {
                var stmtCtx = (FlaskPythonParser.ExprStmtContext)child;
                blockNode.addChild(visit(stmtCtx.expression()));
            }
        }
        
        return blockNode;
    }
    
    @Override public ASTNode visitMethodCallExpr(FlaskPythonParser.MethodCallExprContext ctx) {
        return new GenericNode("Method Call: " + ctx.dottedName().getText() + "()");
    }
    @Override public ASTNode visitFuncCallExpr(FlaskPythonParser.FuncCallExprContext ctx) {
        return new GenericNode("Function Call: " + ctx.ID().getText() + "()");
    }
    @Override public ASTNode visitListExpr(FlaskPythonParser.ListExprContext ctx) {
        return new GenericNode("List");
    }
    @Override public ASTNode visitDictExpr(FlaskPythonParser.DictExprContext ctx) {
        return new GenericNode("Dict");
    }
    @Override public ASTNode visitMemberAccessExpr(FlaskPythonParser.MemberAccessExprContext ctx) {
        return new GenericNode("Member Access: " + ctx.getText());
    }
    @Override public ASTNode visitStringLit(FlaskPythonParser.StringLitContext ctx) {
        return new GenericNode("String: " + ctx.getText());
    }
    @Override public ASTNode visitFStringLit(FlaskPythonParser.FStringLitContext ctx) {
        return new GenericNode("f-String: " + ctx.getText());
    }
    @Override public ASTNode visitNumberLit(FlaskPythonParser.NumberLitContext ctx) {
        return new GenericNode("Number: " + ctx.NUMBER().getText());
    }
    @Override public ASTNode visitVarLit(FlaskPythonParser.VarLitContext ctx) {
        return new GenericNode("Variable: " + ctx.ID().getText());
    }
    @Override public ASTNode visitMathExpr(FlaskPythonParser.MathExprContext ctx) {
        return new GenericNode("Math: " + ctx.getText());
    }
    @Override public ASTNode visitCompExpr(FlaskPythonParser.CompExprContext ctx) {
        return new GenericNode("Comparison: " + ctx.getText());
    }
    
    @Override protected ASTNode defaultResult() { return new GenericNode("Unknown"); }
}
