import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class PushTheButtons {
  BoardCoordinates boardCoordinates;
  Hero hero;
  ArrayList<Creature> monsters;

  public PushTheButtons(BoardCoordinates boardCoordinates, Hero hero, ArrayList<Creature> monsters) {
    this.boardCoordinates = boardCoordinates;
    this.hero = hero;
    this.monsters = monsters;
  }

  public void move(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      if (hero.posY > 0 && !boardCoordinates.isItAWall(hero.posY - 1, hero.posX)) {
        hero.posY -= 1;
        hero.up();
      }
      else if (hero.posY == 0 || boardCoordinates.isItAWall(hero.posY - 1, hero.posX) ) {
        hero.down();
      }
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      if (hero.posY < 9 && !boardCoordinates.isItAWall(hero.posY + 1, hero.posX)) {
        hero.posY += 1;
        hero.down();
      }
      else if (hero.posY == 9 || boardCoordinates.isItAWall(hero.posY + 1, hero.posX)) {
        hero.up();
      }
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (hero.posX > 0 && !boardCoordinates.isItAWall(hero.posY, hero.posX - 1)) {
        hero.posX -= 1;
        hero.left();
      }
      else if (hero.posX == 0 || boardCoordinates.isItAWall(hero.posY, hero.posX - 1)) {
        hero.right();
      }
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (hero.posX < 9 && !boardCoordinates.isItAWall(hero.posY, hero.posX + 1)) {
        hero.posX += 1;
        hero.right();
      }
      else if (hero.posX == 9 || boardCoordinates.isItAWall(hero.posY, hero.posX + 1)) {
        hero.left();
      }
    }
  }

  public void fight(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
      for (int i = 0; i < monsters.size(); i++) {
        if (hero.isThereAnything(hero, monsters.get(i))) {
          hero.battle(hero, monsters.get(i));
        }
      }
    }
  }
}
