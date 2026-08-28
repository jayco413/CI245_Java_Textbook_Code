import java.util.HashMap;
import java.util.TreeMap;
import java.util.Scanner;

public class MountainTracker {

    private static final int MAX_NAME_LENGTH = 16;
    private static final int MAX_ELEVATION = 99999;
    private static final String QUIT_NAME = "-1";

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String name = promptForName(scanner);
            if (name.equals(QUIT_NAME)) break;

            int elevation = promptForElevation(scanner);

            // ADD YOUR CODE HERE -- put name/elevation into both maps
        }

        printDirectories(hashMap, treeMap);

        System.out.println("Please enter mountains to remove (quit with -1):");
        while (true) {
            String nameToRemove = scanner.next();
            if (nameToRemove.equals(QUIT_NAME)) break;

            // ADD YOUR CODE HERE -- remove nameToRemove from both maps
        }

        printDirectories(hashMap, treeMap);

        scanner.close();
    }

    private static String promptForName(Scanner scanner) {
        while (true) {
            System.out.print("Please enter the mountain name (or -1 to quit): ");
            String name = scanner.next();
            if (name.equals(QUIT_NAME) || name.length() <= MAX_NAME_LENGTH) return name;
            System.out.println("INVALID NAME PLEASE TRY AGAIN");
        }
    }

    private static int promptForElevation(Scanner scanner) {
        while (true) {
            System.out.print("Please enter the mountain elevation: ");
            int elevation = scanner.nextInt();
            if (elevation >= 0 && elevation <= MAX_ELEVATION) return elevation;
            System.out.println("INVALID ELEVATION PLEASE TRY AGAIN");
        }
    }

    private static void printDirectories(
            HashMap<String, Integer> hashMap, TreeMap<String, Integer> treeMap) {
        System.out.println();
        System.out.println(
            "      |          HashMap          |          TreeMap          |");
        System.out.println(
            "Entry |                  | Elev.  |                  | Elev.  |");
        System.out.println(
            "------|------------------|--------|------------------|--------|");

        // ADD YOUR CODE HERE -- print each map's entries side by side

        System.out.println();
    }
}
