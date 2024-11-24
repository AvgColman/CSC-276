import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("John", 4000));
        employees.add(new PartTimeEmployee("Emily", 25, 100));
        employees.add(new Contractor("Michael", 1500));
        employees.add(new SeasonalEmployee("Sarah", 18, 50, "Summer", 300));
        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println("Pay: $" + emp.calculatePay());
            System.out.println();
        }
    }
}

