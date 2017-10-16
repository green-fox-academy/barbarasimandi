import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {
  Deck deck;
  String playerName;


  @Before
  public void setUp() throws Exception {
    deck = new Deck();
    playerName = "blah";
  }

  @Test
  public void generateDeck() throws Exception {
    assertEquals(52, deck.deck.size());
  }

  @Test
  public void remainingDeck() throws Exception {
    Hand hand = new Hand(playerName, deck);
    assertEquals(47, hand.deck.deck.size());
  }
}