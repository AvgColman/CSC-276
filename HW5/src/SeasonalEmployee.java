public class SeasonalEmployee extends PartTimeEmployee {
    private String season;
    private double seasonalBonus;
    public SeasonalEmployee(String name, double hourlyRate, int hoursWorked, String season, double seasonalBonus) {
        super(name, hourlyRate, hoursWorked);
        this.season = season;
        this.seasonalBonus = seasonalBonus;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + seasonalBonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Season: " + season);
    }
}
