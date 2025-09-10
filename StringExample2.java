package com.demo;

public class StringDemo {
    public static void main(String[] args) {
        String name = "Java Programming";
        
        System.out.println("Original: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Starts with 'Java'? " + name.startsWith("Java"));
        System.out.println("Ends with 'ing'? " + name.endsWith("ing"));
        System.out.println("Index of 'a': " + name.indexOf('a'));
        System.out.println("Last index of 'a': " + name.lastIndexOf('a'));
        System.out.println("Substring (5,16): " + name.substring(5,16));
        System.out.println("Replace 'Java' with 'Core Java': " + name.replace("Java","Core Java"));
        System.out.println("Equals Ignore Case: " + name.equalsIgnoreCase("java programming"));
        System.out.println("Trim: " + "   Hello   ".trim());
        System.out.println("Split: ");
        String[] words = name.split(" ");
        for(String w : words){
            System.out.println(w);
        }
    }
}
