import java.util.ArrayList;
import java.util.Scanner;

public class HomeTask_ArrayList {


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<ArrayList> al1 = new ArrayList<ArrayList>();

        for(int i=0;i<n;i++)
        {
            int num = s.nextInt();
            ArrayList<Integer> al = new ArrayList<Integer>();
            for(int j=0;j<num;j++)
            {
                al.add(s.nextInt());
            }
            al1.add(al);
            s.nextLine();
        }
        int query = s.nextInt();
        for(int i=0;i<query;i++)
        {
            int x = s.nextInt()-1;
            int y = s.nextInt()-1;
            s.nextLine();
            if(x<al1.size() && y<al1.get(x).size())
            {
                System.out.println(al1.get(x).get(y));
            }
            else
            {
                System.out.println("ERROR!");
            }
        }
    }


}
