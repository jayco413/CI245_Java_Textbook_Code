import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = scanner.nextInt();

        int[] resultRow = generateRow(row);

        System.out.print("Row: ");
        for (int value : resultRow) {
            System.out.print(value + " ");
        }
        System.out.println();

        scanner.close();
    }

    private static int[] generateRow(int row) {
        // ADD YOUR RECURSIVE CODE HERE
        return new int[0];
    }
}
