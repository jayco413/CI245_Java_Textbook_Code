import java.io.File;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class TextEditorController {

    @FXML
    private TextArea txtEditor;

    private File workingFile = null;

    private void setWorkingFile(File f) {
        workingFile = f;
        // TODO: set the title to the file's name, or Untitled,
        // followed by " - Notepad"
    }

    private Stage getStage() {
        return (Stage) txtEditor.getScene().getWindow();
    }
}
