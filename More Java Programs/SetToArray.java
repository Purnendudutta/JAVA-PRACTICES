import java.util.HashSet;
import java.util.Set;

public class SetToArray {
    public static void main(String[] args) {
        // Create a Set
        Set<String> stringSet = new HashSet<>();
        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("C");
        stringSet.add("D");

        // Convert Set to Array
        String[] stringArray = stringSet.toArray(new String[0]);

        // Print the Array
        for (String element : stringArray) {
            System.out.println(element);
        }
    }
}
