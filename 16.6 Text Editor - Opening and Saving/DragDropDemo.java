import java.io.File;
import javafx.scene.control.TextArea;
import javafx.scene.input.TransferMode;

public class DragDropDemo {

    private TextArea txtEditor;

    void acceptDroppedFiles() {
        txtEditor.setOnDragOver(e -> {
            if (e.getDragboard().hasFiles()) {
                e.acceptTransferModes(TransferMode.COPY);
                e.consume();
            }
        });
        txtEditor.setOnDragDropped(e -> {
            boolean opened = false;
            if (e.getDragboard().hasFiles()) {
                openFile(e.getDragboard().getFiles().get(0));
                opened = true;
            }
            e.setDropCompleted(opened);
            e.consume();
        });
    }

    public void openFile(File f) {
    }
}
