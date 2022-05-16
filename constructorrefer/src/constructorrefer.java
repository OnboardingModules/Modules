public class constructorrefer {

    public static void main(String[] args)
    {
        MyFunctionalInterface mf = Employee::new;
        BiFunction<Integer, String, Employee> f1 = Employee::new;

        System.out.println(f1.apply("Jai",1000).getId());
    }
}
