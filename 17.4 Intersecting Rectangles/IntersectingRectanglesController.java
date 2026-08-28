import java.security.SecureRandom;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class IntersectingRectanglesController
        extends TimelineAnimationController {

    @FXML
    private Button btnReset;

    @FXML
    private CheckBox cbxIntersecting;

    @FXML
    private Pane paneBackground;

    @FXML
    private Rectangle rectBlue;

    @FXML
    private Rectangle rectRed;

    @FXML
    private TextField txtBlueStatus;

    @FXML
    private TextField txtRedStatus;

    boolean setup = false;
    ArrayList<RectangleMover> movers = new ArrayList<>();

    @FXML
    void btnReset_onAction(ActionEvent event) {
        setup = false;
    }

    @Override
    protected void handleTimerIteration() {
        if (!setup && paneBackground.getWidth() != 0.0) {
            SecureRandom sr = new SecureRandom();
            sizeAndPositionRectangle(sr, true, rectRed);
            sizeAndPositionRectangle(sr, false, rectBlue);

            rectRed.setFill(Color.rgb(255, 0, 0, 0.5));
            rectRed.setViewOrder(1);
            rectBlue.setFill(Color.rgb(0, 0, 255));
            rectBlue.setViewOrder(2);

            movers.clear();
            movers.add(new RectangleMover(
                rectRed, txtRedStatus, paneBackground, 1));
            movers.add(new RectangleMover(
                rectBlue, txtBlueStatus, paneBackground, -1));

            cbxIntersecting.setSelected(false);
            setup = true;
        } else if (setup) {
            for (RectangleMover rt : movers) {
                rt.move();
            }

            if (areNodesIntersecting(rectRed, rectBlue)) {
                cbxIntersecting.setSelected(true);
            } else {
                cbxIntersecting.setSelected(false);
            }
        }
    }

    @Override
    protected void initializeConcrete() {
        assertPaneAndRectanglesAreNotNull();
    }

    private void assertPaneAndRectanglesAreNotNull() {
        assert paneBackground != null;
        assert rectBlue != null;
        assert rectRed != null;
        assert txtBlueStatus != null;
        assert txtRedStatus != null;
    }

    public boolean areNodesIntersecting(Node node1, Node node2) {
        // ADD YOUR CODE HERE
        return false;
    }

    private void sizeAndPositionRectangle(
            SecureRandom sr, boolean isLeftSide, Rectangle rect) {
        // ADD YOUR CODE HERE
    }
}
