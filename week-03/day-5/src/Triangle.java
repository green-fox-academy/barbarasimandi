import javax.naming.SizeLimitExceededException;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {

  public static void mainDraw(Graphics graphics) {

    triangle(0, 0, WIDTH, graphics);

  }

  public static void triangle(int x, double y, int a, Graphics gr) {
    double magassag = (Math.sqrt(3.0) * a)/2;

    if (a > 300) {            // if a > 200, it's not working because of the Math.sqrt(3) is not precise.
      triangle(x,y,a/2,gr);
      triangle(x + a/2,y + y,a/2,gr);
      triangle(x+a/4, y + magassag/2, a/2, gr );
    }
    int x1 = x;
    double y1 = y;
    int x2 = x + a;
    double y2 = y;
    int x3 = x + a / 2;
    double y3 = y + magassag;
    int[] xPoints = {x1, x2, x3};
    int[] yPoints = {(int)y1, (int)y2, (int)y3};
    gr.drawPolygon(xPoints, yPoints, 3);

      xPoints[0] = x + a / 2;
      xPoints[1] = x + 3 * a / 4;
      xPoints[2] = x + a / 4;
      yPoints[0] = (int) y;
      yPoints[1] = (int)y + (int)((Math.sqrt(3.0) * a) / 4);
      yPoints[2] = (int)y + (int)((Math.sqrt(3.0) * a) / 4);
      gr.fillPolygon(xPoints, yPoints, 3);

    }
  //    Don't touch the code below
  static int WIDTH = 500;
  static int HEIGHT = 500;

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
