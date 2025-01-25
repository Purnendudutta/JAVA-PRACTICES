import java.util.ArrayList;
import java.util.List;

public class ReplaceListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Original List: " + list);

        // Replace element at index 1
        list.set(1, "E");

        System.out.println("Modified List: " + list);
    }
}
