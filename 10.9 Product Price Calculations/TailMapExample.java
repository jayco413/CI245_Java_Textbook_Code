import java.util.TreeMap;
import java.util.SortedMap;

public class TailMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        SortedMap<Integer, String> tailMap = map.tailMap(3);

        System.out.println(tailMap); // {3=Three, 4=Four, 5=Five}
    }
}
