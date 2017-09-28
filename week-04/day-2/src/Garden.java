import java.util.ArrayList;

public class Garden {

  ArrayList<Plant> garden = new ArrayList<>();


  public void plant(Plant flora) {
    garden.add(flora);
  }

  public void waterFlora(int waterAmount) {
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i).thirsty) {
        garden.get(i).waterLevel += waterAmount / (i+1) * garden.get(i).waterAbsorb;
      }
    }
    System.out.println("Watering with " + waterAmount);
  }

  public void currentWaterLevel() {
    for (int i = 0; i < garden.size(); i++) {
      if(garden.get(i) instanceof Flower){
        System.out.println("The " + garden.get(i).color + " Flower " + ((Flower) garden.get(i)).isItThirsty());
      } else {
        System.out.println("The " + garden.get(i).color + " Tree " + ((Tree) garden.get(i)).isItThirsty());
      }
  }
}
}
