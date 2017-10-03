import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  int testBoxX;
  int testBoxY;

  ArrayList<PositionedImage> board;
  ArrayList<Coordinates> coordinates;

  Coordinates c1 = new Coordinates(0,4);
  Coordinates c2 = new Coordinates(1,2);
  Coordinates c3 = new Coordinates(1,4);
  Coordinates c4 = new Coordinates(1,5);
  Coordinates c5 = new Coordinates(1,6);
  Coordinates c6 = new Coordinates(1,8);
  Coordinates c7 = new Coordinates(1,10);
  Coordinates c8 = new Coordinates(2,2);
  Coordinates c9 = new Coordinates(2,8);
  Coordinates c10 = new Coordinates(3,0);
  Coordinates c12 = new Coordinates(3,1);
  Coordinates c13 = new Coordinates(3,2);
  Coordinates c14 = new Coordinates(3,4);
  Coordinates c15 = new Coordinates(3,5);
  Coordinates c16 = new Coordinates(3,6);
  Coordinates c17 = new Coordinates(3,8);
  Coordinates c18 = new Coordinates(3,9);
  Coordinates c19 = new Coordinates(3,10);
  Coordinates c20 = new Coordinates(5,0);
  Coordinates c21 = new Coordinates(5,1);
  Coordinates c22 = new Coordinates(5,2);
  Coordinates c23 = new Coordinates(5,3);
  Coordinates c24 = new Coordinates(5,4);
  Coordinates c25 = new Coordinates(5,6);
  Coordinates c26 = new Coordinates(5,7);
  Coordinates c27 = new Coordinates(5,8);
  Coordinates c28 = new Coordinates(5,9);
  Coordinates c29 = new Coordinates(5,10);
  Coordinates c30 = new Coordinates(6,4);
  Coordinates c31 = new Coordinates(6,6);
  Coordinates c32 = new Coordinates(6,7);
  Coordinates c33 = new Coordinates(6,9);
  Coordinates c34 = new Coordinates(7,1);
  Coordinates c35 = new Coordinates(7,2);
  Coordinates c36 = new Coordinates(7,4);
  Coordinates c37 = new Coordinates(8,1);
  Coordinates c38 = new Coordinates(8,2);
  Coordinates c39 = new Coordinates(8,4);
  Coordinates c40 = new Coordinates(8,5);
  Coordinates c41 = new Coordinates(8,6);
  Coordinates c42 = new Coordinates(8,7);
  Coordinates c43 = new Coordinates(8,8);
  Coordinates c44 = new Coordinates(8,9);

  public Board() {
    testBoxX = 0;
    testBoxY = 0;
    board = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 11; j++) {
        Floor floor = new Floor();
        floor.posX = i;
        floor.posY = j;
        board.add(floor);
      }
    }

    for (int i = 0; i < wallX.size(); i++) {
      Wall wall = new Wall();
      wall.posX = wallX.get(i);
      wall.posY = wallY.get(i);
      board.add(wall);
    }

    Hero hero = new Hero();
    for (int i = 0; i < wallX.size(); i++) {
      board.add(hero);
    }


    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }


  @Override
  public void paint(Graphics graphics) {
        super.paint(graphics);
    /*graphics.fillRect(testBoxX, testBoxY, 100, 100);*/
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.

    for (int i = 0; i < board.size(); i++) {
      board.get(i).draw(graphics);
    }

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
      testBoxY -= 1;

    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      testBoxY += 1;

    }
    else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      testBoxX -= 1;

    }
    else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      testBoxX += 1;
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}