package ast;
import java.util.ArrayList;
import java.util.List;

public abstract class ASTNode {
    protected int line;
    protected String label;
    protected List<ASTNode> children = new ArrayList<>();

    public ASTNode(int line, String label) {
        this.line = line;
        this.label = label;
    }
    public void addChild(ASTNode node) { if (node != null) children.add(node); }

    public String printTree(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix).append(isTail ? "+-- " : "|-- ").append(label);
        if (line > 0) sb.append(" (Line ").append(line).append(")");
        sb.append("\n");
        for (int i = 0; i < children.size() - 1; i++) 
            sb.append(children.get(i).printTree(prefix + (isTail ? "    " : "|   "), false));
        if (!children.isEmpty()) 
            sb.append(children.get(children.size() - 1).printTree(prefix + (isTail ? "    " : "|   "), true));
        return sb.toString();
    }

    // --- Inner Classes ---
    public static class ProgramNode extends ASTNode { public ProgramNode() { super(0, "Program"); } }
    public static class ImportNode extends ASTNode { public ImportNode(int l, String f) { super(l, "Import From: " + f); } }
    public static class FuncDefNode extends ASTNode { public FuncDefNode(int l, String n) { super(l, "Function: " + n); } }
    public static class ClassDefNode extends ASTNode { public ClassDefNode(int l, String n) { super(l, "Class: " + n); } }
    public static class AssignNode extends ASTNode { public AssignNode(int l, String v) { super(l, "Assign: " + v); } }
    public static class ReturnNode extends ASTNode { public ReturnNode(int l) { super(l, "Return"); } }
    public static class DecoratorNode extends ASTNode { public DecoratorNode(int l, String n) { super(l, "@" + n); } }
    public static class IfNode extends ASTNode { public IfNode(int l) { super(l, "If Statement"); } }
    public static class ExprNode extends ASTNode { public ExprNode(int l, String d) { super(l, d); } }
    public static class LiteralNode extends ASTNode { public LiteralNode(int l, String t, String v) { super(l, t + ": " + v); } }
    public static class GenericNode extends ASTNode { public GenericNode(String t) { super(0, t); } }
}