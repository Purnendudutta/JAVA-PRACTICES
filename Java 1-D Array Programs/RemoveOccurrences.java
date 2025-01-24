import java.util.ArrayList;
import java.util.Arrays;

public class RemoveOccurrences {
     public static void main(String[] args) {
        int[] array = {10, 20, 10, 30, 40, 10, 50};
        int elementToRemove = 10;
        
        // Convert array to ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : array) {
            if (num != elementToRemove) {
                list.add(num);
            }
        }
        
        // Convert ArrayList back to array
        int[] newArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i);
        }

        System.out.println("Array after removing all occurrences of " + elementToRemove + ": " + Arrays.toString(newArray));
    }
}
