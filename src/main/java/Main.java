import antlr.*;
import visitor.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            PrintStream fileOut = new PrintStream(new FileOutputStream("compiler_output_log.txt"));
            PrintStream multiOut = new PrintStream(new MultiOutputStream(System.out, fileOut));
            System.setOut(multiOut);

            System.out.println("=================================================");
            System.out.println(">>> STARTING SEMANTIC ANALYSIS TEST SUITE <<<");
            System.out.println("=================================================\n");

            analyzeSemanticError("test_files/semantics/test_err1_undefined_var.py");
            analyzeSemanticError("test_files/semantics/test_err2_duplicate_func.py");
            analyzeSemanticError("test_files/semantics/test_err3_return_outside.py");
            analyzeSemanticError("test_files/semantics/test_err4_unresolved_global.py");
            analyzeSemanticError("test_files/semantics/test_err5_duplicate_route.py");
            analyzeSemanticError("test_files/semantics/test_err6_missing_import.py");

            System.out.println("\n>>> COMPILATION FINISHED. Output saved to 'compiler_output_log.txt' <<<");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void analyzeSemanticError(String filePath) {
        try {
            System.out.println("---------------------------------------------------------");
            System.out.println("Processing File: " + filePath);
            
            FlaskPythonLexer lexer = new FlaskPythonLexer(CharStreams.fromPath(Paths.get(filePath)));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            FlaskPythonParser parser = new FlaskPythonParser(tokens);
            ParseTree tree = parser.program();

            PythonSemanticAnalyzer analyzer = new PythonSemanticAnalyzer(Paths.get(filePath).getFileName().toString());
            analyzer.visit(tree);

            analyzer.getSymbolTable().printTable();

            List<String> errors = analyzer.getErrors();
            if (errors.isEmpty()) {
                System.out.println(">> No Semantic Errors Found.");
            } else {
                System.out.println("\n!!! SEMANTIC ERRORS DETECTED !!!");
                for (String error : errors) {
                    System.out.println(error);
                }
            }
            System.out.println("---------------------------------------------------------\n");

        } catch (Exception e) {
            System.out.println("Error reading file: " + filePath);
        }
    }
}
