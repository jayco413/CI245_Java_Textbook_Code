import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrincipalCheckController {

    private static final String PRINCIPAL_HELP =
        "Principal must be a dollar amount above 0, like 250,000.";

    @FXML
    private TextField txtPrincipal;

    @FXML
    private TextField txtPayment;

    @FXML
    private Label lblMessage;

    @FXML
    void calculate() {
        double principal;
        try {
            principal = Double.parseDouble(txtPrincipal.getText()
                .replace("$", "").replace(",", "").trim());
        } catch (NumberFormatException e) {
            showError(txtPrincipal, PRINCIPAL_HELP);
            return;
        }
        if (!Double.isFinite(principal) || principal <= 0) {
            showError(txtPrincipal, PRINCIPAL_HELP);
            return;
        }
        // check the term the same way, then calculate
    }

    private void showError(TextField field, String message) {
        txtPayment.clear();
        lblMessage.setText(message);
        field.selectAll();
        field.requestFocus();
    }
}
