package Listeners;

import java.awt.event.KeyEvent;

public class K_Listener implements java.awt.event.KeyListener
{

    @Override
    public void keyTyped(KeyEvent e) {
        // Print the character that was typed
        System.out.println("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Print the character that was typed
        System.out.println("Key Pressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released");
    }
}
