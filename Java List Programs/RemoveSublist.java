import java.util.ArrayList;
import java.util.List;

public class RemoveSublist {
    public static void main(String[] args) {
        List<Integer> mainList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            mainList.add(i);
        }

        List<Integer> subList = new ArrayList<>();
        for (int i = 4; i <= 6; i++) {
            subList.add(i);
        }

        System.out.println("Original list: " + mainList);
        mainList.removeAll(subList);
        System.out.println("List after removing sublist: " + mainList);
    }
}
