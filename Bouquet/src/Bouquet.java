import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Bouquet
{
    static  double cost=0;
    public static double bouquetCost(ArrayList<String> flower)
    {
        double rose = 10;
        double lily = 20;
        double jasmine = 30;

        for(String f:flower)
        {
        switch (f.toLowerCase())
        {
            case "rose":
             cost += rose;
             break;
            case "lily":
                cost += lily;
                break;
            case "jasmine":
                cost+=jasmine;
                break;
            default:
                cost+= 0.0;
                break;

        }

        }
        return cost;
    }


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the total no of flowers:");
        int count = s.nextInt();

        ArrayList<String> flower = new ArrayList<>();

        for(int i=0;i<count;i++)
        {
        System.out.println("Enter the Flower name");
        String flow = s.next();
        flower.add(flow);
        }
        double v = bouquetCost(flower);
        System.out.print(v);
    }


}
