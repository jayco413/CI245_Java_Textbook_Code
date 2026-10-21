import java.util.Optional;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class GoToDialogDemo {

    private TextArea txtEditor;

    void askForLine() {
        TextInputDialog dialog = new TextInputDialog("1");
        dialog.initOwner(getStage());
        dialog.setTitle("Goto line");
        dialog.setHeaderText(null);
        dialog.setGraphic(null);
        dialog.setContentText("Line number:");
        dialog.getEditor().setTextFormatter(new TextFormatter<String>(change ->
            change.getControlNewText().matches("\\d*") ? change : null));

        Optional<String> answer = dialog.showAndWait();
    }

    private Stage getStage() {
        return (Stage) txtEditor.getScene().getWindow();
    }
}
