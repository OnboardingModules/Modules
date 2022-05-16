public class second {

    public static boolean greatnumber(int a,int b)
    {
        if((a==6)||(b==6))
            return true;
        int add = a+b;
        int sub = Math.abs(a-b);

        if((add==6)||(sub==6))
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        System.out.println(greatnumber(1,6));
        System.out.println(greatnumber(6,6));
        System.out.println(greatnumber(12,6));
        System.out.println(greatnumber(11,2));

    }
}
