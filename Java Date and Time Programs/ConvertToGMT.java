import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ConvertToGMT {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat localSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat gmtSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Set the time zone to GMT for the gmtSdf
        gmtSdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        String localTime = localSdf.format(now);
        String gmtTime = gmtSdf.format(now);

        System.out.println("Local time: " + localTime);
        System.out.println("GMT time: " + gmtTime);
    }
}
