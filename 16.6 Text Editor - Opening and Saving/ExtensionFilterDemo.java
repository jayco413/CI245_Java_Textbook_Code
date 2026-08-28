import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class ExtensionFilterDemo {
    void demo() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
            new ExtensionFilter("Text Files", "*.txt"),
            new ExtensionFilter("All Files", "*.*"));
        fileChooser.setSelectedExtensionFilter(new ExtensionFilter("Text Files", "*.txt"));
    }
}
