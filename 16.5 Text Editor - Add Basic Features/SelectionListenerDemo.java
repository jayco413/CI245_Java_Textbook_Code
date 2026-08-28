import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.IndexRange;
import javafx.scene.control.TextArea;

public class SelectionListenerDemo {

    private TextArea txtEditor;

    void attachListener() {
        txtEditor.selectionProperty().addListener(new ChangeListener<IndexRange>() {
            @Override
            public void changed(ObservableValue<? extends IndexRange> observable,
                    IndexRange oldValue, IndexRange newValue) {
                // recompute and display the current line and column here
            }
        });
    }
}
