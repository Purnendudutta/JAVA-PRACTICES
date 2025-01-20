import java.util.Scanner;

public class SpiralPatternNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the spiral (n x n): ");
        int n = scanner.nextInt();

        int[][] spiral = new int[n][n];

        int value = 1;
        int minRow = 0;
        int maxRow = n - 1;
        int minCol = 0;
        int maxCol = n - 1;

        while (value <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = value++;
            }
            minRow++;
            for (int i = minRow; i <= maxRow; i++) {
                spiral[i][maxCol] = value++;
            }
            maxCol--;
            for (int i = maxCol; i >= minCol; i--) {
                spiral[maxRow][i] = value++;
            }
            maxRow--;
            for (int i = maxRow; i >= minRow; i--) {
                spiral[i][minCol] = value++;
            }
            minCol++;
        }

        System.out.println("The Spiral Pattern of Numbers is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }
        // Close the scanner
        scanner.close();
    }
}
