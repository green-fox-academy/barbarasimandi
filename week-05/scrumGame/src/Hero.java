import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Hero extends PositionedImage {

  public Hero(int x, int y) {
    super("assets/hero-down.png", x, y);
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



