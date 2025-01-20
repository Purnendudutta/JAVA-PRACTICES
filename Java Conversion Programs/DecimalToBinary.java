import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String binaryStr = Integer.toBinaryString(decimal);
        
        System.out.println("The binary representation is: " + binaryStr);
        
        // Close the scanner
        scanner.close();
    }
}
