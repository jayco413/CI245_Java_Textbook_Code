import java.util.Scanner;

public class InputHandlerCharSentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;

        System.out.println("Enter integers (q to quit):");

        while (!(userInput = input.next()).equalsIgnoreCase("q")) {
            int number = Integer.parseInt(userInput);
            System.out.println("You entered: " + number);
        }

        System.out.println("End of input.");
    }
}
