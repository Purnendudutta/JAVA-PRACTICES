import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
    public static void main(String[] args) {
        // Create a list
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A"); // Duplicate element

        // Convert list to set
        Set<String> set = new HashSet<>(list);

        // Print the set
        for (String element : set) {
            System.out.println(element);
        }
    }
}
