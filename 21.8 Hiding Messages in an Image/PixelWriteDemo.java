import javafx.application.Application;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PixelWriteDemo extends Application {

    @Override
    public void start(Stage stage) {
        int width = 4;
        int height = 4;
        int red = 255;
        int green = 255;
        int blue = 0;

        WritableImage image = new WritableImage(width, height);
        PixelWriter writer = image.getPixelWriter();
        writer.setColor(0, 0, Color.rgb(red, green, blue));

        System.out.println("Wrote pixel (0,0): " + image.getPixelReader().getColor(0, 0));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
