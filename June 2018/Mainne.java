abstract class Shape {
    protected int x, y; // Common properties

    public abstract void draw(); // Abstract method without implementation

    public void move(int dx, int dy) {
        // Concrete method with common behavior
        x += dx;
        y += dy;
    }
}

class Circle extends Shape {
    private int radius;

    @Override
    public void draw() {
        // Specialized implementation for drawing a circle
        System.out.println("Drawing a circle with center (" + x + ", " + y + ") and radius " + radius);
    }

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
}

class Rectangle extends Shape {
    private int width, height;

    @Override
    public void draw() {
        // Specialized implementation for drawing a rectangle
        System.out.println("Drawing a rectangle with top-left corner (" + x + ", " + y + ") and dimensions " + width + "x" + height);
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}

public class Mainne {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(10, 20, 5), new Rectangle(25, 30, 10, 15)};

        for (Shape shape : shapes) {
            shape.draw(); // Polymorphic behavior: Calls correct draw() based on object type
            shape.move(5, 3); // Common behavior inherited from Shape
        }
    }
}
