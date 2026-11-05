import javafx.scene.shape.Rectangle;

public class PixelsPerUnit {

    private static final double PIXELS_PER_UNIT = 10;

    public static void main(String[] args) {
        Rectangle rectDisplay = new Rectangle(50, 50);
        Number newValue = 7.5;

        rectDisplay.setWidth(newValue.doubleValue() * PIXELS_PER_UNIT);

        System.out.println(rectDisplay.getWidth());
    }
}
