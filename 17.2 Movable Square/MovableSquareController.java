import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class MovableSquareController extends TimelineAnimationController {

    @FXML
    private Pane paneBackground;

    @FXML
    private Rectangle rectMover;

    private ArrowKeyHandler arrowKeyHandler = new ArrowKeyHandler();

    @Override
    protected void handleTimerIteration() {
        arrowKeyHandler.performKeyEffects();
    }

    @Override
    protected void initializeConcrete() {
        // Nothing to do here. The key handler cannot be wired up yet: FXML
        // calls initialize() before the pane belongs to a Scene, so the first
        // timeline tick is the earliest moment a Scene exists to listen on.
    }

    private class ArrowKeyHandler extends KeyHandler {

        @Override
        protected void performKeyEffectsConcrete() {
            int speed = 5;
            if (isKeyActive(KeyCode.UP) && rectMover.getLayoutY() > 0) {
                rectMover.setLayoutY(rectMover.getLayoutY() - speed);
            }
            // Add conditions for the other three arrow keys and the pane's
            // right/bottom boundaries the same way.
        }

        @Override
        protected Scene getScene() {
            return paneBackground.getScene();
        }
    }
}
