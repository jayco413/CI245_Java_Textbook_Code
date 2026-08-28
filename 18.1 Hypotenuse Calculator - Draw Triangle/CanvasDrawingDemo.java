import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CanvasDrawingDemo {

    @FXML
    private Canvas canvas;

    public void drawRectangle() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.RED);
        gc.fillRect(0, 0, 200, 100);
    }

    public void drawShapes() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        gc.strokeRect(0, 0, 200, 100);
        gc.setFill(Color.BLUE);
        gc.fillOval(50, 50, 100, 50);
        gc.setStroke(Color.GREEN);
        gc.strokeOval(50, 50, 100, 50);
    }
}
