public abstract class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculatePay();
    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}