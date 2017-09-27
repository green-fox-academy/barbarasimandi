import static org.junit.Assert.*;

import java.util.Dictionary;
import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;

public class CountLettersTest {

  String testInput;
  CountLetters countLettersObject;

  @Before
  public void setUp() throws Exception {
    testInput = "ikiscicai";
    countLettersObject = new CountLetters();
  }

  @Test
  public void testMap() {
    assertTrue(4 == countLettersObject.dictionary(testInput).get('i'));
  }
}