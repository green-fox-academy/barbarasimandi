package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  public ElectricGuitar() {
    super(6);
  }

  public void sound() {
    System.out.println("Electric Guitar, a " + this.numberOfStrings + "-stringed instrument that twangs");
  }
}
