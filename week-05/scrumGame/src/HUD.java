import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

public class HUD {

  int x;
  int y;
  Hero hero;
  Boss boss;
  ArrayList<Creature> monsters;


  public HUD(int x, int y, Hero hero, Boss boss, ArrayList<Creature> monsters) {
    this.hero = hero;
    this.boss = boss;
    this.monsters = monsters;

    this.x = x;
    this.y = y;

  }

  public void draw(Graphics graphics) {

    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 720, 720, 130);
    graphics.setColor(Color.BLACK);
    Font myFont = new Font("Arial", 1, 20);
    graphics.setFont(myFont);
    graphics.drawString(
        "Hero (Level " + hero.level + ") HP: " + hero.maxHP + "/" + hero.HP + " | DP: " + hero.DP
            + " | SP: " + hero.SP, x * 72, y * 72);

    for (int i = 0; i < monsters.size(); i++) {
      if (boss.isThereAnything(hero, boss) && boss.alive) {
        graphics.drawString(
            "Boss (Level " + boss.level + ") HP: " + boss.maxHP + "/" + boss.HP + " | DP: " + boss.DP
                + " | SP: " + boss.SP, x * 70, y * 70);

      }
      else if (monsters.get(i).isThereAnything(hero, monsters.get(i)) && monsters.get(i).alive) {
        graphics.drawString(
            "Skeleton (Level " + monsters.get(i).level + ") HP: " + monsters.get(i).maxHP + "/" + monsters.get(i).HP + " | DP: " + monsters.get(i).DP
                + " | SP: " + monsters.get(i).SP, x * 70, y * 70);
      }
    }
  }
}
