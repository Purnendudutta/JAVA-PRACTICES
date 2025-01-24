import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DisplayDates {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.DAY_OF_YEAR, 1);
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat sdf3 = new SimpleDateFormat("E, MMM dd yyyy");

        System.out.println("Dates of the year 2023 in different formats:");
        for (int i = 0; i < 365; i++) {
            Date date = calendar.getTime();
            
            System.out.println("Format 1: " + sdf1.format(date));
            System.out.println("Format 2: " + sdf2.format(date));
            System.out.println("Format 3: " + sdf3.format(date));
            System.out.println("----------------------------");

            calendar.add(Calendar.DAY_OF_YEAR, 1);
        }
    }
}
