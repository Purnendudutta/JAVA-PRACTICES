import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String octalStr = Integer.toOctalString(decimal);

        System.out.println("The octal representation is: " + octalStr);
        // Close the scanner
        scanner.close();
    }
}
