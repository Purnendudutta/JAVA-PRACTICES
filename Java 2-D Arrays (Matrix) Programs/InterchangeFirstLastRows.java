public class InterchangeFirstLastRows {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {
            // Interchange first and last elements of each column
            int temp = matrix[0][j];
            matrix[0][j] = matrix[rows - 1][j];
            matrix[rows - 1][j] = temp;
        }

        System.out.println("Matrix after interchanging first and last rows:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
