package Input;

import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;


/**
 * Created by Jeremy on 3/1/2015.
 */
public class Mouse implements MouseInputListener {
    private static int mouseX = 0, mouseY = 0;

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e){
        mouseX = e.getX();
        mouseY = e.getY();
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
    }

    public static int[] getMousePos(){
        int[] i =  {mouseX, mouseY};
        return i;
    }
}
