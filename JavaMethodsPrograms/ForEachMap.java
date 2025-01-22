import java.util.HashMap;
import java.util.Map;

public class ForEachMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Using lambda expression
        map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}