class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor to initialize a complex number
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    // Method to display a complex number
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        // Create two complex numbers
        ComplexNumber num1 = new ComplexNumber(3.5, 2.5);
        ComplexNumber num2 = new ComplexNumber(1.5, 4.5);

        // Add the two complex numbers
        ComplexNumber result = num1.add(num2);

        // Display the result
        System.out.println("First Complex Number: " + num1);
        System.out.println("Second Complex Number: " + num2);
        System.out.println("Sum of Complex Numbers: " + result);
    }
}
