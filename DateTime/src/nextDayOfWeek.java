import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class nextDayOfWeek {

    public static void main(String[] args)
    {
        LocalDate ld = LocalDate.now();
        System.out.println("Next Thursday :"+ld.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));
    }
}
