import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        while (true) {
            System.out.print("Enter a row: ");
            row = scanner.nextInt();

            if (row < 0 || row > 33) {
                System.out.println("Invalid input! Please try again.");
            } else {
                break;
            }
        }

        int[] resultRow = generateRow(row);

        System.out.print("Row:");
        for (int value : resultRow) {
            System.out.print(" " + value);
        }
        System.out.println();

        scanner.close();
    }

    private static int[] generateRow(int row) {
        // ADD YOUR RECURSIVE CODE HERE
        return new int[0];
    }
}
