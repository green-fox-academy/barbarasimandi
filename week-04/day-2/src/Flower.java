public class Flower extends Plant {

  public Flower(String color) {
    super(color);
    waterAbsorb = 0.75;
  }

  public String isItThirsty() {
    if (waterLevel < 5) {
      super.thirsty = true;
      return "needs water";
    }
    super.thirsty = false;
    return "doesn't need water";
  }
}
