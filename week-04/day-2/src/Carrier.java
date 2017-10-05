import java.util.ArrayList;

public class Carrier {

  ArrayList<Aircraft> aircraftList;
  int storeOfAmmo;
  int healthPoint;

  public Carrier(int initAmmo, int healthPoint) {
    this.aircraftList = new ArrayList<>();
    this.storeOfAmmo = initAmmo;
    this.healthPoint = healthPoint;
  }

  public void addAircraft(String aircraftsName) {
    if (aircraftsName.equals("F16")) {
      aircraftList.add(new F16());
    } aircraftList.add(new F35());
  }

  public void fill() {
    if (this.storeOfAmmo > 0) {
      for (int i = 0; i < aircraftList.size(); i++) {
        int neededAmmo = aircraftList.get(i).maxAmmo - aircraftList.get(i).currentAmmo;
        if (neededAmmo > storeOfAmmo && aircraftList.get(i).equals("F35")) {
          storeOfAmmo = aircraftList.get(i).refill(storeOfAmmo);
        }
        storeOfAmmo = aircraftList.get(i).refill(storeOfAmmo);
      }
    }
  }

  public int totalDamageCount() {
    int totalDam = 0;
    for (int i = 0; i < aircraftList.size(); i++) {
      totalDam += aircraftList.get(i).baseDamage;
    } return totalDam;
  }

  public void fight(Carrier anotherCarrier) {
    anotherCarrier.healthPoint = anotherCarrier.healthPoint - this.storeOfAmmo;
    this.storeOfAmmo = 0;
  }

  public String getStatus() {
    for (Aircraft a : aircraftList) {
      System.out.println(a.getStatus());
    }
    return "HP: " + this.healthPoint + " Aircraft count: " + this.aircraftList.size() + " Storage: " + this.storeOfAmmo + " Total damage: " + totalDamageCount() + "\n";
  }


  public static void main(String[] args) {

    Carrier first = new Carrier(300, 6000);
    Carrier second = new Carrier(200, 4000);

    first.addAircraft("F16");
    first.addAircraft("F35");

    second.addAircraft("F35");

    first.fill();
    second.fill();

    System.out.println(first.getStatus());
    System.out.println(second.getStatus());

    first.fight(second);
    second.fight(first);

    System.out.println(first.getStatus());
    System.out.println(second.getStatus());

    first.fill();
    System.out.println(first.getStatus());

  }
}





