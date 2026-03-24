# Polyglot-Template-Compiler

A high-performance multi-language compiler system built with ANTLR4 and Java. This project provides a robust engine for parsing and analyzing Python (Flask), CSS, and HTML template files, generating structured Abstract Syntax Trees (AST), comprehensive Symbol Tables, and advanced Semantic Analysis with error detection.

## 🚀 Key Features

### 🐍 Python (Flask) Support
- **Advanced Parsing**: Handles Flask-specific decorators, function definitions, and complex assignments.
- **Modern Syntax**: Full support for Python `f-strings` and multi-line expressions.
- **Semantic Analysis**: Complete error detection for undefined variables, duplicate functions, invalid returns, and more.
- **Contextual Analysis**: Tracks global variables and local function scopes.

### 🔍 Semantic Analyzer
- **Error Detection**: Identifies 6+ types of semantic errors with precise line and column information.
- **Scope Management**: Proper handling of global and local variable scopes.
- **Flask Validation**: Checks for missing imports and duplicate routes.
- **Clear Error Messages**: Detailed error descriptions with type, location, and explanation.
- **Test Suite**: Comprehensive test files with intentional semantic errors for validation.

### 🎨 CSS Analysis
- **Selector Engine**: Efficiently parses class selectors, IDs, and element selectors.
- **Property Mapping**: Maps CSS properties and values into a structured format for easy analysis.

### 🌐 HTML Template Engine
- **Lexer Modes**: Implements advanced Lexer Modes to ensure zero collision between text content and HTML tags.
- **Standard Compliance**: Handles standard elements, attributes, and void elements (e.g., `<img>`, `<br>`, `<meta>`).
- **Full Jinja2 Support**: Complete parsing and analysis of Jinja2 template syntax including:
  - **Variables**: `{{ variable }}` and `{{ object.property }}`
  - **Loops**: `{% for item in items %}` ... `{% endfor %}`
  - **Conditions**: `{% if condition %}` ... `{% else %}` ... `{% endif %}`
- **Smart Symbol Classification**: Distinguishes between different Jinja2 constructs:
  - `JINJA VARIABLE`: Template variables
  - `JINJA LOOP VAR`: Loop iteration variables
  - `JINJA ITERABLE`: Loop collections
  - `JINJA CONDITION`: Conditional expressions

### 📊 Advanced Output Features
- **Formatted ASCII Tables**: Beautiful, readable symbol tables with proper alignment and borders.
- **Dual Output System**: Simultaneous display in terminal and file output via `MultiOutputStream`.
- **Timestamped Reports**: Automatic generation of timestamped output files (`compiler_output_YYYY-MM-DD_HH-mm-ss.txt`).
- **Complete Analysis Logs**: Full AST and symbol table documentation saved for later review.
- **Semantic Error Reports**: Clear, structured error messages with line/column information.

---

## 🏗 Architecture

The project follows a classic compiler design pattern:
1.  **Lexical Analysis**: Tokenizes source files using ANTLR4 grammars.
2.  **Syntax Analysis**: Builds a Parse Tree based on language-specific rules.
3.  **Semantic Analysis**: Advanced error detection and scope management using `PythonSemanticAnalyzer`.
4.  **AST Generation**: Uses custom Visitors to transform Parse Trees into structured **AST** (Abstract Syntax Trees).
5.  **Symbol Tracking**: Populates a **Symbol Table** to manage identifiers, scopes, and types across all files.
6.  **Multi-Output**: Simultaneous terminal and file output via `MultiOutputStream`.

---

## 🛠 Prerequisites

- **Java JDK**: version 11 or higher.
- **ANTLR**: version 4.13.1 (provided as `antlr-4.13.1-complete.jar`).

---

## 🏁 Building and Running

### 1. Generate ANTLR Components
Generate the Java lexers and parsers from the `.g4` grammar files:
```powershell
java -jar antlr-4.13.1-complete.jar -Dlanguage=Java -package antlr -visitor -no-listener -o src/main/java/antlr src/main/antlr4/FlaskPythonLexer.g4 src/main/antlr4/FlaskPythonParser.g4 src/main/antlr4/SimpleCSS.g4 src/main/antlr4/TemplateHTMLLexer.g4 src/main/antlr4/TemplateHTMLParser.g4
```

