import java.util.ArrayList;
import java.util.Iterator;
public class HasnextAndNext {
    public static void main(String[] args) {
        // Create a collection
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Get an iterator for the collection
        Iterator<String> iterator = names.iterator();

        // Use hasNext() and next() to traverse the collection
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
