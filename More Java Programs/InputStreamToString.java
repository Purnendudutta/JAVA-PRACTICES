import java.io.InputStream;
import java.util.Scanner;

public class InputStreamToString {
    public static String convertUsingScanner(InputStream inputStream) {
        try (Scanner scanner = new Scanner(inputStream).useDelimiter("\\A")) {
            return scanner.hasNext() ? scanner.next() : "";
        }
    }
}
