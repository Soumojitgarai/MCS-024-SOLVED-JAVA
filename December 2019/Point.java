public class Point {
    private int x;
    private int y;
  
    // Default constructor - no arguments
    public Point() {
      this(0, 0); // Call another constructor with default values
    }
  
    // Constructor with two integer arguments
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  
    public void print() {
      System.out.println("(" + x + ", " + y + ")");
    }
  }
  
  public class Main {
    public static void main(String[] args) {
      // Create a Point object with default constructor (x=0, y=0)
      Point point1 = new Point();
      point1.print(); // Output: (0, 0)
  
      // Create a Point object with parameterized constructor (x=5, y=3)
      Point point2 = new Point(5, 3);
      point2.print(); // Output: (5, 3)
    }
  }
  