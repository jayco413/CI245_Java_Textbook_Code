import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter up to 10 integers (q to quit):");
        for (int i = 0; i < 10; i++) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            } else {
                break;
            }
        }
        scanner.close();

        mergeSort(numbers);

        System.out.println("Sorted List:");
        System.out.println(numbers);
    }

    public static void mergeSort(List<Integer> list) {
        // Base case: If the list has 1 or 0 elements, it is already sorted.

        // ADD YOUR CODE HERE, SHOULD END THE FUNCTION AFTER COMPLETING

        // Recursive case: Sort the left and right halves.
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        // ADD YOUR CODE HERE, MAX 5 LINES OF CODE

        // Merge the sorted halves.
        merge(list, left, right);
    }

    private static void merge(List<Integer> result,
            List<Integer> left, List<Integer> right) {
        // ADD YOUR CODE HERE
    }
}
