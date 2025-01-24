import java.util.List;
import java.util.Vector;
import java.util.ArrayList;

public class VectorToList {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("D");

        // Convert Vector to List
        List<String> list = new ArrayList<>(vector);

        // Print the List
        for (String element : list) {
            System.out.println(element);
        }
    }
}
