package week7;

public class TwoDimensionalShape {

    private double dimension1;
    private double dimension2;

    public TwoDimensionalShape(String name, double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public String getClassName() {
        return this.getClass().getSimpleName();
    }

    public double getArea() {
        return 0.0;
    }

    public double getDimension1() {
        return dimension1;
    }

    public double getDimension2() {
        return dimension2;
    }
}


