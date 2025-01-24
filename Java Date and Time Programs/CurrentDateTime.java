import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String formattedDate = sdf.format(now);
        System.out.println("Current date and time: " + formattedDate);
    }
}
