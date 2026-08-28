import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ExpressionEvaluator {

    private static ArrayList<String> binaryOperators = new ArrayList<>();
    private static ArrayList<String> constants = new ArrayList<>();
    private static ArrayList<String> functions = new ArrayList<>();

    private static String leftParenthesis = "(";
    private static String rightParenthesis = ")";

    private static double evaluateExpression(double x, ArrayList<String> postfixTokens) {
        Stack<Double> evaluationStack = new Stack<>();

        // ADD YOUR CODE HERE -- evaluate the postfix expression
        evaluationStack.push(0.0);

        return evaluationStack.pop();
    }

    private static ArrayList<String> getInfixTokens(String expression) {
        ArrayList<String> infixTokens = new ArrayList<>();

        // ADD YOUR CODE HERE -- parse the expression into infix tokens

        return infixTokens;
    }

    private static ArrayList<String> getPostfixTokens(ArrayList<String> infixTokens) {
        ArrayList<String> outputQueue = new ArrayList<>();
        Stack<String> operatorStack = new Stack<>();

        // ADD YOUR CODE HERE -- apply the Shunting Yard algorithm

        return outputQueue;
    }

    private static int getPrecedence(String operator) {
        switch (operator) {
            case "^": return 3;
            case "*":
            case "/": return 2;
        }
        return 1;
    }

    private static boolean isLeftAssociative(String operator) {
        // Exponentiation is right-associative: 2 ^ 3 ^ 2 means 2 ^ (3 ^ 2).
        // Every other binary operator here is left-associative.
        switch (operator) {
            case "^": return false;
        }
        return true;
    }

    public static void main(String[] args) {
        performSetUp();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter expression: f(x) = ");
        String expression = input.nextLine();
        System.out.println();

        ArrayList<String> infixTokens = getInfixTokens(expression);
        ArrayList<String> postfixTokens = getPostfixTokens(infixTokens);
        System.out.println("  Infix Tokens: " + infixTokens.toString());
        System.out.println("Postfix Tokens: " + postfixTokens.toString());
        System.out.println();

        ArrayList<Double> xValues = new ArrayList<>();
        System.out.print("Enter values for x (q to quit): ");
        while (true) {
            try {
                xValues.add(input.nextDouble());
            } catch (Exception ex) {
                break;
            }
        }

        for (Double x : xValues) {
            double y = evaluateExpression(x, postfixTokens);
            System.out.printf("f(%.2f) = %.2f\n", x, y);
        }
    }

    private static void performSetUp() {
        setupOperators();
        setupFunctions();
        setupConstants();
    }

    private static void setupConstants() {
        constants.add("pi");
        constants.add("e");
        constants.add("x");
    }

    private static void setupFunctions() {
        functions.add("neg");
        functions.add("log10");
        functions.add("ln");
        functions.add("sin");
        functions.add("cos");
        functions.add("tan");
        functions.add("inv");
    }

    private static void setupOperators() {
        binaryOperators.add("+");
        binaryOperators.add("-");
        binaryOperators.add("*");
        binaryOperators.add("/");
        binaryOperators.add("^");
    }
}
