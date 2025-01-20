import java.util.Scanner;

public class StringToLong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string representation of a long: ");
        String strValue = scanner.nextLine();

        try {
            long longValue = Long.parseLong(strValue);
            System.out.println("The long representation is: " + longValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid string representation of a long.");
        }
        // Close the scanner
        scanner.close();
    }
}
