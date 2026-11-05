import java.text.NumberFormat;
import java.util.Locale;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class RateReadoutController {

    private final NumberFormat percent =
        NumberFormat.getPercentInstance(Locale.US);

    @FXML
    private Slider sliderRate;

    @FXML
    private Label lblRate;

    @FXML
    void initialize() {
        percent.setMinimumFractionDigits(2);
        showRate();
        sliderRate.valueProperty().addListener(
            (observable, oldValue, newValue) -> showRate());
    }

    private void showRate() {
        lblRate.setText(percent.format(sliderRate.getValue() / 100.0));
    }
}
