package Listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MsM_Listener implements MouseMotionListener
{

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse Dragged");

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse Moved");
    }
}
