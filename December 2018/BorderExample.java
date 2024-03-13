import javax.swing.*;
import java.awt.*;

public class BorderExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create components for each region
        JPanel northPanel = new JPanel();
        northPanel.add(new JLabel("North"));
        northPanel.setBackground(Color.GREEN);

        JPanel southPanel = new JPanel();
        southPanel.add(new JLabel("South"));
        southPanel.setBackground(Color.RED);

        JPanel eastPanel = new JPanel();
        eastPanel.add(new JLabel("East"));
        eastPanel.setBackground(Color.BLUE);

        JPanel westPanel = new JPanel();
        westPanel.add(new JLabel("West"));
        westPanel.setBackground(Color.YELLOW);

        JPanel centerPanel = new JPanel();
        centerPanel.add(new JButton("Click Me!"));
        centerPanel.setBackground(Color.WHITE);

        // Set the layout manager
        frame.setLayout(new BorderLayout());

        // Add components to the container
        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(southPanel, BorderLayout.SOUTH);
        frame.add(eastPanel, BorderLayout.EAST);
        frame.add(westPanel, BorderLayout.WEST);
        frame.add(centerPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

