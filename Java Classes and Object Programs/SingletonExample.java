// SingletonExample.java
public class SingletonExample {

    // Step 1: Create a private static instance of the class (initially null)
    private static SingletonExample instance;

    // Step 2: Make the constructor private to prevent instantiation from outside
    private SingletonExample() {
        System.out.println("Singleton instance created.");
    }

    // Step 3: Provide a public static method to get the single instance
    public static SingletonExample getInstance() {
        if (instance == null) {
            synchronized (SingletonExample.class) { // Thread-safe initialization
                if (instance == null) { // Double-checked locking
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }

    // Example method to demonstrate singleton usage
    public void showMessage() {
        System.out.println("Hello from the Singleton class!");
    }

    // Main method to test the Singleton class
    public static void main(String[] args) {
        // Try to create multiple references to the Singleton instance
        SingletonExample singleton1 = SingletonExample.getInstance();
        SingletonExample singleton2 = SingletonExample.getInstance();

        // Check if both references point to the same instance
        System.out.println("Are both references equal? " + (singleton1 == singleton2));

        // Call a method on the Singleton instance
        singleton1.showMessage();
    }
}
