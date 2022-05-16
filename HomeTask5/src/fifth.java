public class fifth {

    public static boolean inOrder(int a,int b,int c,boolean bOK)
    {
        if(bOK)
        {
            if(c>b)
                return true;
            else
                return false;
        }
        if(b>a && c>b)
            return true;
        else
            return false;
    }


    public static void main(String[] args)
    {
        System.out.println(inOrder(5,6,7,false));
        System.out.println(inOrder(8,9,10,false));
        System.out.println(inOrder(0,6,4,false));
        System.out.println(inOrder(11,10,20,true));

    }
}
