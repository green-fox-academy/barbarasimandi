package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  public BassGuitar() {
    super(4);
  }

  @Override
  public void sound() {
    System.out.println("Bass Guitar, a" + this.numberOfStrings + "-stringed instrument that Duum-duum-duum");
  }
}
