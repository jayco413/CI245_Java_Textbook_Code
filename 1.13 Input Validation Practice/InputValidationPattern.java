import java.util.Scanner;

public class InputValidationPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isValid;
        int x;
        do {
            isValid = true;
            x = input.nextInt();
            if (x <= 0 || x >= 100)  isValid = false;
            if (!isPrime(x))         isValid = false;
            if (!isValid) System.out.println("Invalid. Try again.");
        } while (!isValid);
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
