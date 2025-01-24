import java.util.stream.Stream;

public class FibonacciStreams {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series

        System.out.println("Fibonacci Series:");
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
              .limit(n)
              .forEach(t -> System.out.print(t[0] + " "));
    }
}
