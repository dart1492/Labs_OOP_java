package lab4;

public class Pyramid extends Rectangle {

    private final double height;

    Pyramid() {
        // Rectangle();
        this.height = 1;
        System.out.println("Default constructor of the derived class");
    }

    Pyramid(double length, double width, double height ) {
        super(length, width);
        this.height = height;
        System.out.println("Parametrized constructor of the derived class");
    }


    double surface_area() {
        double side_area = Math.sqrt((super.length / 2.0) * (super.length / 2.0) + height * height)
		* super.perimeter() / 2.0;

        return side_area * super.area();
    }

    double volume() {
        return (super.area() * this.height) / 3.0;
    }

    void view() {
        super.view();
        System.out.println("Additional parameter (height): " + this.height);
    }
}
