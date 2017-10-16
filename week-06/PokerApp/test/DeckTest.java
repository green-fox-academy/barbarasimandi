import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {

  Deck deck;

  @Before
  public void setUp() throws Exception {
    deck = new Deck();
  }

  @Test
  public void generateDeck() throws Exception {
    assertEquals(52, deck.deck.size());
  }


}