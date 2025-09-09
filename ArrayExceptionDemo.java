package com.example;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4};
            System.out.println("Element at index 2: " + numbers[2]);
            
            
            System.out.println("Element at index 5: " + numbers[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: You are trying to access an invalid array index.");
        } finally {
            System.out.println("Program execution finished.");
        }
    }
}
