import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(3, "C");
        System.out.println("HashMap: " + hashMap);

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(4, "D");
        treeMap.put(5, "E");
        treeMap.put(6, "F");
        System.out.println("TreeMap: " + treeMap);
    }
}
