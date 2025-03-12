import java.util.ArrayList;
import java.util.List;

public class ListToArrayExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Convert List to Array
        String[] array = list.toArray(new String[0]);

        // Print Array
        for (String element : array) {
            System.out.println(element);
        }
    }
}