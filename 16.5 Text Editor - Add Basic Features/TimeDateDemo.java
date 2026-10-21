import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javafx.scene.control.TextArea;

public class TimeDateDemo {

    private TextArea txtEditor;

    void insertTimeDate() {
        DateTimeFormatter dtf =
            DateTimeFormatter.ofPattern("h:mm a M/d/yyyy", Locale.US);
        String timeDate = dtf.format(LocalDateTime.now());
        txtEditor.replaceSelection(timeDate);
    }
}
