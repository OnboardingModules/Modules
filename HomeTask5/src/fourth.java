public class fourth {

    public static int bluelottery(int a,int b,int c)
    {
        int ab=a+b;
        int bc=b+c;
        int ca=c+a;

        if((ab==10)||(bc==10||(ca==10)))
            return 10;
        if((ab-bc==10)||(ab-ca==10))
            return 5;
        else
            return 0;
    }

    public static void main(String[] args)
    {
        System.out.println(bluelottery(5,5,2));
        System.out.println(bluelottery(8,8,6));
        System.out.println(bluelottery(0,6,4));
        System.out.println(bluelottery(1,2,1));

    }
}
