import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        String octalStr = scanner.nextLine();

        int decimal = Integer.parseInt(octalStr, 8);

        System.out.println("The decimal representation is: " + decimal);
        // Close the scanner
        scanner.close();
    }
}
