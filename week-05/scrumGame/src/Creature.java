import java.util.ArrayList;

public class Creature extends PositionedImage {

  int level;
  int maxHP;
  int HP;
  int DP;
  int SP;
  int d6 = (int)(Math.random()*7);
  boolean alive = true;

 public Creature(String fileName, int col, int row) {
   super(fileName, col, row);
   this.level = 1;
 }

  public void die() {
    alive = false;
  }

  public void fight(Creature creature, Creature creature1) {
      if (isThereAnything(creature, creature1)){

      }

  }

  public boolean isThereAnything(Creature creature, Creature creature1) {
    return creature.posX == creature1.posX && creature.posY == creature1.posY;
  }

}
