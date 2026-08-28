import java.io.File;
import java.util.ArrayList;

public class TxtFileLister {

    private static String[] getTxtFiles() {
        File directory = new File(".");
        File[] filesList = directory.listFiles((dir, name) -> name.endsWith(".txt"));
        ArrayList<String> txtFilesList = new ArrayList<>();
        if (filesList != null) {
            for (File file : filesList) {
                if (file.isFile()) {
                    txtFilesList.add(file.getName());
                }
            }
        }
        return txtFilesList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        for (String name : getTxtFiles()) {
            System.out.println(name);
        }
    }
}
