class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        this("Unknown", 0);
        System.out.println("Person default constructor called");
    }

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person parameterized constructor called");
    }
}

class Employee extends Person {
    int empId;
    double salary;

    // Default constructor
    Employee() {
        this(0, "Not Assigned", 0, 0.0);
        System.out.println("Employee default constructor called");
    }

    // Parameterized constructor
    Employee(int empId, String name, int age, double salary) {
        super(name, age); // call Person constructor
        this.empId = empId;
        this.salary = salary;
        System.out.println("Employee parameterized constructor called");
    }

    // Copy constructor
    Employee(Employee e) {
        this(e.empId, e.name, e.age, e.salary);
        System.out.println("Employee copy constructor called");
    }

    void showDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("---------------------------");
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("Creating e1:");
        Employee e1 = new Employee(101, "Ravi", 30, 55000);

        System.out.println("\nCreating e2:");
        Employee e2 = new Employee();

        System.out.println("\nCreating e3 (Copy of e1):");
        Employee e3 = new Employee(e1);

        System.out.println("\nDisplaying Details:");
        e1.showDetails();
        e2.showDetails();
        e3.showDetails();
    }
}
