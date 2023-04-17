import javax.swing.*;
import java.awt.*;

public class paintOnPanel {
    public paintOnPanel(JFrame frame)
    {
        // Create a JPanel and paint rectangles on it.
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawRect(10, 10, 50, 50);
                g.drawRect(70, 10, 50, 50);
                g.drawRect(130, 10, 50, 50);
            }
        };

        // Add the panel to the content pane.
        frame.add(panel);
    }
}
