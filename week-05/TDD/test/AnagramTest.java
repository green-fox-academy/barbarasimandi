import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class AnagramTest {

  Anagram anagram;

  @Before
  public void setUp() throws Exception {
    anagram = new Anagram();
  }

  @Test
  public void testAnagramEmpty() {
    assertTrue(anagram.match("", ""));
  }

  @Test
  public void testAnagramChar() {
   assertTrue(anagram.match("b", "b"));
  }

  @Test
  public void testAnagramWord() {
    assertTrue(anagram.match("cd", "dc"));
  }

  @Test
  public void testAnagramAbba() {
    assertTrue(anagram.match("abba", "baba"));
  }

  @Test
  public void testAnagramNegative() {
    assertFalse(anagram.match("abd", "def"));
  }
}