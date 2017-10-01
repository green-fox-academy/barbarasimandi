import java.util.ArrayList;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {

    public static void mainDraw(Graphics graphics){
      // reproduce this:
      // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]

purpleSteps(0, 0, 30, graphics);
    }

  public static void purpleSteps(int x, int y, int size, Graphics gr) {

    for (int i = 0; i < 18; i++) {
      gr.setColor(Color.BLACK);
      gr.drawRect(x, y, size + 1, size + 1);
      gr.setColor(Color.MAGENTA);
      gr.fillRect(x + 1, y + 1, size, size);
      x += size;
      y += size;
    }
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
