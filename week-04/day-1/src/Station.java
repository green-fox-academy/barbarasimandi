public class Station {
    //Create Station and Car classes
    //Station
    // gasAmount
    // refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
    // Car
    // gasAmount
    // capacity
    // create constructor for Car where:
    // initialize gasAmount -> 0
    // initialize capacity -> 100

  int gasAmount;

  public Station(int gasAmount){
   this.gasAmount = gasAmount;
  }

  public void refill(Car car) {
    gasAmount -= car.capacity;
    while (car.gasAmount != car.capacity) {
      car.gasAmount += car.capacity;
    }
  }

  public static void main(String[] args) {
    Station agip = new Station(5000);
    Car beetle = new Car();

    agip.refill(beetle);
    agip.refill(beetle);
    agip.refill(beetle);
    agip.refill(beetle);

    System.out.println("This is the station's remaining gas amount: " + agip.gasAmount);
    System.out.println("This is the car's new gas amount: " + beetle.gasAmount);
  }
}
