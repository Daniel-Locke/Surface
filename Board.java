import java.awt.*;
import java.applet.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.*;
public class Board extends Applet implements KeyListener {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private boolean ready;

    @Override
    public void init() {
        super.init();
        setSize(1000,650);
        x1 = 0;
        y1 = 0;
        x2 = 1000;
        y2 = 650;

        this.requestFocus ();
        addKeyListener (this);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if((x1 <= 1000 && x1 >= 0) && (y1 <=650 && y1>=0)){
            g.fillRect(x1, y1, 20, 20);
            g.fillRect(x2, y2, 20, 20);
        }


       // repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        ready = true;
        if((x1 <= 1000 && x1 >= 0) && (y1 <=650 && y1>=0)){
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                y1 -= 10;
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                if (e.getKeyCode() == KeyEvent.VK_DOWN && e.getKeyCode() == KeyEvent.VK_LEFT) {
                    y1 -= 10;
                    x1 -= 10;
                }
                System.out.println(e.getKeyCode());
                y1 += 10;
            } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                x1 -= 10;
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                x1 += 10;
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN && e.getKeyCode() == KeyEvent.VK_LEFT) {
                y1 -= 10;
                x1 -= 10;
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN && e.getKeyCode() == KeyEvent.VK_RIGHT) {

            } else if (e.getKeyCode() == KeyEvent.VK_UP && e.getKeyCode() == KeyEvent.VK_LEFT) {

            } else if (e.getKeyCode() == KeyEvent.VK_DOWN && e.getKeyCode() == KeyEvent.VK_RIGHT) {

            }
        }
        else{
            x1 = 0;
            y1 = 0;
        }
        repaint();
    }
}
