public class Contractor extends Employee {
    public Contractor(String name, int hoursWorked, double hourlyRate) {
        super(name, hoursWorked, hourlyRate);
    }

    @Override
    public double calculatePay() {
        // Contractors earn a 10% bonus
        return (hoursWorked * hourlyRate) * 1.10;
    }

    @Override
    public String getRole() {
        return "Contractor";
    }
}
