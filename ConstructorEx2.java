class Employee {
    int id;
    String name;
    double salary;

    Employee() {
        this.id = 0;
        this.name = "Unknown";
        this.salary = 0.0;
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    Employee(Employee e) {
        this.id = e.id;
        this.name = e.name;
        this.salary = e.salary;
    }

    Employee(int id, String name) {
        this(id, name, 25000.0);
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Amit", 50000);
        Employee e3 = new Employee(e2);
        Employee e4 = new Employee(102, "Snehal");

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}
