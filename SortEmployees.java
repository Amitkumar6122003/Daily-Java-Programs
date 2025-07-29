
import java.util.*;

class Employee {
    int id;
    String firstName;
    String lastName;
    String email;

    Employee(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String toString() {
        return id + " - " + firstName + " " + lastName + " - " + email;
    }
}

public class SortEmployees {

    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();

        
        employees.add(new Employee(1, "Rahul", "Sharma", "rahul@example.com"));
        employees.add(new Employee(2, "Amit", "Kumar", "amit@example.com"));
        employees.add(new Employee(3, "Neha", "Verma", "neha@example.com"));
        employees.add(new Employee(4, "Priya", "Patil", "priya@example.com"));

        
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.firstName.compareTo(e2.firstName);
            }
        });

        
        System.out.println("Employee Details Sorted by First_Name (Ascending):");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
