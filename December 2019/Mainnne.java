interface Drawable {
    void draw();
  }
  
  interface Resizable {
    void resize(int width, int height);
  }
  
  class Rectangle implements Drawable, Resizable {
    private int width;
    private int height;
  
    public Rectangle(int width, int height) {
      this.width = width;
      this.height = height;
    }
  
    @Override
    public void draw() {
      System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
  
    @Override
    public void resize(int width, int height) {
      this.width = width;
      this.height = height;
      System.out.println("Resized rectangle to width " + width + " and height " + height);
    }
  }
  
  public class Mainnne {
    public static void main(String[] args) {
      Rectangle rectangle = new Rectangle(5, 10);
      rectangle.draw();
      rectangle.resize(8, 12);
      rectangle.draw();
    }
  }
  