// Generated from src/main/antlr4/SimpleCSS.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleCSSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleCSSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code StylesheetRule}
	 * labeled alternative in {@link SimpleCSSParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheetRule(SimpleCSSParser.StylesheetRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RuleSetRule}
	 * labeled alternative in {@link SimpleCSSParser#ruleSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSetRule(SimpleCSSParser.RuleSetRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCSSParser#selectors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectors(SimpleCSSParser.SelectorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCSSParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(SimpleCSSParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCSSParser#selectorElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorElement(SimpleCSSParser.SelectorElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationRule}
	 * labeled alternative in {@link SimpleCSSParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationRule(SimpleCSSParser.DeclarationRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCSSParser#propName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropName(SimpleCSSParser.PropNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCSSParser#propValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropValue(SimpleCSSParser.PropValueContext ctx);
}