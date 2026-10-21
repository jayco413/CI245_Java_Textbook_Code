import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class MeasureTextDemo {

    private static double measure(String s, Font font, double width) {
        Text t = new Text(s.isEmpty() ? " " : s);
        t.setFont(font);
        t.setWrappingWidth(width);
        return t.getLayoutBounds().getHeight();
    }
}
