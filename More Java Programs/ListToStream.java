import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListToStream {
    public static void main(String[] args) {
        // Create a list
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        // Convert list to stream
        Stream<String> stream = list.stream();

        // Print the elements of the stream
        stream.forEach(System.out::println);
    }
}
