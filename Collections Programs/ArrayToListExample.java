import java.util.Arrays;
import java.util.List;

public class ArrayToListExample {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D"};

        // Convert Array to List
        List<String> list = Arrays.asList(array);

        // Print List
        for (String element : list) {
            System.out.println(element);
        }
    }
}
