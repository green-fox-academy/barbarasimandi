import java.util.ArrayList;

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
        listOfCards.add(getCardByColor(number).get(i));
      }
    }
  }

  public void fillDeck() {
    listOfCards.add(new Heart());
    listOfCards.add(new Club());
    listOfCards.add(new Spade());
    listOfCards.add(new Diamond());
  }

  public ArrayList<Card> getCardByColor(int num) {

    getRandomColor();

    for (int i = 0; i < num; i++) {

      if (getRandomColor().equals(DIAMOND)) {
        listFromMoreThanFourCards.add(new Diamond());

      } else if (getRandomColor().equals(SPADE)) {
        listFromMoreThanFourCards.add(new Spade());

      } else if (getRandomColor().equals(HEART)) {
        listFromMoreThanFourCards.add(new Heart());

      } else if (getRandomColor().equals(CLUB)) {
        listFromMoreThanFourCards.add(new Club());
      }
    } return listFromMoreThanFourCards;
  }

  public String getRandomColor() {
    int random = (int) (Math.random() * 4);
    String color = new String [] {DIAMOND, SPADE, HEART, CLUB}[random];
    return color;
  }


  public void shuffle() {

  }

  private int getNumberOfCards(String type) {
      int counter = 0;
      for (int i = 0; i < listOfCards.size(); i++) {
        if (listOfCards.get(i) instanceof Heart && type.equals(HEART)) {
          counter++;
        }
        else if (listOfCards.get(i) instanceof Spade && type.equals(SPADE)) {
          counter++;
        }
        else if (listOfCards.get(i) instanceof Diamond && type.equals(DIAMOND)) {
          counter++;
        }
        else if (listOfCards.get(i) instanceof Club && type.equals(CLUB)) {
          counter++;
        }
       }
      return counter;
    }

  @Override
  public String toString() {
    return listOfCards.size() + " cards - " + getNumberOfCards(HEART) + " hearts " + getNumberOfCards(SPADE) + " spades " + getNumberOfCards(CLUB) + " clubs " + getNumberOfCards(DIAMOND) + " diamonds ";
  }
}
