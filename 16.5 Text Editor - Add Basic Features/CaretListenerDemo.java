import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextArea;

public class CaretListenerDemo {

    private TextArea txtEditor;

    void attachListener() {
        txtEditor.caretPositionProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable,
                    Number oldValue, Number newValue) {
                // recompute and display the current line and column here
            }
        });
    }
}
