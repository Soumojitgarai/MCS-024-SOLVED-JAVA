import java.applet.*;
import java.awt.*;

public class CircleApplet extends Applet {

  private int radius = 50; // Change this value to adjust the circle size

  @Override
  public void paint(Graphics g) {
    super.paint(g);
    g.setColor(Color.BLUE); // Change this to desired color
    g.fillOval(getWidth() / 2 - radius / 2, getHeight() / 2 - radius / 2, radius, radius);
  }
}
