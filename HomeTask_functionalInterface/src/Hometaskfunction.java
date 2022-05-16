import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Hometaskfunction {

        String name,grade,category;
        int price;

    Hometaskfunction(String name, String grade, String category, int price)
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

    public static void main(String[] args)
    {
        List<Hometaskfunction> ls = new ArrayList<Hometaskfunction>();
        ls.add(new Hometaskfunction("Dinesh","A","Electronics",10000));
        ls.add(new Hometaskfunction("Kohli","B","IT",100));
        ls.add(new Hometaskfunction("maddy","B","Hardware",2000));
        ls.add(new Hometaskfunction("dante","C","Electronics",3000));
        ls.add(new Hometaskfunction("dave","A","Electronics",7000));

        
    }


    }


