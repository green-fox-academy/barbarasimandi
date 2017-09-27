import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AnagramTest {

  String testFirstString;
  String testSecondString;
  Anagram testAnagram;

  @Before
  public void setUp() throws Exception {
    testAnagram = new Anagram();
    testFirstString = "dog";
    testSecondString = "god";
  }

  @Test
  public void testAreTheyAnagrams() {
    assertTrue(testAnagram.anagram(testFirstString, testSecondString));
  }
}