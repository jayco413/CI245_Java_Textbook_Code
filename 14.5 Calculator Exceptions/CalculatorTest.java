public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            int result = calculator.add(4, 5);
            System.out.println(result); // 9

            result = calculator.subtract(4, 5);
            System.out.println(result); // -1

            result = calculator.multiply(4, 5);
            System.out.println(result); // 20

            result = calculator.divide(4, 5);
            System.out.println(result); // 0

            result = calculator.divide(4, 0);
            // Will raise ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        try {
            int result = calculator.add(-4, 5);
            // Will raise IllegalArgumentException
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
