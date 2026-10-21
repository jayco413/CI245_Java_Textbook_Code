import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.Clipboard;

public class PasteOnShowingDemo {

    private Menu mnuEdit;
    private MenuItem mnuPaste;

    void watchClipboard() {
        mnuEdit.setOnShowing(e ->
            mnuPaste.setDisable(!Clipboard.getSystemClipboard().hasString()));
    }
}
