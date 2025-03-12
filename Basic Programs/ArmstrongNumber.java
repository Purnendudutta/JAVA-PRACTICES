import java.util.Scanner;

public class ArmstrongNumber {
    
    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        
        // Find the number of digits
        int numberOfDigits = String.valueOf(number).length();
        
        // Sum of each digit raised to the power of numberOfDigits
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }
        
        return sum == originalNumber;
    }

    // Method to print all Armstrong numbers between two integers
    public static void printArmstrongNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the end number: ");
        int end = scanner.nextInt();
        
        // Print Armstrong numbers in the given range
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        printArmstrongNumbers(start, end);
        
        // Close scanner to avoid resource leak
        scanner.close();
    }
}
