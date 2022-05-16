import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class agecalculator {

    public static int calculateage(LocalDate ld)
    {
        LocalDate today = LocalDate.now();
        if((ld != null) && (today!=null))
        {
            return Period.between(ld,today).getYears();
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Birthday in YYYY-MM-DD format: ");
        String input = scanner.nextLine();
        LocalDate ld = LocalDate.parse(input);
        System.out.println("Your Age is "+calculateage(ld));
    }
}
