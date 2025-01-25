import java.util.ArrayList;
import java.util.List;

public class ListSizeExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        int size = list.size();
        System.out.println("List size: " + size);
    }
}
