import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  ArrayList<Card> listOfCards;
  ArrayList<Card> listFromMoreThanFourCards;
  final static String HEART = "heart";
  final static String SPADE = "spade";
  final static String CLUB = "club";
  final static String DIAMOND = "diamond";

  public Deck(int number) {

    listOfCards = new ArrayList<>();
    listFromMoreThanFourCards = new ArrayList<>();

    if (number % 4 == 0) {
      for (int i = 0; i < number / 4; i++) {
       fillDeck();
      }
    }
    else if (number < 4) {
      fillDeck();
      int howManyToRemove = 4 - number;
      for (int i = 0; i < howManyToRemove; i++) {
        int random = (int)(Math.random() * (number + 1));
        listOfCards.remove(random);
      }
    }
    else {
      fillDeck();
      int howManyMore = number - 4;
      for (int i = 0; i < howManyMore; i++) {
        listOfCards.add(getCardListByColor(number).get(i));
      }
    }
  }

  public void fillDeck() {
    listOfCards.add(new Club());
    listOfCards.add(new Diamond());
    listOfCards.add(new Heart());
    listOfCards.add(new Spade());
  }

  public ArrayList<Card> getCardListByColor(int num) {

    getRandomColor();

    for (int i = 0; i < num; i++) {

      if (getRandomColor().equals(CLUB)) {
        listFromMoreThanFourCards.add(new Club());
      }
      else if (getRandomColor().equals(DIAMOND)) {
        listFromMoreThanFourCards.add(new Diamond());
      }
      else if (getRandomColor().equals(HEART)) {
        listFromMoreThanFourCards.add(new Heart());
      }
      else if (getRandomColor().equals(SPADE)) {
        listFromMoreThanFourCards.add(new Spade());

      }
    } return listFromMoreThanFourCards;
  }

  public String getRandomColor() {
    int random = (int) (Math.random() * 4);
    String color = new String [] {CLUB, DIAMOND, HEART, SPADE}[random];
    return color;
  }

  public void shuffle() {
    Collections.shuffle(listOfCards);
  }

  public Card draw() {
    Card tempCard = listOfCards.get(listOfCards.size() - 1);
    listOfCards.remove(listOfCards.size() - 1);
    return tempCard;
  }

  private int getTheNumberOfCardsInTheDeck(String type) {
    int counter = 0;
    for (int i = 0; i < listOfCards.size(); i++) {
      if (listOfCards.get(i) instanceof Club && type.equals(CLUB)) {
        counter++;
      }
      else if (listOfCards.get(i) instanceof Diamond && type.equals(DIAMOND)) {
        counter++;
      }
      else if (listOfCards.get(i) instanceof Heart && type.equals(HEART)) {
        counter++;
      }
      else if (listOfCards.get(i) instanceof Spade && type.equals(SPADE)) {
        counter++;
      }
    }
      return counter;
    }

  @Override
  public String toString() {
    return listOfCards.size() + " Cards - " + getTheNumberOfCardsInTheDeck(CLUB) + " Clubs " +  getTheNumberOfCardsInTheDeck(DIAMOND) + " Diamonds " + getTheNumberOfCardsInTheDeck(HEART) + " Hearts " + getTheNumberOfCardsInTheDeck(SPADE) + " Spades" ;
  }
}
