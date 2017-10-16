import java.util.ArrayList;

public class Deck {
  ArrayList<Card> deck;
  String[] color = {"S", "H", "C", "D"};
  String[] value = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

  public Deck() {
    deck = new ArrayList<>();
    createDeck();
  }

  public void createDeck() {

    for (int i = 0; i < color.length; i++) {
      for (int j = 0; j < value.length; j++) {
       deck.add(new Card(color[i], value[j]));
      }
    }
  }
}
