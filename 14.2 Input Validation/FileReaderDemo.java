import java.io.*;

public class FileReaderDemo {

    public void readFile(String filename) {
        try {
            File file = new File(filename);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + filename);
        } finally {
            System.out.println("File reading completed or an error occurred.");
        }
    }

    public static void main(String[] args) {
        FileReaderDemo demo = new FileReaderDemo();
        demo.readFile("sample.txt");
    }
}
