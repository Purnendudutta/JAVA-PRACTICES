public class SearchArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int searchValue = 30;
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                found = true;
                System.out.println("Element " + searchValue + " is found at index: " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + searchValue + " is not found in the array.");
        }
    }
}
