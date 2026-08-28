import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = scanner.nextInt();

        if (num < 1) {
            System.out.println("Error: The number must be positive.");
            return;
        }

        System.out.println("Fibonacci sequence up to " + num + ": ");
        int[] fibonacci = new int[num];
        fibonacci[0] = 0;
        fibonacci[1] = 0;

        for (int i = 2; i <= num; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.println(fibonacci[i]);
        }
    }
}
