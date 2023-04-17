import Layouts.*;
import Layouts.Box;
import Listeners.K_Listener;
import Listeners.MsM_Listener;
import Listeners.Ms_Listener;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create a new JFrame container.
        JFrame frame = new JFrame("A Simple Swing Application");

        // Give the frame an initial size.
        frame.setSize(600, 600);

        int option = 0;

        switch (option)
        {
            case 0:
                // Dialogs
                Dialog dialog = new Dialog(frame);
                break;
            case 1:
                // Layouts
//                Grid grid = new Grid(frame);
//                Box box = new Box(frame);
//                Border border = new Border(frame);

                break;
            case 2:
                // Listeners
                Ms_Listener ms_listener = new Ms_Listener();
                frame.addMouseListener(ms_listener);

                MsM_Listener msm_listener = new MsM_Listener();
                frame.addMouseMotionListener(msm_listener);

                K_Listener k_listener = new K_Listener();
                frame.addKeyListener(k_listener);
                break;
        }







        // Display the frame.
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
