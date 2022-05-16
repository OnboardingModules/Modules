import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class categoryPredicate {

    String name,grade,category;
    int price;

    categoryPredicate(String name, String grade, String category, int price)
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

    public static List<categoryPredicate> process(List<categoryPredicate> ls, Predicate<categoryPredicate> predicate)
    {
        List<categoryPredicate> ls1 = new ArrayList<categoryPredicate>();
        for(categoryPredicate cate: ls)
            if(predicate.test(cate))
                ls1.add(cate);
        return ls1;
    }

    public static void main(String[] args)
    {
        List<categoryPredicate> ls = new ArrayList<categoryPredicate>();
        ls.add(new categoryPredicate("Dinesh","A","Electronics",10000));
        ls.add(new categoryPredicate("Kohli","B","IT",100));
        ls.add(new categoryPredicate("maddy","B","Hardware",2000));
        ls.add(new categoryPredicate("dante","C","Electronics",3000));
        ls.add(new categoryPredicate("dave","A","Electronics",7000));

        List cost = process(ls,(categoryPredicate c) -> c.getCategory().equals("Electronics") );
        System.out.println(cost);
    }


}
