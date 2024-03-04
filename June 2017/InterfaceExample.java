interface Shape {
    void draw(); // Method signature declaration
    double getArea(); // Method signature declaration
}

class Circle implements Shape {
    double radius;

    public void draw() {
        System.out.println("Drawing a circle");
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    double sideLength;

    public void draw() {
        System.out.println("Drawing a square");
    }

    public double getArea() {
        return sideLength * sideLength;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        shape1.draw(); // Outputs "Drawing a circle"
        shape2.draw(); // Outputs "Drawing a square"

        double area1 = shape1.getArea(); // Calls Circle's implementation
        double area2 = shape2.getArea(); // Calls Square's implementation

        System.out.println("Circle area: " + area1);
        System.out.println("Square area: " + area2);
    }
}