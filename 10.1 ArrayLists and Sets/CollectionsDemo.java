import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionsDemo {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        String element1 = "Banana";
        String element2 = "Apple";

        arrayList.add(element1);
        arrayList.add(element2);
        hashSet.add(element1);
        hashSet.add(element2);
        treeSet.add(element1);
        treeSet.add(element2);

        System.out.println("After adding two unique elements:");
        printCollections(arrayList, hashSet, treeSet);

        arrayList.add(element1);
        hashSet.add(element1);
        treeSet.add(element1);

        System.out.println("\nAfter adding a duplicate element:");
        printCollections(arrayList, hashSet, treeSet);
    }

    public static void printCollections(
            ArrayList<String> arrayList, HashSet<String> hashSet, TreeSet<String> treeSet) {
        System.out.println("ArrayList: " + arrayList);
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
