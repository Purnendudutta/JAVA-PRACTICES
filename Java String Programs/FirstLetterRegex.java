import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLetterRegex {
    public static void main(String[] args) {
        String str = "Hello, World! This is Java programming.";
        String regex = "\\b\\w"; // Pattern to match the first letter of each word

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        System.out.println("First letters of each word:");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
