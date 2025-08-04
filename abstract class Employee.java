import java.util.*;

abstract class Employee {
    int id;
    String firstName;
    String lastName;
    String email;

    
    public Employee(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

   
    public abstract void displayDetails();
}


class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String firstName, String lastName, String email) {
        super(id, firstName, lastName, email);
    }

    @Override
    public void displayDetails() {
        System.out.println(id + " | " + firstName + " | " + lastName + " | " + email);
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee(103, "Sneha", "Patil", "sneha@gmail.com"));
        employees.add(new FullTimeEmployee(101, "Rahul", "Sharma", "rahul@gmail.com"));
        employees.add(new FullTimeEmployee(102, "Amit", "Kumar", "amit@gmail.com"));

        employees.sort(Comparator.comparing(emp -> emp.firstName));

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
