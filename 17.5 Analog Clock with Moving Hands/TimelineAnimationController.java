import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.util.Duration;

public abstract class TimelineAnimationController {

    @FXML
    void initialize() {
        initializeConcrete();

        Timeline timelineAnimation = new Timeline(new KeyFrame(Duration.millis(10),
            new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    handleTimerIteration();
                }
            }));

        timelineAnimation.setCycleCount(Timeline.INDEFINITE);
        timelineAnimation.play();
    }

    protected abstract void handleTimerIteration();

    protected abstract void initializeConcrete();
}
