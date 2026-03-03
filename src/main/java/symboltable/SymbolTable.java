package symboltable;
import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    public static class Symbol {
        String name, type, scope;
        public Symbol(String n, String t, String s) { name=n; type=t; scope=s; }
    }
    private List<Symbol> symbols = new ArrayList<>();
    private String name;
    public SymbolTable(String n) { this.name = n; }
    public void define(String n, String t, String s) { symbols.add(new Symbol(n, t, s)); }
    public void printTable() {
        System.out.println("--- " + name + " SYMBOL TABLE ---");
        for(Symbol s : symbols) System.out.printf("%-20s %-15s %-10s\n", s.name, s.type, s.scope);
        System.out.println("-------------------------------------");
    }
}