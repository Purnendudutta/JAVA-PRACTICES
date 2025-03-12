public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int trace = findTrace(matrix);
        double normal = findNormal(matrix);

        System.out.println("Trace of the matrix is: " + trace);
        System.out.println("Normal (Frobenius norm) of the matrix is: " + normal);
    }

    public static int findTrace(int[][] matrix) {
        int trace = 0;
        for (int i = 0; i < matrix.length; i++) {
            trace += matrix[i][i];
        }
        return trace;
    }

    public static double findNormal(int[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += Math.pow(matrix[i][j], 2);
            }
        }
        return Math.sqrt(sum);
    }
}
