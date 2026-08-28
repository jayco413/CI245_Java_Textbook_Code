public class Calculator {

    public int add(int a, int b) {
        checkNonNegative(a);
        checkNonNegative(b);
        return a + b;
    }

    public int subtract(int a, int b) {
        checkNonNegative(a);
        checkNonNegative(b);
        return a - b;
    }

    public int multiply(int a, int b) {
        checkNonNegative(a);
        checkNonNegative(b);
        return a * b;
    }

    public int divide(int a, int b) {
        checkNonNegative(a);
        checkNonNegative(b);
        if (b == 0) {
            throw new ArithmeticException("Division by zero.");
        }
        return a / b;
    }

    private void checkNonNegative(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Negative argument not allowed.");
        }
    }
}
