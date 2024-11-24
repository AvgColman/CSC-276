public class Contractor extends Employee {
    private double weeklyRate;
    public Contractor(String name, double weeklyRate) {
        super(name);
        this.weeklyRate = weeklyRate;
    }

    @Override
    public double calculatePay() {
        return weeklyRate;
    }
}
