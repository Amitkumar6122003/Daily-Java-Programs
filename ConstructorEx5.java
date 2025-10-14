abstract class Shape {
    String color;

    // Static block
    static {
        System.out.println("Static block of Shape class executed");
    }

    // Abstract class constructor
    Shape(String color) {
        this.color = color;
        System.out.println("Shape constructor called: Color = " + color);
    }

    abstract double area();
}

class Rectangle extends Shape {
    int length, breadth;

    // Constructor
    Rectangle(String color, int length, int breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
        System.out.println("Rectangle constructor called");
    }

    double area() {
        return length * breadth;
    }
}

class Cuboid extends Rectangle {
    int height;

    // Constructor chaining using super()
    Cuboid(String color, int length, int breadth, int height) {
        super(color, length, breadth);
        this.height = height;
        System.out.println("Cuboid constructor called");
    }

    double volume() {
        return area() * height;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        System.out.println("Creating Cuboid Object:\n");
        Cuboid c1 = new Cuboid("Blue", 10, 5, 4);

        System.out.println("\nCalculating values:");
        System.out.println("Area of Base: " + c1.area());
        System.out.println("Volume of Cuboid: " + c1.volume());
    }
}
