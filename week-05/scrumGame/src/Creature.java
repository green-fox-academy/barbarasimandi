public class Creature extends PositionedImage {

  int level = 1;
  int maxHP;
  int HP;
  int DP;
  int SP;
  int d6 = (int)(Math.random()*7);
  boolean alive = true;

 public Creature(String fileName, int col, int row) {
   super(fileName, col, row);
   this.readFromFile(fileName);
 }

  public void die() {
    alive = false;
  }
}
