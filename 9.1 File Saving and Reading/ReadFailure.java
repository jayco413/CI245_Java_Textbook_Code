import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFailure {

    public static void main(String[] args) {
        System.out.println(fileLength("text.txt"));
        System.out.println(fileLength("nosuchfile.txt"));
    }

    public static int fileLength(String filename) {
        try {
            byte[] contents = Files.readAllBytes(Paths.get(filename));
            return contents.length;
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return -1;
        }
    }
}
