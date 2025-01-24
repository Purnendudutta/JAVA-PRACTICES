import java.util.LinkedList;
import java.util.List;

public class LinkedListToArray {
    public static void main(String[] args) {
        // Create a linked list
        List<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        // Convert linked list to array
        String[] array = linkedList.toArray(new String[0]);

        // Print the array
        for (String element : array) {
            System.out.println(element);
        }
    }
}
