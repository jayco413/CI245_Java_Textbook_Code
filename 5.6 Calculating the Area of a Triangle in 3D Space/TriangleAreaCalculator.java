import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first point (x, y, z): ");
        int[] point1 = { sc.nextInt(), sc.nextInt(), sc.nextInt() };

        System.out.print("Enter second point (x, y, z): ");
        int[] point2 = { sc.nextInt(), sc.nextInt(), sc.nextInt() };

        System.out.print("Enter third point (x, y, z): ");
        int[] point3 = { sc.nextInt(), sc.nextInt(), sc.nextInt() };

        System.out.printf(
            "The area of the triangle is: %.2f\n",
            getAreaOfTriangle(point1, point2, point3));
    }

    public static double getAreaOfTriangle(int[] pt1, int[] pt2, int[] pt3) {
        // YOUR CODE HERE
        return 0.0;
    }

    public static double euclideanDistance(int[] point1, int[] point2) {
        // YOUR CODE HERE
        return 0.0;
    }

    public static double heronsFormula(double side1, double side2, double side3) {
        // YOUR CODE HERE
        return 0.0;
    }
}
