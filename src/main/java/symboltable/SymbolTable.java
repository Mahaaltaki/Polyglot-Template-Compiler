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
        System.out.println("\n+---------------------+-----------------+---------------------+");
        System.out.println("| " + padRight("SYMBOL NAME", 19) + " | " + padRight("TYPE", 15) + " | " + padRight("SCOPE", 19) + " |");
        System.out.println("+---------------------+-----------------+---------------------+");
        
        for(Symbol s : symbols) {
            System.out.println("| " + padRight(s.name, 19) + " | " + padRight(s.type, 15) + " | " + padRight(s.scope, 19) + " |");
        }
        
        System.out.println("+---------------------+-----------------+---------------------+");
    }
    
    private String padRight(String s, int n) {
        return String.format("%-" + n + "s", s.length() > n ? s.substring(0, n-3) + "..." : s);
    }
}