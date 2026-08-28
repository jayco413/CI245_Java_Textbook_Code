import java.io.IOException;
import java.util.Scanner;

public class FileSaveAndRead {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = keyboard.nextLine();

        System.out.print("Enter String 1: ");
        String line1 = keyboard.nextLine();
        System.out.print("Enter String 2: ");
        String line2 = keyboard.nextLine();
        System.out.print("Enter String 3: ");
        String line3 = keyboard.nextLine();

        System.out.println();
        System.out.println("... Writing to File ...");
        // ADD YOUR CODE HERE -- join line1/line2/line3 with line separators
        // and write the result to filename using any FileHandler method

        System.out.println();
        System.out.println("... Reading File Back ...");
        System.out.println();
        // ADD YOUR CODE HERE -- read filename back and print its contents

        keyboard.close();
    }
}
