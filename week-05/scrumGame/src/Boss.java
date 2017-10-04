public class Boss extends Creature{
  public Boss(int col, int row) {
    super("assets/boss.png", col, row);
    this.HP = 2 * this.level * d6 + d6;
    this.DP =  this.level/2 * d6 + d6/2;
    this.SP =  this.level * d6 + this.level;
  }
}
