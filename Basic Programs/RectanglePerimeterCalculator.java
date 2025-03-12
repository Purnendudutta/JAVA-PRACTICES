import java.util.Scanner;

public class RectanglePerimeterCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);

        System.out.println("The Perimeter of the rectangle is: " + perimeter);
    
        // Close the scanner
        scanner.close();
    }
}


//It calculates the perimeter using the formula:
//Perimeter = 2 * (Length + Width)
