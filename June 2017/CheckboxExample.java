public class CheckboxExample {

    public static void main(String[] args) {
        // Create a JFrame for the GUI
        JFrame frame = new JFrame("Checkbox Example");

        // Create three checkboxes with labels
        JCheckBox checkbox1 = new JCheckBox("Option 1");
        JCheckBox checkbox2 = new JCheckBox("Option 2");
        JCheckBox checkbox3 = new JCheckBox("Option 3");

        // Create a JPanel to hold the checkboxes
        JPanel panel = new JPanel();
        panel.add(checkbox1);
        panel.add(checkbox2);
        panel.add(checkbox3);

        // Add an action listener to each checkbox
        checkbox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Option 1 selected!");
                } else {
                    System.out.println("Option 1 deselected!");
                }
            }
        });

        checkbox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Option 2 selected!");
                } else {
                    System.out.println("Option 2 deselected!");
                }
            }
        });

        checkbox3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Option 3 selected!");
                } else {
                    System.out.println("Option 3 deselected!");
                }
            }
        });

        // Add the panel to the frame
        frame.add(panel);

        // Set frame size and visibility
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}

