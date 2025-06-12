public abstract class Employee extends Person implements Payable {
    protected int hoursWorked;
    protected double hourlyRate;

    public Employee(String name, int hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public abstract String getRole();
}
