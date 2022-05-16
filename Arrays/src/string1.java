import java.util.Scanner;

public class string1 {

    public static void duplicatechar(String str)
    {
        int count;
        char[] c=str.toCharArray();
        System.out.print("Duplicate Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            count=1;
            for (int j = i + 1; j < str.length(); j++) {
                if(c[i]==c[j] && c[i]!=' '){
                    count++;
                    c[j]='0';
                }
            }
            if(count>1 && c[i]!='0')
                System.out.println(c[i]);
        }
    }

    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the String:");
        String str =s.next();
        duplicatechar(str);
    }
}
