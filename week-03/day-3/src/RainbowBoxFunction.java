import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;

import java.awt.*;

import static java.awt.Color.BLACK;
import static java.awt.Color.BLUE;
import static java.awt.Color.GRAY;
import static java.awt.Color.GREEN;
import static java.awt.Color.LIGHT_GRAY;
import static java.awt.Color.MAGENTA;
import static java.awt.Color.ORANGE;
import static java.awt.Color.PINK;
import static java.awt.Color.RED;
import static java.awt.Color.YELLOW;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics){
      // create a square drawing function that takes 2 parameters:
      // the square size, and the fill color,
      // and draws a square of that size and color to the center of the canvas.
      // create a loop that fills the canvas with rainbow colored squares.


      ArrayList<Color> colorList = new ArrayList<>(Arrays.asList(RED, ORANGE, YELLOW, GREEN, BLUE, MAGENTA, RED));
      rainbowBox(300, colorList, graphics);

    }

  public static void rainbowBox(int size, ArrayList<Color> colorList, Graphics gr) {

    for (int i = 0; i < 7; i++) {
      gr.setColor(colorList.get(i));
      gr.fillRect(WIDTH/2 - size/2, HEIGHT/2 - size/2, size, size);
      size -= 30;
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
