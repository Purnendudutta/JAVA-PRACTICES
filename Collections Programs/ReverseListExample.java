import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Original List: " + list);
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);
    }
}
