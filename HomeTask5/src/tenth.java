public class tenth {

    public static int sumNumbers(String str)
    {
        int len =str.length();
        int sum=0;
        String temp="";

        for(int i=0;i<len;i++)
        {
            if(Character.isDigit(str.charAt(i))){
                if(i<len-1 && Character.isDigit(str.charAt(i+1)))
                {
                    temp+=str.charAt(i);
                }
                else {
                    temp+=str.charAt(i);
                    sum+=Integer.parseInt(temp);
                    temp="";
                }
            }
        }
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(sumNumbers("aa11b33"));
        System.out.println(sumNumbers("7 11"));

    }
}
