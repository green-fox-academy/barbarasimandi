import java.util.ArrayList;
import java.util.Arrays;

public class Wall extends PositionedImage {

  boolean movable;

  public Wall (int x, int y) {
    super("assets/wall.png", x, y);
    this.movable = false;
  }



}
