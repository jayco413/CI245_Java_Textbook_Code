import java.util.ArrayList;
import java.util.Collections;

public class ShuffleDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");

        System.out.println("Before shuffling: " + list);
        Collections.shuffle(list);
        System.out.println("After shuffling: " + list);
    }
}
