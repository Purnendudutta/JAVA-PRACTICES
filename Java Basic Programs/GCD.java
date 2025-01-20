import java.util.Scanner;

public class GCD {
    
    // Function to find the GCD of two numbers using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;  // remainder
            a = temp;   // update a to the previous b
        }
        return a;  // GCD is stored in a
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Call the function to find GCD and display the result
        int gcd = findGCD(num1, num2);
        System.out.println("The GCD or HCF of " + num1 + " and " + num2 + " is: " + gcd);
        
        scanner.close();
    }
}

