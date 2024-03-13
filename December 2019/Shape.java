public abstract class Shape {

    public abstract double area();

    public abstract String getName();
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}

class Rectangle extends Shape {

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Area of " + circle.getName() + ": " + circle.area());
        System.out.println("Area of " + rectangle.getName() + ": " + rectangle.area());
    }
}
