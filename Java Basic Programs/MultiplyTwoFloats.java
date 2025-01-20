import java.util.Scanner;

public class MultiplyTwoFloats {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first floating-point number
        System.out.print("Enter the first floating-point number: ");
        float num1 = scanner.nextFloat();

        // Prompt the user for the second floating-point number
        System.out.print("Enter the second floating-point number: ");
        float num2 = scanner.nextFloat();

        // Multiply the two numbers
        float result = num1 * num2;

        // Display the result
        System.out.println("The result of multiplication is: " + result);
    
        // Close the scanner
        scanner.close();
    }
}
