import java.util.*;

class Employee {
    int id;
    String firstName;
    String lastName;
    String department;

    public Employee(int id, String firstName, String lastName, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    @Override
    public String toString() {
        return id + " | " + firstName + " | " + lastName + " | " + department;
    }
}

public class EmployeeDetailsCollection {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Ravi", "Kumar", "IT"));
        employees.add(new Employee(102, "Amit", "Sharma", "HR"));
        employees.add(new Employee(103, "Kiran", "Patil", "Finance"));
        employees.add(new Employee(104, "Sunita", "Verma", "IT"));

        Collections.sort(employees, Comparator.comparing(e -> e.firstName));

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
