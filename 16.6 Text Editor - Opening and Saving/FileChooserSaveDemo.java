import java.io.File;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileChooserSaveDemo {
    void demo(Stage stage) {
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showSaveDialog(stage);
    }
}
