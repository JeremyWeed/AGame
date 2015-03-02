package Graphics;

import Input.Mouse;
import Player.PlayerChar;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

/**
 * Created by Jeremy on 3/1/2015.
 */
public class GameWindow extends JFrame {
    BufferStrategy bufferStrategy;
    Canvas canvas;
    JPanel panel;
    PlayerChar c;
    Background b;
    static int WIDTH = 1280, HEIGHT = 800;

    public GameWindow(){
        canvas = new Canvas();
        canvas.setIgnoreRepaint(true);
        canvas.addMouseMotionListener(new Mouse());
        canvas.setBounds(0, 0, WIDTH, HEIGHT);
        panel = (JPanel) getContentPane();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        panel.setLayout(null);
        panel.add(canvas);
        setTitle("A Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(true);
        canvas.createBufferStrategy(2);
        bufferStrategy = canvas.getBufferStrategy();
        canvas.requestFocus();
        c = new PlayerChar("resources/player.png");
        b = new Background("resources/background.png");
        //stackoverflow copypasta - yay
        BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);

        // Create a new blank cursor.
        Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(
                cursorImg, new Point(0, 0), "blank cursor");

        // Set the blank cursor to the JFrame.
        getContentPane().setCursor(blankCursor);

    }

    public void update(){
        Graphics2D g = (Graphics2D) this.bufferStrategy.getDrawGraphics();
        b.draw(g);
        c.draw(g);
        g.dispose();
        bufferStrategy.show();
    }
}
