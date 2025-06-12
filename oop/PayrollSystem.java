public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee("Alice", 160, 20),
                new Contractor("Bob", 120, 25)
        };

        for (Employee emp : employees) {
            emp.introduce();
            System.out.println("Role: " + emp.getRole());
            System.out.println("Monthly Pay: $" + emp.calculatePay());
            System.out.println("--------------");
        }
    }
}
