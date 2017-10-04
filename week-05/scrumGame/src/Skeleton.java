public class Skeleton extends Creature {

  public Skeleton(int col, int row) {
  super("assets/skeleton.png", col, row);
  this.HP = 2 * this.level * d6;
  this.DP =  this.level/2 * d6;
  this.SP =  this.level * d6;
  }
}
