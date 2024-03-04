import java.awt.*;

public class RectangleDrawingExample {

    public static void main(String[] args) {
        Frame frame = new Frame("Rectangle Drawing");
        frame.setSize(400, 300);
        frame.setVisible(true);

        frame.add(new Canvas() {
            @Override
            public void paint(Graphics g) {
                // Draw a rectangle with coordinates and dimensions
                g.drawRect(50, 50, 100, 80);
            }
        });
    }
}

