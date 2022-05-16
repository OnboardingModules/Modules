import java.util.Scanner;

public class second {

    public static Boolean canBalance(int arr[])
    {
        int lsum=0;

        for(int i=0;i<arr.length;i++)
        {
            lsum+=arr[i];
            int rsum=0;
            for(int j=arr.length-1;j>i;j--)
            {
                rsum+=arr[j];
            }
            if(rsum==lsum)
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        System.out.println(canBalance(arr));

    }
}
