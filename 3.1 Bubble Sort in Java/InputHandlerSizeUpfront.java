import java.util.Scanner;

public class InputHandlerSizeUpfront {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many integers are you entering? ");
        int numInts = input.nextInt();
        int[] intArray = new int[numInts];

        System.out.println("Enter the integers:");

        for (int i = 0; i < numInts; i++) {
            intArray[i] = input.nextInt();
            System.out.println("You entered: " + intArray[i]);
        }

        System.out.println("End of input.");
    }
}
