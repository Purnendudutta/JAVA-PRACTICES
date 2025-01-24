public class DeterminantMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int determinant = findDeterminant(matrix);

        System.out.println("Determinant of the matrix is: " + determinant);
    }

    public static int findDeterminant(int[][] matrix) {
        int determinant = 0;

        if (matrix.length == 1) {
            return matrix[0][0];
        }

        if (matrix.length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        for (int i = 0; i < matrix[0].length; i++) {
            int[][] subMatrix = getSubMatrix(matrix, 0, i);
            determinant += Math.pow(-1, i) * matrix[0][i] * findDeterminant(subMatrix);
        }

        return determinant;
    }

    public static int[][] getSubMatrix(int[][] matrix, int excludingRow, int excludingCol) {
        int[][] subMatrix = new int[matrix.length - 1][matrix[0].length - 1];
        int r = -1;

        for (int i = 0; i < matrix.length; i++) {
            if (i == excludingRow) {
                continue;
            }
            r++;
            int c = -1;
            for (int j = 0; j < matrix[0].length; j++) {
                if (j == excludingCol) {
                    continue;
                }
                subMatrix[r][++c] = matrix[i][j];
            }
        }

        return subMatrix;
    }
}
