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

  public void battle(Creature creature, Creature creature1) {
    if ((creature.HP > 0 && creature1.HP > 0) && isThereAnything(creature, creature1)) {
      strike(creature, creature1);
      strike(creature1, creature);
    } else if (creature.HP <= 0) {
      creature.die();
    } else if (creature1.HP <= 0) {
      creature1.die();
    }
  }


  public void strike(Creature creature, Creature creature1) {
   int SV = creature.SP + d6*2;
   if (SV > creature1.DP) {
     creature1.HP -= (SV - creature1.DP);
   }
  }

  public boolean isThereAnything(Creature creature, Creature creature1) {
    return creature.posX == creature1.posX && creature.posY == creature1.posY;
  }

  /*public Creature whoIsThere() {
    for (int i = 0; i < ; i++) {

    }
    }
  } return */

}
