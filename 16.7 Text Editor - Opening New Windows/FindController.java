import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class FindController {

    @FXML
    private TextField txtSearch;

    @FXML
    private CheckBox cbxMatchCase;

    @FXML
    private RadioButton radDown;

    @FXML
    private Button btnFindNext;

    private TextEditorController editor;

    @FXML
    void btnFindNext_OnAction(ActionEvent event) {
        editor.find(txtSearch.getText(), cbxMatchCase.isSelected(),
            radDown.isSelected());
    }

    @FXML
    void btnCancel_OnAction(ActionEvent event) {
        // YOUR CODE HERE
    }

    public void setEditor(TextEditorController editor) {
        this.editor = editor;
    }
}
