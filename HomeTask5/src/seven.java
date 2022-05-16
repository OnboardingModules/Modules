public class seven {

    private static int sumLimit(int a, int b)
    {
        String s1 = Integer.toString(a+b);
        String s2 = Integer.toString(a);

        if(s1.length()==s2.length())
            return a+b;
        else
            return a;

    }

    public static void main(String[] args)
    {
        System.out.println(sumLimit(2,3));
        System.out.println(sumLimit(8,3));
        System.out.println(sumLimit(8,1));


    }


}
