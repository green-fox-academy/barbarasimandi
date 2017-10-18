public class Bird extends EggLayer {

  public Bird(String name) {
    super(name);
    this.noises = "chirp";
    this.numberOfLegs = 2;
  }

  public void move() {
    System.out.println("flies");
  }
}
