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
    villains = new ArrayList<>();

    for (int i = 0; i < (int)(1+Math.random()*50); i++) {
        int x = (int) (Math.random() * 9);
        int y = (int) (Math.random() * 9);
        while (boardCoordinates.isItAWall(x,y)) {
          x = (int) (Math.random() * 9);
          y = (int) (Math.random() * 9);
        }
        Skeleton sk = new Skeleton(y,x);
        villains.add(sk);
    }

    int bossX = (int)(5+Math.random()*5);
    int bossY = (int)(5+Math.random()*5);
    while (boardCoordinates.isItAWall(bossX,bossY)) {
      bossX = (int) (5 + Math.random() * 5);
      bossY = (int) (5 + Math.random() * 5);
    }
    boss = new Boss(bossY, bossX);
    villains.add(boss);

    hud = new HUD(0, 11, hero, boss, villains);

  }

    @Override
    public void paint (Graphics graphics) {
      super.paint(graphics);

      if (map == null) {
        doMap();
      }

      for (int i = 0; i < map.size(); i++) {
        map.get(i).draw(graphics);
      }

      if (hero == null) {
        createCreatures();
      }

      if (hero.alive) {
        hero.draw(graphics);
      }

      for (int i = 0; i < villains.size(); i++) {
        if (villains.get(i).alive)
        villains.get(i).draw(graphics);
      }

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

      PushTheButtons keys = new PushTheButtons(boardCoordinates, hero, villains);
      keys.move(e);
      PushTheButtons keys2 = new PushTheButtons(boardCoordinates, hero, villains);
      keys2.fight(e);
      repaint();
  }
}

