import java.text.NumberFormat;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class HypotenuseCalculatorController {
    private static final NumberFormat twoDigits = NumberFormat.getNumberInstance();

    @FXML
    private Button btnCalculate;
    @FXML
    private TextField txtHypotenuse;
    @FXML
    private TextField txtLeg1;
    @FXML
    private TextField txtLeg2;
    @FXML
    private Canvas cvTriangle;

    @FXML
    void btnCalculate_onClick(ActionEvent event) {
        try {
            double smallLeg = Double.parseDouble(txtLeg1.getText());

            try {
                double largeLeg = Double.parseDouble(txtLeg2.getText());
                double legSwap = smallLeg;
                smallLeg = largeLeg < smallLeg ? largeLeg : smallLeg;
                largeLeg = legSwap > largeLeg ? legSwap : largeLeg;

                String smallLegText = twoDigits.format(smallLeg);
                String largeLegText = twoDigits.format(largeLeg);
                txtLeg1.setText(smallLegText);
                txtLeg2.setText(largeLegText);

                double hypotenuse =
                    Math.sqrt(smallLeg * smallLeg + largeLeg * largeLeg);
                String hypotenuseText = twoDigits.format(hypotenuse);
                txtHypotenuse.setText(hypotenuseText);

                GraphicsContext gc = cvTriangle.getGraphicsContext2D();
                // YOUR CODE HERE
            } catch (NumberFormatException ex) {
                txtLeg2.setText("Enter leg");
                txtLeg2.selectAll();
                txtLeg2.requestFocus();
            }
        } catch (NumberFormatException ex) {
            txtLeg1.setText("Enter leg");
            txtLeg1.selectAll();
            txtLeg1.requestFocus();
        }
    }

    @FXML
    void initialize() {
        twoDigits.setMaximumFractionDigits(2);
        twoDigits.setMinimumFractionDigits(2);
        twoDigits.setGroupingUsed(false);

        GraphicsContext gc = cvTriangle.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.WHITE);
        gc.setLineWidth(3);

        gc.fillRect(0, 0, 250, 250);
        gc.strokeRect(0, 0, 250, 250);
    }
}
