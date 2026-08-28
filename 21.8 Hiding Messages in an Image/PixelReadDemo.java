import javafx.application.Application;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PixelReadDemo extends Application {

    @Override
    public void start(Stage stage) {
        WritableImage image = new WritableImage(2, 2);
        image.getPixelWriter().setColor(0, 0, Color.rgb(254, 254, 254));

        PixelReader reader = image.getPixelReader();
        Color c = reader.getColor(0, 0);
        System.out.println(c);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
