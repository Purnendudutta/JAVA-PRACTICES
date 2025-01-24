import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorToList {
    public static void main(String[] args) {
        // Create an iterator
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        Iterator<String> iterator = list.iterator();

        // Convert iterator to list
        List<String> newList = new ArrayList<>();
        iterator.forEachRemaining(newList::add);

        // Print the list
        for (String element : newList) {
            System.out.println(element);
        }
    }
}
