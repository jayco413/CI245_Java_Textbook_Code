import java.util.Scanner;

public class FloorMethod {

    public static void main(String[] args) {
        double number, multiple;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = input.nextDouble();
        System.out.print("Enter multiple: ");
        multiple = input.nextDouble();
        System.out.printf("Result: %.2f", floor(number, multiple));
    }

    private static double floor(double number, double multiple) {
        // YOUR CODE HERE
        return 0.0;
    }
}
