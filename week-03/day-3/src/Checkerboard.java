import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

    public static void mainDraw(Graphics graphics){
      // fill the canvas with a checkerboard pattern.

      checkboard(0, 0, 40, graphics);

    }

  public static void checkboard(int x, int y, int size, Graphics gr) {

    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (((i % 2 == 0) && (j % 2 == 0)) || (i % 2 != 0) && (j % 2 != 0)) {
          gr.setColor(Color.BLACK);
        }
        else {
          gr.setColor(Color.WHITE);
        }
        gr.fillRect(j * 40, i * 40, size, size);
      }
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
