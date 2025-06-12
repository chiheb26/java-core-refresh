public class Contractor extends Employee {
    public Contractor(String name, int hoursWorked, double hourlyRate) {
        super(name, hoursWorked, hourlyRate);
    }

    @Override
    public double calculatePay() {
        return calculateBasePay() * 1.10;  // 10% bonus
    }

    @Override
    public String getRole() {
        return "Contractor";
    }
}
