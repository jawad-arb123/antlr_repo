package com.arbahi;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "Person { name: \"John\", age: 25 }";

        // Initialize Lexer and Parser
        PersonLexer lexer = new PersonLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PersonParser parser = new PersonParser(tokens);
        ParseTree tree = parser.person();

        // Print the raw parse tree
        System.out.println("Parse Tree:\n" + tree.toStringTree(parser));
    }
}