interface Animal {
    void sound();
    void sleep();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks.");
    }

    public void sleep() {
        System.out.println("Dog sleeps at night.");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows.");
    }

    public void sleep() {
        System.out.println("Cat sleeps during the day.");
    }
}

public class InterfaceAbstractionExample {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.sound();
        a1.sleep();

        Animal a2 = new Cat();
        a2.sound();
        a2.sleep();
    }
}
