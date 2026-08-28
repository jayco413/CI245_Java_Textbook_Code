import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PowerSet {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int size;
        while (true) {
            System.out.print("Enter element count: ");
            size = keyboard.nextInt();

            if (size < 0 || size > 10) {
                System.out.println("Invalid input! Please try again.");
            } else {
                break;
            }
        }

        List<Integer> input = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            input.add(i);
        }

        List<List<Integer>> powerSet = getPowerSet(input);

        int count = 0;
        System.out.print("{");
        for (List<Integer> subset : powerSet) {
            System.out.print("{" + subset.toString().replace("[", "")
                .replace("]", "") + "}");
            if (++count % 5 == 0) {
                System.out.println(",");
            } else if (count < powerSet.size()) {
                System.out.print(",");
            }
        }
        System.out.println("}");
        System.out.println("Power set elements: " + powerSet.size());
        keyboard.close();
    }

    private static List<List<Integer>> getPowerSet(List<Integer> input) {
        List<List<Integer>> result = new ArrayList<>();

        if (input.isEmpty()) {
            // Base Case
            // ADD YOUR CODE HERE, ONE LINE OF CODE
        } else {
            // Recursive Case
            // ADD YOUR CODE HERE, MAX TEN LINES OF CODE, CAN BE DONE IN LESS
        }

        return result;
    }
}
