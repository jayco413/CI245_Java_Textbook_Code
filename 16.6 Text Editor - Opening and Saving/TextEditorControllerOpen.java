import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class TextEditorControllerOpen {

    @FXML
    private TextArea txtEditor;

    private final ExtensionFilter textFiles =
        new ExtensionFilter("Text Documents (*.txt)", "*.txt");
    private final ExtensionFilter allFiles = new ExtensionFilter("All Files", "*.*");

    @FXML
    void mnuOpen_OnAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open");
        fileChooser.getExtensionFilters().addAll(textFiles, allFiles);
        fileChooser.setSelectedExtensionFilter(textFiles);

        File f = fileChooser.showOpenDialog(getStage());

        if (f != null) {
            openFile(f);
        }
    }

    public void openFile(File f) {
        try {
            String text = decode(Files.readAllBytes(f.toPath()));
            // TODO: put the text in the editor and adopt f as the working file
        } catch (IOException e) {
            // TODO: report the failure in an error alert
        }
    }

    private String decode(byte[] bytes) {
        return null;
    }

    private Stage getStage() {
        return (Stage) txtEditor.getScene().getWindow();
    }
}
