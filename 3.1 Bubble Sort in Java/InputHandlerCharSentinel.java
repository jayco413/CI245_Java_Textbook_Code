import java.util.Scanner;

public class InputHandlerCharSentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;

        System.out.print("Enter integers (q to quit): ");

        while (!(userInput = input.next()).equalsIgnoreCase("q")) {
            int number = Integer.parseInt(userInput);
            // store number in your array here
        }
    }
}
