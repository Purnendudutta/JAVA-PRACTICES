import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryStr = scanner.nextLine();

        int decimal = Integer.parseInt(binaryStr, 2);
        String octalStr = Integer.toOctalString(decimal);

        System.out.println("The octal representation is: " + octalStr);
        // Close the scanner
        scanner.close();
    }
}
