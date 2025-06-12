class Employee extends Person {
    private String role;

    public Employee(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I work as a " + role);
    }
}
