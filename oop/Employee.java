public abstract class Employee extends Person implements Payable {
    private int hoursWorked;
    private double hourlyRate;

    public Employee(String name, int hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double calculateBasePay() {
        return hoursWorked * hourlyRate;
    }

    public abstract String getRole();
}
