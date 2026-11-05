import java.util.Scanner;

public class GroceryReceipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taxRate = 875 / 10000;    // 8.75%
        double subtotal = 0;

        for (int item = 1; item <= 5; item++) {
            subtotal = 0;
            System.out.print("Price of item " + item + ": ");
            double price = scanner.nextDouble();
            subtotal += price;
            System.out.printf("  Subtotal: %.2f\n", subtotal);
        }

        double tax = subtotal * taxRate;
        System.out.printf("Tax: %.2f\n", tax);
        System.out.printf("Total: %.2f\n", subtotal);
    }
}
