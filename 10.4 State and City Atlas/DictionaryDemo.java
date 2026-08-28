import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryDemo {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> dictionary = new HashMap<>();

        dictionary.put("apple", new ArrayList<>());
        dictionary.get("apple").add("A fruit that grows on apple trees.");
        dictionary.get("apple").add("A tech company.");

        dictionary.put("book", new ArrayList<>());
        dictionary.get("book").add("A set of written or printed pages.");

        dictionary.put("cat", new ArrayList<>());
        dictionary.get("cat").add("A small carnivorous mammal.");

        dictionary.put("elephant", new ArrayList<>());
        dictionary.get("elephant").add("A large herbivorous mammal.");

        System.out.println("Printing entire dictionary:");
        printDictionary(dictionary);

        dictionary.get("apple").remove(1);
        System.out.println("\nAfter removing a definition of 'apple':");
        printDictionary(dictionary);

        dictionary.remove("cat");
        System.out.println("\nAfter removing 'cat':");
        printDictionary(dictionary);
    }

    public static void printDictionary(HashMap<String, ArrayList<String>> dic) {
        for (String word : dic.keySet()) {
            System.out.println("Word: " + word);
            System.out.println("Definitions: " + dic.get(word));
        }
    }
}
