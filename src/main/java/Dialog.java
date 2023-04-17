import javax.swing.*;
import java.awt.*;

public class Dialog {
    public Dialog(JFrame frame)
    {
        // Show a dialog with JOptionPane.
        JOptionPane.showMessageDialog(frame, "This is a dialog box.");

        // Store the user's input.
        String input = JOptionPane.showInputDialog(frame, "This is a dialog box with input.");



        int option = JOptionPane.showOptionDialog(  frame,
                                                    "This is a dialog box with options.",
                                                    "Options",
                                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                                    JOptionPane.QUESTION_MESSAGE,
                                                    null,
                                                    new String[]{"Yes", "No", "Cancel"},
                                                    "default");

        // Create a JPanel and paint as many rectangles as the user input.
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (int i = 0; i < Integer.parseInt(input); i++) {
                    g.drawRect(10 + i * 60, 10, 50, 50);
                }
            }
        };

        // Add the panel to the content pane.
        frame.add(panel);
    }
}
