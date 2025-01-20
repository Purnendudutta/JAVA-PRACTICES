import java.util.Scanner;

public class PrimeNumbers {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i * i <= num; i++) {  // Check divisibility up to sqrt(num)
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // It's a prime number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the input
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();
        
        System.out.println("Prime numbers from 1 to " + N + ":");
        
        // Loop through numbers from 1 to N
        for (int i = 1; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        
        // Close the scanner
        scanner.close();
        }
    }
}
