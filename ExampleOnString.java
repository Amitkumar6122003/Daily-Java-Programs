public class StringExample {
    public static void main(String[] args) {
        
        String firstName = "Amit";
        String lastName = "Kadam";
        
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);
        
        System.out.println("Length of Full Name: " + fullName.length());
        
        System.out.println("Uppercase: " + fullName.toUpperCase());
        
        System.out.println("Lowercase: " + fullName.toLowerCase());
        
        System.out.println("Character at index 2: " + fullName.charAt(2));
        
        System.out.println("Substring (0 to 4): " + fullName.substring(0, 4));
        
        String anotherName = "Amit Kadam";
        if (fullName.equals(anotherName)) {
            System.out.println("Names are equal");
        } else {
            System.out.println("Names are not equal");
        }
        
        if (fullName.equalsIgnoreCase("amit kadam")) {
            System.out.println("Names are equal (ignoring case)");
        }
    }
}
