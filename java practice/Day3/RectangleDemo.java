class Rectangle {
    double length;
    double breadth;

    // Default constructor
    Rectangle() {
        this(1.0, 1.0);
    }

    // Parameterized constructor (single parameter)
    Rectangle(double side) {
        this(side, side);
    }

    // Parameterized constructor (two parameters)
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    double calculateArea() {
        return length * breadth;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println(r1.calculateArea());
        System.out.println(r2.calculateArea());
        System.out.println(r3.calculateArea());
    }
}