public class BoundaryElements {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        printBoundaryElements(matrix);
    }

    public static void printBoundaryElements(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Print top row
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[0][j] + " ");
        }
        
        // Print right column
        for (int i = 1; i < rows; i++) {
            System.out.print(matrix[i][cols - 1] + " ");
        }
        
        // Print bottom row
        for (int j = cols - 2; j >= 0; j--) {
            System.out.print(matrix[rows - 1][j] + " ");
        }
        
        // Print left column
        for (int i = rows - 2; i > 0; i--) {
            System.out.print(matrix[i][0] + " ");
        }
    }
}
