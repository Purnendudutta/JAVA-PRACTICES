public class BinarySearchRecursive {
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            }
            if (arr[mid] < target) {
                return binarySearch(arr, mid + 1, right, target); // Search in the right half
            } else {
                return binarySearch(arr, left, mid - 1, target); // Search in the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;

        int result = binarySearch(numbers, 0, numbers.length - 1, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
