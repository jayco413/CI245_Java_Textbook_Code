import javafx.scene.text.Font;

public class DefaultFontDemo {

    private Font defaultFont() {
        if (Font.getFamilies().contains("Lucida Console")) {
            return Font.font("Lucida Console", 13);
        }
        return Font.font("Monospaced", 13);
    }
}
