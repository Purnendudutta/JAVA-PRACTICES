import java.util.ArrayList;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        List<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Date");
        list2.add("Cherry");

        List<String> commonElements = new ArrayList<>(list1);
        commonElements.retainAll(list2);

        System.out.println("Common elements: " + commonElements);
    }
}
