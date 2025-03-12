import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Original List: " + list);
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);
    }
}
