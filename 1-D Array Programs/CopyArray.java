import java.util.Arrays;

public class CopyArray {
     public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        int[] copiedArray = new int[originalArray.length];

        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
    }
}
