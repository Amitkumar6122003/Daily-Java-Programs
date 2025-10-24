abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class PermanentEmployee extends Employee {
    double basicSalary;
    double bonus;

    PermanentEmployee(String name, int id, double basicSalary, double bonus) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + bonus;
    }
}

class ContractEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    ContractEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class Company {
    public static void main(String[] args) {
        Employee e1 = new PermanentEmployee("Ravi", 101, 40000, 8000);
        Employee e2 = new ContractEmployee("Amit", 102, 160, 300);

        e1.display();
        System.out.println("Total Salary: " + e1.calculateSalary());
        System.out.println("-------------------------------");
        e2.display();
        System.out.println("Total Salary: " + e2.calculateSalary());
    }
}
