import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class HelpTopicsDemo {

    private static final String[] TOPICS = {};
    private static final String[] BODIES = {};

    private ListView<String> lstTopics;
    private TextArea txtTopic;

    void showTopics() {
        lstTopics.getItems().addAll(TOPICS);
        lstTopics.getSelectionModel().selectedIndexProperty().addListener(
            (obs, oldValue, newValue) -> {
                int i = newValue.intValue();
                txtTopic.setText(i >= 0 ? BODIES[i] : "");
            });
        lstTopics.getSelectionModel().select(0);
    }
}
