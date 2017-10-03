import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  int HeroPosX;
  int HeroPosY;

  BoardCoordinates boardCoordinates;
  Floor floor;
  Wall wall;
  Hero hero;
  String heroImage = "assets/hero-down.png";

  public Board() {
    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
    boardCoordinates = new BoardCoordinates();
  }

    @Override
    public void paint (Graphics graphics) {
      super.paint(graphics);

      // here you have a 720x720 canvas
      // you can create and draw an image using the class below e.g.

      for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
          if (boardCoordinates.getValue(i, j) == 0) {
            floor = new Floor(i, j);
            floor.draw(graphics);
          } else {
            wall = new Wall(i, j);
            wall.draw(graphics);
          }
        }
      }


      hero = new Hero(heroImage, HeroPosX, HeroPosY);
      hero.draw(graphics);
      }


  public static void main(String[] args) {
    // Here is how you set up a new window and adding our board to it
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    // Here is how you can add a key event listener
    // The board object will be notified when hitting any key
    // with the system calling one of the below 3 methods
    frame.addKeyListener(board);
    // Notice (at the top) that we can only do this
    // because this Board class (the type of the board object) is also a KeyListener
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }
  @Override
  public void keyPressed(KeyEvent e) {

  }
  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box

      if (e.getKeyCode() == KeyEvent.VK_UP) {
        HeroPosY -= 1;

          heroImage = "assets/hero-up.png";


      } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
        HeroPosY += 1;

      }
      else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
        HeroPosX -= 1;

      }
      else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
        HeroPosX += 1;
      }
      // and redraw to have a new picture with the new coordinates
      repaint();
    }

  }

