import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxFromList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 3, 5, 7, 2, 8, 1, 9, 6);

        int min = Collections.min(list);
        int max = Collections.max(list);

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
