import java.util.Scanner;

public class LongToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a long value: ");
        long longValue = scanner.nextLong();

        String strValue = Long.toString(longValue);

        System.out.println("The string representation is: " + strValue);
        // Close the scanner
        scanner.close();
    }
}
