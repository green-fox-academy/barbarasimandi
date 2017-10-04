public class Hero extends Creature {

  public Hero(int x, int y) {
    super("assets/hero-down.png", x, y);
    this.HP = 20 + 3 * d6;
    this.DP = 2 * d6;
    this.SP = 5 + d6;
  }

  public void down() {
    readFromFile("assets/hero-down.png");
  }

  public void right() {
    readFromFile("assets/hero-right.png");
  }

  public void left() {
    readFromFile("assets/hero-left.png");
   }

  public void up() {
    readFromFile("assets/hero-up.png");
  }
}
