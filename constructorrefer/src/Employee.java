 public class Employee {

        String name;
        Integer salary;


     Employee(String name, Integer salary ){

         this.name=name;
         this.salary=salary;

     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public float getSalary() {
         return salary;
     }

     public void setSalary(float salary) {
         this.salary = salary;
     }


}
