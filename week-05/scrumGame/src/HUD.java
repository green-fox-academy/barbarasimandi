import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

public class HUD {

  int x;
  int y;
  Hero hero;
  Boss boss;
  ArrayList<Skeleton> skeletons;


  public HUD(int x, int y, Hero hero, Boss boss, ArrayList<Skeleton> skeletons) {
    this.hero = hero;
    this.boss = boss;
    this.skeletons = skeletons;

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

    if (boss.isThereAnything(hero, boss)) {
      graphics.drawString(
          "Boss (Level " + boss.level + ") HP: " + boss.maxHP + "/" + boss.HP + " | DP: " + boss.DP
              + " | SP: " + boss.SP, x * 70, y * 70);

    }
    else if (skeletons.get(0).isThereAnything(hero, skeletons.get(0))) {
      graphics.drawString(
          "Skeleton (Level " + skeletons.get(0).level + ") HP: " + skeletons.get(0).maxHP + "/" + skeletons.get(0).HP + " | DP: " + skeletons.get(0).DP
              + " | SP: " + skeletons.get(0).SP, x * 70, y * 70);
    }
    else if (skeletons.get(1).isThereAnything(hero, skeletons.get(1))) {
      graphics.drawString(
          "Skeleton (Level " + skeletons.get(1).level + ") HP: " + skeletons.get(1).maxHP + "/" + skeletons.get(1).HP + " | DP: " + skeletons.get(1).DP
              + " | SP: " + skeletons.get(1).SP, x * 70, y * 70);
    }
    else if (skeletons.get(2).isThereAnything(hero, skeletons.get(2))) {
      graphics.drawString(
          "Skeleton (Level " + skeletons.get(2).level + ") HP: " + skeletons.get(2).maxHP + "/" + skeletons.get(2).HP + " | DP: " + skeletons.get(2).DP
              + " | SP: " + skeletons.get(2).SP, x * 70, y * 70);
    }
  }
}
