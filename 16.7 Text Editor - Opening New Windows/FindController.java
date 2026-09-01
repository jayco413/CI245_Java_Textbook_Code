import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FindController {

    @FXML
    private Button btnFindNext;

    @FXML
    private Button btnFindPrevious;

    @FXML
    private CheckBox cbxMatchCase;

    @FXML
    private TextField txtSearch;

    private TextArea txtEditor;

    @FXML
    void btnFindNext_OnAction(ActionEvent event) {
        findText(true);
    }

    @FXML
    void btnFindPrevious_OnAction(ActionEvent event) {
        findText(false);
    }

    private void findText(boolean findNext) {
        // YOUR CODE HERE
    }

    public void setEditor(TextArea editor) {
        this.txtEditor = editor;
    }
}
