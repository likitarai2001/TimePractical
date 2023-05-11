import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeHelperClass {
    public void convertToETTime(String input) throws ParseException {
        SimpleDateFormat inputDateFormatter = new SimpleDateFormat("dd/MM/yyyy hh:mma z");
        SimpleDateFormat etDateFormatter = new SimpleDateFormat("dd/MM/yyyy hh:mma 'ET'");

        Date inputDate = inputDateFormatter.parse(input);

        TimeZone etTimeZone = TimeZone.getTimeZone("America/New_York");
        etDateFormatter.setTimeZone(etTimeZone);
        String convertedDateInET = etDateFormatter.format(inputDate);
        System.out.println("Converted in ET timezone: " + convertedDateInET);
    }
}
