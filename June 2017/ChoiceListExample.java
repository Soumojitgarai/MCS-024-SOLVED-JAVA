import java.awt.*;

public class ChoiceListExample {

    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("Choice List Example");

        // Create a choice list with options
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        // Set layout and add components to frame
        frame.setLayout(new FlowLayout());
        frame.add(choice);

        // Set frame size and visibility
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}

