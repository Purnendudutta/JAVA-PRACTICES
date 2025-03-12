import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending {
    public static void main(String[] args) {
        Integer[] array = {40, 10, 50, 30, 20}; // Use Integer[] instead of int[]

        Arrays.sort(array, Collections.reverseOrder());

        System.out.println("Sorted array in descending order: " + Arrays.toString(array));
    }
}
