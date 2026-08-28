import java.util.Scanner;

public class ScannerNextLineFirst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;

        System.out.print("Enter a string with spaces: ");
        s = input.nextLine();

        if (s.length() == 0) {
            System.out.println("The string is empty!");
        } else {
            System.out.println("Your string: " + s);
        }
    }
}
