package Layouts;

import javax.swing.*;
import java.awt.*;

public class Box {
    public Box(JFrame frame)
    {
        // Create a BoxLayout.
        BoxLayout box = new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS);

        frame.setLayout(box);

        final int button_count = 2;

        JButton[] buttons = new JButton[button_count];

        JButton styled_button = new JButton("Styled Button");
        styled_button.setBackground(Color.RED);
        styled_button.setForeground(Color.WHITE);
        styled_button.setFont(new Font("Arial", Font.BOLD, 20));
        styled_button.setAlignmentX(Component.CENTER_ALIGNMENT);







        for (int i = 0; i < button_count; i++) {
            buttons[i] = new JButton("Button " + (i + 1));
            frame.add(buttons[i]);
        }
        frame.add(styled_button);

    }
}
