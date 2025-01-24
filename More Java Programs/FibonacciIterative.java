public class FibonacciIterative {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
