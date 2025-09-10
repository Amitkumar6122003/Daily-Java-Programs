class Vehicle {
    void start() {
        System.out.println("Vehicle starts with a key.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driven on roads.");
    }
}

class SportsCar extends Car {
    void race() {
        System.out.println("SportsCar is used for racing.");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.start();
        sc.drive();
        sc.race();
    }
}
