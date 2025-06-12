public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee("Alice", 160, 20),
                new Contractor("Bob", 120, 25)
        };

        for (Employee emp : employees) {
            emp.introduce();
            System.out.println("Role: " + emp.getRole());
            System.out.printf("Monthly Pay: $%.2f%n", emp.calculatePay());
            System.out.println("--------------");
        }
    }
}
