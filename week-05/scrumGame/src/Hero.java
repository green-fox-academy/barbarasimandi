import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Hero extends PositionedImage {

  public Hero(int x, int y) {
    super("assets/hero-down.png", x, y);
  }

  public void down() {
    try {
      image = ImageIO.read(new File("assets/hero-down.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void right() {
    try {
      image = ImageIO.read(new File("assets/hero-right.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void left() {
    try {
      image = ImageIO.read(new File("assets/hero-left.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void up() {
    try {
      image = ImageIO.read(new File("assets/hero-up.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}



