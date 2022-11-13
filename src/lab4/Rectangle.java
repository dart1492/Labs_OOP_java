package lab4;

public class Rectangle {

    protected final double length;
    protected final double width;

    public Rectangle() {
        length = 1;
        width = 1;
        System.out.println("Default constructor of the base class...");
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Parametrized constructor of the base class...");
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return length * 2 + width * 2;
    }

    void view() {
        System.out.println("length: " + this.length + ", width:" + this.width );
    }
}
