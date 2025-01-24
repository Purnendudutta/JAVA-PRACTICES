import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeInDifferentCountries {
    public static void main(String[] args) {
        Date now = new Date();

        displayTimeInTimeZone(now, "GMT", "Greenwich Mean Time (GMT)");
        displayTimeInTimeZone(now, "America/New_York", "Eastern Time (ET)");
        displayTimeInTimeZone(now, "Europe/London", "British Time (BT)");
        displayTimeInTimeZone(now, "Asia/Tokyo", "Japan Standard Time (JST)");
        displayTimeInTimeZone(now, "Australia/Sydney", "Australian Eastern Time (AET)");
    }

    public static void displayTimeInTimeZone(Date date, String timeZoneId, String timeZoneName) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        sdf.setTimeZone(TimeZone.getTimeZone(timeZoneId));

        String formattedDate = sdf.format(date);
        System.out.println("Current time in " + timeZoneName + ": " + formattedDate);
    }
}
