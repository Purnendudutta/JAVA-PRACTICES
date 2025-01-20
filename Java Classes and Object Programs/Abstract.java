// Define the abstract class Shape
abstract class Shape {
    String color;

    // Abstract method (no implementation)
    abstract double calculateArea();

    // Regular method with implementation
    void display() {
        System.out.println("Shape color: " + color);
    }
}

// Subclass Circle extends the abstract class Shape
class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    // Implement the abstract method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Rectangle extends the abstract class Shape
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    // Implement the abstract method
    @Override
    double calculateArea() {
        return length * width;
    }
}

// Main class to create objects and interact with them
public class Abstract {
    public static void main(String[] args) {
        // Create objects of Circle and Rectangle
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        // Call methods on the objects
        circle.display();
        System.out.println("Circle area: " + circle.calculateArea());

        rectangle.display();
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}
