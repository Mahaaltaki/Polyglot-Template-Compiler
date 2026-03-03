# Polyglot-Template-Compiler

A high-performance multi-language compiler system built with ANTLR4 and Java. This project provides a robust engine for parsing and analyzing Python (Flask), CSS, and HTML template files, generating structured Abstract Syntax Trees (AST) and comprehensive Symbol Tables.

## 🚀 Key Features

### 🐍 Python (Flask) Support
- **Advanced Parsing**: Handles Flask-specific decorators, function definitions, and complex assignments.
- **Modern Syntax**: Full support for Python `f-strings` and multi-line expressions.
- **Contextual Analysis**: Tracks global variables and local function scopes.

### 🎨 CSS Analysis
- **Selector Engine**: Efficiently parses class selectors, IDs, and element selectors.
- **Property Mapping**: Maps CSS properties and values into a structured format for easy analysis.

### 🌐 HTML Template Engine
- **Lexer Modes**: Implements advanced Lexer Modes to ensure zero collision between text content and HTML tags.
- **Standard Compliance**: Handles standard elements, attributes, and void elements (e.g., `<img>`, `<br>`, `<meta>`).
- **Jinja Compatibility**: Designed to be extendable for Jinja2-style template syntax.

---

## 🏗 Architecture

The project follows a classic compiler design pattern:
1.  **Lexical Analysis**: Tokenizes source files using ANTLR4 grammars.
2.  **Syntax Analysis**: Builds a Parse Tree based on language-specific rules.
3.  **Semantic Mapping**: Uses custom Visitors to transform Parse Trees into structured **AST** (Abstract Syntax Trees).
4.  **Symbol Tracking**: Populates a **Symbol Table** to manage identifiers, scopes, and types across all files.

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
Compile the entire project including AST nodes, Symbol Table logic, and Visitors:
```powershell
javac -cp "antlr-4.13.1-complete.jar" -d out src/main/java/ast/*.java src/main/java/symboltable/*.java src/main/java/antlr/*.java src/main/java/visitor/*.java src/main/java/Main.java
```

### 3. Execution
Run the compiler to analyze the provided test files (`test_files/`):
```powershell
java -cp "antlr-4.13.1-complete.jar;out" Main
```

---

## 📂 Project Structure

- `src/main/antlr4/`: Language grammars.
- `src/main/java/ast/`: AST node definitions.
- `src/main/java/symboltable/`: Symbol table implementation.
- `src/main/java/visitor/`: Concrete implementations of language visitors.
- `test_files/`: Sample files for Python, CSS, and HTML analysis.

