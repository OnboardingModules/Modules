import java.util.Scanner;

public class fifth {

        public static boolean linearIn(int outer[],int inner[])
        {
                int num=0;
                if(inner.length==0){
                        return true;
                }
                int k=0;
                for(int i=0;i<outer.length;i++)
                {
                        if(outer[i]==inner[k])
                        {
                                num++;
                                k++;
                        } else if (outer[i]>inner[k]) {
                                return false;
                                
                        }
                        if(num==inner.length)
                                return true;
                }
                return false;
        }


        public static void main(String[] args)
        {
                Scanner kb = new Scanner(System.in);
                System.out.println("Enter the length of first array");
                int m = kb.nextInt();
                int[] inner = new int[m];
                System.out.println("Enter First array");
                for(int i = 0; i < inner.length; i++)
                        inner[i] = kb.nextInt();
                System.out.println("Ënter the length of second array");
                int n = kb.nextInt();
                int[] outer = new int[n];
                for(int i = 0; i < outer.length; i++)
                        outer[i] = kb.nextInt();
                System.out.println(linearIn(inner,outer));
        }
}
