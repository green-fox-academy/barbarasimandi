import javax.naming.SizeLimitExceededException;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskiCarpet {

  public static void mainDraw(Graphics graphics){
    // fill the canvas with a checkerboard pattern.

    sierpinski(0,0, WIDTH, graphics);

  }

  public static void sierpinski(int x, int y, int edge, Graphics gr) {
    int side = edge/3;
    if (edge != 0) {
      sierpinski(x,y, side, gr);
      sierpinski(x + side, y, side, gr);
      sierpinski(x,y + side, side, gr);
      sierpinski(x + side * 2,y, side, gr);
      sierpinski(x,y + side * 2, side, gr);
      sierpinski(x + side * 2,y + side, side, gr);
      sierpinski(x + side * 2,y + side * 2, side, gr);
      sierpinski(x + side,y + side * 2, side, gr);
    }
    int R = (int)(Math.random()*256);
    int G = (int)(Math.random()*256);
    int B = (int)(Math.random()*256);
    gr.setColor(new Color(R, G, B));
    gr.fillRect(x + side,y + side, side - 1, side - 1);

  }
  //    Don't touch the code below
  static int WIDTH = 1000;
  static int HEIGHT = 1000;

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
