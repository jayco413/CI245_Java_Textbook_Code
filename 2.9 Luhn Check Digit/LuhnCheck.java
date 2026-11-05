import java.util.Scanner;

public class LuhnCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a card number: ");
        String number = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            if (i % 2 == 1) {
                digit = digit * 2;
                if (digit > 9) {
                    digit = digit - 10;
                }
            }
            sum += digit;
        }

        if (sum % 10 == 0) {
            System.out.println(number + " is valid.");
        } else {
            System.out.println(number + " is not valid.");
        }
    }
}
