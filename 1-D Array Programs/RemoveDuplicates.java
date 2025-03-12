import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {10, 20, 10, 30, 40, 20, 50};
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }

        int[] newArray = new int[set.size()];
        int index = 0;
        for (int value : set) {
            newArray[index++] = value;
        }

        System.out.println("Array after removing duplicates: " + Arrays.toString(newArray));
    }
}
