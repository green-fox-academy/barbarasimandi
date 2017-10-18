import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardTest {

  Card card;

  @Before
  public void setUp() throws Exception {
    card = new Card("2", "H");
  }

  @Test
  public void testCard() throws Exception {
    assertEquals("2", card.value);
  }

  @Test
  public void testCardTString() throws Exception {
    assertEquals("2H", card.toString());
  }

}