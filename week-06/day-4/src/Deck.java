import java.util.ArrayList;
import java.util.Collections;

public class Deck {

  ArrayList<CardAndNotHeAbstract> cardList;

  public Deck() {
    cardList = new ArrayList<>();
    for (CardAndNotHeAbstract.Suit suit : CardAndNotHeAbstract.Suit.values()) {
      for (CardAndNotHeAbstract.Rank rank : CardAndNotHeAbstract.Rank.values()) {
        cardList.add(new CardAndNotHeAbstract(suit, rank));
      }
    }
  }

  public void shuffleDeck() {
    Collections.shuffle(cardList);
  }

  public CardAndNotHeAbstract pullFirst() {
    CardAndNotHeAbstract temp = cardList.get(0);
    cardList.remove(cardList.get(0));
    return temp;
  }

  public CardAndNotHeAbstract pullLast() {
    CardAndNotHeAbstract temp = cardList.get(cardList.size()-1);
    cardList.remove(cardList.get(cardList.size()-1));
    return temp;
  }

  public CardAndNotHeAbstract pullRandom() {
    int random = (int)(Math.random() * cardList.size());
    CardAndNotHeAbstract temp = cardList.get(random);
    cardList.remove(cardList.get(random));
    System.out.println(temp);
    return temp;
  }



  @Override
  public String toString() {
    String cards = "";
    for (int i = 0; i < cardList.size(); i++) {
      cards += cardList.get(i);
    }
    return "Number of cards: " + cardList.size() + "\n" + cards;
  }
}
