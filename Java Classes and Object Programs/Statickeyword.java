class Counter {
    static int count = 0;  // Static variable

    Counter() {
        count++;  // Increment the static variable
    }

    static void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class Statickeyword {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter.displayCount();  // Output: Count: 2
    }
}
