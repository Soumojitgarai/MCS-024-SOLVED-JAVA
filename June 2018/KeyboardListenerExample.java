import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListenerExample implements KeyListener {

    public static void main(String[] args) {
        // Add this listener to your desired component (e.g., a text field)
        yourComponent.addKeyListener(new KeyboardListenerExample());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    // Implement other KeyListener methods (keyReleased, keyTyped) if needed
}
