import javax.swing.*;

public class Task1 {

    double a,b;

    public static double add(double a,double b){
        System.out.println("Daniel has "+a+" apples,Amber has "+b+" apples.");
        return a+b;
    }

    public static  void main(String[] args)
    {
       System.out.println("Daniel and Amber have together "+add(3,2));
        System.out.println("Daniel and Amber have together "+ add(3.5,2.5));

    }
}
