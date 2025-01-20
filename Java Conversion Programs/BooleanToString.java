import java.util.Scanner;

public class BooleanToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a boolean value (true/false): ");
        boolean boolValue = scanner.nextBoolean();

        String strValue = Boolean.toString(boolValue);

        System.out.println("The string representation is: " + strValue);
        // Close the scanner
        scanner.close();
    }
}
