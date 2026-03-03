import antlr.*;
import ast.ASTNode;
import symboltable.SymbolTable;
import visitor.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(">>> STARTING COMPLETE COMPILER PROJECT <<<\n");

            processPython("test_files/app.py");
            System.out.println("-------------------------------------");
            processCSS("test_files/style.css");
            System.out.println("-------------------------------------");
            processHTML("test_files/templates/index.html");
            System.out.println("-------------------------------------");
            processHTML("test_files/templates/add_product.html");
            System.out.println("-------------------------------------");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processPython(String filePath) throws IOException {
        System.out.println("Processing Python: " + filePath);
        FlaskPythonLexer lexer = new FlaskPythonLexer(CharStreams.fromPath(Paths.get(filePath)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FlaskPythonParser parser = new FlaskPythonParser(tokens);
        ParseTree tree = parser.program();

        PythonASTVisitor astVisitor = new PythonASTVisitor();
        ASTNode root = astVisitor.visit(tree);
        System.out.println("\n--- PYTHON AST ---");
        if(root != null) System.out.println(root.printTree("", true));

        PythonSymbolTableVisitor symVisitor = new PythonSymbolTableVisitor();
        symVisitor.visit(tree);
        symVisitor.getSymbolTable().printTable();
    }

    private static void processCSS(String filePath) throws IOException {
        System.out.println("Processing CSS: " + filePath);
        SimpleCSSLexer lexer = new SimpleCSSLexer(CharStreams.fromPath(Paths.get(filePath)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleCSSParser parser = new SimpleCSSParser(tokens);
        ParseTree tree = parser.stylesheet();

        CssASTVisitor astVisitor = new CssASTVisitor();
        ASTNode root = astVisitor.visit(tree);
        System.out.println("\n--- CSS AST ---");
        if(root != null) System.out.println(root.printTree("", true));

        CssSymbolTableVisitor cssVisitor = new CssSymbolTableVisitor();
        cssVisitor.visit(tree);
        cssVisitor.getSymbolTable().printTable();
    }

    private static void processHTML(String filePath) throws IOException {
        System.out.println("Processing HTML Template: " + filePath);
        TemplateHTMLLexer lexer = new TemplateHTMLLexer(CharStreams.fromPath(Paths.get(filePath)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TemplateHTMLParser parser = new TemplateHTMLParser(tokens);
        ParseTree tree = parser.htmlDocument();
        HtmlASTVisitor astVisitor = new HtmlASTVisitor();
        ASTNode root = astVisitor.visit(tree);
        System.out.println("\n--- HTML AST ---");
        if(root != null) System.out.println(root.printTree("", true));

        HtmlSymbolTableVisitor htmlVisitor = new HtmlSymbolTableVisitor();
        htmlVisitor.visit(tree);
        htmlVisitor.getSymbolTable().printTable();
    }
}
