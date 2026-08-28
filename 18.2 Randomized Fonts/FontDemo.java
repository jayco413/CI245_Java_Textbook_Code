import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.Font;

public class FontDemo {
    public static void main(String[] args) {
        Canvas canvas = new Canvas(600, 400);

        Font font = new Font("Arial", 14);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFont(font);

        gc.fillText("Hello, World!", 50, 50);
    }
}
