public class Card {
  String color;
  String value;

  public Card(String color) {
    this.color = color;
    value = getRandomValue();
  }


  public String getRandomValue() {
    int random = (int) (Math.random() * 13);
    String value = new String [] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}[random];
    return value;
  }

  @Override
  public String toString() {
    return value + " " + color;
  }
}
