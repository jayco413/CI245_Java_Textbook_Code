import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;

public class ResizableCanvas extends Canvas {

    public ResizableCanvas(Pane parent) {
        parent.getChildren().add(this);
        this.bindToParent();

        widthProperty().addListener(evt -> clearCanvas());
        heightProperty().addListener(evt -> clearCanvas());
    }

    public void clearCanvas() {
        GraphicsContext gc = this.getGraphicsContext2D();

        gc.setStroke(Color.BLACK);
        gc.setFill(Color.WHITE);
        gc.setLineWidth(3);

        gc.fillRect(0, 0, this.getWidth(), this.getHeight());
        gc.strokeRect(0, 0, this.getWidth(), this.getHeight());
    }

    @Override
    public boolean isResizable() {
        return true;
    }

    @Override
    public double prefWidth(double height) {
        return getWidth();
    }

    @Override
    public double prefHeight(double width) {
        return getHeight();
    }

    public void bindToParent() {
        if (this.getParent() instanceof Region) {
            this.widthProperty().bind(((Region) this.getParent()).widthProperty());
            this.heightProperty().bind(((Region) this.getParent()).heightProperty());
        }
    }
}
