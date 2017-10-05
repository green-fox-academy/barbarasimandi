import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements
    KeyListener {

  BoardCoordinates boardCoordinates;
  Floor floor;
  Wall wall;
  ArrayList<PositionedImage> map;
  Hero hero;
  Skeleton skeleton;
  Skeleton skeletoen;
  Skeleton skeletoan;
  ArrayList<Skeleton> skeletons;
  Boss boss;
  ArrayList<Creature> villains;
  HUD hud;

  public Board() {
    // set the size of your draw board
    setPreferredSize(new Dimension(720, 796));
    setVisible(true);
    boardCoordinates = new BoardCoordinates();
  }

  public void doMap() {
    map = new ArrayList<>();
    for (int row = 0; row < 10; row++) {
      for (int col = 0; col < 10; col++) {
        if (boardCoordinates.getValue(row, col) == 0) {
          floor = new Floor(col, row);
          map.add(floor);
        } else {
          wall = new Wall(col, row);
          map.add(wall);
        }
      }
    }
  }

  public void createCreatures() {

    hero = new Hero(0, 0);

    skeletons = new ArrayList<>();
    skeleton = new Skeleton(4, 3);
    skeletons.add(skeleton);
    skeletoan = new Skeleton(0, 9);
    skeletons.add(skeletoan);
    skeletoen = new Skeleton(4, 5);
    skeletons.add(skeletoen);
    boss = new Boss(9, 9);
    villains = new ArrayList<>();
    villains.add(skeleton);
    villains.add(skeletoan);
    villains.add(skeletoen);
    villains.add(boss);

    hud = new HUD(0, 11, hero, boss, skeletons);

  }


    @Override
    public void paint (Graphics graphics) {
      super.paint(graphics);

      // here you have a 720x720 canvas
      // you can create and draw an image using the class below e.g.

      if (map == null) {
        doMap();
      }
      for (int i = 0; i < map.size(); i++) {
        map.get(i).draw(graphics);
      }

      if (hero == null) {
        createCreatures();
      }
      /*if (hero.alive || skeletoan.alive || skeletoen.alive || skeleton.alive || boss.alive) {*/
        hero.draw(graphics);

      for (int i = 0; i < villains.size(); i++) {
        villains.get(i).draw(graphics);
      }

        hud.draw(graphics);
      /*}*/
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

      PushTheButtons keys = new PushTheButtons(boardCoordinates, hero, skeleton, villains);
      keys.move(e);
      repaint();
  }
}

