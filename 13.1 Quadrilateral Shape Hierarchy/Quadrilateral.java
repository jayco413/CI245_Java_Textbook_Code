public class Quadrilateral {

    private double[] sides;
    private double[] angles;

    public Quadrilateral() {
        sides = new double[4];
        angles = new double[4];
    }

    public Quadrilateral(double[] sides, double[] angles) {
        if (sides.length != 4 || angles.length != 4) {
            throw new IllegalArgumentException(
                "Quadrilateral requires 4 sides and 4 angles.");
        }
        this.sides = sides.clone();
        this.angles = angles.clone();
    }

    public void setSide(int sideNum, double sideValue) {
        if (sideNum < 0 || sideNum > 3) {
            throw new IllegalArgumentException("sideNum must be between 0 and 3.");
        }
        sides[sideNum] = sideValue;
    }

    public void setAngle(int angleNum, double angleValue) {
        if (angleNum < 0 || angleNum > 3) {
            throw new IllegalArgumentException("angleNum must be between 0 and 3.");
        }
        angles[angleNum] = angleValue;
    }

    public double getArea() {
        // ADD YOUR CODE HERE, USE BRETSCHNEIDER'S FORMULA
        return 0;
    }

    public double getPerimeter() {
        // ADD YOUR CODE HERE
        return 0;
    }
}
