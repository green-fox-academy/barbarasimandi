public class MainGarden {

  public static void main(String[] args) {
    Garden myGarden = new Garden();

    Flower yellow = new Flower("yellow");
    Flower blue = new Flower("blue");

    myGarden.plant(yellow);
    myGarden.plant(blue);

    Tree purple = new Tree("purple");
    Tree orange = new Tree("orange");

    myGarden.plant(purple);
    myGarden.plant(orange);

    myGarden.currentWaterLevel();
    myGarden.waterFlora(40);
    myGarden.currentWaterLevel();
    myGarden.waterFlora(70);
    myGarden.currentWaterLevel();
  }
}
