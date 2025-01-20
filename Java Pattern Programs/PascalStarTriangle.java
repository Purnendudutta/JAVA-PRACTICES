import java.util.Scanner;

public class PascalStarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
        // Close the scanner
        scanner.close();
    }
}
