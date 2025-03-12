public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int rotationCount = 2; // Number of positions to rotate

        // Rotate the array to the right
        rotateArray(array, rotationCount);

        // Print the rotated array
        System.out.println("Rotated array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void rotateArray(int[] array, int rotationCount) {
        int length = array.length;
        rotationCount = rotationCount % length; // Handle rotationCount greater than array length

        reverseArray(array, 0, length - 1);
        reverseArray(array, 0, rotationCount - 1);
        reverseArray(array, rotationCount, length - 1);
    }

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
