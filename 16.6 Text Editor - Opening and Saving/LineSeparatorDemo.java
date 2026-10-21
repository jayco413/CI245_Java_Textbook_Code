import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import javafx.scene.control.TextArea;

public class LineSeparatorDemo {

    private TextArea txtEditor;
    private File workingFile;

    void writeWorkingFile() throws IOException {
        String text = txtEditor.getText().replace("\n", System.lineSeparator());
        Files.writeString(workingFile.toPath(), text, StandardCharsets.UTF_8);
    }
}
