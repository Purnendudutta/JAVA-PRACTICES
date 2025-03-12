import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A"); // Duplicate element, will not be added
        System.out.println("HashSet: " + hashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("D");
        treeSet.add("E");
        treeSet.add("F");
        System.out.println("TreeSet: " + treeSet);
    }
}
