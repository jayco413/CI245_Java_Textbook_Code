import java.io.File;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class TextEditorControllerSaveAs {

    @FXML
    private TextArea txtEditor;

    private File workingFile = null;

    @FXML
    void mnuSaveAs_OnAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Text File As...");

        fileChooser.getExtensionFilters().addAll(
            new ExtensionFilter("Text Files", "*.txt"));

        File f = fileChooser.showSaveDialog(getStage());

        if (f != null) {
            workingFile = f;
            saveWorkingFile();
            // TODO: update the stage title to show the current filename
        }
    }

    private Stage getStage() {
        return (Stage) txtEditor.getScene().getWindow();
    }

    private void saveWorkingFile() {
        // TODO: write txtEditor's text to workingFile
    }
}
