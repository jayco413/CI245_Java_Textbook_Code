import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class RectangleMover {

    private Rectangle rect;
    private TextField status;
    private Pane parent;
    private int direction;
    private int pauseCount = 0;

    public RectangleMover(Rectangle rect, TextField status, Pane parent, int direction) {
        this.rect = rect;
        this.status = status;
        this.parent = parent;
        this.direction = direction;
    }

    public void move() {
        if (pauseCount == 0) {
            rect.setLayoutX(rect.getLayoutX() + direction);

            if (isChildFullyContained(parent, rect)) {
                status.setText("Fully Contained");
            } else if (isChildPartiallyContained(parent, rect)) {
                status.setText("Partially Contained");
            } else if (isChildUncontained(parent, rect)) {
                status.setText("Uncontained");
                direction *= -1;
                pauseCount++;
            }
        } else if (pauseCount == 101) {
            pauseCount = 0;
        } else {
            pauseCount++;
        }
    }

    public boolean isIntersecting(Node node2) {
        Bounds bounds1 = this.rect.getBoundsInParent();
        Bounds bounds2 = node2.getBoundsInParent();
        return bounds1.intersects(bounds2);
    }

    public boolean isChildFullyContained(Node parent, Node child) {
        // ADD YOUR CODE HERE
        return false;
    }

    public boolean isChildPartiallyContained(Node parent, Node child) {
        // ADD YOUR CODE HERE
        return false;
    }

    public boolean isChildUncontained(Node parent, Node child) {
        // ADD YOUR CODE HERE
        return false;
    }
}
