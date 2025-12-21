public class FinalLabTask3 {
    
// Abstract class
abstract class Shape {

    // Abstract method
    abstract double calculateArea();

    // Concrete method
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement abstract method
    double calculateArea() {
        return length * width;
    }
}

// Circle subclass
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implement abstract method
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Shape rect = new Rectangle(5, 4);
        rect.displayShape();
        System.out.println("Rectangle Area: " + rect.calculateArea());

        Shape cir = new Circle(3);
        cir.displayShape();
        System.out.println("Circle Area: " + cir.calculateArea());
    }
}