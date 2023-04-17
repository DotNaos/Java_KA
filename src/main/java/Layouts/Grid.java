package Layouts;
import javax.swing.*;
import java.awt.*;

// GridLayout
public class Grid{
    public Grid(JFrame frame) {
        // Create a GridLayout with 3 rows and 2 columns.
        GridLayout grid = new GridLayout(3, 2);
        frame.setLayout(grid);

        // Create Array of 6 buttons.
        JButton[] buttons = new JButton[6];

        // Create 6 buttons and add them to the frame.
        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton("Button " + (i + 1));
            frame.add(buttons[i]);
        }




    }
}

