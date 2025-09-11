package com.demo;

class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Test Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Amit", 21);
        Student s2 = new Student("Kiran", 22);

        s1.display();
        s2.display();
    }
}
