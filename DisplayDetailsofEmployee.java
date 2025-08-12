abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void work();

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

class Developer extends Employee {
    Developer(String name, int id) {
        super(name, id);
    }

    @Override
    void work() {
        System.out.println(name + " is writing Java code.");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Employee e = new Employee("Amit", 101); 
        Employee dev = new Developer("Amit", 101); 
        dev.displayDetails();
        dev.work();
    }
}
