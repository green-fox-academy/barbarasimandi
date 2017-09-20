import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
      // draw four different size and color rectangles.

        graphics.setColor(Color.GREEN);
        graphics.drawRect(20, 20, 100, 100);

        graphics.setColor(Color.RED);
        graphics.drawRect(20, 200, 100, 80);

        graphics.setColor(Color.ORANGE);
        graphics.drawRect(150, 200, 50, 99);

        graphics.setColor(Color.MAGENTA);
        graphics.drawRect(140, 100, 150, 70);
    }

//    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
