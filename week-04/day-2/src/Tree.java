public class Tree extends Plant {
 int waterAmount;

  public Tree(String color){
    super(color);
    waterAbsorb = 0.4;
  }

  public String isItThirsty() {
    if (waterLevel < 10) {
      super.thirsty = true;
      return "needs water";
    }
    super.thirsty = false;
    return "doesn't need water";
  }
}
