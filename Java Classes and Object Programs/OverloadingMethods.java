class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add an integer and a double
    public double add(int a, double b) {
        return a + b;
    }

    // Method to add a double and an integer
    public double add(double a, int b) {
        return a + b;
    }
}

public class OverloadingMethods  {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Calling overloaded methods
        System.out.println("Sum of two integers: " + calculator.add(10, 20));
        System.out.println("Sum of three integers: " + calculator.add(10, 20, 30));
        System.out.println("Sum of two doubles: " + calculator.add(5.5, 4.5));
        System.out.println("Sum of integer and double: " + calculator.add(10, 5.5));
        System.out.println("Sum of double and integer: " + calculator.add(5.5, 10));
    }
}
