import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> employeeNames = new ArrayList<>();

        employeeNames.add("Amit");
        employeeNames.add("Sneha");
        employeeNames.add("Raj");
        employeeNames.add("Priya");

        System.out.println("Employee Names:");
        for (String name : employeeNames) {
            System.out.println(name);
        }
    }
}
