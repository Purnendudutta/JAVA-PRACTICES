// Demonstrating Polymorphism
class Shape {
    // Method to be overridden (runtime polymorphism)
    public void draw() {
        System.out.println("Drawing a generic shape.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}

// Demonstrating method overloading (compile-time polymorphism)
class Calculator {
    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two double values
    public double add(double a, double b) {
        return a + b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Runtime polymorphism example
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        Shape shape3 = new Triangle();

        shape1.draw(); // Calls Circle's draw method
        shape2.draw(); // Calls Rectangle's draw method
        shape3.draw(); // Calls Triangle's draw method

        // Compile-time polymorphism example
        Calculator calculator = new Calculator();

        System.out.println("Sum of two integers: " + calculator.add(5, 10));
        System.out.println("Sum of three integers: " + calculator.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + calculator.add(5.5, 10.5));
    }
}
