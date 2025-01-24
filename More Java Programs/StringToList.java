import java.util.ArrayList;
import java.util.List;

public class StringToList {
    public static void main(String[] args) {
        String str = "Hello, world!";
        
        // Convert string to list of characters
        List<Character> charList = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            charList.add(ch);
        }
        
        // Print the list of characters
        for (Character ch : charList) {
            System.out.print(ch + " ");
        }
    }
}
