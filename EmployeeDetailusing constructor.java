public class Employee {
    
    String name;
    int id;

    
    public Employee(String empName, int empId) {
        name = empName;
        id = empId;
    }

    
    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }

    
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Amit", 101);
        Employee emp2 = new Employee("jay", 102);

      
        emp1.display();
        emp2.display();
    }
}
