import java.util.Scanner;
public class Array1 {

    public static void missingnum(int inpuArray[],int n )
    {
        int sumOfAll = (n * (n + 1)) / 2;
        int sumOfArray = 0;
        for (int j = 0; j <= n - 2; j++)
        {
            sumOfArray = sumOfArray + inpuArray[j];
        }
        int missingNumber = sumOfAll - sumOfArray;
        System.out.println("Missing number is: " + missingNumber);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = sc.nextInt();
        int inpuArray[] = new int[n];
        System.out.println("Enter (n-1) numbers: ");
        for(int i=0; i<=n-2; i++)
            inpuArray[i] = sc.nextInt();
        missingnum(inpuArray,n);


    }
}