public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name, hoursWorked, hourlyRate);
    }

    @Override
    public double calculatePay() {
        return calculateBasePay();
    }

    @Override
    public String getRole() {
        return "Full-Time";
    }
}
