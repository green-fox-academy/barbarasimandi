public class Reptile extends EggLayer {

  public Reptile(String name) {
    super(name);
    this.noises = "gshaaaa";
    this.numberOfLegs = 4;
  }

  public void move() {
    System.out.println("stomps");
  }
}
