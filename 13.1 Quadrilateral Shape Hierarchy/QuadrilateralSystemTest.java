public class QuadrilateralSystemTest {

    public static void main(String[] args) {
        Quadrilateral quadrilateral = new Quadrilateral(
            new double[]{3.61, 4.47, 4.47, 5}, new double[]{93.18, 97.12, 90, 79.70});
        System.out.printf("Quadrilateral Area:      %.2f%n", quadrilateral.getArea());
        System.out.printf("Quadrilateral Perimeter: %.2f%n", quadrilateral.getPerimeter());

        Rectangle rectangle = new Rectangle(4, 5);
        System.out.printf("Rectangle Area:          %.2f%n", rectangle.getArea());
        System.out.printf("Rectangle Perimeter:     %.2f%n", rectangle.getPerimeter());

        Square square = new Square(4);
        System.out.printf("Square Area:             %.2f%n", square.getArea());
        System.out.printf("Square Perimeter:        %.2f%n", square.getPerimeter());

        Rhombus rhombus = new Rhombus(4, 60, 120);
        System.out.printf("Rhombus Area:            %.2f%n", rhombus.getArea());
        System.out.printf("Rhombus Perimeter:       %.2f%n", rhombus.getPerimeter());

        Parallelogram parallelogram = new Parallelogram(4, 5, 60, 120);
        System.out.printf("Parallelogram Area:      %.2f%n", parallelogram.getArea());
        System.out.printf("Parallelogram Perimeter: %.2f%n", parallelogram.getPerimeter());

        Trapezoid trapezoid = new Trapezoid(4, 5, 3);
        System.out.printf("Trapezoid Area:          %.2f%n", trapezoid.getArea());
        System.out.printf("Trapezoid Perimeter:     %.2f%n", trapezoid.getPerimeter());
    }
}
