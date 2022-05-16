import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HometaskStream {

    String name,grade,category;
    int price;

    HometaskStream(String name, String grade, String category, int price)
    {
        this.name = name;
        this.grade = grade;
        this.category = category;
        this.price = price;
    }

     public static void main(String[] args)
    {
        List<HometaskStream> ls = new ArrayList<HometaskStream>();
        ls.add(new HometaskStream("Dinesh","A","Electronics",10000));
        ls.add(new HometaskStream("Kohli","B","IT",100));
        ls.add(new HometaskStream("maddy","B","Hardware",2000));
        ls.add(new HometaskStream("dante","C","Electronics",3000));
        ls.add(new HometaskStream("dave","A","Electronics",7000));

        ls.stream().filter(p->p.price>1000).forEach(p-> System.out.println(p.name));
        ls.stream().filter(e->e.category.equals("Electronics")).forEach(e-> System.out.println(e.name));
        ls.stream().filter(pe->pe.price>1000).filter(pc->pc.category.equals("Electronics")).forEach(pec-> System.out.println(pec.name));
    }


}
