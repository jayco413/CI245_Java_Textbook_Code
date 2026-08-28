public class Combination {

    private enum ComputationType {
        FACTORIAL, RECURSIVE
    }

    public static void main(String[] args) {
        for (ComputationType computationType : ComputationType.values()) {
            System.out.printf("%s method\n", computationType);
            System.out.println();

            long startTime = System.nanoTime();

            combination(2, 2, computationType);
            combination(3, 2, computationType);
            combination(4, 3, computationType);
            combination(10, 2, computationType);
            combination(52, 5, computationType);
            combination(60, 4, computationType);
            combination(75, 3, computationType);
            combination(100, 4, computationType);

            long endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1e6;
            System.out.println("Run time for these calculations: " + duration +
                " milliseconds");
            System.out.println();
        }
    }

    public static void combination(int n, int k, ComputationType computationType) {
        System.out.print(n + " choose " + k + " = ");
        try {
            switch (computationType) {
                case FACTORIAL:
                    System.out.println(combinationFactorial(n, k));
                    break;
                case RECURSIVE:
                    System.out.println(combinationRecursive(n, k));
                    break;
            }
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic Exception!");
        }
    }

    private static int fact(int n) {
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        return prod;
    }

    private static int combinationFactorial(int n, int k) {
        // ADD YOUR CODE HERE, MAXIMUM ONE LINE OF CODE
        return 0;
    }

    public static int combinationRecursive(int n, int k) {
        // ADD YOUR CODE HERE, TARGET FOUR TO SEVEN LINES OF CODE
        // IT CAN POSSIBLY BE DONE IN LESS
        return 0;
    }
}
