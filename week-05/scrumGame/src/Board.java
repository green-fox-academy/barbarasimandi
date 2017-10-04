import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  BoardCoordinates boardCoordinates;
  Floor floor;
  Wall wall;
  Hero hero;
  Skeleton skeleton;
  Skeleton skeletoen;
  Skeleton skeletoan;
  Boss boss;
  HUD hud;

  public Board() {
    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
    boardCoordinates = new BoardCoordinates();
    hero = new Hero(0, 0);
    skeleton = new Skeleton(2,3);
    skeletoan = new Skeleton(0,9);
    skeletoen = new Skeleton(4,5);
    boss = new Boss(9,9);
    hud = new HUD(0,10);
  }

    @Override
    public void paint (Graphics graphics) {
      super.paint(graphics);

      // here you have a 720x720 canvas
      // you can create and draw an image using the class below e.g.

      for (int row = 0; row < 10; row++) {
        for (int col = 0; col < 10; col++) {
          if (boardCoordinates.getValue(row, col) == 0) {
            floor = new Floor(col, row);
            floor.draw(graphics);
          } else {
            wall = new Wall(col, row);
            wall.draw(graphics);
          }
        }
      }

      hero.draw(graphics);
      skeleton.draw(graphics);
      skeletoen.draw(graphics);
      skeletoan.draw(graphics);
      boss.draw(graphics);
      hud.draw(graphics);
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

      PushTheButtons keys = new PushTheButtons(boardCoordinates, hero);
      keys.move(e);

      repaint();
    }
  }

