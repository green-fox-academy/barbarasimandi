public class CardAndNotHeAbstract {

  public enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES}

  public enum Rank {
    DEUCE(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10), ACE(11);

    public int value;

    Rank(int value) {
    this.value = value;
    }
    public int getValue() {
      return value;
    }
  }

  public enum Color {BLACK, RED}

  private Suit suit;

  private Rank rank;
  private Color color;
  public CardAndNotHeAbstract(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
    color = getColor();
  }

  private Color getColor() {
    return (suit == Suit.CLUBS || suit == Suit.SPADES) ? Color.BLACK : Color.RED;
  }

  public int getValue() {
    return rank.getValue();
  }

  @Override
  public String toString() {
    return this.rank + " of " + this.suit + "\n";
  }
}
