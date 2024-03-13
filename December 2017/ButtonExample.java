import java.awt.*;
import java.awt.event.*;

public class ButtonExample {

    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button
        JButton button = new JButton("Click me");

        // Create an event listener object
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        };

        // Register the event listener with the button
        button.addActionListener(listener);

        // Add the button to the frame
        frame.add(button);

        // Set the frame size and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
