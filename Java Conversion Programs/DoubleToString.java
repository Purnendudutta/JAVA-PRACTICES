import java.util.Scanner;

public class DoubleToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        String strValue = Double.toString(doubleValue);

        System.out.println("The string representation is: " + strValue);
        // Close the scanner
        scanner.close();
    }
}
