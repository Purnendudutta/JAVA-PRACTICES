import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] charArray = str.toCharArray();

        Arrays.sort(charArray);

        String sortedStr = new String(charArray);
        System.out.println("Original string: " + str);
        System.out.println("Sorted string: " + sortedStr);
    }
}
