import java.util.Scanner;

public class StringToDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string representation of a double: ");
        String strValue = scanner.nextLine();

        try {
            double doubleValue = Double.parseDouble(strValue);
            System.out.println("The double representation is: " + doubleValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid string representation of a double.");
        }
        // Close the scanner
        scanner.close();
    }
}
