public class BlackJack {

  public static void main(String[] args) {
    Deck deck = new Deck();
    //System.out.println(deck);
    deck.shuffleDeck();
    System.out.println(deck);
    deck.pullRandom();
    System.out.println(deck);
  }
}
