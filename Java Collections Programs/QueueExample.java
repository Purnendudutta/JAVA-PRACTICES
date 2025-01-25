import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> linkedListQueue = new LinkedList<>();
        linkedListQueue.add("A");
        linkedListQueue.add("B");
        linkedListQueue.add("C");
        System.out.println("LinkedListQueue: " + linkedListQueue);

        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("C");
        priorityQueue.add("A");
        priorityQueue.add("B");
        System.out.println("PriorityQueue: " + priorityQueue);
    }
}
