import java.util.*;

public class A1 {

    static boolean isKeyword(String word) {
        String[] keywords = {
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
            "class", "const", "continue", "default", "do", "double", "else", "enum",
            "extends", "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native", "new",
            "package", "private", "protected", "public", "return", "short", "static",
            "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
            "transient", "try", "void", "volatile", "while"
        };

        for (String keyword : keywords) {
            if (word.equals(keyword)) {
                return true;
            }
        }
        return false;
    }

    static void lexicalAnalysis(String inputCode) {
        String delimiters = "[ \\t\\n(){}\\[\\];,\\.\\+\\-\\*/%&|\\^<>=!]+";
        String[] tokens = inputCode.split(delimiters);

        for (String token : tokens) {
            if (!token.isEmpty() && isKeyword(token)) {
                System.out.println("Keyword: " + token);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Java code (single line):");
        String javaCode = sc.nextLine();

        lexicalAnalysis(javaCode);
        sc.close();
    }
}
