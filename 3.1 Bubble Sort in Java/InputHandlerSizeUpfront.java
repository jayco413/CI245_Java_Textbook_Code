import java.util.Scanner;

public class InputHandlerSizeUpfront {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many integers would you like to enter? ");
        int numInts = input.nextInt();
        int[] intArray = new int[numInts];

        System.out.print("Enter integers: ");

        for (int i = 0; i < numInts; i++) {
            intArray[i] = input.nextInt();
        }
    }
}
