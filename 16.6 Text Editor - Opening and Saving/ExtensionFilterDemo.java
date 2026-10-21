import java.io.File;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class ExtensionFilterDemo {

    private TextArea txtEditor;

    private final ExtensionFilter textFiles =
        new ExtensionFilter("Text Documents (*.txt)", "*.txt");
    private final ExtensionFilter allFiles = new ExtensionFilter("All Files", "*.*");

    void showOpenDialog() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open");
        fileChooser.getExtensionFilters().addAll(textFiles, allFiles);
        fileChooser.setSelectedExtensionFilter(textFiles);
        File f = fileChooser.showOpenDialog(getStage());
    }

    private Stage getStage() {
        return (Stage) txtEditor.getScene().getWindow();
    }
}
