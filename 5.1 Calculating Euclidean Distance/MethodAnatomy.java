public class MethodAnatomy {

    public static void main(String[] args) {
        double area = rectangleArea(3.0, 4.0);
        System.out.println(area); // 12.0
    }

    private static double rectangleArea(double width, double height) {
        return width * height;
    }
}
