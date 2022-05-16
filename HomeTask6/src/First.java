import java.util.Scanner;

public class First {

    public static int maxSpan(int[] arr)
    {
        int span =0,temp=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    temp=j-i+1;
                    span = Math.max(temp,span);
                }
            }
        }
        return span;
    }

    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        System.out.println(maxSpan(arr));

    }
}
