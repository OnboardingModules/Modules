import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PizzaOrderDeliver {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<PizzaTask> pizzas = new ArrayList<>();

        System.out.println("Enter the no of  pizza");
        int totalpizzas = scanner.nextInt();

        for(int i=0;i<totalpizzas;i++)
        {
            PizzaTask pizza = new PizzaTask();

            ArrayList<String> toppings = new ArrayList<>();
            String Pizzasize;
            System.out.println("Enter the base of the pizza");
            Pizzasize= scanner.next();
            pizza.setSize(Pizzasize);

            int totalToppings;
            System.out.println("Enter the total amount of toppings");
            totalToppings = scanner.nextInt();

            for(int j=0;j<totalToppings;j++)
            {
                System.out.println("Enter the toppings:");
                String topping = scanner.next();
                toppings.add(topping);
            }
            pizza.setToppings(toppings);
            pizzas.add(pizza);
        }

        PizzaOrder order = new PizzaOrder(pizzas);
        order.calculatetotalamount();
        order.printordersummary();

        scanner.close();;


    }
}
