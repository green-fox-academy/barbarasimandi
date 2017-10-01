public class Captain extends Pirate {

  Parrot parrot;
  String name;

  public Captain(String name) {
    this.name = name;
  }

  public Captain() {
    this("Barker 'Cross' Hamet");
  }

  @Override
  public String toString() {
    return "\nThe captain: " + name + "\nand his crew:\n";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Captain) {
      Captain other = (Captain) obj;
      return this.name.equals(other.name);
    }
    return false;
  }
}
