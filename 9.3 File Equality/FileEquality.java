import java.util.Scanner;

public class FileEquality {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename1 = scanner.nextLine();

        System.out.print("Enter filename: ");
        String filename2 = scanner.nextLine();

        if (areFilesEqual(filename1, filename2)) {
            System.out.println("These files are equal.");
        } else {
            System.out.println("These files are NOT equal.");
        }

        scanner.close();
    }

    public static boolean areFilesEqual(String filename1, String filename2) {
        // ADD YOUR CODE HERE
        return false;
    }
}
