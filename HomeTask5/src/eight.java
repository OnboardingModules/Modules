public class eight {

    private static String withoutString(String str1, String str2)
    {
        int s1=str1.length();
        int s2=str2.length();

        String str1low = str1.toLowerCase();
        String str2low = str2.toLowerCase();
        String str ="";

        for(int i=0;i<s1;i++)
        {
            if(i<=s1-s2)
            {
                String temp = str1low.substring(i,i+s2);
                if(!temp.equals(str2low))
                    str+=str1.substring(i,i+1);
                else {
                    i+=s2-1;
                }
            }
            else {
                String temp2 =str1.substring(i,i+1);
                if(!temp2.equals(str2low))
                {
                    str+=str1.substring(i,i+1);
                }

            }

        }
        return str;
    }
    public static void  main(String[] args)
    {
        System.out.println(withoutString("Hello there","llo"));
        System.out.println(withoutString("Hello there","e"));
        System.out.println(withoutString("Hello there","x"));
    }


}
