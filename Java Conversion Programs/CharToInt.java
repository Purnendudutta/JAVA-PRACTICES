import java.util.Scanner;

public class CharToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0);

        int intValue = (int) charValue;

        System.out.println("The integer representation is: " + intValue);
        // Close the scanner
        scanner.close();
    }
}
