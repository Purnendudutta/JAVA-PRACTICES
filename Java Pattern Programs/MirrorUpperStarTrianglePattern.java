import java.util.Scanner;

public class MirrorUpperStarTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * (rows - i + 1) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Close the scanner
        scanner.close();
    }
}
