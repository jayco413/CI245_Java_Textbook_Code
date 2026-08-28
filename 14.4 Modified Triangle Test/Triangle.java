public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height) throws TriangleDimensionException {
        setBase(base);
        setHeight(height);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) throws TriangleDimensionException {
        if (base <= 0) {
            throw new TriangleDimensionException("base <= 0");
        }
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws TriangleDimensionException {
        if (height <= 0) {
            throw new TriangleDimensionException("height <= 0");
        }
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public double getPrismVolume(double thickness) throws TriangleDimensionException {
        if (thickness <= 0) {
            throw new TriangleDimensionException("thickness <= 0");
        }
        return getArea() * thickness;
    }
}
