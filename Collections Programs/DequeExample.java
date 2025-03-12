import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst("A");
        arrayDeque.addLast("B");
        arrayDeque.addFirst("C");
        System.out.println("ArrayDeque: " + arrayDeque);

        Deque<String> linkedListDeque = new LinkedList<>();
        linkedListDeque.addFirst("D");
        linkedListDeque.addLast("E");
        linkedListDeque.addFirst("F");
        System.out.println("LinkedListDeque: " + linkedListDeque);
    }
}
