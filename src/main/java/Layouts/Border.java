package Layouts;

import javax.swing.*;
import java.awt.*;

public class Border {
    public Border(JFrame frame)
    {
// Create a BorderLayout.
        BorderLayout border = new BorderLayout();
        frame.setLayout(border);

        // Create 5 buttons in Array and add them to the frame.
        JButton[] buttons = new JButton[5];

        for (int i = 0; i < 5; i++) {
            buttons[i] = new JButton("Button " + (i + 1));
            frame.add(buttons[i]);
        }

        // Set the position of the buttons.
        frame.add(buttons[0], BorderLayout.NORTH);
        frame.add(buttons[1], BorderLayout.SOUTH);
        frame.add(buttons[2], BorderLayout.EAST);
        frame.add(buttons[3], BorderLayout.WEST);
        frame.add(buttons[4], BorderLayout.CENTER);

    }
}
