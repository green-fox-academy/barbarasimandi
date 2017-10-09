public class SharpieTry {

  public static void main(String[] args) {
    Sharpie sharpie1 = new Sharpie("blue", 4);
    Sharpie sharpie2 = new Sharpie("green", 50);
    Sharpie sharpie3 = new Sharpie("yellow", 2);
    Sharpie sharpie4 = new Sharpie("purple", 10);

    SharpieSet set = new SharpieSet();
    set.sharpieAdd(sharpie1);
    set.sharpieAdd(sharpie2);
    set.sharpieAdd(sharpie3);
    set.sharpieAdd(sharpie4);

    sharpie1.use();
    sharpie1.use();
    sharpie1.use();
    sharpie1.use();
    sharpie1.use();

    System.out.println(set.isSharpieUsable(sharpie1));

    set.currentInkLevel(sharpie1);
    System.out.println("is the current ink amount of the " + sharpie1.color + "\n");
    set.currentInkLevel(sharpie2);
    set.currentInkLevel(sharpie3);
    set.currentInkLevel(sharpie4);

    sharpie1.use();
    sharpie1.use();
    sharpie1.use();
    sharpie1.use();
    sharpie1.use();

    System.out.println(set.isSharpieUsable(sharpie1));
    set.removeFromSet(sharpie1);

    sharpie2.use();
    sharpie2.use();
    sharpie3.use();
    sharpie4.use();

    set.currentInkLevel(sharpie1);
    set.currentInkLevel(sharpie2);
    set.currentInkLevel(sharpie3);
    set.currentInkLevel(sharpie4);

  }
}
