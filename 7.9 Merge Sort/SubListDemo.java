import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubListDemo {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        printSubList(numbers, 1, 4);
    }

    public static void printSubList(List<Integer> list, int fromIndex, int toIndex) {
        List<Integer> subList = list.subList(fromIndex, toIndex);
        System.out.println("Sublist: " + subList);
    }
}
