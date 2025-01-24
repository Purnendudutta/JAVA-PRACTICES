import java.util.ArrayList;
import java.util.List;

public class RemoveNulls {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add(null);
        list.add("Banana");
        list.add(null);
        list.add("Cherry");

        System.out.println("Original list: " + list);

        // Remove null values
        list.removeIf(item -> item == null);

        System.out.println("List after removing nulls: " + list);
    }
}
