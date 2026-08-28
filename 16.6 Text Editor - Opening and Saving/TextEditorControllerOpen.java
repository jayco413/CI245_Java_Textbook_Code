import java.io.File;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class TextEditorControllerOpen {

    @FXML
    private TextArea txtEditor;

    private File workingFile = null;

    @FXML
    void mnuOpen_OnAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Text File");

        fileChooser.getExtensionFilters().addAll(
            new ExtensionFilter("Text Files", "*.txt"));

        File f = fileChooser.showOpenDialog(getStage());

        if (f != null) {
            try {
                // TODO: read f's contents into txtEditor
                new java.io.FileReader(f).close();
                setWorkingFile(f);
            } catch (IOException e) {
                // TODO: handle the exception
            }
        }
    }

    private Stage getStage() {
        return (Stage) txtEditor.getScene().getWindow();
    }

    private void setWorkingFile(File f) {
        workingFile = f;
    }
}
