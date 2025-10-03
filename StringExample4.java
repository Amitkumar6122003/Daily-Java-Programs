class StringAdvanced {
    public static void main(String[] args) {
        String str = " CoreJava Programming ";
        System.out.println("Original: [" + str + "]");
        System.out.println("Trimmed: [" + str.trim() + "]");
        System.out.println("Starts with 'Core'? " + str.trim().startsWith("Core"));
        System.out.println("Ends with 'ing'? " + str.endsWith("ing "));
        System.out.println("Index of 'a': " + str.indexOf('a'));
        System.out.println("Last index of 'a': " + str.lastIndexOf('a'));
        System.out.println("Split words:");
        for(String word : str.trim().split(" ")) {
            System.out.println(word);
        }

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Developer");
        sb.insert(4, " Core");
        sb.replace(0, 4, "Advanced");
        sb.reverse();
        System.out.println("StringBuffer result: " + sb);

        StringBuilder builder = new StringBuilder("Performance");
        builder.append(" Test");
        builder.delete(0, 5);
        builder.insert(3, "###");
        builder.reverse();
        System.out.println("StringBuilder result: " + builder);

        String word = "madam";
        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println(word + " is palindrome? " + word.equals(reversed));
    }
}
