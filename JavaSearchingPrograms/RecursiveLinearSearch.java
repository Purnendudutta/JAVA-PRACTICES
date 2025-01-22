public class RecursiveLinearSearch {
    // Recursive method to search for an element
    public static int linearSearch(int[] arr, int index, int target) {
        // Base case: If index exceeds array bounds, element not found
        if (index >= arr.length) {
            return -1;
        }
        // Base case: If the target is found
        if (arr[index] == target) {
            return index;
        }
        // Recursive case: Search in the remaining array
        return linearSearch(arr, index + 1, target);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;

        int result = linearSearch(numbers, 0, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
