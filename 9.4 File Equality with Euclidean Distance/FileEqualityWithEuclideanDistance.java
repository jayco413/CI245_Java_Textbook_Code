import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class FileEqualityWithEuclideanDistance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename1 = scanner.nextLine();

        System.out.print("Enter filename: ");
        String filename2 = scanner.nextLine();

        int distance = getFileDistance(filename1, filename2);

        if (distance == 0) {
            System.out.println("These files are equal.");
        } else if (distance == -1) {
            System.out.println("These files are of different lengths.");
        } else {
            System.out.println(
                "These files are NOT equal. " +
                "The Euclidean distance between the files is: " + distance);
        }

        scanner.close();
    }

    public static int getFileDistance(String filename1, String filename2) {
        // ADD YOUR CODE HERE
        return 0;
    }

    private static double euclideanDistance(int[] point1, int[] point2) {
        // ADD YOUR CODE HERE
        return 0;
    }
}