### 2. Compile Source Code
Compile the entire project including AST nodes, Symbol Table logic, Visitors, and MultiOutputStream:
```powershell
javac -cp "antlr-4.13.1-complete.jar" -d out src/main/java/ast/*.java src/main/java/symboltable/*.java src/main/java/antlr/*.java src/main/java/visitor/*.java src/main/java/MultiOutputStream.java src/main/java/Main.java
```

### 3. Execution
Run the compiler to analyze the provided test files (`test_files/`):
```powershell
java -cp "antlr-4.13.1-complete.jar;out" Main
```

### 4. Semantic Analysis Testing
The compiler automatically runs semantic analysis on test files in `test_files/semantics/`:
- **Error Detection**: Identifies undefined variables, duplicate functions, invalid returns, etc.
- **Output**: Saves detailed reports to `compiler_output_log.txt`
- **Test Files**: 6 test files with intentional semantic errors for validation

### 5. Output Files
The compiler automatically generates timestamped output files containing:
- Complete AST trees for all analyzed files
- Formatted symbol tables with Jinja2 variable classification
- Semantic error reports with precise line/column information
- Terminal output preserved in text format
- Example filename: `compiler_output_2026-03-16_15-36-49.txt`

---

## 📂 Project Structure

- `src/main/antlr4/`: Language grammars including Jinja2 template support.
- `src/main/java/ast/`: AST node definitions.
- `src/main/java/symboltable/`: Symbol table implementation with formatted output.
- `src/main/java/visitor/`: Concrete implementations of language visitors and semantic analyzer.
- `src/main/java/MultiOutputStream.java`: Dual output system for terminal and file logging.
- `test_files/`: Sample files for Python, CSS, and HTML analysis.
- `test_files/semantics/`: Test files with intentional semantic errors for validation.
- `compiler_output_*.txt`: Auto-generated analysis reports.
- `compiler_output_log.txt`: Semantic analysis test suite results.

## 📋 Sample Output

### Semantic Error Reports
```
!!! SEMANTIC ERRORS DETECTED !!!
>> [SEMANTIC ERROR - UNDEFINED_VARIABLE] Line 8, Col 8: Variable 'x' is used before assignment.
>> [SEMANTIC ERROR - RETURN_OUTSIDE_FUNCTION] Line 7, Col 0: 'return' statement cannot be used outside of a function.
>> [SEMANTIC ERROR - UNRESOLVED_GLOBAL] Line 8, Col 4: Global variable 'products' used in function but never defined in global scope.
```

### Symbol Table Example
```
+---------------------+-----------------+---------------------+
| SYMBOL NAME         | TYPE            | SCOPE               |
+---------------------+-----------------+---------------------+
| Flask               | MODULE_IMPORT   | Global              |
| app                 | VARIABLE        | Global              |
| products            | VARIABLE        | Global              |
| products            | GLOBAL_REF      | Local               |
+---------------------+-----------------+---------------------+
```

### Supported Jinja2 Constructs
- **Variables**: `{{ title }}`, `{{ product.name }}`, `{{ user.email }}`
- **Loops**: `{% for item in items %}` ... `{% endfor %}`
- **Conditions**: `{% if condition %}` ... `{% endif %}`
- **Nested Expressions**: `{% for product in products %}` with `{{ product.name }}`

## 🎯 Semantic Error Types Detected

1. **UNDEFINED_VARIABLE**: Variables used before assignment
2. **DUPLICATE_DECLARATION**: Functions or variables declared multiple times
3. **RETURN_OUTSIDE_FUNCTION**: Return statements outside function scope
4. **UNRESOLVED_GLOBAL**: Global variables referenced but not defined
5. **MISSING_FLASK_IMPORT**: Flask functions used without proper imports
6. **DUPLICATE_ROUTE**: Same Flask route path registered multiple times

## 🎯 Clean Code Principles

This project follows clean-code practices:
- **No embedded comments** in core source files
- **Self-documenting code** with meaningful variable names
- **Consistent formatting** and structure
- **Modular design** with clear separation of concerns
- **Comprehensive testing** with semantic error validation
- **Professional output** with structured error reporting
