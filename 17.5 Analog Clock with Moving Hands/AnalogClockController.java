import javafx.fxml.FXML;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;

public class AnalogClockController extends TimelineAnimationController {

    @FXML
    private Line hourHand;

    @FXML
    private Line minuteHand;

    @FXML
    private Line secondHand;

    @FXML
    private Rotate hourRotate;

    @FXML
    private Rotate minuteRotate;

    @FXML
    private Rotate secondRotate;

    @Override
    protected void initializeConcrete() {
        // The FXML's Rotate transforms already default to 0 degrees, so the
        // hands start at 12 o'clock without any code here -- this method is
        // only a natural place to double check that, or to seed the hands
        // at a specific starting time instead of midnight.
    }

    @Override
    protected void handleTimerIteration() {
        // ADD YOUR CODE HERE
        //
        // Each tick, read the current time (java.time.LocalTime.now() gives
        // hour/minute/second) and set hourRotate, minuteRotate, and
        // secondRotate's angles using the three formulas above. Until this
        // is filled in, the clock keeps showing the frozen midnight face
        // from the FXML.
    }
}
