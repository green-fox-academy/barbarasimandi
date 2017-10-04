import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class HUD {
  String text;
  int x;
  int y;
  Hero hero = new Hero(0,0);

  public HUD(int x, int y) {
    this.text = "Hero(Level " + hero.level + ") HP: " + hero.maxHP + "/" + hero.HP + " | DP: " + hero.DP + " | SP: " + hero.SP;
    this.x = x;
    this.y = y;
  }
  public void draw(Graphics graphics) {
      graphics.setColor(Color.WHITE);
      graphics.fillRect(0, 720, 720, 130);
      graphics.setColor(Color.BLACK);
      Font myFont = new Font("Arial", 1, 25);
      graphics.setFont(myFont);
      graphics.drawString(text, x * 72, y * 72);
  }
}
