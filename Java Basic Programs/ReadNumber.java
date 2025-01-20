import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read an integer from standard input
        int number = scanner.nextInt();

        // Print the number
        System.out.println("You entered: " + number);

        // Close the scanner
        scanner.close();
    }
}
