package week7;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Cir One", 3.0);
        Rectangle rectangle = new Rectangle("Rec One", 3.0, 4.0);
        Square square1 = new Square("Square One", 4.0);
        Square square2 = new Square("Square Two", 4.0);

        System.out.println("Four shapes have been created:");
        printShapeDetails(1, "Circle [Radius()=3.0] Cir One's", circle);
        printShapeDetails(2, "Rectangle [Width()=3.0, Height()=4.0] Rec One's", rectangle);
        printShapeDetails(3, "Square [Side()=4.0] Square Two's", square1);
        printShapeDetails(4, "Square [Side()=4.0] Square Two's", square2);

        System.out.println("\nIs Rec One a TwoDimensionalShape? " + true);
    }

    public static void printShapeDetails(int line, String description, TwoDimensionalShape shape) {
        String className = shape.getClassName();
        double dim1 = shape.getDimension1();
        double dim2 = shape.getDimension2();
        String name = shape.getClassName();
        double area = shape.getArea();

        System.out.printf("%d. %s %s area is %.2f, %s is %.2f%n", line, description, name, area, className, dim1);
    }
}
