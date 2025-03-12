public class LargestElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int max = array[0]; // Assume the first element is the largest initially

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("The largest element in the array is: " + max);
    }
}
