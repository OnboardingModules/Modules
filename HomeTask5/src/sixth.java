public class sixth {

    public static boolean samenumber(int a,int b)
    {
        int al = a/10;
        int ar = a%10;
        int bl = b/10;
        int br = b%10;

        if((al==bl)||(al==br)||(ar==bl)||(ar==br))
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        System.out.println(samenumber(16,62));
        System.out.println(samenumber(61,26));
        System.out.println(samenumber(12,63));
        System.out.println(samenumber(11,22));

    }
}
