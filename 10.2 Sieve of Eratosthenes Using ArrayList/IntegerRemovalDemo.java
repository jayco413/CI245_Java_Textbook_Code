import java.util.ArrayList;

public class IntegerRemovalDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(42);

        // Calls remove(int index) -- removes whatever is at position 42,
        // not the value 42. Throws IndexOutOfBoundsException here, since
        // the list only has one element.
        list.remove(42);

        // To remove the value itself, box it explicitly so overload
        // resolution has no ambiguity left to resolve:
        list.remove(Integer.valueOf(42));
    }
}
