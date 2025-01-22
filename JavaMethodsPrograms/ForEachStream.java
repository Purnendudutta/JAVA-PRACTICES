import java.util.stream.Stream;

public class ForEachStream {
    public static void main(String[] args) {
        Stream.of("Java", "Python", "C++")
              .forEach(language -> System.out.println("Language: " + language));
    }
}
