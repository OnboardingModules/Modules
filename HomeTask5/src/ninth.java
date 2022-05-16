public class ninth {

    public static int maxBlock(String str)
    {
        int len =str.length();
        int count=0,temp=1;

        if(len==0)
            return 0;

        for(int i=0;i<len;i++)
        {
            if(i<len-1 && str.charAt(i) == str.charAt(i+1))
                temp++;
            else
                temp=1;

            if(temp>count)
                count=temp;
        }
            return count;
    }

    public static void  main(String[] args)
    {
        System.out.println(maxBlock("hoopla"));
        System.out.println(maxBlock("abbCCCddBBBxx"));
        System.out.println(maxBlock(""));
    }
}
