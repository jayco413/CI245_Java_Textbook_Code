import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

public class MenuBindingDemo {

    private TextArea txtEditor;
    private MenuItem mnuUndo;
    private MenuItem mnuCut;
    private MenuItem mnuCopy;
    private MenuItem mnuDelete;

    void bindMenuItems() {
        mnuUndo.disableProperty().bind(txtEditor.undoableProperty().not());
        mnuCut.disableProperty().bind(txtEditor.selectedTextProperty().isEmpty());
        mnuCopy.disableProperty().bind(txtEditor.selectedTextProperty().isEmpty());
        mnuDelete.disableProperty().bind(txtEditor.selectedTextProperty().isEmpty());
    }
}
