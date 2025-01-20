import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String hexStr = Integer.toHexString(decimal).toUpperCase();

        System.out.println("The hexadecimal representation is: " + hexStr);
        // Close the scanner
        scanner.close();
    }
}
