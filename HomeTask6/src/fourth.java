import java.util.Scanner;

public class fourth {

    public static int maxMirror(int arr[])
    {
        int len = arr.length;
        int count=0,max=0;

        for(int i=0;i<len;i++)
        {
            count=0;
            for(int j=len-1;i+count<len && j>-1;j--)
            {
                if(arr[i+count]==arr[j])
                {
                    count++;
                }
                else {
                    if(count>0){
                        max=Math.max(count,max);
                        count=0;
                    }
                }
            }
            max = Math.max(count,max);
        }
        return max;
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
        System.out.println(maxMirror(arr));

    }
}
