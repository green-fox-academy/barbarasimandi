import java.awt.Graphics;

public class HUD {
  String text;
  int x;
  int y;
  Hero hero = new Hero(0,0);

  public HUD(int x, int y) {
    this.text = "Hero(" + hero.level + ") HP:" + hero.HP + " | DP:" + hero.DP + " | SP:" + hero.SP;
    this.x = x;
    this.y = y;
  }
  public void draw(Graphics graphics) {
    
      graphics.drawString(text, x * 72, y * 72);
  }
}
