import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");

        System.out.println("Original list: " + list);

        // Remove duplicates using LinkedHashSet
        Set<String> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);

        System.out.println("List after removing duplicates: " + list);
    }
}
