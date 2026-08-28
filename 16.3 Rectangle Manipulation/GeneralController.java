import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class GeneralController {

    @FXML
    private Slider sldGeneral;

    @FXML
    private TextField txtGeneral;

    @FXML
    void initialize() {
        txtGeneral.textProperty().bind(
            sldGeneral.valueProperty().asString("%.0f"));

        sldGeneral.valueProperty().addListener(
            new ChangeListener<Number>() {
                @Override
                public void changed(
                        ObservableValue<? extends Number> ov,
                        Number oldValue, Number newValue) {
                    // react to the new slider value here
                }
            }
        );
    }
}
