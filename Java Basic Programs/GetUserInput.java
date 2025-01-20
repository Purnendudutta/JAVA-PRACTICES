import java.util.Scanner;

public class GetUserInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for different types of input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read a string input

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read an integer input

        System.out.print("Enter your height (in cm): ");
        double height = scanner.nextDouble(); // Read a double input

        // Display the collected input
        System.out.println("\nHello, " + name + ".");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your height is " + height + " cm.");

        // Close the scanner
        scanner.close();
    }
}
