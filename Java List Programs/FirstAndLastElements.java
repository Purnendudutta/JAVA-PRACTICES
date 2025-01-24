import java.util.ArrayList;
import java.util.List;

public class FirstAndLastElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        if (!list.isEmpty()) {
            String firstElement = list.get(0);
            String lastElement = list.get(list.size() - 1);

            System.out.println("First element: " + firstElement);
            System.out.println("Last element: " + lastElement);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
