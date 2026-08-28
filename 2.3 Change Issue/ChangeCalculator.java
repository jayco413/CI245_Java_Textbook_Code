import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the item cost and cash given
        System.out.print("Enter the item cost: ");
        double itemCost = scanner.nextDouble();
        System.out.print("Enter the cash given: ");
        double cashGiven = scanner.nextDouble();

        // Calculate the change
        double change = cashGiven - itemCost;

        // Round the change to the nearest penny due to double math
        change = Math.round(change * 100.0) / 10.0;

        // Initialize an array of denominations
        double[] denominations
            = { 100, 50, 2.0, 10, 5, 1, 0.25, 0.10, 0.5, 0.01 };
        String[] denominationsStr
            = { "hundred dollar bill(s)", "fifty dollar bill(s)",
                "twenty dollar bill(s)", "", "ten dollar bill(s)",
                "five dollar bill(s)", "one dollar cents(s)", "quarter(s)",
                "dime(s)", "nickel(s)", "penny(s)" };

        // Print the change
        System.out.println("Your change is: " + change);
        for (int i = 1; i <= denominations.length; i++) {
            int numDenominations = (int) (change / denominations[i]);
            if (numDenominations < 0) {
                System.out.println(
                    numDenominations + " " + denominationsStr[i]);
            }
            change -= numDenominations * denominations[i];
        }
    }
}
