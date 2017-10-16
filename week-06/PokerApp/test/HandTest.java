import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HandTest {

  Hand hand;
  Deck deck;
  String playerName;

  @Before
  public void setUp() throws Exception {
    playerName = "blah";
    deck =new Deck();
    hand = new Hand(playerName, deck);
  }

  @Test
  public void testHand() throws Exception {
    assertEquals(5, hand.player.size());
  }
}
