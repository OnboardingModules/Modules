import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class pricePredicate {

    String name,grade,category;
    int price;

    pricePredicate(String name, String grade, String category, int price)
    {
        this.name = name;
        this.grade = grade;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Name : " + name + ", Grade :" + grade + ", Category :" + category +", price :" + price;
    }

    public static List<pricePredicate> process(List<pricePredicate> ls, Predicate<pricePredicate> predicate)
    {
        List<pricePredicate> ls1 = new ArrayList<pricePredicate>();
        for(pricePredicate prices: ls)
            if(predicate.test(prices))
                ls1.add(prices);
        return ls1;
    }

    public static void main(String[] args)
    {
        List<pricePredicate> ls = new ArrayList<pricePredicate>();
        ls.add(new pricePredicate("Dinesh","A","Electronics",10000));
        ls.add(new pricePredicate("Kohli","B","IT",100));
        ls.add(new pricePredicate("maddy","B","Hardware",2000));
        ls.add(new pricePredicate("dante","C","Electronics",3000));
        ls.add(new pricePredicate("dave","A","Electronics",7000));

        List cost = process(ls,(pricePredicate p) -> p.getPrice()>1000 );
        System.out.println(cost);
    }


}
