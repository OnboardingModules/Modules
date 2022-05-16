import java.util.Scanner;

public class Array2 {

    public static void largeandsmall(int input[])
    {
        int max=input[0];
        int min=input[0];

        for(int j=0;j<input.length;j++)
        {
            if(max<input[j])
                max=input[j];
            if(min>input[j])
                min=input[j];
        }

        System.out.println("Largest NUmber in the array is "+max);
        System.out.println("Largest NUmber in the array is "+min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = sc.nextInt();
        int inpuArray[] = new int[n];
        System.out.println("Enter  numbers: ");
        for(int i=0; i<n; i++)
            inpuArray[i] = sc.nextInt();
        largeandsmall(inpuArray);
    }
}
