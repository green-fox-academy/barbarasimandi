import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

    public static void mainDraw(Graphics graphics){
      // draw a box that has different colored lines on each edge.
      graphics.setColor(Color.RED);
      graphics.drawLine(50, 70, 150, 70);

      graphics.setColor(Color.GREEN);
      graphics.drawLine(150, 70, 150, 170);

      graphics.setColor(Color.ORANGE);
      graphics.drawLine(50, 170, 150, 170);

      graphics.setColor(Color.MAGENTA);
      graphics.drawLine(50, 70, 50, 170);
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
