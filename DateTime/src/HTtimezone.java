import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class HTtimezone {

    public static void main(String[] args) {
        SimpleDateFormat etDf = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mma 'ET'");
        TimeZone etTimeZone = TimeZone.getTimeZone("America/New_York");
        etDf.setTimeZone( etTimeZone );

        Date currentDate = new Date();

        System.out.println(etDf.format(currentDate.getTime()));

    }

}