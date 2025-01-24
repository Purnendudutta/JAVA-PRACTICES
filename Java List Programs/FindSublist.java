import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSublist {
    public static void main(String[] args) {
        List<Integer> mainList = new ArrayList<>();
        Collections.addAll(mainList, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> subList = new ArrayList<>();
        Collections.addAll(subList, 4, 5, 6);

        int index = Collections.indexOfSubList(mainList, subList);

        if (index != -1) {
            System.out.println("Sublist found at index: " + index);
        } else {
            System.out.println("Sublist not found.");
        }
    }
}
