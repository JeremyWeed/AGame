package Graphics;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Jeremy on 3/1/2015.
 */
public class Background {
    BufferedImage img;

    public Background(String imgLoc){
        try {
            img = ImageIO.read(new File(imgLoc));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g){
        g.drawImage(img, 0, 0, GameWindow.WIDTH, GameWindow.HEIGHT, null);
    }
}
