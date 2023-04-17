package Listeners;

import javax.swing.*;

public class Listener_Implementation {
    public Listener_Implementation(JFrame frame)
    {
        // Implement MouseListener, MouseMotionListener, KeyListener
        // Create the MouseListener

        Ms_Listener ms_listener = new Ms_Listener();
        frame.addMouseListener(ms_listener);

        // Create the MouseMotionListener
        MsM_Listener msm_listener = new MsM_Listener();
        frame.addMouseMotionListener(msm_listener);

        // Create the KeyListener
        K_Listener k_listener = new K_Listener();
        frame.addKeyListener(k_listener);
    }
}
