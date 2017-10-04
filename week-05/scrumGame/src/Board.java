import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
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
    hero = new Hero(0, 0);
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
        if (hero.posY > 0 && !boardCoordinates.isItAWall(hero.posY - 1, hero.posX )) {
          hero.posY -= 1;
          hero.up();
        }
      }
      else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
        if (hero.posY < 9 && !boardCoordinates.isItAWall(hero.posY + 1, hero.posX)) {
          hero.posY += 1;
          hero.down();
        }
      }
      else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
        if (hero.posX > 0 && !boardCoordinates.isItAWall(hero.posY, hero.posX - 1)) {
          hero.posX -= 1;
          hero.left();
        }
      }
      else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
        if (hero.posX < 9 && !boardCoordinates.isItAWall(hero.posY, hero.posX + 1)) {
          hero.posX += 1;
          hero.right();
        }
      }
      // and redraw to have a new picture with the new coordinates
      repaint();
    }

  }

