package week7;

import week7.TwoDimensionalShape;

public class Rectangle extends TwoDimensionalShape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name, width, height);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}


