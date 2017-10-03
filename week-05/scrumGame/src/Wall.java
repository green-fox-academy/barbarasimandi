import java.util.ArrayList;
import java.util.Arrays;

public class Wall extends PositionedImage {

  boolean movable;

  public Wall () {
    super("assets/wall.png", 0, 0);
    this.movable = false;
  }



}
