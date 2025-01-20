import java.util.Scanner;

public class LCM {
    
    // Method to compute the GCD (Greatest Common Divisor) using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // Method to compute the LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);  // Formula: LCM(a, b) = (a * b) / GCD(a, b)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Compute and print the LCM
        int result = lcm(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + result);
        
        scanner.close();
    }
}
