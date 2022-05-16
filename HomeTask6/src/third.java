import java.util.Scanner;

public class third {

    public static int countClumps(int arr[])
    {
        boolean clump=false;
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1] && !clump)
            {
                clump=true;
                count++;
            }
            else if(arr[i]!=arr[i+1]){
                clump=false;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter array length");
        int n=s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        System.out.println(countClumps(arr));

    }
}
