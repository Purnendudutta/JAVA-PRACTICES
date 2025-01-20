import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hexStr = scanner.nextLine();

        int decimal = Integer.parseInt(hexStr, 16);

        System.out.println("The decimal representation is: " + decimal);
        // Close the scanner
        scanner.close();
    }
}
