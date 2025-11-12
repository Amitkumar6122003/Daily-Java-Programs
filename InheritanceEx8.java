class Animal {
    String name;
    static {
        System.out.println("Static block in Animal class executed");
    }

    Animal() {
        this("Unknown Animal");
        System.out.println("Animal default constructor called");
    }

    Animal(String name) {
        this.name = name;
        System.out.println("Animal parameterized constructor called for: " + name);
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }

    final void eat() {
        System.out.println(name + " is eating...");
    }
}

class Mammal extends Animal {
    int age;

    Mammal() {
        this("Unknown Mammal", 0);
        System.out.println("Mammal default constructor called");
    }

    Mammal(String name, int age) {
        super(name);
        this.age = age;
        System.out.println("Mammal parameterized constructor called for: " + name);
    }

    @Override
    void sound() {
        System.out.println(name + " (Mammal) makes a warm-blooded sound");
    }
}

class Dog extends Mammal {
    String breed;
    static int dogCount;

    static {
        dogCount = 0;
        System.out.println("Static block in Dog class executed");
    }

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        dogCount++;
        System.out.println("Dog constructor called for breed: " + breed);
    }

    void sound(String mood) {
        System.out.println(name + " barks " + (mood.equals("happy") ? "cheerfully!" : "angrily!"));
    }

    @Override
    void sound() {
        System.out.println(name + " barks loudly (override from Mammal)");
    }

    static void totalDogs() {
        System.out.println("Total Dogs created: " + dogCount);
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Object Creation Starts ===");
        Dog d1 = new Dog("Bruno", 5, "Labrador");
        Dog d2 = new Dog("Rocky", 3, "German Shepherd");

        System.out.println("\n=== Method Calls ===");
        d1.sound();
        d1.sound("happy");
        d1.eat();

        System.out.println("\n=== Display Information ===");
        d1.showInfo();
        d2.showInfo();

        System.out.println("\n=== Static Info ===");
        Dog.totalDogs();
    }
}
