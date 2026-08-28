import java.util.Scanner;

public class ScannerNextLineIssue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a double: ");
        double d = input.nextDouble(); // leaves a newline in the buffer

        System.out.println("Your double: " + d);

        String s;
        System.out.print("Enter a string with spaces: ");

        // input.nextLine();  <-- uncommenting this fixes it: it consumes
        //                         the leftover newline from nextDouble()

        s = input.nextLine(); // reads that leftover newline as an empty line

        if (s.length() == 0) {
            System.out.println("The string is empty!");
        } else {
            System.out.println("Your string: " + s);
        }
    }
}
