import java.util.Arrays;
import java.util.Comparator;

public class Sort2DArrayByColumn {
    public static void main(String[] args) {
        int[][] array = {
            {3, 2, 1},
            {6, 5, 4},
            {9, 8, 7}
        };

        // Sort the 2D array by each column
        for (int col = 0; col < array[0].length; col++) {
            final int column = col;
            Arrays.sort(array, new Comparator<int[]>() {
                @Override
                public int compare(int[] row1, int[] row2) {
                    return Integer.compare(row1[column], row2[column]);
                }
            });
        }

        // Print the sorted 2D array
        for (int[] row : array) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}