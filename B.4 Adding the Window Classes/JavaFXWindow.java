import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public abstract class JavaFXWindow extends Application {

    private Object controller = null;

    public Object getController() {
        return controller;
    }

    protected abstract String getStageTitle();

    private Parent loadFXML() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
            JavaFXWindow.class.getResource(
                this.getClass().getSimpleName() + ".fxml"));
        Parent p = fxmlLoader.load();
        controller = fxmlLoader.getController();
        return p;
    }

    public void openNewWindow(double screenX, double screenY) throws IOException {
        Stage s = new Stage();
        s.setX(screenX);
        s.setY(screenY);
        start(s);
    }

    public void runAsStartUpWindow() {
        launch(this.getClass());
    }

    @Override
    public void start(Stage stage) throws IOException {
        startWindow(stage, getStageTitle());
    }

    private void startWindow(Stage stage, String title) throws IOException {
        Scene scene = new Scene(loadFXML());
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }
}
