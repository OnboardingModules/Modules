import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeTask_MAP {



    public static void main(String[] args)
    {
        Map<String,String> map = new HashMap<String, String>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<n;i++)
        {
            String name = scanner.nextLine();
            String phone = scanner.nextLine();
            map.put(name,phone);
        }

        while(scanner.hasNext())
        {
            String name1 = scanner.nextLine();

            if(map.containsKey(name1))
            {
                System.out.println(name1 +"=" + map.get(name1));
            }
            else {
                System.out.println("Not Found");
            }
        }
    }
}
