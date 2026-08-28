import java.util.Scanner;

public class EuclideanDistance {

    public static void main(String[] args) {
        double[] point1, point2;

        System.out.print("How many dimensions? ");
        Scanner input = new Scanner(System.in);
        int dimensions = input.nextInt();
        point1 = new double[dimensions];
        point2 = new double[dimensions];

        System.out.print("Enter first point: ");
        for (int i = 0; i < point1.length; i++) {
            point1[i] = input.nextDouble();
        }

        System.out.print("Enter second point: ");
        for (int i = 0; i < point1.length; i++) {
            point2[i] = input.nextDouble();
        }

        System.out.printf("Euclidean distance: %.2f",
            euclideanDistance(point1, point2));
    }

    private static double euclideanDistance(double[] point1, double[] point2) {
        // YOUR CODE HERE
        return 0.0;
    }
}
