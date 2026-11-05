public class BisectionDemo {
    static final double X_MIN = -10;
    static final double X_MAX = 10;
    static final int WIDTH = 500;
    static final double PIXEL = (X_MAX - X_MIN) / WIDTH;

    static double toGraphX(int px) {
        return X_MIN + px * (X_MAX - X_MIN) / WIDTH;
    }

    static double difference(double x) {
        return Math.sin(x) * 5 - x / 2;
    }

    static double bisect(double left, double right) {
        while (right - left > PIXEL / 1000) {
            double middle = (left + right) / 2;
            if ((difference(left) < 0) == (difference(middle) < 0)) {
                left = middle;
            } else {
                right = middle;
            }
        }
        return (left + right) / 2;
    }

    public static void main(String[] args) {
        double previous = difference(toGraphX(0));
        for (int px = 1; px <= WIDTH; px++) {
            double current = difference(toGraphX(px));
            if (current == 0) {
                System.out.printf("Crossing at x = %.4f%n", toGraphX(px));
            } else if (previous < 0 && current > 0
                    || previous > 0 && current < 0) {
                double x = bisect(toGraphX(px - 1), toGraphX(px));
                System.out.printf("Crossing at x = %.4f%n", x);
            }
            previous = current;
        }
    }
}
