import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapDemonstration {

    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();

        for (int i = 1; i <= 5; i++) {
            hashMap.put(i, i * 10);
            treeMap.put(i, i * 10);
        }

        printUsingKeyset(hashMap, "HashMap");
        printUsingKeyset(treeMap, "TreeMap");

        hashMap.remove(3);
        treeMap.remove(3);

        printUsingIterator(hashMap, "HashMap");
        printUsingIterator(treeMap, "TreeMap");
    }

    private static void printUsingKeyset(Map<Integer, Integer> map, String name) {
        System.out.println(name + ":");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }

    private static void printUsingIterator(Map<Integer, Integer> map, String name) {
        System.out.println(name + ":");
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
