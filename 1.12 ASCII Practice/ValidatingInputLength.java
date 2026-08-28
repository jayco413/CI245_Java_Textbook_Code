import java.util.Scanner;

public class ValidatingInputLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x;
        do {
            System.out.print("Enter a string: ");
            x = input.next();
            if (x.length() > 10) {
                System.out.println("Too long, try again.");
            }
        } while (x.length() > 10);
    }
}
