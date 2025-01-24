import java.util.LinkedList;

public class AddElementsLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Add element at the first position
        list.addFirst("Apple");

        // Add element at the last position
        list.addLast("Elderberry");

        System.out.println("Linked list: " + list);
    }
}
