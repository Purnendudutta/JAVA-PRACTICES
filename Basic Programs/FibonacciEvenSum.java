public class FibonacciEvenSum {
    
    // Method to calculate the sum of even Fibonacci numbers up to N
    public static int evenFibonacciSum(int N) {
        int sum = 0;
        int a = 0, b = 1;
        
        // Loop to generate Fibonacci numbers up to N
        while (b <= N) {
            // Check if the Fibonacci number is even
            if (b % 2 == 0) {
                sum += b;
            }
            
            // Generate the next Fibonacci number
            int next = a + b;
            a = b;
            b = next;
        }
        
        return sum;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int N = 100; // You can set any value for N
        System.out.println("Even Sum of Fibonacci Series till " + N + " is: " + evenFibonacciSum(N));
    }
}
