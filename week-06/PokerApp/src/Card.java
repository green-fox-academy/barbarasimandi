public class Card {
  String value;
  String color;

  public Card(String value, String color) {
    this.value = value;
    this.color = color;
  }

  @Override
  public String toString() {
    return value + color;
  }
}
