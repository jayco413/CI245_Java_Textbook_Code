import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class MoveableSquareController extends TimelineAnimationController {

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
        arrowKeyHandler.performKeyEffects();
    }

    private class ArrowKeyHandler extends KeyHandler {

        @Override
        protected void performKeyEffectsConcrete() {
            int speed = 5;
            if (isKeyActive(KeyCode.UP)
                    && paneBackground.getLayoutY() <= rectMover.getLayoutY()) {
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
