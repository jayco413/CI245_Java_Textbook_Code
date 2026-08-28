import java.util.Scanner;

public class TriangleTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a base: ");
        double base = input.nextDouble();
        System.out.print("Enter a height: ");
        double height = input.nextDouble();
        System.out.print("Enter a thickness: ");
        double thickness = input.nextDouble();
        System.out.println();

        Triangle t = null;
        try {
            t = new Triangle(base, height);
        } catch (TriangleDimensionException e) {
            e.printStackTrace();
        }

        if (t != null) {
            System.out.printf("Base: %.3f units%n", t.getBase());
            System.out.printf("Height: %.3f units%n", t.getHeight());
            System.out.printf("Area: %.3f sq units%n", t.getArea());
            try {
                System.out.printf("Prism Volume: %.3f cu units%n",
                    t.getPrismVolume(thickness));
            } catch (TriangleDimensionException e) {
                e.printStackTrace();
            }
            System.out.println();

            System.out.println("*** doubling the base and height ***");
            System.out.println();
            try {
                t.setBase(t.getBase() * 2);
                t.setHeight(t.getHeight() * 2);
            } catch (TriangleDimensionException e) {
                e.printStackTrace();
            }

            System.out.printf("Base: %.3f units%n", t.getBase());
            System.out.printf("Height: %.3f units%n", t.getHeight());
            System.out.printf("Area: %.3f sq units%n", t.getArea());
            try {
                System.out.printf("Prism Volume: %.3f cu units%n",
                    t.getPrismVolume(thickness));
            } catch (TriangleDimensionException e) {
                e.printStackTrace();
            }
        }
    }
}
