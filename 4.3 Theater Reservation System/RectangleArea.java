import java.util.Scanner;

public class RectangleArea {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double length = getUserInput("length");
        double width = getUserInput("width");
        double area = calculateArea(length, width);
        System.out.println("The area of the rectangle is: " + area);
    }

    public static double getUserInput(String dimension) {
        System.out.println("Enter " + dimension + ": ");
        return scanner.nextDouble();
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }
}
