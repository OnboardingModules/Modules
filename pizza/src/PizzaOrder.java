import java.util.ArrayList;

public class PizzaOrder {


    private double total;
    private ArrayList<PizzaTask> pizzas;

    public PizzaOrder(ArrayList<PizzaTask> pizzas)
    {
        this.pizzas = pizzas;
    }


    public void calculatetotalamount()
    {
        final double standard = 100;
        final double soft = 50;
        final double topping_cost = 25;

        for(PizzaTask pizza:pizzas)
        {
            switch(pizza.getSize())
            {
                case "standard":
                    total += standard;
                        break;
                case "soft":
                    total += soft;
                    break;
                default:
                    total+= 0.0;
                    break;
            }
            int totaltoppings = pizza.getToppings().size();
            total += totaltoppings * topping_cost;
        }
    }

    public double getTotalOrderCost()
    {
        return total;
    }
     public void printordersummary()
     {
         for(PizzaTask pizza:pizzas){
             System.out.println("Ordered a "+ pizza.getSize() + "pizza with " + pizza.getToppings());
         }
         System.out.println("Total order amount" + getTotalOrderCost());
     }

}
