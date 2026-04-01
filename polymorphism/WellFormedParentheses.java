import java.util.Stack;
import java.util.Scanner;

public class WellFormedParentheses {

    static boolean isMatch(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }

    static String checkWellFormed(String expression) {
        Stack<Character> stack = new Stack<>();

        System.out.println("\nTracing: " + expression);
        System.out.println("-----------------------------------");

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                System.out.println("Char: " + c + " -> PUSH | Stack: " + stack);
            }
            else if (c == ')' || c == ']' || c == '}') {

                if (stack.isEmpty()) {
                    System.out.println("Stack EMPTY! No matching open bracket.");
                    return "NOT WELL FORMED";
                }

                char top = stack.pop();

                if (!isMatch(top, c)) {
                    System.out.println("MISMATCH! " + top + " and " + c + " dont match.");
                    return "NOT WELL FORMED";
                }

                System.out.println("Char: " + c + " -> POP " + top + " matches | Stack: " + stack);
            }
        }

        if (stack.isEmpty()) {
            return "WELL FORMED";
        } else {
            System.out.println("Unmatched brackets remaining: " + stack);
            return "NOT WELL FORMED";
        }
    }

    public static void main(String[] args) {

        String[] testCases = {
            "([{}])",
            "([)]",
            "(()",
            "{[()]}",
            "((()))"
        };

        System.out.println("==============================");
        System.out.println("  PARENTHESES CHECKER");
        System.out.println("==============================");

        for (String test : testCases) {
            String result = checkWellFormed(test);
            System.out.println("Result: " + result);
            System.out.println("===================================");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your own expression: ");
        String input = sc.nextLine();
        String result = checkWellFormed(input);
        System.out.println("Result: " + result);
        sc.close();
    }
}