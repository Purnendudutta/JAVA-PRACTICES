import java.util.Scanner;

public class NeonNumber {
    
    // Method to check if the number is a Neon Number
    public static boolean isNeonNumber(int number) {
        // Calculate the square of the number
        int square = number * number;
        
        // Find the sum of digits of the square
        int sum = 0;
        while (square > 0) {
            sum += square % 10;  // Add last digit to sum
            square /= 10;         // Remove the last digit
        }
        
        // Return true if the sum of digits equals the original number
        return sum == number;
    }

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is a Neon Number
        if (isNeonNumber(number)) {
            System.out.println(number + " is a Neon Number.");
        } else {
            System.out.println(number + " is not a Neon Number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
