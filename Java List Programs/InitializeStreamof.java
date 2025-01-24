import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InitializeStreamof {
    public static void main(String[] args) {
        List<String> list = Stream.of("Apple", "Banana", "Cherry")
                                  .collect(Collectors.toList());

        System.out.println("List: " + list);
    }
}
