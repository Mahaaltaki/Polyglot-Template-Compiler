// Generated from src/main/antlr4/TemplateHTMLParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TemplateHTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TemplateHTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TemplateHTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(TemplateHTMLParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateHTMLParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(TemplateHTMLParser.NodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateHTMLParser#doctype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctype(TemplateHTMLParser.DoctypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateHTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(TemplateHTMLParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateHTMLParser#normalElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalElement(TemplateHTMLParser.NormalElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateHTMLParser#voidElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidElement(TemplateHTMLParser.VoidElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateHTMLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(TemplateHTMLParser.AttributeContext ctx);
}