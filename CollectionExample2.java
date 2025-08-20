import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();

        names.add("Amit");
        names.add("Kiran");
        names.add("Sneha");
        names.add("Rahul");

        System.out.println("Employee Names:");
        for (String name : names) {
            System.out.println(name);
        }

        if (names.contains("Kiran")) {
            System.out.println("Kiran is in the list.");
        }

        names.remove("Sneha");

        System.out.println("After removal:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
