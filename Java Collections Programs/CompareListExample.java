import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");

        // Sort the list in natural order
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // Sort the list using a custom comparator
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); // Sort in reverse order
            }
        });
        System.out.println("List sorted in reverse order: " + list);
    }
}
