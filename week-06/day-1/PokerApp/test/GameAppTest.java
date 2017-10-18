import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameAppTest {
  GameApp game;

  @Before
  public void setUp() throws Exception {
    game = new GameApp();
  }

  @Test
  public void testHello() throws Exception {
    assertEquals("hello", game.hello());
  }
}