import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ListToCommaSeparatedString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Using StringJoiner
        StringJoiner joiner = new StringJoiner(", ");
        for (String item : list) {
            joiner.add(item);
        }

        String result = joiner.toString();
        System.out.println("Comma-separated string: " + result);
    }
}
