package main.java.music;

public class Violin extends StringedInstrument {

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
  }

  public Violin() {
    super(4);
  }

  @Override
  public void sound() {
    System.out.println("Violin, a " + this.numberOfStrings + "-stringed instrument that screeches");
  }
}
