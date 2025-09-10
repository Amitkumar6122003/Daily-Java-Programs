package com.demo;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        String result = str1 + " " + str2;
        System.out.println("Concatenation: " + result);

        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
        System.out.println("Substring of str2 (0,3): " + str2.substring(0, 3));
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str2.toLowerCase());

        String str3 = "Hello";
        System.out.println("str1 equals str3? " + str1.equals(str3));
        System.out.println("Does str2 contain 'or'? " + str2.contains("or"));
        System.out.println("Replace 'l' with 'x' in str1: " + str1.replace("l", "x"));
    }
}
