import java.util.ArrayList;

public class SharpieSet {

  ArrayList<Sharpie> sharpies;

  public void sharpieAdd(Sharpie sharpieItem) {
    sharpies = new ArrayList<>();
    sharpies.add(sharpieItem);
  }

  public boolean isSharpieUsable(Sharpie sharpieItem) {
    if (sharpieItem.inkAmount > 0) {
      return true;
    }
    return false;
  }

  public void removeFromSet(Sharpie sharpieItem) {
    if (sharpieItem.inkAmount < 0) {
      sharpies.remove(sharpieItem);
    }
  }
  public void currentInkLevel(Sharpie sharpieItem) {
    System.out.println(sharpieItem.inkAmount);
  }
}
