package Player;

import Input.Mouse;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Jeremy on 3/1/2015.
 */
public class PlayerChar {
    BufferedImage img;


    public PlayerChar(String imgLoc){
        try {
            img = ImageIO.read(new File(imgLoc));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g){
        g.drawImage(img, Mouse.getMousePos()[0], Mouse.getMousePos()[1] - 25, 75, 50, null);
    }
}
