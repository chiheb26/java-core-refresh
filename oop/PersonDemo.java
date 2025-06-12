class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", age " + age);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 28);
        p1.introduce();

        Employee e1 = new Employee("Bob", 32, "Backend Developer");
        e1.introduce();  // polymorphism
    }
}

