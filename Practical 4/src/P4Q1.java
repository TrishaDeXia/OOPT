public class P4Q1 {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Ken Lim");
        emp1.setSalary(3300);
        Employee emp2 = new Employee("Ben John", 2500);

        if (emp1.getSalary() > emp2.getSalary())
            System.out.println(emp1.getName() + " earns higher salary than " + emp2.getName());
        else
            System.out.println(emp2.getName() + " earns higher salary than " + emp1.getName());

        System.out.println("Total salary of the 2 employees " + (emp1.getSalary() + emp2.getSalary()));
    }
}