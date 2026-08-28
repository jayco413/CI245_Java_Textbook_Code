import java.util.Scanner;

public class PrintAndJoin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How large is your array? ");
        int size = input.nextInt();

        int[] array = new int[size];
        System.out.print("Enter your array: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Enter your separator character: ");
        String separator = input.next();

        System.out.println("Join: " + join(array, separator));
        System.out.print("Print: ");
        print(array);
    }

    private static void print(int[] array) {
        // YOUR CODE HERE, MAX ONE LINE OF CODE
    }

    private static String join(int[] array, String separator) {
        // YOUR CODE HERE
        return "";
    }
}
