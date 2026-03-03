// Generated from src/main/antlr4/FlaskPythonParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FlaskPythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FlaskPythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ProgramRule}
	 * labeled alternative in {@link FlaskPythonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramRule(FlaskPythonParser.ProgramRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportRule}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportRule(FlaskPythonParser.ImportRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionRule}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionRule(FlaskPythonParser.FunctionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassRule}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassRule(FlaskPythonParser.ClassRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentRule}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentRule(FlaskPythonParser.AssignmentRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfRule}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfRule(FlaskPythonParser.IfRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnRule}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnRule(FlaskPythonParser.ReturnRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorRule}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorRule(FlaskPythonParser.DecoratorRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalRule}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalRule(FlaskPythonParser.GlobalRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionRule}
	 * labeled alternative in {@link FlaskPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRule(FlaskPythonParser.ExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(FlaskPythonParser.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#globalStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStmt(FlaskPythonParser.GlobalStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(FlaskPythonParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(FlaskPythonParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(FlaskPythonParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(FlaskPythonParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(FlaskPythonParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(FlaskPythonParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#decoratorStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorStmt(FlaskPythonParser.DecoratorStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FlaskPythonParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(FlaskPythonParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(FlaskPythonParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#dottedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedName(FlaskPythonParser.DottedNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLit}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLit(FlaskPythonParser.NumberLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictExpr(FlaskPythonParser.DictExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(FlaskPythonParser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpr(FlaskPythonParser.ListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarLit}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarLit(FlaskPythonParser.VarLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberAccessExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessExpr(FlaskPythonParser.MemberAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FStringLit}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFStringLit(FlaskPythonParser.FStringLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpr(FlaskPythonParser.MathExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpr(FlaskPythonParser.MethodCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCallExpr}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpr(FlaskPythonParser.FuncCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLit}
	 * labeled alternative in {@link FlaskPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLit(FlaskPythonParser.StringLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(FlaskPythonParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(FlaskPythonParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(FlaskPythonParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#dictPairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictPairs(FlaskPythonParser.DictPairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskPythonParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(FlaskPythonParser.PairContext ctx);
}