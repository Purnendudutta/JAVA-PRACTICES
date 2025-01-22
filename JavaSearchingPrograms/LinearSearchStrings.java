public class LinearSearchStrings {
    public static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) { // Use equals() for string comparison
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Diana"};
        String target = "Charlie";

        int result = linearSearch(names, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
