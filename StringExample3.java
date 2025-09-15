public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        
        String result = str1 + " " + str2;
        System.out.println("Concatenation: " + result);

        System.out.println("Length of str1: " + str1.length());


        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str2.toLowerCase());

        
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

    
        System.out.println("Substring of str2 (1 to 3): " + str2.substring(1, 4));

       
        System.out.println("str1 equals 'Hello'? " + str1.equals("Hello"));
    }
}
