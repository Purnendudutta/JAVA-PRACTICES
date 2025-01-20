import java.util.Scanner;

public class Factorial {
    
    // Method to calculate factorial
    public static long factorial(int n) {
        long result = 1;
        
        // Calculate the factorial using a loop
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Ensure the number is non-negative
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate and display the factorial
            long result = factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        }
        
        // Close the scanner
        scanner.close();
    }
}
