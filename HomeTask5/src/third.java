public class third {

    public static int teaparty(int tea,int candy)
    {
        if((tea<5)||(candy<5))
            return 0;
        if((tea>=2*candy)||(candy>=2*tea))
            return 2;
        else
            return 1;
    }

    public static void main(String[] args)
    {
        System.out.println(teaparty(1,6));
        System.out.println(teaparty(6,6));
        System.out.println(teaparty(12,6));
        System.out.println(teaparty(11,2));

    }
}
