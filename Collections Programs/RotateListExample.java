import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Original List: " + list);

        // Rotate the list to the right by 2 positions
        Collections.rotate(list, 2);

        System.out.println("Rotated List: " + list);
    }
}
