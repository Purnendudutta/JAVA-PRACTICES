import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");

        String formattedTime = sdf.format(now);
        System.out.println("Current time in AM-PM format: " + formattedTime);
    }
}
