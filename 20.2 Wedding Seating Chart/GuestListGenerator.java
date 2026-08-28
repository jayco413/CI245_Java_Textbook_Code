import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class GuestListGenerator {

    public static void generate(String filename, int guests, int hatePairs)
            throws FileNotFoundException {

        ArrayList<int[]> possible = new ArrayList<int[]>();
        for (int a = 1; a <= guests; a++) {
            for (int b = a + 1; b <= guests; b++) {
                possible.add(new int[] {a, b});
            }
        }
        Collections.shuffle(possible);

        try (PrintWriter writer = new PrintWriter(new File(filename))) {
            writer.println(guests);
            writer.println(hatePairs);
            for (int i = 0; i < hatePairs; i++) {
                writer.println(possible.get(i)[0] + " " + possible.get(i)[1]);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        generate("guests.txt", 40, 150);
        System.out.println("Wrote guests.txt");
    }
}
