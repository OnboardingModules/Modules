import java.util.Scanner;

public class string2 {

    public static boolean rotations(String s1,String s2)
    {
        if(s1.length()==s2.length())
        {
            s1 =s1.concat(s1);

        }
        return  s1.indexOf(s2)!=-1;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1=s.next();
        System.out.println("Enter the first string");
        String s2=s.next();

        if(rotations(s1,s2))
            System.out.println("Two Strings are rotation of each other");
        else
            System.out.println("Two Strings are not rotation of each other");
    }
}


