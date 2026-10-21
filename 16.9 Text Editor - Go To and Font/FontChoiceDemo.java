import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class FontChoiceDemo {

    private ListView<String> lstFamily;
    private Label lblSample;

    void showFonts() {
        lstFamily.getItems().addAll(Font.getFamilies());

        Font chosen = Font.font("Lucida Console", FontWeight.BOLD,
            FontPosture.ITALIC, 14);
        lblSample.setFont(chosen);
    }
}
