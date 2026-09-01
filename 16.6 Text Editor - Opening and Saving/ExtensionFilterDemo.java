import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class ExtensionFilterDemo {
    void demo() {
        FileChooser fileChooser = new FileChooser();
        ExtensionFilter textFiles = new ExtensionFilter("Text Files", "*.txt");

        fileChooser.getExtensionFilters().addAll(
            textFiles,
            new ExtensionFilter("All Files", "*.*"));
        fileChooser.setSelectedExtensionFilter(textFiles);
    }
}
