public class SumDiagonals {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            mainDiagonalSum += matrix[i][i]; // Sum of main diagonal
            secondaryDiagonalSum += matrix[i][cols - 1 - i]; // Sum of secondary diagonal
        }

        System.out.println("Sum of main diagonal: " + mainDiagonalSum);
        System.out.println("Sum of secondary diagonal: " + secondaryDiagonalSum);
    }
}
