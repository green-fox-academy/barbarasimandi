import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

  ArrayList<Car> parkingLot;

  public ParkingLot() {
    parkingLot = new ArrayList<>();
    for (int i = 0; i < 255; i++) {
      parkingLot.add(new Car());
    }
  }

  public void countSameTypes() {
    HashMap<String, Integer> carMap = new HashMap<>();

    for (int i = 0; i < parkingLot.size(); i++) {
      String carType = parkingLot.get(i).type;

      if (carMap.containsKey(carType)) {
        int counter = carMap.get(carType);
        carMap.put(carType, ++counter);
      } else {
        carMap.put(carType, 1);
      }
    }
    for (Map.Entry car : carMap.entrySet()) {
      System.out.println(car);
    }
  }

  public void countSameColor() {
    HashMap<String, Integer> carMap = new HashMap<>();

    for (int i = 0; i < parkingLot.size(); i++) {
      String carColor = parkingLot.get(i).color;

      if (carMap.containsKey(carColor)) {
        int counter = carMap.get(carColor);
        carMap.put(carColor, ++counter);
      } else {
        carMap.put(carColor, 1);
      }
    }
    for (Map.Entry car : carMap.entrySet()) {
      System.out.println(car);
    }
  }

  public void printMostFrequentlyOccurring() {

    HashMap<String, Integer> carMap = new HashMap<>();

    for (int i = 0; i < parkingLot.size(); i++) {

      String carTypeAndColor = parkingLot.get(i).color + " " + parkingLot.get(i).type;

      if (carMap.containsKey(carTypeAndColor)) {
        int counter = carMap.get(carTypeAndColor);
        carMap.put(carTypeAndColor, ++counter);

      }
      else {
        carMap.put(carTypeAndColor, 1);
      }
    }

    Map.Entry<String, Integer> mostOccurringCar = null;

    for (Map.Entry<String, Integer> car : carMap.entrySet()) {

      if ((mostOccurringCar == null) || car.getValue() > mostOccurringCar.getValue()) {
        mostOccurringCar = car;
      }
    }
    System.out.println("Most frequently occurring: " + mostOccurringCar.getKey());
  }
}
