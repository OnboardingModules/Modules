import java.time.LocalDate;
import java.util.Date;
import java.util.function.Predicate;

public class yesterday {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate yes = today.minusDays(1);
        System.out.println("Today's Local date : " + today);
        System.out.println("Yesterday's Local date : " + yes);

    }
}