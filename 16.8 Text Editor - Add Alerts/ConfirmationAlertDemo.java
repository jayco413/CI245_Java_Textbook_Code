import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class ConfirmationAlertDemo {

    private TextArea txtEditor;

    void askToSave() {
        Alert alert = new Alert(AlertType.WARNING,
            "The text in the Untitled file has changed.\n\n"
            + "Do you want to save the changes?",
            ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.initOwner(getStage());
        alert.setTitle("Notepad");
        alert.setHeaderText(null);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isEmpty() || result.get() == ButtonType.CANCEL) {
            // stop: do not do whatever was about to happen
        } else if (result.get() == ButtonType.YES) {
            // save first, then go ahead
        } else {
            // No: go ahead and lose the changes
        }
    }

    private Stage getStage() {
        return (Stage) txtEditor.getScene().getWindow();
    }
}
