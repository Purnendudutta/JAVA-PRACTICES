import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        char charValue = (char) intValue;

        System.out.println("The character representation is: " + charValue);
        // Close the scanner
        scanner.close();
    }
}
