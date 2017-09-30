public class Animal {
  int hunger;
  int thirst;
  String name;

  public Animal (String name) {
    this.hunger = 50;
    this.thirst = 50;
    this.name = name;
  }

  public void eat() {
    hunger -= 10;
  }

  public void drink() {
    thirst -= 1;
  }

  public void play() {
    hunger += 1;
    thirst += 1;
  }

  @Override
  public String toString() {
    return name;
  }
}
