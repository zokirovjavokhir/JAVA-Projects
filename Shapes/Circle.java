package week7;


public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(String name, double radius) {
        super(name, radius, 0);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}


